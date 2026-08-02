package com.zoho.livechat.android.utils;

import Be.a;
import Ph.AbstractC1459k;
import Ph.C1452g0;
import android.app.Application;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.MimeTypeMap;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Keep;
import com.facebook.hermes.intl.Constants;
import com.google.android.material.snackbar.Snackbar;
import com.twilio.voice.PublisherMetadata;
import com.zoho.livechat.android.ZohoLiveChat;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.provider.b;
import com.zoho.livechat.android.utils.MobilistenUtil;
import com.zoho.salesiqembed.ZohoSalesIQ;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;
import og.AbstractC5891c;
import og.AbstractC5892d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rd.C6218a;
import td.C6461a;

/* loaded from: classes4.dex */
public final class MobilistenUtil {

    /* renamed from: a, reason: collision with root package name */
    public static final MobilistenUtil f44407a = new MobilistenUtil();

    /* renamed from: b, reason: collision with root package name */
    public static final Application f44408b;

    /* renamed from: c, reason: collision with root package name */
    public static final Be.a f44409c;

    /* renamed from: d, reason: collision with root package name */
    public static final Lazy f44410d;

    public static final class DateTime {

        /* renamed from: a, reason: collision with root package name */
        public static final DateTime f44411a = new DateTime();

        /* renamed from: b, reason: collision with root package name */
        public static final Map f44412b;

        /* renamed from: c, reason: collision with root package name */
        public static final List f44413c;

        @Keep
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/zoho/livechat/android/utils/MobilistenUtil$DateTime$TimeUnitResource;", "Ljava/io/Serializable;", "Lcom/zoho/livechat/android/utils/MobilistenUtil$DateTime$a;", "unit", "", "resourceId", "<init>", "(Lcom/zoho/livechat/android/utils/MobilistenUtil$DateTime$a;I)V", "component1", "()Lcom/zoho/livechat/android/utils/MobilistenUtil$DateTime$a;", "component2", "()I", "copy", "(Lcom/zoho/livechat/android/utils/MobilistenUtil$DateTime$a;I)Lcom/zoho/livechat/android/utils/MobilistenUtil$DateTime$TimeUnitResource;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/zoho/livechat/android/utils/MobilistenUtil$DateTime$a;", "getUnit", "I", "getResourceId", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class TimeUnitResource implements Serializable {
            private final int resourceId;

            @NotNull
            private final a unit;

            public TimeUnitResource(@NotNull a unit, int i10) {
                Intrinsics.checkNotNullParameter(unit, "unit");
                this.unit = unit;
                this.resourceId = i10;
            }

            public static /* synthetic */ TimeUnitResource copy$default(TimeUnitResource timeUnitResource, a aVar, int i10, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    aVar = timeUnitResource.unit;
                }
                if ((i11 & 2) != 0) {
                    i10 = timeUnitResource.resourceId;
                }
                return timeUnitResource.copy(aVar, i10);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final a getUnit() {
                return this.unit;
            }

            /* renamed from: component2, reason: from getter */
            public final int getResourceId() {
                return this.resourceId;
            }

            @NotNull
            public final TimeUnitResource copy(@NotNull a unit, int resourceId) {
                Intrinsics.checkNotNullParameter(unit, "unit");
                return new TimeUnitResource(unit, resourceId);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TimeUnitResource)) {
                    return false;
                }
                TimeUnitResource timeUnitResource = (TimeUnitResource) other;
                return this.unit == timeUnitResource.unit && this.resourceId == timeUnitResource.resourceId;
            }

            public final int getResourceId() {
                return this.resourceId;
            }

            @NotNull
            public final a getUnit() {
                return this.unit;
            }

            public int hashCode() {
                return (this.unit.hashCode() * 31) + Integer.hashCode(this.resourceId);
            }

            @NotNull
            public String toString() {
                return "TimeUnitResource(unit=" + this.unit + ", resourceId=" + this.resourceId + ')';
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class a {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ a[] $VALUES;
            public static final a Year = new a("Year", 0);
            public static final a Month = new a("Month", 1);
            public static final a Week = new a("Week", 2);
            public static final a Day = new a("Day", 3);
            public static final a Hour = new a("Hour", 4);
            public static final a Minute = new a("Minute", 5);
            public static final a Second = new a("Second", 6);

            private static final /* synthetic */ a[] $values() {
                return new a[]{Year, Month, Week, Day, Hour, Minute, Second};
            }

            static {
                a[] $values = $values();
                $VALUES = $values;
                $ENTRIES = EnumEntriesKt.enumEntries($values);
            }

            private a(String str, int i10) {
            }

            @NotNull
            public static EnumEntries<a> getEntries() {
                return $ENTRIES;
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) $VALUES.clone();
            }
        }

        static {
            a aVar = a.Year;
            Pair pair = TuplesKt.to(aVar, 31536000L);
            a aVar2 = a.Month;
            Pair pair2 = TuplesKt.to(aVar2, 2592000L);
            a aVar3 = a.Week;
            Pair pair3 = TuplesKt.to(aVar3, 604800L);
            a aVar4 = a.Day;
            Pair pair4 = TuplesKt.to(aVar4, 86400L);
            a aVar5 = a.Hour;
            Pair pair5 = TuplesKt.to(aVar5, 3600L);
            a aVar6 = a.Minute;
            Pair pair6 = TuplesKt.to(aVar6, 60L);
            a aVar7 = a.Second;
            f44412b = MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, pair6, TuplesKt.to(aVar7, 1L));
            f44413c = CollectionsKt.listOf((Object[]) new TimeUnitResource[]{new TimeUnitResource(aVar, od.t.f61038h5), new TimeUnitResource(aVar2, od.t.f61017e5), new TimeUnitResource(aVar3, od.t.f61031g5), new TimeUnitResource(aVar4, od.t.f60996b5), new TimeUnitResource(aVar5, od.t.f61003c5), new TimeUnitResource(aVar6, od.t.f61010d5), new TimeUnitResource(aVar7, od.t.f61024f5)});
        }

        public static final String a(Context context, long j10, int i10, boolean z10, List list) {
            int resourceId;
            Object obj;
            if (context == null) {
                context = MobilistenInitProvider.INSTANCE.e();
            }
            long floor = ((long) Math.floor(Math.abs(j10 / 1000))) | 1;
            if (!z10 && floor < 60) {
                String string = context != null ? context.getString(od.t.f61032h) : null;
                return string == null ? "" : string;
            }
            int i11 = 0;
            String str = "";
            for (TimeUnitResource timeUnitResource : f44413c) {
                Object obj2 = f44412b.get(timeUnitResource.getUnit());
                Intrinsics.checkNotNull(obj2);
                long longValue = ((Number) obj2).longValue();
                if (AbstractC5891c.d(list)) {
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (((TimeUnitResource) obj).getUnit() == timeUnitResource.getUnit()) {
                                break;
                            }
                        }
                        TimeUnitResource timeUnitResource2 = (TimeUnitResource) obj;
                        if (timeUnitResource2 != null) {
                            resourceId = timeUnitResource2.getResourceId();
                        }
                    }
                    resourceId = timeUnitResource.getResourceId();
                } else {
                    resourceId = timeUnitResource.getResourceId();
                }
                if (z10 || timeUnitResource.getResourceId() != od.t.f61024f5) {
                    long roundToLong = MathKt.roundToLong(Math.floor(floor / longValue));
                    floor %= longValue;
                    if (roundToLong <= 0) {
                        if (str.length() > 0) {
                            break;
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(' ');
                        sb2.append(roundToLong);
                        String string2 = context != null ? context.getString(resourceId) : null;
                        if (string2 == null) {
                            string2 = "";
                        }
                        sb2.append(string2);
                        str = sb2.toString();
                        i11++;
                        if (i11 == i10) {
                            break;
                        }
                    }
                }
            }
            return StringsKt.trim((CharSequence) str).toString();
        }

        public static /* synthetic */ String b(Context context, long j10, int i10, boolean z10, List list, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                i10 = 2;
            }
            int i12 = i10;
            if ((i11 & 8) != 0) {
                z10 = false;
            }
            boolean z11 = z10;
            if ((i11 & 16) != 0) {
                list = null;
            }
            return a(context, j10, i12, z11, list);
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f44414a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final Lazy f44415b = LazyKt.lazy(C0643a.f44416d);

        /* renamed from: com.zoho.livechat.android.utils.MobilistenUtil$a$a, reason: collision with other inner class name */
        public static final class C0643a extends Lambda implements Function0 {

            /* renamed from: d, reason: collision with root package name */
            public static final C0643a f44416d = new C0643a();

            public C0643a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Ge.g invoke() {
                return new Ge.g(MobilistenUtil.f44409c);
            }
        }

        public static final Ge.g a() {
            return (Ge.g) f44415b.getValue();
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f44417a = new b();

        public final String a(Uri uri) {
            String scheme;
            Integer valueOf;
            ContentResolver contentResolver;
            Cursor cursor = null;
            r1 = null;
            String str = null;
            cursor = null;
            if (StringsKt.equals(uri != null ? uri.getScheme() : null, "file", true)) {
                if (uri != null) {
                    return uri.getLastPathSegment();
                }
                return null;
            }
            if (uri == null || (scheme = uri.getScheme()) == null || !StringsKt.equals(scheme, "content", true)) {
                return "";
            }
            String[] strArr = {"mime_type"};
            try {
                try {
                    Application e10 = MobilistenInitProvider.INSTANCE.e();
                    Cursor query = (e10 == null || (contentResolver = e10.getContentResolver()) == null) ? null : contentResolver.query(uri, strArr, null, null, null);
                    if (query != null) {
                        try {
                            valueOf = Integer.valueOf(query.getColumnIndexOrThrow("mime_type"));
                        } catch (Exception e11) {
                            e = e11;
                            cursor = query;
                            LiveChatUtil.log(e);
                            if (cursor == null) {
                                return "";
                            }
                            cursor.close();
                            return "";
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = query;
                            Throwable th3 = th;
                            if (cursor == null) {
                                throw th3;
                            }
                            cursor.close();
                            throw th3;
                        }
                    } else {
                        valueOf = null;
                    }
                    if (query != null) {
                        query.moveToFirst();
                    }
                    if (valueOf != null) {
                        int intValue = valueOf.intValue();
                        if (query != null) {
                            str = query.getString(intValue);
                        }
                    }
                    if (query != null) {
                        query.close();
                    }
                    return str;
                } catch (Exception e12) {
                    e = e12;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }

        public final String b(Uri uri) {
            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(String.valueOf(uri));
            MimeTypeMap singleton = MimeTypeMap.getSingleton();
            Intrinsics.checkNotNull(fileExtensionFromUrl);
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            String lowerCase = fileExtensionFromUrl.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            String mimeTypeFromExtension = singleton.getMimeTypeFromExtension(lowerCase);
            return mimeTypeFromExtension == null ? a(uri) : mimeTypeFromExtension;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final c f44418a = new c();

        /* renamed from: b, reason: collision with root package name */
        public static final Lazy f44419b = LazyKt.lazy(b.f44422d);

        /* renamed from: c, reason: collision with root package name */
        public static final Lazy f44420c = LazyKt.lazy(a.f44421d);

        public static final class a extends Lambda implements Function0 {

            /* renamed from: d, reason: collision with root package name */
            public static final a f44421d = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Ge.f invoke() {
                return new Ge.f(MobilistenUtil.f44409c);
            }
        }

        public static final class b extends Lambda implements Function0 {

            /* renamed from: d, reason: collision with root package name */
            public static final b f44422d = new b();

            public b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Ge.i invoke() {
                return new Ge.i(MobilistenUtil.f44409c);
            }
        }

        public static final Ge.f a() {
            return (Ge.f) f44420c.getValue();
        }

        public static final Ge.i b() {
            return (Ge.i) f44419b.getValue();
        }
    }

    public static final class d extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f44423n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f44424o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ View f44425p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f44426q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ int f44427r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ View f44428s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Object f44429t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(View view, int i10, int i11, View view2, Object obj, Continuation continuation) {
            super(2, continuation);
            this.f44425p = view;
            this.f44426q = i10;
            this.f44427r = i11;
            this.f44428s = view2;
            this.f44429t = obj;
        }

        public static final void j(Snackbar snackbar, View view) {
            snackbar.y();
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            d dVar = new d(this.f44425p, this.f44426q, this.f44427r, this.f44428s, this.f44429t, continuation);
            dVar.f44424o = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((d) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m147constructorimpl;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f44423n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            View view = this.f44425p;
            int i10 = this.f44426q;
            int i11 = this.f44427r;
            View view2 = this.f44428s;
            Object obj2 = this.f44429t;
            try {
                Result.Companion companion = Result.INSTANCE;
                androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(view.getContext(), ZohoSalesIQ.getStyleForCurrentThemeMode());
                final Snackbar l02 = Snackbar.l0(view, i10, i11);
                if (view2 != null) {
                }
                boolean z10 = true;
                l02.U(1);
                if (obj2 == null) {
                    z10 = false;
                }
                int b10 = og.k.b(24);
                int b11 = og.k.b(16);
                float d10 = og.k.d(4);
                Integer boxInt = Boxing.boxInt(b11 + b10);
                boxInt.intValue();
                if (!z10) {
                    boxInt = null;
                }
                int k10 = og.i.k(boxInt) + b11;
                int d11 = androidx.core.content.res.k.d(dVar.getResources(), od.n.f59922b, dVar.getTheme());
                View H10 = l02.H();
                ViewGroup.LayoutParams layoutParams = l02.H().getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMargins(b11, b11, b11, b11);
                H10.setLayoutParams(marginLayoutParams);
                l02.H().setPadding(0, 0, 0, 0);
                View H11 = l02.H();
                Intrinsics.checkNotNullExpressionValue(H11, "getView(...)");
                og.p.d(H11, og.k.b(8), Boxing.boxInt(d11), 0, null, false, 28, null);
                TextView textView = (TextView) l02.H().findViewById(ia.g.f48428e0);
                textView.setTextColor(androidx.core.content.res.k.d(dVar.getResources(), od.n.f59923c, dVar.getTheme()));
                textView.setTypeface(C6218a.P());
                textView.setPadding(b11, 0, k10, 0);
                if (z10) {
                    ImageView imageView = new ImageView(view.getContext());
                    if (obj2 instanceof Drawable) {
                        imageView.setImageDrawable((Drawable) obj2);
                    }
                    imageView.setOnClickListener(new View.OnClickListener() { // from class: com.zoho.livechat.android.utils.M
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            MobilistenUtil.d.j(Snackbar.this, view3);
                        }
                    });
                    float[] fArr = new float[8];
                    ArraysKt.fill$default(fArr, d10, 0, 0, 6, (Object) null);
                    Unit unit = Unit.INSTANCE;
                    og.p.v(imageView, d11, fArr, null, false, 0, 28, null);
                    View H12 = l02.H();
                    ViewGroup viewGroup = H12 instanceof FrameLayout ? (FrameLayout) H12 : null;
                    if (viewGroup != null) {
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(b10, b10);
                        layoutParams2.gravity = 8388629;
                        layoutParams2.setMarginEnd(og.k.b(16));
                        viewGroup.addView(imageView, layoutParams2);
                    }
                }
                l02.Z();
                m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
            if (m150exceptionOrNullimpl != null) {
                LiveChatUtil.log(m150exceptionOrNullimpl);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class e extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f44430n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f44431o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f44432p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, int i10, Continuation continuation) {
            super(2, continuation);
            this.f44431o = str;
            this.f44432p = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new e(this.f44431o, this.f44432p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((e) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f44430n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Toast.makeText(MobilistenUtil.f44408b, this.f44431o, this.f44432p).show();
            return Unit.INSTANCE;
        }
    }

    public static final class f extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f44433n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f44434o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f44435p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int i10, int i11, Continuation continuation) {
            super(2, continuation);
            this.f44434o = i10;
            this.f44435p = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new f(this.f44434o, this.f44435p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((f) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f44433n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Toast makeText = Toast.makeText(MobilistenUtil.f44408b, MobilistenUtil.f44408b.getString(this.f44434o), this.f44435p);
            if (makeText != null) {
                makeText.show();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class g extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final g f44436d = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Ge.k invoke() {
            return new Ge.k(MobilistenUtil.f44409c);
        }
    }

    static {
        MobilistenInitProvider.Companion companion = MobilistenInitProvider.INSTANCE;
        Application e10 = companion.e();
        Intrinsics.checkNotNull(e10);
        f44408b = e10;
        a.C0020a c0020a = Be.a.f866b;
        Application e11 = companion.e();
        Intrinsics.checkNotNull(e11);
        f44409c = c0020a.a(e11);
        f44410d = LazyKt.lazy(g.f44436d);
    }

    public static /* synthetic */ void A(String str, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        y(str, i10);
    }

    public static final void B(String chatId, Hashtable hashtable) {
        ContentResolver contentResolver;
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        long q10 = og.i.q(String.valueOf(hashtable != null ? hashtable.get("current_position") : null), -1L);
        Long longOrNull = StringsKt.toLongOrNull(String.valueOf(hashtable != null ? hashtable.get("average_response_time") : null));
        long longValue = longOrNull != null ? longOrNull.longValue() : 60L;
        if (longValue < 1) {
            longValue = 60;
        }
        if (q10 > 0) {
            ContentValues contentValues = new ContentValues();
            long j10 = longValue / 1000;
            long j11 = j10 > 0 ? j10 : 60L;
            contentValues.put("SHOW_QUEUE", (Integer) 1);
            contentValues.put("QUEUEPOSITION", Long.valueOf(q10));
            contentValues.put("QUEUE_START_TIME", Long.valueOf(rd.b.f()));
            contentValues.put("QUEUE_END_TIME", Long.valueOf(j11));
            Application e10 = MobilistenInitProvider.INSTANCE.e();
            if (e10 == null || (contentResolver = e10.getContentResolver()) == null) {
                return;
            }
            contentResolver.update(b.a.f44269a, contentValues, "CHATID=?", new String[]{chatId});
        }
    }

    public static final String c() {
        return Ye.d.l(De.a.AccessKey, null);
    }

    public static final String d() {
        return Ye.d.l(De.a.AppKey, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String e() {
        Object m147constructorimpl;
        Throwable m150exceptionOrNullimpl;
        Application application;
        ApplicationInfo applicationInfo;
        String obj;
        CharSequence charSequence;
        Object m147constructorimpl2;
        try {
            Result.Companion companion = Result.INSTANCE;
            application = f44408b;
            applicationInfo = application.getApplicationInfo();
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        if (applicationInfo != null) {
            Integer valueOf = Integer.valueOf(applicationInfo.labelRes);
            if (valueOf.intValue() <= 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                try {
                    m147constructorimpl2 = Result.m147constructorimpl(application.getString(valueOf.intValue()));
                } catch (Throwable th3) {
                    Result.Companion companion3 = Result.INSTANCE;
                    m147constructorimpl2 = Result.m147constructorimpl(ResultKt.createFailure(th3));
                }
                if (Result.m153isFailureimpl(m147constructorimpl2)) {
                    m147constructorimpl2 = null;
                }
                obj = (String) m147constructorimpl2;
                if (obj == null) {
                }
                m147constructorimpl = Result.m147constructorimpl(obj);
                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                if (m150exceptionOrNullimpl != null) {
                    LiveChatUtil.log(m150exceptionOrNullimpl);
                }
                String str = (String) (Result.m153isFailureimpl(m147constructorimpl) ? null : m147constructorimpl);
                return str != null ? "App Name Not Found" : str;
            }
        }
        ApplicationInfo applicationInfo2 = f44408b.getApplicationInfo();
        obj = (applicationInfo2 == null || (charSequence = applicationInfo2.nonLocalizedLabel) == null) ? null : charSequence.toString();
        m147constructorimpl = Result.m147constructorimpl(obj);
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
        }
        String str2 = (String) (Result.m153isFailureimpl(m147constructorimpl) ? null : m147constructorimpl);
        if (str2 != null) {
        }
    }

    public static final String f() {
        Application e10 = MobilistenInitProvider.INSTANCE.e();
        if (e10 != null) {
            return e10.getPackageName();
        }
        return null;
    }

    public static final String g() {
        return f();
    }

    public static final List h() {
        String str;
        ArrayList arrayList = new ArrayList();
        boolean isConversationEnabled = LiveChatUtil.isConversationEnabled();
        boolean isArticlesEnabled = LiveChatUtil.isArticlesEnabled();
        if (isConversationEnabled) {
            arrayList.add(ZohoSalesIQ.l.Conversations);
        }
        if (isArticlesEnabled) {
            arrayList.add(ZohoSalesIQ.l.KnowledgeBase);
        }
        SharedPreferences M10 = C6218a.M();
        if (M10 != null) {
            if (arrayList.isEmpty()) {
                str = null;
            } else {
                str = arrayList.toString().substring(1, arrayList.toString().length() - 1);
                Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
            }
            String string = M10.getString("salesiq_tabs_order", str);
            if (string != null && string.length() != 0) {
                ArrayList arrayList2 = new ArrayList();
                for (String str2 : StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null)) {
                    String obj = StringsKt.trim((CharSequence) str2).toString();
                    ZohoSalesIQ.l lVar = ZohoSalesIQ.l.Conversations;
                    if (Intrinsics.areEqual(obj, lVar.name()) && isConversationEnabled) {
                        arrayList2.add(lVar);
                        arrayList.remove(lVar);
                    } else if (Intrinsics.areEqual(StringsKt.trim((CharSequence) str2).toString(), ZohoSalesIQ.l.FAQ.name()) || Intrinsics.areEqual(StringsKt.trim((CharSequence) str2).toString(), ZohoSalesIQ.l.KnowledgeBase.name())) {
                        if (isArticlesEnabled) {
                            ZohoSalesIQ.l lVar2 = ZohoSalesIQ.l.KnowledgeBase;
                            arrayList2.add(lVar2);
                            arrayList.remove(lVar2);
                        }
                    }
                }
                if (!arrayList2.isEmpty()) {
                    if (!arrayList.isEmpty()) {
                        arrayList2.addAll(arrayList);
                    }
                    return arrayList2;
                }
            }
        }
        return arrayList;
    }

    public static final Ge.k i() {
        return (Ge.k) f44410d.getValue();
    }

    public static final boolean j() {
        String l10;
        String l11 = Ye.d.l(De.a.AppKey, null);
        return l11 == null || l11.length() == 0 || (l10 = Ye.d.l(De.a.AccessKey, null)) == null || l10.length() == 0;
    }

    public static final boolean k() {
        Application e10 = MobilistenInitProvider.INSTANCE.e();
        Intrinsics.checkNotNull(e10);
        return (e10.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static final boolean l() {
        Resources resources;
        Configuration configuration;
        Application e10 = MobilistenInitProvider.INSTANCE.e();
        return (e10 == null || (resources = e10.getResources()) == null || (configuration = resources.getConfiguration()) == null || configuration.orientation != 2) ? false : true;
    }

    public static final boolean m() {
        return w0.q.a(Locale.getDefault()) == 1;
    }

    public static final void n() {
        LiveChatUtil.log("Registering for push notifications");
        synchronized (f44407a) {
            try {
                String fCMId = LiveChatUtil.getFCMId();
                SharedPreferences M10 = C6218a.M();
                String string = M10 != null ? M10.getString("pushstatus", Constants.CASEFIRST_FALSE) : null;
                if (string != null && !Intrinsics.areEqual(string, "true")) {
                    if (fCMId != null && fCMId.length() != 0) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("os", com.twilio.voice.Constants.PLATFORM_ANDROID);
                        hashMap.put("test_device", String.valueOf(LiveChatUtil.isTestDevice()));
                        Intrinsics.checkNotNull(fCMId);
                        hashMap.put("registration_id", fCMId);
                        String insID = LiveChatUtil.getInsID();
                        if (insID != null) {
                            Intrinsics.checkNotNull(insID);
                            hashMap.put("installation_id", insID);
                        }
                        String zldp = LiveChatUtil.getZLDP();
                        if (zldp != null) {
                            Intrinsics.checkNotNull(zldp);
                            hashMap.put("_zldp", zldp);
                        }
                        hashMap.put(PublisherMetadata.OS_VERSION, String.valueOf(Build.VERSION.SDK_INT));
                        String B10 = C6218a.B();
                        if (B10 != null) {
                            Intrinsics.checkNotNull(B10);
                            hashMap.put("device_info", B10);
                        }
                        String visitorName = LiveChatUtil.getVisitorName();
                        if (visitorName != null) {
                            Intrinsics.checkNotNull(visitorName);
                            hashMap.put("name", visitorName);
                        }
                        String e10 = ZohoLiveChat.e.e();
                        if (e10 != null) {
                            Intrinsics.checkNotNull(e10);
                            hashMap.put("email", e10);
                        }
                        if (C6218a.M() != null) {
                            LiveChatUtil.submitTaskToExecutorServiceSafely(new N(LiveChatUtil.getAnnonID(), LiveChatUtil.getScreenName(), hashMap, true, null));
                            Unit unit = Unit.INSTANCE;
                        }
                        return;
                    }
                    return;
                }
                LiveChatUtil.log("Push notifications registered already");
            } finally {
            }
        }
    }

    public static final void o(ZohoSalesIQ.l... tabOrders) {
        Intrinsics.checkNotNullParameter(tabOrders, "tabOrders");
        List<ZohoSalesIQ.l> distinct = ArraysKt.distinct(tabOrders);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(distinct, 10));
        for (ZohoSalesIQ.l lVar : distinct) {
            if (lVar == ZohoSalesIQ.l.FAQ) {
                lVar = ZohoSalesIQ.l.KnowledgeBase;
            }
            arrayList.add(lVar);
        }
        String substring = arrayList.toString().substring(1, arrayList.toString().length() - 1);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        if (C6218a.M() != null) {
            SharedPreferences M10 = C6218a.M();
            SharedPreferences.Editor edit = M10 != null ? M10.edit() : null;
            if (edit != null) {
                edit.putString("salesiq_tabs_order", substring);
            }
            if (edit != null) {
                edit.apply();
            }
        }
    }

    public static final void p(View parent, View view, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        r(parent, view, i10, 0, null, 24, null);
    }

    public static final void q(View parent, View view, int i10, int i11, Object obj) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (i10 != -1) {
            AbstractC1459k.d(C6461a.f65810a.e(), C1452g0.c(), null, new d(parent, i10, i11, view, obj, null), 2, null);
        }
    }

    public static /* synthetic */ void r(View view, View view2, int i10, int i11, Object obj, int i12, Object obj2) {
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        if ((i12 & 16) != 0) {
            obj = null;
        }
        q(view, view2, i10, i11, obj);
    }

    public static final void s(View parent, View view, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        u(parent, view, i10, 0, 8, null);
    }

    public static final void t(View parent, View view, int i10, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int i12 = od.p.f60119k;
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        q(parent, view, i10, i11, AbstractC5892d.c(context, i12, AbstractC5892d.i(context2, od.n.f59925e)));
    }

    public static /* synthetic */ void u(View view, View view2, int i10, int i11, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        t(view, view2, i10, i11);
    }

    public static final void v(int i10) {
        z(i10, 0, 2, null);
    }

    public static final void w(int i10, int i11) {
        if (i10 != -1) {
            AbstractC1459k.d(C6461a.f65810a.e(), C1452g0.c(), null, new f(i10, i11, null), 2, null);
        }
    }

    public static final void x(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        A(text, 0, 2, null);
    }

    public static final void y(String text, int i10) {
        Intrinsics.checkNotNullParameter(text, "text");
        AbstractC1459k.d(C6461a.f65810a.e(), C1452g0.c(), null, new e(text, i10, null), 2, null);
    }

    public static /* synthetic */ void z(int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        w(i10, i11);
    }
}
