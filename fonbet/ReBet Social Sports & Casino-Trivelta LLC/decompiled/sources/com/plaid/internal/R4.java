package com.plaid.internal;

import android.net.Uri;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.plaid.internal.Y6;
import com.reactnativecommunity.clipboard.ClipboardModule;
import j.AbstractC5086b;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nWebViewClients.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebViewClients.kt\ncom/plaid/core/webview/PlaidChromeClient\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,232:1\n37#2,2:233\n4117#3:235\n4217#3,2:236\n1855#4,2:238\n*S KotlinDebug\n*F\n+ 1 WebViewClients.kt\ncom/plaid/core/webview/PlaidChromeClient\n*L\n101#1:233,2\n110#1:235\n110#1:236,2\n110#1:238,2\n*E\n"})
/* loaded from: classes3.dex */
public final class R4 extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final AbstractC5086b f39589a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final AbstractC5086b f39590b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final U7 f39591c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final P7 f39592d;

    public static final class a extends Lambda implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PermissionRequest f39593a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String[] f39594b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PermissionRequest permissionRequest, String[] strArr) {
            super(0);
            this.f39593a = permissionRequest;
            this.f39594b = strArr;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f39593a.grant(this.f39594b);
            return Unit.INSTANCE;
        }
    }

    public static final class b extends Lambda implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PermissionRequest f39595a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(PermissionRequest permissionRequest) {
            super(0);
            this.f39595a = permissionRequest;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f39595a.deny();
            return Unit.INSTANCE;
        }
    }

    public static final class c extends Lambda implements Function0<Unit> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            AbstractC5086b abstractC5086b = R4.this.f39590b;
            Unit unit = Unit.INSTANCE;
            abstractC5086b.b(unit);
            return unit;
        }
    }

    public R4(@NotNull AbstractC5086b inputFileResultContract, @NotNull AbstractC5086b takePictureContract, @NotNull U7 listener, @NotNull P7 permissionHelper) {
        Intrinsics.checkNotNullParameter(inputFileResultContract, "inputFileResultContract");
        Intrinsics.checkNotNullParameter(takePictureContract, "takePictureContract");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(permissionHelper, "permissionHelper");
        this.f39589a = inputFileResultContract;
        this.f39590b = takePictureContract;
        this.f39591c = listener;
        this.f39592d = permissionHelper;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(@Nullable PermissionRequest permissionRequest) {
        if (permissionRequest == null) {
            return;
        }
        String[] resources = permissionRequest.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        if (ArraysKt.contains(resources, "android.webkit.resource.VIDEO_CAPTURE")) {
            String[] strArr = (String[]) CollectionsKt.listOf("android.webkit.resource.VIDEO_CAPTURE").toArray(new String[0]);
            if (this.f39592d.a()) {
                permissionRequest.grant(strArr);
            } else {
                this.f39592d.a(new a(permissionRequest, strArr), new b(permissionRequest));
            }
        }
        String[] resources2 = permissionRequest.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        ArrayList arrayList = new ArrayList();
        for (String str : resources2) {
            if (!Intrinsics.areEqual(str, "android.webkit.resource.VIDEO_CAPTURE")) {
                arrayList.add(str);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Y6.a.a("WebView requesting unsupported permission - " + ((String) it.next()));
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(@NotNull WebView view, int i10) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (i10 == 100) {
            i10 = 0;
        }
        super.onProgressChanged(view, i10);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(@Nullable WebView webView, @Nullable ValueCallback<Uri[]> valueCallback, @Nullable WebChromeClient.FileChooserParams fileChooserParams) {
        String[] acceptTypes;
        if (valueCallback == null) {
            return false;
        }
        this.f39591c.f39685n = valueCallback;
        if (fileChooserParams == null || !fileChooserParams.isCaptureEnabled() || (acceptTypes = fileChooserParams.getAcceptTypes()) == null || !ArraysKt.contains(acceptTypes, ClipboardModule.MIMETYPE_JPEG)) {
            this.f39589a.b("*/*");
            return true;
        }
        if (webView == null) {
            return false;
        }
        if (this.f39592d.a()) {
            this.f39590b.b(Unit.INSTANCE);
        } else {
            P7 p72 = this.f39592d;
            c success = new c();
            M4 failure = M4.f39376a;
            p72.getClass();
            Intrinsics.checkNotNullParameter(success, "success");
            Intrinsics.checkNotNullParameter(failure, "failure");
            p72.f39534f = success;
            p72.f39535g = failure;
            p72.f39536h.b("android.permission.CAMERA");
        }
        return true;
    }
}
