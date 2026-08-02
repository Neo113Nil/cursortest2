package com.zoho.livechat.android.modules.messages.ui.activities;

import L4.g;
import Ph.AbstractC1459k;
import Ph.P;
import X9.m;
import Zf.j;
import a1.C1908a;
import android.app.SharedElementCallback;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.transition.Transition;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.k;
import androidx.lifecycle.AbstractC2194t;
import androidx.lifecycle.U;
import androidx.viewpager.widget.ViewPager;
import com.bumptech.glide.load.engine.q;
import com.google.android.material.shape.i;
import com.zoho.livechat.android.modules.messages.ui.activities.MobilistenImageViewerActivity;
import com.zoho.livechat.android.modules.messages.ui.viewmodels.ImageViewerViewModel;
import com.zoho.livechat.android.ui.ImagePager;
import com.zoho.livechat.android.utils.MobilistenUtil;
import i3.C4527h;
import j.AbstractC5086b;
import j.InterfaceC5085a;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import k.h;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.AbstractC5323h;
import kotlinx.coroutines.flow.L;
import l0.AbstractC5338c;
import od.AbstractC5886l;
import od.s;
import od.t;
import og.AbstractC5889a;
import og.AbstractC5892d;
import og.n;
import og.p;
import rd.C6218a;
import ud.C6547a;
import wd.d;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0016\u0010\u0003J\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\rJ\u000f\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u0003R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010.\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010'R\u0016\u00100\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010'R\u0016\u00103\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00107\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010:\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010>\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010@\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010=R\u0016\u0010B\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010=R\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020\u000b0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006G"}, d2 = {"Lcom/zoho/livechat/android/modules/messages/ui/activities/MobilistenImageViewerActivity;", "LYf/c;", "<init>", "()V", "", "l0", "Landroid/content/BroadcastReceiver;", "f0", "()Landroid/content/BroadcastReceiver;", "", "time", "", "h0", "(J)Ljava/lang/String;", "Ljava/util/Calendar;", "e0", "(Ljava/util/Calendar;)Ljava/util/Calendar;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onPause", "messageTime", "g0", "onBackPressed", "Lud/a;", "g", "Lud/a;", "binding", "Lcom/zoho/livechat/android/modules/messages/ui/viewmodels/ImageViewerViewModel;", C4527h.f48087o, "Lcom/zoho/livechat/android/modules/messages/ui/viewmodels/ImageViewerViewModel;", "viewModel", "LZf/j;", i.f35755A, "LZf/j;", "adapter", "j", "Ljava/lang/String;", "chatId", "", "k", "Ljava/lang/CharSequence;", "title", "l", "currentFileName", m.f13664a, "currentImageId", "n", "J", "currentFileTime", "Ljava/io/File;", "o", "Ljava/io/File;", "currentFile", "p", "Landroid/content/BroadcastReceiver;", "clickReceiver", "", "q", "Z", "isTransitionCompleted", "r", "isDummyImageLoaded", "s", "isOriginalImageLoaded", "Lj/b;", "t", "Lj/b;", "permissionRequest", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMobilistenImageViewerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MobilistenImageViewerActivity.kt\ncom/zoho/livechat/android/modules/messages/ui/activities/MobilistenImageViewerActivity\n+ 2 Transition.kt\nandroidx/core/transition/TransitionKt\n*L\n1#1,424:1\n59#2,16:425\n*S KotlinDebug\n*F\n+ 1 MobilistenImageViewerActivity.kt\ncom/zoho/livechat/android/modules/messages/ui/activities/MobilistenImageViewerActivity\n*L\n119#1:425,16\n*E\n"})
/* loaded from: classes4.dex */
public final class MobilistenImageViewerActivity extends Yf.c {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public C6547a binding;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public ImageViewerViewModel viewModel;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public j adapter;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public long currentFileTime;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public File currentFile;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public BroadcastReceiver clickReceiver;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public boolean isTransitionCompleted;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public boolean isDummyImageLoaded;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public boolean isOriginalImageLoaded;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public String chatId = "";

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public CharSequence title = "";

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public String currentFileName = "";

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public String currentImageId = "";

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final AbstractC5086b permissionRequest = registerForActivityResult(new h(), new InterfaceC5085a() { // from class: Af.a
        @Override // j.InterfaceC5085a
        public final void a(Object obj) {
            MobilistenImageViewerActivity.j0(MobilistenImageViewerActivity.this, ((Boolean) obj).booleanValue());
        }
    });

    public static final class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            C6547a c6547a = MobilistenImageViewerActivity.this.binding;
            C6547a c6547a2 = null;
            if (c6547a == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c6547a = null;
            }
            Toolbar toolbar = c6547a.f66259c;
            C6547a c6547a3 = MobilistenImageViewerActivity.this.binding;
            if (c6547a3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c6547a3 = null;
            }
            int i10 = 0;
            if (c6547a3.f66259c.getVisibility() == 0) {
                AbstractC5889a.a(MobilistenImageViewerActivity.this, false);
                C6547a c6547a4 = MobilistenImageViewerActivity.this.binding;
                if (c6547a4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    c6547a2 = c6547a4;
                }
                i10 = 4;
                c6547a2.f66261e.setVisibility(4);
            } else {
                AbstractC5889a.a(MobilistenImageViewerActivity.this, true);
                C6547a c6547a5 = MobilistenImageViewerActivity.this.binding;
                if (c6547a5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    c6547a2 = c6547a5;
                }
                c6547a2.f66261e.setVisibility(0);
            }
            toolbar.setVisibility(i10);
        }
    }

    public static final class b extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f43733n;

        public static final class a implements ViewPager.j {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ MobilistenImageViewerActivity f43735a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Bundle f43736b;

            public a(MobilistenImageViewerActivity mobilistenImageViewerActivity, Bundle bundle) {
                this.f43735a = mobilistenImageViewerActivity;
                this.f43736b = bundle;
            }

            public static final void e(MobilistenImageViewerActivity this$0) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                C6547a c6547a = this$0.binding;
                if (c6547a == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c6547a = null;
                }
                c6547a.f66258b.setElevation(0.0f);
            }

            @Override // androidx.viewpager.widget.ViewPager.j
            public void a(int i10, float f10, int i11) {
            }

            @Override // androidx.viewpager.widget.ViewPager.j
            public void b(int i10) {
            }

            @Override // androidx.viewpager.widget.ViewPager.j
            public void c(int i10) {
                C6547a c6547a = this.f43735a.binding;
                C6547a c6547a2 = null;
                if (c6547a == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c6547a = null;
                }
                AppCompatImageView appCompatImageView = c6547a.f66258b;
                final MobilistenImageViewerActivity mobilistenImageViewerActivity = this.f43735a;
                appCompatImageView.postDelayed(new Runnable() { // from class: Af.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        MobilistenImageViewerActivity.b.a.e(MobilistenImageViewerActivity.this);
                    }
                }, 500L);
                ImageViewerViewModel imageViewerViewModel = this.f43735a.viewModel;
                if (imageViewerViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    imageViewerViewModel = null;
                }
                Object value = imageViewerViewModel.d().getValue();
                if (i10 > ((List) value).size()) {
                    value = null;
                }
                if (((List) value) != null) {
                    ImageViewerViewModel imageViewerViewModel2 = this.f43735a.viewModel;
                    if (imageViewerViewModel2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        imageViewerViewModel2 = null;
                    }
                    com.zoho.livechat.android.models.a aVar = (com.zoho.livechat.android.models.a) ((List) imageViewerViewModel2.d().getValue()).get(i10);
                    if (aVar != null) {
                        MobilistenImageViewerActivity mobilistenImageViewerActivity2 = this.f43735a;
                        Bundle bundle = this.f43736b;
                        String c10 = aVar.c();
                        Intrinsics.checkNotNullExpressionValue(c10, "getImageid(...)");
                        mobilistenImageViewerActivity2.currentImageId = c10;
                        String b10 = aVar.b();
                        if (b10 == null) {
                            b10 = "";
                        }
                        mobilistenImageViewerActivity2.currentFileName = b10;
                        mobilistenImageViewerActivity2.currentFileTime = aVar.f();
                        mobilistenImageViewerActivity2.currentFile = aVar.a();
                        C6547a c6547a3 = mobilistenImageViewerActivity2.binding;
                        if (c6547a3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            c6547a3 = null;
                        }
                        c6547a3.f66259c.setTitle(aVar.d());
                        C6547a c6547a4 = mobilistenImageViewerActivity2.binding;
                        if (c6547a4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            c6547a4 = null;
                        }
                        Toolbar siqChatimagesviewToolbar = c6547a4.f66259c;
                        Intrinsics.checkNotNullExpressionValue(siqChatimagesviewToolbar, "siqChatimagesviewToolbar");
                        n.c(siqChatimagesviewToolbar, mobilistenImageViewerActivity2.g0(mobilistenImageViewerActivity2.currentFileTime) + ", " + og.j.c(mobilistenImageViewerActivity2.currentFileTime, null, null, 3, null));
                        if (Intrinsics.areEqual(mobilistenImageViewerActivity2.currentImageId, bundle != null ? bundle.getString("message_id") : null)) {
                            C6547a c6547a5 = mobilistenImageViewerActivity2.binding;
                            if (c6547a5 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                            } else {
                                c6547a2 = c6547a5;
                            }
                            p.w(c6547a2.f66258b);
                            return;
                        }
                        C6547a c6547a6 = mobilistenImageViewerActivity2.binding;
                        if (c6547a6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                        } else {
                            c6547a2 = c6547a6;
                        }
                        p.n(c6547a2.f66258b);
                    }
                }
            }
        }

        /* renamed from: com.zoho.livechat.android.modules.messages.ui.activities.MobilistenImageViewerActivity$b$b, reason: collision with other inner class name */
        public static final class SharedElementCallbackC0629b extends SharedElementCallback {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Rect f43737a;

            public SharedElementCallbackC0629b(Rect rect) {
                this.f43737a = rect;
            }

            @Override // android.app.SharedElementCallback
            public void onSharedElementEnd(List sharedElementNames, List sharedElements, List sharedElementSnapshots) {
                Intrinsics.checkNotNullParameter(sharedElementNames, "sharedElementNames");
                Intrinsics.checkNotNullParameter(sharedElements, "sharedElements");
                Intrinsics.checkNotNullParameter(sharedElementSnapshots, "sharedElementSnapshots");
                int size = sharedElementNames.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (Intrinsics.areEqual("chatImageTransition", sharedElementNames.get(i10))) {
                        ((View) sharedElements.get(i10)).setClipBounds(null);
                    }
                }
                super.onSharedElementEnd(sharedElementNames, sharedElements, sharedElementSnapshots);
            }

            @Override // android.app.SharedElementCallback
            public void onSharedElementStart(List sharedElementNames, List sharedElements, List sharedElementSnapshots) {
                Intrinsics.checkNotNullParameter(sharedElementNames, "sharedElementNames");
                Intrinsics.checkNotNullParameter(sharedElements, "sharedElements");
                Intrinsics.checkNotNullParameter(sharedElementSnapshots, "sharedElementSnapshots");
                int size = sharedElementNames.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (Intrinsics.areEqual("chatImageTransition", sharedElementNames.get(i10))) {
                        ((View) sharedElements.get(i10)).setClipBounds(this.f43737a);
                    }
                }
                super.onSharedElementStart(sharedElementNames, sharedElements, sharedElementSnapshots);
            }
        }

        public static final class c extends Lambda implements Function0 {

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ MobilistenImageViewerActivity f43738d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(MobilistenImageViewerActivity mobilistenImageViewerActivity) {
                super(0);
                this.f43738d = mobilistenImageViewerActivity;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m119invoke();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m119invoke() {
                this.f43738d.isOriginalImageLoaded = true;
                C6547a c6547a = this.f43738d.binding;
                ImageViewerViewModel imageViewerViewModel = null;
                if (c6547a == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c6547a = null;
                }
                c6547a.f66258b.setElevation(0.0f);
                MobilistenImageViewerActivity mobilistenImageViewerActivity = this.f43738d;
                ImageViewerViewModel imageViewerViewModel2 = mobilistenImageViewerActivity.viewModel;
                if (imageViewerViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                } else {
                    imageViewerViewModel = imageViewerViewModel2;
                }
                MobilistenImageViewerActivity.i0(mobilistenImageViewerActivity, (List) imageViewerViewModel.d().getValue());
            }
        }

        public static final class d implements g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ MobilistenImageViewerActivity f43739a;

            public d(MobilistenImageViewerActivity mobilistenImageViewerActivity) {
                this.f43739a = mobilistenImageViewerActivity;
            }

            @Override // L4.g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public boolean f(Drawable resource, Object model, M4.j jVar, com.bumptech.glide.load.a dataSource, boolean z10) {
                Intrinsics.checkNotNullParameter(resource, "resource");
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                C6547a c6547a = this.f43739a.binding;
                if (c6547a == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c6547a = null;
                }
                c6547a.f66258b.setImageDrawable(resource);
                this.f43739a.isDummyImageLoaded = true;
                this.f43739a.l0();
                return true;
            }

            @Override // L4.g
            public boolean k(q qVar, Object obj, M4.j target, boolean z10) {
                Intrinsics.checkNotNullParameter(target, "target");
                C6547a c6547a = this.f43739a.binding;
                if (c6547a == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c6547a = null;
                }
                p.n(c6547a.f66258b);
                return true;
            }
        }

        public static final class e extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f43740n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ MobilistenImageViewerActivity f43741o;

            public static final class a extends SuspendLambda implements Function2 {

                /* renamed from: n, reason: collision with root package name */
                public int f43742n;

                /* renamed from: o, reason: collision with root package name */
                public /* synthetic */ Object f43743o;

                /* renamed from: p, reason: collision with root package name */
                public final /* synthetic */ MobilistenImageViewerActivity f43744p;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(MobilistenImageViewerActivity mobilistenImageViewerActivity, Continuation continuation) {
                    super(2, continuation);
                    this.f43744p = mobilistenImageViewerActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    a aVar = new a(this.f43744p, continuation);
                    aVar.f43743o = obj;
                    return aVar;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: i, reason: merged with bridge method [inline-methods] */
                public final Object invoke(List list, Continuation continuation) {
                    return ((a) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f43742n != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    List list = (List) this.f43743o;
                    j jVar = this.f43744p.adapter;
                    if (jVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        jVar = null;
                    }
                    jVar.u(list);
                    MobilistenImageViewerActivity.i0(this.f43744p, list);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(MobilistenImageViewerActivity mobilistenImageViewerActivity, Continuation continuation) {
                super(2, continuation);
                this.f43741o = mobilistenImageViewerActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new e(this.f43741o, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((e) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f43740n;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    ImageViewerViewModel imageViewerViewModel = this.f43741o.viewModel;
                    if (imageViewerViewModel == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        imageViewerViewModel = null;
                    }
                    L d10 = imageViewerViewModel.d();
                    a aVar = new a(this.f43741o, null);
                    this.f43740n = 1;
                    if (AbstractC5323h.h(d10, aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public b(Continuation continuation) {
            super(2, continuation);
        }

        public static final void k(MobilistenImageViewerActivity mobilistenImageViewerActivity, View view) {
            mobilistenImageViewerActivity.onBackPressed();
        }

        public static final boolean m(MobilistenImageViewerActivity mobilistenImageViewerActivity, MenuItem menuItem) {
            ImageViewerViewModel imageViewerViewModel = mobilistenImageViewerActivity.viewModel;
            if (imageViewerViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                imageViewerViewModel = null;
            }
            List list = (List) imageViewerViewModel.d().getValue();
            C6547a c6547a = mobilistenImageViewerActivity.binding;
            if (c6547a == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c6547a = null;
            }
            File a10 = ((com.zoho.livechat.android.models.a) list.get(c6547a.f66260d.getCurrentItem())).a();
            String str = mobilistenImageViewerActivity.currentFileName;
            if (StringsKt.contains$default((CharSequence) mobilistenImageViewerActivity.currentFileName, (CharSequence) ".", false, 2, (Object) null)) {
                str = mobilistenImageViewerActivity.currentFileName.substring(StringsKt.lastIndexOf$default((CharSequence) mobilistenImageViewerActivity.currentFileName, ".", 0, false, 6, (Object) null));
                Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
            }
            if (menuItem.getItemId() == od.q.f60379S) {
                wd.d.S(mobilistenImageViewerActivity, str, null, a10);
            } else if (menuItem.getItemId() == od.q.f60556j) {
                if (Build.VERSION.SDK_INT >= 29) {
                    wd.d.N(mobilistenImageViewerActivity, null, mobilistenImageViewerActivity.currentFileName, a10);
                } else if (AbstractC5338c.checkSelfPermission(mobilistenImageViewerActivity, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    mobilistenImageViewerActivity.permissionRequest.b("android.permission.WRITE_EXTERNAL_STORAGE");
                } else {
                    wd.d.N(mobilistenImageViewerActivity, null, mobilistenImageViewerActivity.currentFileName, a10);
                }
            }
            return false;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return MobilistenImageViewerActivity.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Rect rect;
            String string;
            Object parcelableExtra;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f43733n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (Build.VERSION.SDK_INT >= 33) {
                parcelableExtra = MobilistenImageViewerActivity.this.getIntent().getParcelableExtra("clip_rect", Rect.class);
                rect = (Rect) parcelableExtra;
            } else {
                rect = (Rect) MobilistenImageViewerActivity.this.getIntent().getParcelableExtra("clip_rect");
            }
            MobilistenImageViewerActivity.this.setEnterSharedElementCallback(new SharedElementCallbackC0629b(rect));
            C6547a c6547a = MobilistenImageViewerActivity.this.binding;
            C6547a c6547a2 = null;
            if (c6547a == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c6547a = null;
            }
            AppCompatImageView appCompatImageView = c6547a.f66258b;
            C6547a c6547a3 = MobilistenImageViewerActivity.this.binding;
            if (c6547a3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c6547a3 = null;
            }
            ViewGroup.LayoutParams layoutParams = c6547a3.f66258b.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.height = C6218a.s();
            marginLayoutParams.width = C6218a.t();
            appCompatImageView.setLayoutParams(marginLayoutParams);
            C6547a c6547a4 = MobilistenImageViewerActivity.this.binding;
            if (c6547a4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c6547a4 = null;
            }
            c6547a4.f66260d.setBackgroundColor(-16777216);
            AbstractC5889a.b(MobilistenImageViewerActivity.this, true);
            if (MobilistenImageViewerActivity.this.clickReceiver == null) {
                MobilistenImageViewerActivity mobilistenImageViewerActivity = MobilistenImageViewerActivity.this;
                mobilistenImageViewerActivity.clickReceiver = mobilistenImageViewerActivity.f0();
            }
            C6547a c6547a5 = MobilistenImageViewerActivity.this.binding;
            if (c6547a5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c6547a5 = null;
            }
            ViewGroup.LayoutParams layoutParams2 = c6547a5.f66261e.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams2;
            ((ViewGroup.MarginLayoutParams) bVar).height = C6218a.U();
            C6547a c6547a6 = MobilistenImageViewerActivity.this.binding;
            if (c6547a6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c6547a6 = null;
            }
            c6547a6.f66261e.setLayoutParams(bVar);
            C6547a c6547a7 = MobilistenImageViewerActivity.this.binding;
            if (c6547a7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c6547a7 = null;
            }
            Drawable navigationIcon = c6547a7.f66259c.getNavigationIcon();
            if (navigationIcon != null) {
                navigationIcon.setColorFilter(new PorterDuffColorFilter(AbstractC5892d.h(MobilistenImageViewerActivity.this, Boxing.boxInt(AbstractC5886l.f59877q2), 0.0f, 2, null), PorterDuff.Mode.SRC_ATOP));
            }
            C6547a c6547a8 = MobilistenImageViewerActivity.this.binding;
            if (c6547a8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c6547a8 = null;
            }
            Toolbar toolbar = c6547a8.f66259c;
            final MobilistenImageViewerActivity mobilistenImageViewerActivity2 = MobilistenImageViewerActivity.this;
            toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: Af.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MobilistenImageViewerActivity.b.k(MobilistenImageViewerActivity.this, view);
                }
            });
            C6547a c6547a9 = MobilistenImageViewerActivity.this.binding;
            if (c6547a9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c6547a9 = null;
            }
            c6547a9.f66259c.x(s.f60825b);
            C6547a c6547a10 = MobilistenImageViewerActivity.this.binding;
            if (c6547a10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c6547a10 = null;
            }
            if (c6547a10.f66259c.getOverflowIcon() != null) {
                Drawable f10 = k.f(MobilistenImageViewerActivity.this.getResources(), AbstractC5892d.l(MobilistenImageViewerActivity.this, AbstractC5886l.f59881r2), MobilistenImageViewerActivity.this.getTheme());
                if (f10 != null) {
                    C6547a c6547a11 = MobilistenImageViewerActivity.this.binding;
                    if (c6547a11 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        c6547a11 = null;
                    }
                    c6547a11.f66259c.setOverflowIcon(f10);
                }
                C6547a c6547a12 = MobilistenImageViewerActivity.this.binding;
                if (c6547a12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c6547a12 = null;
                }
                Drawable overflowIcon = c6547a12.f66259c.getOverflowIcon();
                if (overflowIcon != null) {
                    overflowIcon.setColorFilter(new PorterDuffColorFilter(AbstractC5892d.h(MobilistenImageViewerActivity.this, Boxing.boxInt(AbstractC5886l.f59885s2), 0.0f, 2, null), PorterDuff.Mode.SRC_ATOP));
                }
            }
            C6547a c6547a13 = MobilistenImageViewerActivity.this.binding;
            if (c6547a13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c6547a13 = null;
            }
            Toolbar toolbar2 = c6547a13.f66259c;
            final MobilistenImageViewerActivity mobilistenImageViewerActivity3 = MobilistenImageViewerActivity.this;
            toolbar2.setOnMenuItemClickListener(new Toolbar.h() { // from class: Af.d
                @Override // androidx.appcompat.widget.Toolbar.h
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    boolean m10;
                    m10 = MobilistenImageViewerActivity.b.m(MobilistenImageViewerActivity.this, menuItem);
                    return m10;
                }
            });
            Intent intent = MobilistenImageViewerActivity.this.getIntent();
            Bundle extras = intent != null ? intent.getExtras() : null;
            if (extras != null) {
                MobilistenImageViewerActivity mobilistenImageViewerActivity4 = MobilistenImageViewerActivity.this;
                String string2 = extras.getString("chat_id");
                if (string2 == null) {
                    string2 = "";
                }
                mobilistenImageViewerActivity4.chatId = string2;
                MobilistenImageViewerActivity mobilistenImageViewerActivity5 = MobilistenImageViewerActivity.this;
                String string3 = extras.getString("message_id");
                if (string3 == null) {
                    string3 = "";
                }
                mobilistenImageViewerActivity5.currentImageId = string3;
                MobilistenImageViewerActivity.this.title = Vf.b.i().c(extras.getString("display_name"));
                MobilistenImageViewerActivity mobilistenImageViewerActivity6 = MobilistenImageViewerActivity.this;
                String string4 = extras.getString("file_name");
                mobilistenImageViewerActivity6.currentFileName = string4 != null ? string4 : "";
                MobilistenImageViewerActivity.this.currentFileTime = extras.getLong("time");
            }
            ImageViewerViewModel imageViewerViewModel = MobilistenImageViewerActivity.this.viewModel;
            if (imageViewerViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                imageViewerViewModel = null;
            }
            imageViewerViewModel.e(MobilistenImageViewerActivity.this.chatId);
            MobilistenImageViewerActivity.this.adapter = new j(CollectionsKt.emptyList(), MobilistenImageViewerActivity.this.currentImageId, new c(MobilistenImageViewerActivity.this));
            wd.d dVar = wd.d.f67581a;
            C6547a c6547a14 = MobilistenImageViewerActivity.this.binding;
            if (c6547a14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c6547a14 = null;
            }
            AppCompatImageView appCompatImageView2 = c6547a14.f66258b;
            File file = (extras == null || (string = extras.getString("file_path")) == null) ? null : new File(string);
            d dVar2 = new d(MobilistenImageViewerActivity.this);
            String string5 = extras != null ? extras.getString("file_path") : null;
            int d10 = k.d(MobilistenImageViewerActivity.this.getResources(), od.n.f59933m, MobilistenImageViewerActivity.this.getTheme());
            Intrinsics.checkNotNull(appCompatImageView2);
            wd.d.K(appCompatImageView2, file, null, false, false, dVar2, Boxing.boxInt(d10), null, string5, null, true, null, 2716, null);
            AbstractC1459k.d(AbstractC2194t.a(MobilistenImageViewerActivity.this), null, null, new e(MobilistenImageViewerActivity.this, null), 3, null);
            C6547a c6547a15 = MobilistenImageViewerActivity.this.binding;
            if (c6547a15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c6547a15 = null;
            }
            c6547a15.f66259c.setTitle(MobilistenImageViewerActivity.this.title);
            C6547a c6547a16 = MobilistenImageViewerActivity.this.binding;
            if (c6547a16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c6547a16 = null;
            }
            Toolbar siqChatimagesviewToolbar = c6547a16.f66259c;
            Intrinsics.checkNotNullExpressionValue(siqChatimagesviewToolbar, "siqChatimagesviewToolbar");
            StringBuilder sb2 = new StringBuilder();
            MobilistenImageViewerActivity mobilistenImageViewerActivity7 = MobilistenImageViewerActivity.this;
            sb2.append(mobilistenImageViewerActivity7.g0(mobilistenImageViewerActivity7.currentFileTime));
            sb2.append(", ");
            sb2.append(og.j.c(MobilistenImageViewerActivity.this.currentFileTime, null, null, 3, null));
            n.c(siqChatimagesviewToolbar, sb2.toString());
            C6547a c6547a17 = MobilistenImageViewerActivity.this.binding;
            if (c6547a17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                c6547a2 = c6547a17;
            }
            c6547a2.f66260d.c(new a(MobilistenImageViewerActivity.this, extras));
            return Unit.INSTANCE;
        }
    }

    public static final class c implements Transition.TransitionListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Window f43745a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MobilistenImageViewerActivity f43746b;

        public c(Window window, MobilistenImageViewerActivity mobilistenImageViewerActivity) {
            this.f43745a = window;
            this.f43746b = mobilistenImageViewerActivity;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.f43745a.setSharedElementsUseOverlay(true);
            C6547a c6547a = this.f43746b.binding;
            ImageViewerViewModel imageViewerViewModel = null;
            if (c6547a == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c6547a = null;
            }
            ImagePager imagePager = c6547a.f66260d;
            j jVar = this.f43746b.adapter;
            if (jVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                jVar = null;
            }
            imagePager.setAdapter(jVar);
            MobilistenImageViewerActivity mobilistenImageViewerActivity = this.f43746b;
            ImageViewerViewModel imageViewerViewModel2 = mobilistenImageViewerActivity.viewModel;
            if (imageViewerViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                imageViewerViewModel = imageViewerViewModel2;
            }
            MobilistenImageViewerActivity.i0(mobilistenImageViewerActivity, (List) imageViewerViewModel.d().getValue());
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    private final Calendar e0(Calendar calendar) {
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BroadcastReceiver f0() {
        return new a();
    }

    public static final void i0(MobilistenImageViewerActivity mobilistenImageViewerActivity, List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (Intrinsics.areEqual(((com.zoho.livechat.android.models.a) list.get(i10)).c(), mobilistenImageViewerActivity.currentImageId)) {
                mobilistenImageViewerActivity.currentFile = ((com.zoho.livechat.android.models.a) list.get(i10)).a();
                C6547a c6547a = mobilistenImageViewerActivity.binding;
                if (c6547a == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c6547a = null;
                }
                c6547a.f66260d.M(i10, false);
                return;
            }
        }
    }

    public static final void j0(MobilistenImageViewerActivity this$0, boolean z10) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z10) {
            d.N(this$0, null, this$0.currentFileName, this$0.currentFile);
        } else {
            MobilistenUtil.z(t.f60859F1, 0, 2, null);
        }
    }

    public final String g0(long messageTime) {
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "getInstance(...)");
        Calendar e02 = e0(calendar);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(6, -1);
        Intrinsics.checkNotNull(calendar2);
        return messageTime > e02.getTimeInMillis() ? getResources().getString(t.f60899M) : messageTime > e0(calendar2).getTimeInMillis() ? getResources().getString(t.f60905N) : h0(messageTime);
    }

    public final String h0(long time) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy", Locale.getDefault());
        simpleDateFormat.format(Long.valueOf(System.currentTimeMillis()));
        int i10 = simpleDateFormat.getCalendar().get(1);
        simpleDateFormat.format(Long.valueOf(time));
        return (i10 == simpleDateFormat.getCalendar().get(1) ? new SimpleDateFormat("MMM dd", Locale.getDefault()) : new SimpleDateFormat("MMM dd, yy", Locale.getDefault())).format(Long.valueOf(time));
    }

    public final void l0() {
        if (this.isTransitionCompleted || !this.isDummyImageLoaded) {
            return;
        }
        androidx.core.app.b.l(this);
        this.isTransitionCompleted = true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        supportFinishAfterTransition();
    }

    @Override // Yf.c, androidx.fragment.app.AbstractActivityC2168s, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(12);
        C6547a c10 = C6547a.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(c10, "inflate(...)");
        this.binding = c10;
        if (c10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c10 = null;
        }
        setContentView(c10.b());
        this.viewModel = (ImageViewerViewModel) new U(this).a(ImageViewerViewModel.class);
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                Intrinsics.checkNotNull(attributes);
                if (Build.VERSION.SDK_INT >= 28) {
                    attributes.layoutInDisplayCutoutMode = 1;
                    attributes.flags = 512;
                }
            } else {
                attributes = null;
            }
            window.setAttributes(attributes);
            window.setAllowEnterTransitionOverlap(false);
            window.setAllowReturnTransitionOverlap(true);
            window.setSharedElementsUseOverlay(false);
            Transition sharedElementEnterTransition = window.getSharedElementEnterTransition();
            Intrinsics.checkNotNullExpressionValue(sharedElementEnterTransition, "getSharedElementEnterTransition(...)");
            sharedElementEnterTransition.addListener(new c(window, this));
            window.setStatusBarColor(AbstractC5892d.h(this, Integer.valueOf(AbstractC5886l.f59873p2), 0.0f, 2, null));
        }
        androidx.core.app.b.d(this);
        AbstractC1459k.d(AbstractC2194t.a(this), null, null, new b(null), 3, null);
    }

    @Override // Yf.c, androidx.fragment.app.AbstractActivityC2168s, android.app.Activity
    public void onPause() {
        super.onPause();
        C1908a b10 = C1908a.b(this);
        BroadcastReceiver broadcastReceiver = this.clickReceiver;
        Intrinsics.checkNotNull(broadcastReceiver);
        b10.e(broadcastReceiver);
    }

    @Override // Yf.c, androidx.fragment.app.AbstractActivityC2168s, android.app.Activity
    public void onResume() {
        super.onResume();
        C1908a b10 = C1908a.b(this);
        BroadcastReceiver broadcastReceiver = this.clickReceiver;
        Intrinsics.checkNotNull(broadcastReceiver);
        b10.c(broadcastReceiver, new IntentFilter("201"));
    }
}
