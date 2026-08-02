package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.ironsource.C2676u;
import com.ironsource.X3;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.AbstractC2867b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.C2866a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.o;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.p;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.s;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.w;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z;
import com.vungle.ads.internal.protos.Sdk;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes4.dex */
public final class k {
    public static final String A = "CustomClick";
    public static final String B = "Icons";
    public static final String C = "Icon";
    public static final String D = "StaticResource";
    public static final String E = "IFrameResource";
    public static final String F = "HTMLResource";
    public static final String G = "IconClicks";
    public static final String H = "IconClickThrough";
    public static final String I = "IconClickTracking";
    public static final String J = "IconViewTracking";
    public static final String K = "AltText";
    public static final String L = "CompanionAds";
    public static final String M = "Companion";
    public static final String N = "CompanionClickThrough";
    public static final String O = "CompanionClickTracking";
    public static final Lazy a = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return k.a();
        }
    });
    public static final NumberFormat b = NumberFormat.getPercentInstance();
    public static final String c = "Error";
    public static final String d = "Ad";
    public static final String e = "InLine";
    public static final String f = "Wrapper";
    public static final String g = "VASTAdTagURI";
    public static final String h = "AdSystem";
    public static final String i = "AdTitle";
    public static final String j = "Description";
    public static final String k = "Advertiser";
    public static final String l = "Pricing";
    public static final String m = "Survey";
    public static final String n = "Impression";
    public static final String o = "Creatives";
    public static final String p = "Creative";
    public static final String q = "Linear";
    public static final String r = "AdParameters";
    public static final String s = "Duration";
    public static final String t = "MediaFiles";
    public static final String u = "MediaFile";
    public static final String v = "TrackingEvents";
    public static final String w = "Tracking";
    public static final String x = "VideoClicks";
    public static final String y = "ClickThrough";
    public static final String z = "ClickTracking";

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {941}, m = "parseInLineTag", n = {"adSystem", "adTitle", "description", X3.i.F0, "pricing", "impressions", "errorUrls", "creatives"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7"})
    public static final class A extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public Object g;
        public Object h;
        public /* synthetic */ Object i;
        public int j;

        public A(Continuation<? super A> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.j |= Integer.MIN_VALUE;
            return k.K(null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseLinearTag$$inlined$iterateTag$1", f = "VastParser.kt", i = {0, 1, 2, 3, 4, 5}, l = {Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, 126, 127, 128, 129}, m = "invokeSuspend", n = {"initialDepth", "initialDepth", "initialDepth", "initialDepth", "initialDepth", "initialDepth"}, s = {"I$0", "I$0", "I$0", "I$0", "I$0", "I$0"})
    public static final class B extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ XmlPullParser d;
        public final /* synthetic */ Ref.ObjectRef e;
        public final /* synthetic */ Ref.ObjectRef f;
        public final /* synthetic */ Ref.ObjectRef g;
        public final /* synthetic */ List h;
        public final /* synthetic */ List i;
        public final /* synthetic */ Ref.ObjectRef j;
        public final /* synthetic */ boolean k;
        public final /* synthetic */ List l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public B(XmlPullParser xmlPullParser, Continuation continuation, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3, List list, List list2, Ref.ObjectRef objectRef4, boolean z, List list3) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = objectRef;
            this.f = objectRef2;
            this.g = objectRef3;
            this.h = list;
            this.i = list2;
            this.j = objectRef4;
            this.k = z;
            this.l = list3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((B) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            B b = new B(this.d, continuation, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
            b.c = obj;
            return b;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00ec, code lost:
        
            if (r6 == r0) goto L81;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x014e, code lost:
        
            if (r6 == r0) goto L81;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x01cb  */
        /* JADX WARN: Type inference failed for: r6v19, types: [T, java.lang.Long] */
        /* JADX WARN: Type inference failed for: r6v40, types: [T, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r] */
        /* JADX WARN: Type inference failed for: r6v44, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v46, types: [T, java.lang.Object] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0096 -> B:8:0x01c4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00a0 -> B:8:0x01c4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00a8 -> B:8:0x01c4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00ae -> B:8:0x01c4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00b9 -> B:8:0x01c4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00db -> B:8:0x01c4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00ec -> B:7:0x00f0). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00fd -> B:8:0x01c4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x011f -> B:8:0x01c4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x013d -> B:8:0x01c4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0164 -> B:8:0x01c4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0184 -> B:8:0x01c4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x01a6 -> B:8:0x01c4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x01bf -> B:8:0x01c4). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int depth;
            Ref.ObjectRef objectRef;
            Object obj2;
            String text;
            XmlPullParser xmlPullParser;
            String name;
            List list;
            Object obj3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.b) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    CoroutineScopeKt.ensureActive((CoroutineScope) this.c);
                    if (k.j(this.d)) {
                        this.d.nextTag();
                    }
                    if (k.h(this.d)) {
                        return Unit.INSTANCE;
                    }
                    if (!k.k(this.d)) {
                        throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
                    }
                    depth = this.d.getDepth();
                    if (this.d.getDepth() < depth) {
                        return Unit.INSTANCE;
                    }
                    int depth2 = this.d.getDepth() - depth;
                    if (depth2 != 0) {
                        if (depth2 == 1 && k.k(this.d) && (name = (xmlPullParser = this.d).getName()) != null) {
                            switch (name.hashCode()) {
                                case -2049897434:
                                    if (name.equals(k.x)) {
                                        Ref.ObjectRef objectRef2 = this.j;
                                        boolean z = this.k;
                                        this.c = objectRef2;
                                        this.a = depth;
                                        this.b = 5;
                                        ?? h = k.h(xmlPullParser, z, this);
                                        if (h != coroutine_suspended) {
                                            objectRef2.element = h;
                                            break;
                                        }
                                        return coroutine_suspended;
                                    }
                                    break;
                                case -1927368268:
                                    if (name.equals(k.s)) {
                                        objectRef = this.g;
                                        this.c = objectRef;
                                        this.a = depth;
                                        this.b = 2;
                                        Object P = k.P(xmlPullParser, this);
                                        obj2 = P;
                                        break;
                                    }
                                    break;
                                case -1348833651:
                                    if (name.equals(k.r)) {
                                        Ref.ObjectRef objectRef3 = this.f;
                                        this.c = objectRef3;
                                        this.a = depth;
                                        this.b = 1;
                                        ?? y = k.y(xmlPullParser, this);
                                        if (y != coroutine_suspended) {
                                            objectRef3.element = y;
                                            break;
                                        }
                                        return coroutine_suspended;
                                    }
                                    break;
                                case -385055469:
                                    if (name.equals(k.t)) {
                                        List list2 = this.h;
                                        this.c = list2;
                                        this.a = depth;
                                        this.b = 3;
                                        Object M = k.M(xmlPullParser, this);
                                        if (M != coroutine_suspended) {
                                            list2.addAll((Collection) M);
                                            break;
                                        }
                                        return coroutine_suspended;
                                    }
                                    break;
                                case 70476538:
                                    if (name.equals(k.B)) {
                                        list = this.l;
                                        this.c = list;
                                        this.a = depth;
                                        this.b = 6;
                                        Object I = k.I(xmlPullParser, this);
                                        obj3 = I;
                                        break;
                                    }
                                    break;
                                case 611554000:
                                    if (name.equals(k.v)) {
                                        List list3 = this.i;
                                        this.c = list3;
                                        this.a = depth;
                                        this.b = 4;
                                        Object Q = k.Q(xmlPullParser, this);
                                        if (Q != coroutine_suspended) {
                                            list3.addAll((Collection) Q);
                                            break;
                                        }
                                        return coroutine_suspended;
                                    }
                                    break;
                            }
                        }
                    } else if (k.k(this.d)) {
                        this.e.element = k.n(this.d);
                    } else if (k.l(this.d) && (text = this.d.getText()) != null && !StringsKt.isBlank(text)) {
                        String text2 = this.d.getText();
                        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                        StringsKt.trim((CharSequence) text2).toString();
                    } else if (k.i(this.d)) {
                        return Unit.INSTANCE;
                    }
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 1:
                    depth = this.a;
                    Ref.ObjectRef objectRef4 = (Ref.ObjectRef) this.c;
                    ResultKt.throwOnFailure(obj);
                    objectRef4.element = obj;
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 2:
                    depth = this.a;
                    objectRef = (Ref.ObjectRef) this.c;
                    ResultKt.throwOnFailure(obj);
                    obj2 = obj;
                    String str = (String) obj2;
                    if (str != null) {
                        objectRef.element = k.f(str);
                    } else {
                        objectRef.element = null;
                    }
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 3:
                    depth = this.a;
                    List list4 = (List) this.c;
                    ResultKt.throwOnFailure(obj);
                    list4.addAll((Collection) obj);
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 4:
                    depth = this.a;
                    List list5 = (List) this.c;
                    ResultKt.throwOnFailure(obj);
                    list5.addAll((Collection) obj);
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 5:
                    depth = this.a;
                    Ref.ObjectRef objectRef5 = (Ref.ObjectRef) this.c;
                    ResultKt.throwOnFailure(obj);
                    objectRef5.element = obj;
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 6:
                    depth = this.a;
                    list = (List) this.c;
                    ResultKt.throwOnFailure(obj);
                    obj3 = obj;
                    list.addAll((Collection) obj3);
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {941}, m = "parseLinearTag", n = {"skipOffset", "adParameters", "durationMillis", "mediaFiles", "trackingList", "videoClicks", "icons", "isInLineParent"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "Z$0"})
    public static final class C extends ContinuationImpl {
        public boolean a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public Object g;
        public Object h;
        public /* synthetic */ Object i;
        public int j;

        public C(Continuation<? super C> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.j |= Integer.MIN_VALUE;
            return k.g(null, false, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseMediaFileTag$$inlined$iterateTag$1", f = "VastParser.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class D extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ XmlPullParser d;
        public final /* synthetic */ Ref.ObjectRef e;
        public final /* synthetic */ Ref.ObjectRef f;
        public final /* synthetic */ Ref.ObjectRef g;
        public final /* synthetic */ Ref.ObjectRef h;
        public final /* synthetic */ Ref.ObjectRef i;
        public final /* synthetic */ Ref.ObjectRef j;
        public final /* synthetic */ Ref.ObjectRef k;
        public final /* synthetic */ Ref.ObjectRef l;
        public final /* synthetic */ Ref.ObjectRef m;
        public final /* synthetic */ Ref.ObjectRef n;
        public final /* synthetic */ Ref.ObjectRef o;
        public final /* synthetic */ Ref.ObjectRef p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public D(XmlPullParser xmlPullParser, Continuation continuation, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3, Ref.ObjectRef objectRef4, Ref.ObjectRef objectRef5, Ref.ObjectRef objectRef6, Ref.ObjectRef objectRef7, Ref.ObjectRef objectRef8, Ref.ObjectRef objectRef9, Ref.ObjectRef objectRef10, Ref.ObjectRef objectRef11, Ref.ObjectRef objectRef12) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = objectRef;
            this.f = objectRef2;
            this.g = objectRef3;
            this.h = objectRef4;
            this.i = objectRef5;
            this.j = objectRef6;
            this.k = objectRef7;
            this.l = objectRef8;
            this.m = objectRef9;
            this.n = objectRef10;
            this.o = objectRef11;
            this.p = objectRef12;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((D) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            D d = new D(this.d, continuation, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p);
            d.c = obj;
            return d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v20, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v22, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v17, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v5, types: [T, java.lang.Boolean] */
        /* JADX WARN: Type inference failed for: r2v7, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String text;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScopeKt.ensureActive((CoroutineScope) this.c);
            if (k.j(this.d)) {
                this.d.nextTag();
            }
            if (k.h(this.d)) {
                return Unit.INSTANCE;
            }
            if (!k.k(this.d)) {
                throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = this.d.getDepth();
            while (this.d.getDepth() >= depth) {
                int depth2 = this.d.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1) {
                        k.k(this.d);
                    }
                } else if (k.k(this.d)) {
                    XmlPullParser xmlPullParser = this.d;
                    this.e.element = k.b(xmlPullParser, "id");
                    this.f.element = Boxing.boxBoolean(Intrinsics.areEqual(k.b(xmlPullParser, C2676u.g), "progressive"));
                    this.g.element = k.b(xmlPullParser, "type");
                    Ref.ObjectRef objectRef = this.h;
                    String b = k.b(xmlPullParser, "width");
                    objectRef.element = b != null ? StringsKt.toIntOrNull(b) : 0;
                    Ref.ObjectRef objectRef2 = this.i;
                    String b2 = k.b(xmlPullParser, "height");
                    objectRef2.element = b2 != null ? StringsKt.toIntOrNull(b2) : 0;
                    this.j.element = k.b(xmlPullParser, "codec");
                    Ref.ObjectRef objectRef3 = this.k;
                    String b3 = k.b(xmlPullParser, "bitrate");
                    objectRef3.element = b3 != null ? StringsKt.toIntOrNull(b3) : 0;
                    Ref.ObjectRef objectRef4 = this.l;
                    String b4 = k.b(xmlPullParser, "minBitrate");
                    objectRef4.element = b4 != null ? StringsKt.toIntOrNull(b4) : 0;
                    Ref.ObjectRef objectRef5 = this.m;
                    String b5 = k.b(xmlPullParser, "maxBitrate");
                    objectRef5.element = b5 != null ? StringsKt.toIntOrNull(b5) : 0;
                    Ref.ObjectRef objectRef6 = this.n;
                    String b6 = k.b(xmlPullParser, "scalable");
                    objectRef6.element = b6 != null ? Boxing.boxBoolean(Boolean.parseBoolean(b6)) : 0;
                    this.o.element = k.b(xmlPullParser, "apiFramework");
                } else if (k.l(this.d) && (text = this.d.getText()) != null && !StringsKt.isBlank(text)) {
                    String text2 = this.d.getText();
                    Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                    this.p.element = StringsKt.trim((CharSequence) text2).toString();
                } else if (k.i(this.d)) {
                    return Unit.INSTANCE;
                }
                this.d.next();
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {941}, m = "parseMediaFileTag", n = {"mediaFileUrl", "id", "isProgressiveDelivery", "type", "widthPx", "heightPx", "codec", "bitrate", "minBitrate", "maxBitrate", "isScalable", "apiFramework"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11"})
    public static final class E extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public Object g;
        public Object h;
        public Object i;
        public Object j;
        public Object k;
        public Object l;
        public /* synthetic */ Object m;
        public int n;

        public E(Continuation<? super E> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.m = obj;
            this.n |= Integer.MIN_VALUE;
            return k.L(null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseMediaFilesTag$$inlined$iterateTag$1", f = "VastParser.kt", i = {0}, l = {Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE}, m = "invokeSuspend", n = {"initialDepth"}, s = {"I$0"})
    public static final class F extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ XmlPullParser d;
        public final /* synthetic */ List e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F(XmlPullParser xmlPullParser, Continuation continuation, List list) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = list;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((F) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            F f = new F(this.d, continuation, this.e);
            f.c = obj;
            return f;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00ce  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0083  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005b -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0064 -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0072 -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x007c -> B:5:0x007f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x008f -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00a9 -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00c2 -> B:8:0x00c7). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int depth;
            String text;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScopeKt.ensureActive((CoroutineScope) this.c);
                if (k.j(this.d)) {
                    this.d.nextTag();
                }
                if (k.h(this.d)) {
                    return Unit.INSTANCE;
                }
                if (!k.k(this.d)) {
                    throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
                }
                depth = this.d.getDepth();
                if (this.d.getDepth() < depth) {
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                depth = this.a;
                ResultKt.throwOnFailure(obj);
                q qVar = (q) obj;
                if (qVar != null) {
                    this.e.add(qVar);
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                    return Unit.INSTANCE;
                }
                int depth2 = this.d.getDepth() - depth;
                if (depth2 == 0) {
                    if (!k.k(this.d)) {
                        if (k.l(this.d) && (text = this.d.getText()) != null && !StringsKt.isBlank(text)) {
                            String text2 = this.d.getText();
                            Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                            StringsKt.trim((CharSequence) text2).toString();
                        } else if (k.i(this.d)) {
                            return Unit.INSTANCE;
                        }
                    }
                } else if (depth2 == 1 && k.k(this.d)) {
                    XmlPullParser xmlPullParser = this.d;
                    if (Intrinsics.areEqual(xmlPullParser.getName(), k.u)) {
                        this.a = depth;
                        this.b = 1;
                        obj = k.L(xmlPullParser, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        q qVar2 = (q) obj;
                        if (qVar2 != null) {
                        }
                    }
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            }
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", i = {0}, l = {941}, m = "parseMediaFilesTag", n = {"mediaFiles"}, s = {"L$0"})
    public static final class G extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int c;

        public G(Continuation<? super G> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.c |= Integer.MIN_VALUE;
            return k.M(null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parsePricingTag$$inlined$iterateTag$1", f = "VastParser.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class H extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ XmlPullParser d;
        public final /* synthetic */ Ref.ObjectRef e;
        public final /* synthetic */ Ref.ObjectRef f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public H(XmlPullParser xmlPullParser, Continuation continuation, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = objectRef;
            this.f = objectRef2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((H) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            H h = new H(this.d, continuation, this.e, this.f);
            h.c = obj;
            return h;
        }

        /* JADX WARN: Type inference failed for: r0v21, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String text;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScopeKt.ensureActive((CoroutineScope) this.c);
            if (k.j(this.d)) {
                this.d.nextTag();
            }
            if (k.h(this.d)) {
                return Unit.INSTANCE;
            }
            if (!k.k(this.d)) {
                throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = this.d.getDepth();
            while (this.d.getDepth() >= depth) {
                int depth2 = this.d.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1) {
                        k.k(this.d);
                    }
                } else if (k.k(this.d)) {
                    XmlPullParser xmlPullParser = this.d;
                    this.e.element = k.b(xmlPullParser, "model");
                    this.f.element = k.b(xmlPullParser, "currency");
                } else if (k.l(this.d) && (text = this.d.getText()) != null && !StringsKt.isBlank(text)) {
                    String text2 = this.d.getText();
                    Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                    StringsKt.trim((CharSequence) text2).toString();
                } else if (k.i(this.d)) {
                    return Unit.INSTANCE;
                }
                this.d.next();
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", i = {0, 0}, l = {941}, m = "parsePricingTag", n = {"model", "currency"}, s = {"L$0", "L$1"})
    public static final class I extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int d;

        public I(Continuation<? super I> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            return k.N(null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseStaticResourceTag$$inlined$iterateTag$1", f = "VastParser.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class J extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ XmlPullParser d;
        public final /* synthetic */ Ref.ObjectRef e;
        public final /* synthetic */ Ref.ObjectRef f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public J(XmlPullParser xmlPullParser, Continuation continuation, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = objectRef;
            this.f = objectRef2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((J) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            J j = new J(this.d, continuation, this.e, this.f);
            j.c = obj;
            return j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v20, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String text;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScopeKt.ensureActive((CoroutineScope) this.c);
            if (k.j(this.d)) {
                this.d.nextTag();
            }
            if (k.h(this.d)) {
                return Unit.INSTANCE;
            }
            if (!k.k(this.d)) {
                throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = this.d.getDepth();
            while (this.d.getDepth() >= depth) {
                int depth2 = this.d.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1) {
                        k.k(this.d);
                    }
                } else if (k.k(this.d)) {
                    XmlPullParser xmlPullParser = this.d;
                    Ref.ObjectRef objectRef = this.e;
                    String b = k.b(xmlPullParser, "creativeType");
                    objectRef.element = b != null ? k.e(b) : 0;
                } else if (k.l(this.d) && (text = this.d.getText()) != null && !StringsKt.isBlank(text)) {
                    String text2 = this.d.getText();
                    Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                    this.f.element = StringsKt.trim((CharSequence) text2).toString();
                } else if (k.i(this.d)) {
                    return Unit.INSTANCE;
                }
                this.d.next();
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", i = {0, 0}, l = {941}, m = "parseStaticResourceTag", n = {"resource", "creativeType"}, s = {"L$0", "L$1"})
    public static final class K extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int d;

        public K(Continuation<? super K> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            return k.O(null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseTagsTextOnly$$inlined$iterateTag$1", f = "VastParser.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class L extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ XmlPullParser d;
        public final /* synthetic */ Ref.ObjectRef e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public L(XmlPullParser xmlPullParser, Continuation continuation, Ref.ObjectRef objectRef) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = objectRef;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((L) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            L l = new L(this.d, continuation, this.e);
            l.c = obj;
            return l;
        }

        /* JADX WARN: Type inference failed for: r0v20, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String text;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScopeKt.ensureActive((CoroutineScope) this.c);
            if (k.j(this.d)) {
                this.d.nextTag();
            }
            if (k.h(this.d)) {
                return Unit.INSTANCE;
            }
            if (!k.k(this.d)) {
                throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = this.d.getDepth();
            while (this.d.getDepth() >= depth) {
                int depth2 = this.d.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1) {
                        k.k(this.d);
                    }
                } else if (k.k(this.d)) {
                    continue;
                } else if (k.l(this.d) && (text = this.d.getText()) != null && !StringsKt.isBlank(text)) {
                    String text2 = this.d.getText();
                    Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                    this.e.element = StringsKt.trim((CharSequence) text2).toString();
                } else if (k.i(this.d)) {
                    return Unit.INSTANCE;
                }
                this.d.next();
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", i = {0}, l = {941}, m = "parseTagsTextOnly", n = {"simpleText"}, s = {"L$0"})
    public static final class M extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int c;

        public M(Continuation<? super M> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.c |= Integer.MIN_VALUE;
            return k.P(null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseTrackingEventsTag$$inlined$iterateTag$1", f = "VastParser.kt", i = {0}, l = {Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE}, m = "invokeSuspend", n = {"initialDepth"}, s = {"I$0"})
    public static final class N extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ XmlPullParser d;
        public final /* synthetic */ List e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public N(XmlPullParser xmlPullParser, Continuation continuation, List list) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = list;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((N) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            N n = new N(this.d, continuation, this.e);
            n.c = obj;
            return n;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00ce  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0083  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005b -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0064 -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0072 -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x007c -> B:5:0x007f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x008f -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00a9 -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00c2 -> B:8:0x00c7). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int depth;
            String text;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScopeKt.ensureActive((CoroutineScope) this.c);
                if (k.j(this.d)) {
                    this.d.nextTag();
                }
                if (k.h(this.d)) {
                    return Unit.INSTANCE;
                }
                if (!k.k(this.d)) {
                    throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
                }
                depth = this.d.getDepth();
                if (this.d.getDepth() < depth) {
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                depth = this.a;
                ResultKt.throwOnFailure(obj);
                u uVar = (u) obj;
                if (uVar != null) {
                    this.e.add(uVar);
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                    return Unit.INSTANCE;
                }
                int depth2 = this.d.getDepth() - depth;
                if (depth2 == 0) {
                    if (!k.k(this.d)) {
                        if (k.l(this.d) && (text = this.d.getText()) != null && !StringsKt.isBlank(text)) {
                            String text2 = this.d.getText();
                            Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                            StringsKt.trim((CharSequence) text2).toString();
                        } else if (k.i(this.d)) {
                            return Unit.INSTANCE;
                        }
                    }
                } else if (depth2 == 1 && k.k(this.d)) {
                    XmlPullParser xmlPullParser = this.d;
                    if (Intrinsics.areEqual(xmlPullParser.getName(), k.w)) {
                        this.a = depth;
                        this.b = 1;
                        obj = k.R(xmlPullParser, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        u uVar2 = (u) obj;
                        if (uVar2 != null) {
                        }
                    }
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            }
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", i = {0}, l = {941}, m = "parseTrackingEventsTag", n = {"trackingList"}, s = {"L$0"})
    public static final class O extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int c;

        public O(Continuation<? super O> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.c |= Integer.MIN_VALUE;
            return k.Q(null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseTrackingTag$$inlined$iterateTag$1", f = "VastParser.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class P extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ XmlPullParser d;
        public final /* synthetic */ Ref.ObjectRef e;
        public final /* synthetic */ Ref.ObjectRef f;
        public final /* synthetic */ Ref.ObjectRef g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public P(XmlPullParser xmlPullParser, Continuation continuation, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = objectRef;
            this.f = objectRef2;
            this.g = objectRef3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((P) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            P p = new P(this.d, continuation, this.e, this.f, this.g);
            p.c = obj;
            return p;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v20, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String text;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScopeKt.ensureActive((CoroutineScope) this.c);
            if (k.j(this.d)) {
                this.d.nextTag();
            }
            if (k.h(this.d)) {
                return Unit.INSTANCE;
            }
            if (!k.k(this.d)) {
                throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = this.d.getDepth();
            while (this.d.getDepth() >= depth) {
                int depth2 = this.d.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1) {
                        k.k(this.d);
                    }
                } else if (k.k(this.d)) {
                    XmlPullParser xmlPullParser = this.d;
                    Ref.ObjectRef objectRef = this.e;
                    String b = k.b(xmlPullParser, "event");
                    objectRef.element = b != null ? k.i(b) : 0;
                    Ref.ObjectRef objectRef2 = this.f;
                    String b2 = k.b(xmlPullParser, TypedValues.CycleType.S_WAVE_OFFSET);
                    objectRef2.element = b2 != null ? k.g(b2) : 0;
                } else if (k.l(this.d) && (text = this.d.getText()) != null && !StringsKt.isBlank(text)) {
                    String text2 = this.d.getText();
                    Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                    this.g.element = StringsKt.trim((CharSequence) text2).toString();
                } else if (k.i(this.d)) {
                    return Unit.INSTANCE;
                }
                this.d.next();
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", i = {0, 0, 0}, l = {941}, m = "parseTrackingTag", n = {"event", "url", TypedValues.CycleType.S_WAVE_OFFSET}, s = {"L$0", "L$1", "L$2"})
    public static final class Q extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int e;

        public Q(Continuation<? super Q> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.e |= Integer.MIN_VALUE;
            return k.R(null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseVast$2", f = "VastParser.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
    public static final class R extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super w>, Object> {
        public int a;
        public final /* synthetic */ XmlPullParser b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public R(XmlPullParser xmlPullParser, Continuation<? super R> continuation) {
            super(2, continuation);
            this.b = xmlPullParser;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super w> continuation) {
            return ((R) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new R(this.b, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            XmlPullParser xmlPullParser = this.b;
            this.a = 1;
            Object T = k.T(xmlPullParser, this);
            return T == coroutine_suspended ? coroutine_suspended : T;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseVastTag$$inlined$iterateTag$1", f = "VastParser.kt", i = {0, 1}, l = {Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE}, m = "invokeSuspend", n = {"initialDepth", "initialDepth"}, s = {"I$0", "I$0"})
    public static final class S extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ XmlPullParser d;
        public final /* synthetic */ Ref.ObjectRef e;
        public final /* synthetic */ Ref.ObjectRef f;
        public final /* synthetic */ List g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public S(XmlPullParser xmlPullParser, Continuation continuation, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, List list) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = objectRef;
            this.f = objectRef2;
            this.g = list;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((S) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            S s = new S(this.d, continuation, this.e, this.f, this.g);
            s.c = obj;
            return s;
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x00a8, code lost:
        
            if (r7 == r0) goto L38;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0107  */
        /* JADX WARN: Type inference failed for: r7v34, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r7v39, types: [T, java.lang.Object] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0069 -> B:9:0x0100). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0073 -> B:9:0x0100). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x009b -> B:9:0x0100). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00a8 -> B:6:0x00ab). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00bd -> B:9:0x0100). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00e2 -> B:9:0x0100). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00fb -> B:9:0x0100). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int depth;
            String text;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScopeKt.ensureActive((CoroutineScope) this.c);
                if (k.j(this.d)) {
                    this.d.nextTag();
                }
                if (k.h(this.d)) {
                    return Unit.INSTANCE;
                }
                if (!k.k(this.d)) {
                    throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
                }
                depth = this.d.getDepth();
                if (this.d.getDepth() < depth) {
                }
            } else if (i == 1) {
                depth = this.a;
                Ref.ObjectRef objectRef = (Ref.ObjectRef) this.c;
                ResultKt.throwOnFailure(obj);
                objectRef.element = obj;
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                depth = this.a;
                ResultKt.throwOnFailure(obj);
                Object obj2 = obj;
                C2866a c2866a = (C2866a) obj2;
                if (c2866a != null) {
                    this.g.add(c2866a);
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                    return Unit.INSTANCE;
                }
                int depth2 = this.d.getDepth() - depth;
                if (depth2 == 0) {
                    if (k.k(this.d)) {
                        this.e.element = k.b(this.d, "version");
                    } else if (k.l(this.d) && (text = this.d.getText()) != null && !StringsKt.isBlank(text)) {
                        String text2 = this.d.getText();
                        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                        StringsKt.trim((CharSequence) text2).toString();
                    } else if (k.i(this.d)) {
                        return Unit.INSTANCE;
                    }
                } else if (depth2 == 1 && k.k(this.d)) {
                    XmlPullParser xmlPullParser = this.d;
                    String name = xmlPullParser.getName();
                    if (Intrinsics.areEqual(name, k.c)) {
                        Ref.ObjectRef objectRef2 = this.f;
                        this.c = objectRef2;
                        this.a = depth;
                        this.b = 1;
                        ?? D = k.D(xmlPullParser, this);
                        if (D != coroutine_suspended) {
                            objectRef2.element = D;
                        }
                        return coroutine_suspended;
                    }
                    if (Intrinsics.areEqual(name, k.d)) {
                        this.c = null;
                        this.a = depth;
                        this.b = 2;
                        Object A = k.A(xmlPullParser, this);
                        obj2 = A;
                    }
                    if (this.d.getDepth() < depth) {
                    }
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            }
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", i = {0, 0, 0}, l = {941}, m = "parseVastTag", n = {com.safedk.android.analytics.brandsafety.m.S, "version", "errorUrl"}, s = {"L$0", "L$1", "L$2"})
    public static final class T extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int e;

        public T(Continuation<? super T> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.e |= Integer.MIN_VALUE;
            return k.T(null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseVideoClickTag$$inlined$iterateTag$1", f = "VastParser.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class U extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ XmlPullParser d;
        public final /* synthetic */ Ref.ObjectRef e;
        public final /* synthetic */ Ref.ObjectRef f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public U(XmlPullParser xmlPullParser, Continuation continuation, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = objectRef;
            this.f = objectRef2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((U) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            U u = new U(this.d, continuation, this.e, this.f);
            u.c = obj;
            return u;
        }

        /* JADX WARN: Type inference failed for: r0v20, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v22, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String text;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScopeKt.ensureActive((CoroutineScope) this.c);
            if (k.j(this.d)) {
                this.d.nextTag();
            }
            if (k.h(this.d)) {
                return Unit.INSTANCE;
            }
            if (!k.k(this.d)) {
                throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = this.d.getDepth();
            while (this.d.getDepth() >= depth) {
                int depth2 = this.d.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1) {
                        k.k(this.d);
                    }
                } else if (k.k(this.d)) {
                    this.e.element = k.b(this.d, "id");
                } else if (k.l(this.d) && (text = this.d.getText()) != null && !StringsKt.isBlank(text)) {
                    String text2 = this.d.getText();
                    Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                    this.f.element = StringsKt.trim((CharSequence) text2).toString();
                } else if (k.i(this.d)) {
                    return Unit.INSTANCE;
                }
                this.d.next();
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", i = {0, 0}, l = {941}, m = "parseVideoClickTag", n = {"id", "url"}, s = {"L$0", "L$1"})
    public static final class V extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int d;

        public V(Continuation<? super V> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            return k.U(null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseVideoClicksTag$$inlined$iterateTag$1", f = "VastParser.kt", i = {0, 1, 2}, l = {Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, 126}, m = "invokeSuspend", n = {"initialDepth", "initialDepth", "initialDepth"}, s = {"I$0", "I$0", "I$0"})
    public static final class W extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ XmlPullParser d;
        public final /* synthetic */ Ref.ObjectRef e;
        public final /* synthetic */ List f;
        public final /* synthetic */ List g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public W(XmlPullParser xmlPullParser, Continuation continuation, Ref.ObjectRef objectRef, List list, List list2) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = objectRef;
            this.f = list;
            this.g = list2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((W) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            W w = new W(this.d, continuation, this.e, this.f, this.g);
            w.c = obj;
            return w;
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x00b2, code lost:
        
            if (r10 == r0) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00d4, code lost:
        
            if (r10 == r0) goto L62;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0141  */
        /* JADX WARN: Type inference failed for: r10v38, types: [T, java.lang.Object] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0074 -> B:10:0x013a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007e -> B:10:0x013a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0086 -> B:10:0x013a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x009a -> B:10:0x013a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00a4 -> B:10:0x013a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00b7 -> B:10:0x013a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00b9 -> B:10:0x013a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00c6 -> B:10:0x013a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00d4 -> B:7:0x00d7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00e7 -> B:10:0x013a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0102 -> B:10:0x013a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x011c -> B:10:0x013a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0135 -> B:10:0x013a). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int depth;
            Object obj2;
            String text;
            XmlPullParser xmlPullParser;
            String name;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScopeKt.ensureActive((CoroutineScope) this.c);
                if (k.j(this.d)) {
                    this.d.nextTag();
                }
                if (k.h(this.d)) {
                    return Unit.INSTANCE;
                }
                if (!k.k(this.d)) {
                    throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
                }
                depth = this.d.getDepth();
                if (this.d.getDepth() < depth) {
                }
            } else if (i == 1) {
                depth = this.a;
                Ref.ObjectRef objectRef = (Ref.ObjectRef) this.c;
                ResultKt.throwOnFailure(obj);
                objectRef.element = obj;
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            } else if (i == 2) {
                depth = this.a;
                ResultKt.throwOnFailure(obj);
                obj2 = obj;
                z zVar = (z) obj2;
                if (zVar != null) {
                    this.f.add(zVar);
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                depth = this.a;
                ResultKt.throwOnFailure(obj);
                Object obj3 = obj;
                z zVar2 = (z) obj3;
                if (zVar2 != null) {
                    this.g.add(zVar2);
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                    return Unit.INSTANCE;
                }
                int depth2 = this.d.getDepth() - depth;
                if (depth2 == 0) {
                    if (!k.k(this.d)) {
                        if (k.l(this.d) && (text = this.d.getText()) != null && !StringsKt.isBlank(text)) {
                            String text2 = this.d.getText();
                            Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                            StringsKt.trim((CharSequence) text2).toString();
                        } else if (k.i(this.d)) {
                            return Unit.INSTANCE;
                        }
                    }
                } else if (depth2 == 1 && k.k(this.d) && (name = (xmlPullParser = this.d).getName()) != null) {
                    int hashCode = name.hashCode();
                    if (hashCode == -617879491) {
                        if (name.equals(k.y)) {
                            Ref.ObjectRef objectRef2 = this.e;
                            this.c = objectRef2;
                            this.a = depth;
                            this.b = 1;
                            ?? U = k.U(xmlPullParser, this);
                            if (U != coroutine_suspended) {
                                objectRef2.element = U;
                            }
                            return coroutine_suspended;
                        }
                    } else if (hashCode == -135761801) {
                        if (name.equals(k.A)) {
                            this.c = null;
                            this.a = depth;
                            this.b = 3;
                            Object U2 = k.U(xmlPullParser, this);
                            obj3 = U2;
                        }
                    } else if (hashCode == 2107600959 && name.equals(k.z)) {
                        this.c = null;
                        this.a = depth;
                        this.b = 2;
                        Object U3 = k.U(xmlPullParser, this);
                        obj2 = U3;
                    }
                    if (this.d.getDepth() < depth) {
                    }
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            }
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", i = {0, 0, 0, 0}, l = {941}, m = "parseVideoClicksTag", n = {"clickThrough", "clickTrackingList", "customClickList", "isInLineParent"}, s = {"L$0", "L$1", "L$2", "Z$0"})
    public static final class X extends ContinuationImpl {
        public boolean a;
        public Object b;
        public Object c;
        public Object d;
        public /* synthetic */ Object e;
        public int f;

        public X(Continuation<? super X> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.e = obj;
            this.f |= Integer.MIN_VALUE;
            return k.h(null, false, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseWrapperTag$$inlined$iterateTag$1", f = "VastParser.kt", i = {0, 1, 2, 3, 4}, l = {126, 127, 128, 129, 130}, m = "invokeSuspend", n = {"initialDepth", "initialDepth", "initialDepth", "initialDepth", "initialDepth"}, s = {"I$0", "I$0", "I$0", "I$0", "I$0"})
    public static final class Y extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ XmlPullParser d;
        public final /* synthetic */ Ref.ObjectRef e;
        public final /* synthetic */ Ref.ObjectRef f;
        public final /* synthetic */ Ref.ObjectRef g;
        public final /* synthetic */ List h;
        public final /* synthetic */ List i;
        public final /* synthetic */ List j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Y(XmlPullParser xmlPullParser, Continuation continuation, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3, List list, List list2, List list3) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = objectRef;
            this.f = objectRef2;
            this.g = objectRef3;
            this.h = list;
            this.i = list2;
            this.j = list3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((Y) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            Y y = new Y(this.d, continuation, this.e, this.f, this.g, this.h, this.i, this.j);
            y.c = obj;
            return y;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00be, code lost:
        
            if (r11 == r0) goto L76;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00e1, code lost:
        
            if (r11 == r0) goto L76;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x013d, code lost:
        
            if (r11 == r0) goto L76;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x019c, code lost:
        
            r8.element = null;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x01a3  */
        /* JADX WARN: Type inference failed for: r11v44, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r11v45, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v4, types: [T, java.lang.Boolean] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x008d -> B:10:0x019c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0097 -> B:10:0x019c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x009f -> B:10:0x019c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00a5 -> B:10:0x019c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00b0 -> B:10:0x019c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00c4 -> B:10:0x019c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00c6 -> B:10:0x019c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00d3 -> B:10:0x019c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00e6 -> B:10:0x019c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00e8 -> B:10:0x019c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00f5 -> B:10:0x019c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0112 -> B:10:0x019c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x012f -> B:10:0x019c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x013d -> B:9:0x0140). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x017e -> B:10:0x019c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0197 -> B:10:0x019c). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int depth;
            Object obj2;
            Object obj3;
            String text;
            XmlPullParser xmlPullParser;
            String name;
            Object obj4;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i != 0) {
                if (i == 1) {
                    depth = this.a;
                    Ref.ObjectRef objectRef = (Ref.ObjectRef) this.c;
                    ResultKt.throwOnFailure(obj);
                    objectRef.element = obj;
                } else if (i == 2) {
                    depth = this.a;
                    Ref.ObjectRef objectRef2 = (Ref.ObjectRef) this.c;
                    ResultKt.throwOnFailure(obj);
                    objectRef2.element = obj;
                } else if (i == 3) {
                    depth = this.a;
                    ResultKt.throwOnFailure(obj);
                    obj3 = obj;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n nVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n) obj3;
                    if (nVar != null) {
                        this.h.add(nVar);
                    }
                } else if (i == 4) {
                    depth = this.a;
                    ResultKt.throwOnFailure(obj);
                    obj2 = obj;
                    String str = (String) obj2;
                    if (str != null) {
                        this.i.add(str);
                    }
                } else {
                    if (i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    depth = this.a;
                    ResultKt.throwOnFailure(obj);
                    obj4 = obj;
                    this.j.addAll((List) obj4);
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                    return Unit.INSTANCE;
                }
                int depth2 = this.d.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1 && k.k(this.d) && (name = (xmlPullParser = this.d).getName()) != null) {
                        switch (name.hashCode()) {
                            case -1692490108:
                                if (name.equals(k.o)) {
                                    this.c = null;
                                    this.a = depth;
                                    this.b = 5;
                                    Object f = k.f(xmlPullParser, false, this);
                                    obj4 = f;
                                    break;
                                }
                                break;
                            case -1633884078:
                                if (name.equals(k.h)) {
                                    Ref.ObjectRef objectRef3 = this.g;
                                    this.c = objectRef3;
                                    this.a = depth;
                                    this.b = 2;
                                    ?? z = k.z(xmlPullParser, this);
                                    if (z != coroutine_suspended) {
                                        objectRef3.element = z;
                                        break;
                                    }
                                    return coroutine_suspended;
                                }
                                break;
                            case -587420703:
                                if (name.equals(k.g)) {
                                    Ref.ObjectRef objectRef4 = this.f;
                                    this.c = objectRef4;
                                    this.a = depth;
                                    this.b = 1;
                                    ?? P = k.P(xmlPullParser, this);
                                    if (P != coroutine_suspended) {
                                        objectRef4.element = P;
                                        break;
                                    }
                                    return coroutine_suspended;
                                }
                                break;
                            case 67232232:
                                if (name.equals(k.c)) {
                                    this.c = null;
                                    this.a = depth;
                                    this.b = 4;
                                    Object D = k.D(xmlPullParser, this);
                                    obj2 = D;
                                    break;
                                }
                                break;
                            case 2114088489:
                                if (name.equals(k.n)) {
                                    this.c = null;
                                    this.a = depth;
                                    this.b = 3;
                                    Object J = k.J(xmlPullParser, this);
                                    obj3 = J;
                                    break;
                                }
                                break;
                        }
                    }
                } else if (k.k(this.d)) {
                    XmlPullParser xmlPullParser2 = this.d;
                    Ref.ObjectRef objectRef5 = this.e;
                    String b = k.b(xmlPullParser2, "followAdditionalWrappers");
                    if (b != null) {
                    }
                    objectRef5.element = Boxing.boxBoolean(Boolean.parseBoolean(b));
                } else if (k.l(this.d) && (text = this.d.getText()) != null && !StringsKt.isBlank(text)) {
                    String text2 = this.d.getText();
                    Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                    StringsKt.trim((CharSequence) text2).toString();
                } else if (k.i(this.d)) {
                    return Unit.INSTANCE;
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            } else {
                ResultKt.throwOnFailure(obj);
                CoroutineScopeKt.ensureActive((CoroutineScope) this.c);
                if (k.j(this.d)) {
                    this.d.nextTag();
                }
                if (k.h(this.d)) {
                    return Unit.INSTANCE;
                }
                if (!k.k(this.d)) {
                    throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
                }
                depth = this.d.getDepth();
                if (this.d.getDepth() < depth) {
                }
            }
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", i = {0, 0, 0, 0, 0, 0}, l = {941}, m = "parseWrapperTag", n = {"vastAdTagUrl", "followAdditionalWrappers", "adSystem", "impressions", "errorUrls", "creatives"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
    public static final class Z extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public /* synthetic */ Object g;
        public int h;

        public Z(Continuation<? super Z> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.g = obj;
            this.h |= Integer.MIN_VALUE;
            return k.V(null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$iterateTag$2", f = "VastParser.kt", i = {0, 1, 2}, l = {102, 103, 111}, m = "invokeSuspend", n = {"initialDepth", "initialDepth", "initialDepth"}, s = {"I$0", "I$0", "I$0"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$a, reason: case insensitive filesystem */
    public static final class C2841a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ XmlPullParser d;
        public final /* synthetic */ Function2<XmlPullParser, Continuation<? super Unit>, Object> e;
        public final /* synthetic */ Function3<XmlPullParser, String, Continuation<? super Unit>, Object> f;
        public final /* synthetic */ Function2<XmlPullParser, Continuation<? super Unit>, Object> g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C2841a(XmlPullParser xmlPullParser, Function2<? super XmlPullParser, ? super Continuation<? super Unit>, ? extends Object> function2, Function3<? super XmlPullParser, ? super String, ? super Continuation<? super Unit>, ? extends Object> function3, Function2<? super XmlPullParser, ? super Continuation<? super Unit>, ? extends Object> function22, Continuation<? super C2841a> continuation) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = function2;
            this.f = function3;
            this.g = function22;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2841a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C2841a c2841a = new C2841a(this.d, this.e, this.f, this.g, continuation);
            c2841a.c = obj;
            return c2841a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x007b, code lost:
        
            if (r9.invoke(r5, r8) == r0) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00cb, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
        
            if (r9.invoke(r5, r8) == r0) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00c9, code lost:
        
            if (r9.invoke(r5, r6, r8) == r0) goto L46;
         */
        /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00de  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0063 -> B:10:0x00d7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x006d -> B:10:0x00d7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x007b -> B:10:0x00d7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0092 -> B:10:0x00d7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00c9 -> B:10:0x00d7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00d2 -> B:10:0x00d7). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int depth;
            String text;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScopeKt.ensureActive((CoroutineScope) this.c);
                if (k.j(this.d)) {
                    this.d.nextTag();
                }
                if (k.h(this.d)) {
                    return Unit.INSTANCE;
                }
                if (!k.k(this.d)) {
                    throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
                }
                depth = this.d.getDepth();
                if (this.d.getDepth() < depth) {
                }
            } else {
                if (i != 1 && i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                depth = this.a;
                ResultKt.throwOnFailure(obj);
                this.d.next();
                if (this.d.getDepth() < depth) {
                    return Unit.INSTANCE;
                }
                int depth2 = this.d.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1 && k.k(this.d)) {
                        Function2<XmlPullParser, Continuation<? super Unit>, Object> function2 = this.g;
                        XmlPullParser xmlPullParser = this.d;
                        this.a = depth;
                        this.b = 3;
                    }
                    this.d.next();
                } else if (k.k(this.d)) {
                    Function2<XmlPullParser, Continuation<? super Unit>, Object> function22 = this.e;
                    XmlPullParser xmlPullParser2 = this.d;
                    this.a = depth;
                    this.b = 1;
                } else {
                    if (k.l(this.d) && (text = this.d.getText()) != null && !StringsKt.isBlank(text)) {
                        Function3<XmlPullParser, String, Continuation<? super Unit>, Object> function3 = this.f;
                        XmlPullParser xmlPullParser3 = this.d;
                        String text2 = xmlPullParser3.getText();
                        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                        String obj2 = StringsKt.trim((CharSequence) text2).toString();
                        this.a = depth;
                        this.b = 2;
                    } else if (k.i(this.d)) {
                        return Unit.INSTANCE;
                    }
                    this.d.next();
                }
                if (this.d.getDepth() < depth) {
                }
            }
        }

        public final Object a(Object obj) {
            String text;
            CoroutineScopeKt.ensureActive((CoroutineScope) this.c);
            if (k.j(this.d)) {
                this.d.nextTag();
            }
            if (k.h(this.d)) {
                return Unit.INSTANCE;
            }
            if (!k.k(this.d)) {
                throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = this.d.getDepth();
            while (this.d.getDepth() >= depth) {
                int depth2 = this.d.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1 && k.k(this.d)) {
                        this.g.invoke(this.d, this);
                    }
                } else if (k.k(this.d)) {
                    this.e.invoke(this.d, this);
                } else if (k.l(this.d) && (text = this.d.getText()) != null && !StringsKt.isBlank(text)) {
                    Function3<XmlPullParser, String, Continuation<? super Unit>, Object> function3 = this.f;
                    XmlPullParser xmlPullParser = this.d;
                    String text2 = xmlPullParser.getText();
                    Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                    function3.invoke(xmlPullParser, StringsKt.trim((CharSequence) text2).toString(), this);
                } else if (k.i(this.d)) {
                    return Unit.INSTANCE;
                }
                this.d.next();
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseAdParametersTag$$inlined$iterateTag$1", f = "VastParser.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$b, reason: case insensitive filesystem */
    public static final class C2842b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ XmlPullParser d;
        public final /* synthetic */ Ref.ObjectRef e;
        public final /* synthetic */ Ref.ObjectRef f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2842b(XmlPullParser xmlPullParser, Continuation continuation, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = objectRef;
            this.f = objectRef2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2842b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C2842b c2842b = new C2842b(this.d, continuation, this.e, this.f);
            c2842b.c = obj;
            return c2842b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v20, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String text;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScopeKt.ensureActive((CoroutineScope) this.c);
            if (k.j(this.d)) {
                this.d.nextTag();
            }
            if (k.h(this.d)) {
                return Unit.INSTANCE;
            }
            if (!k.k(this.d)) {
                throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = this.d.getDepth();
            while (this.d.getDepth() >= depth) {
                int depth2 = this.d.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1) {
                        k.k(this.d);
                    }
                } else if (k.k(this.d)) {
                    XmlPullParser xmlPullParser = this.d;
                    Ref.ObjectRef objectRef = this.e;
                    String b = k.b(xmlPullParser, "xmlEncoded");
                    objectRef.element = b != null ? Boxing.boxBoolean(Boolean.parseBoolean(b)) : 0;
                } else if (k.l(this.d) && (text = this.d.getText()) != null && !StringsKt.isBlank(text)) {
                    String text2 = this.d.getText();
                    Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                    this.f.element = StringsKt.trim((CharSequence) text2).toString();
                } else if (k.i(this.d)) {
                    return Unit.INSTANCE;
                }
                this.d.next();
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", i = {0, 0}, l = {941}, m = "parseAdParametersTag", n = {"rawText", "isXmlEncoded"}, s = {"L$0", "L$1"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$c, reason: case insensitive filesystem */
    public static final class C2843c extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int d;

        public C2843c(Continuation<? super C2843c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            return k.y(null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseAdSystemTag$$inlined$iterateTag$1", f = "VastParser.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$d, reason: case insensitive filesystem */
    public static final class C2844d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ XmlPullParser d;
        public final /* synthetic */ Ref.ObjectRef e;
        public final /* synthetic */ Ref.ObjectRef f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2844d(XmlPullParser xmlPullParser, Continuation continuation, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = objectRef;
            this.f = objectRef2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2844d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C2844d c2844d = new C2844d(this.d, continuation, this.e, this.f);
            c2844d.c = obj;
            return c2844d;
        }

        /* JADX WARN: Type inference failed for: r0v20, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v22, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String text;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScopeKt.ensureActive((CoroutineScope) this.c);
            if (k.j(this.d)) {
                this.d.nextTag();
            }
            if (k.h(this.d)) {
                return Unit.INSTANCE;
            }
            if (!k.k(this.d)) {
                throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = this.d.getDepth();
            while (this.d.getDepth() >= depth) {
                int depth2 = this.d.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1) {
                        k.k(this.d);
                    }
                } else if (k.k(this.d)) {
                    this.e.element = k.b(this.d, "version");
                } else if (k.l(this.d) && (text = this.d.getText()) != null && !StringsKt.isBlank(text)) {
                    String text2 = this.d.getText();
                    Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                    this.f.element = StringsKt.trim((CharSequence) text2).toString();
                } else if (k.i(this.d)) {
                    return Unit.INSTANCE;
                }
                this.d.next();
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", i = {0, 0}, l = {941}, m = "parseAdSystemTag", n = {"name", "version"}, s = {"L$0", "L$1"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$e, reason: case insensitive filesystem */
    public static final class C2845e extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int d;

        public C2845e(Continuation<? super C2845e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            return k.z(null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseAdTag$$inlined$iterateTag$1", f = "VastParser.kt", i = {0, 1}, l = {126, 127}, m = "invokeSuspend", n = {"initialDepth", "initialDepth"}, s = {"I$0", "I$0"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$f, reason: case insensitive filesystem */
    public static final class C2846f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ XmlPullParser d;
        public final /* synthetic */ Ref.ObjectRef e;
        public final /* synthetic */ Ref.ObjectRef f;
        public final /* synthetic */ Ref.ObjectRef g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2846f(XmlPullParser xmlPullParser, Continuation continuation, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = objectRef;
            this.f = objectRef2;
            this.g = objectRef3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2846f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C2846f c2846f = new C2846f(this.d, continuation, this.e, this.f, this.g);
            c2846f.c = obj;
            return c2846f;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x00b6, code lost:
        
            if (r9 == r0) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00c4, code lost:
        
            r6 = 0;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0120  */
        /* JADX WARN: Type inference failed for: r6v1, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r6v10, types: [com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b$a] */
        /* JADX WARN: Type inference failed for: r6v5 */
        /* JADX WARN: Type inference failed for: r6v6, types: [com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b$a] */
        /* JADX WARN: Type inference failed for: r6v8 */
        /* JADX WARN: Type inference failed for: r6v9, types: [com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b$b] */
        /* JADX WARN: Type inference failed for: r9v34, types: [T, java.lang.Integer] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x006f -> B:10:0x0119). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0079 -> B:10:0x0119). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0081 -> B:10:0x0119). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00b6 -> B:6:0x00b9). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00cf -> B:10:0x0119). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00fb -> B:10:0x0119). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0114 -> B:10:0x0119). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int depth;
            String text;
            Ref.ObjectRef objectRef;
            T t;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScopeKt.ensureActive((CoroutineScope) this.c);
                if (k.j(this.d)) {
                    this.d.nextTag();
                }
                if (k.h(this.d)) {
                    return Unit.INSTANCE;
                }
                if (!k.k(this.d)) {
                    throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
                }
                depth = this.d.getDepth();
                if (this.d.getDepth() < depth) {
                }
            } else if (i == 1) {
                depth = this.a;
                objectRef = (Ref.ObjectRef) this.c;
                ResultKt.throwOnFailure(obj);
                t = new AbstractC2867b.a((o) obj);
                objectRef.element = t;
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                depth = this.a;
                objectRef = (Ref.ObjectRef) this.c;
                ResultKt.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.B b = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.B) obj;
                if (b != null) {
                    t = new AbstractC2867b.C0344b(b);
                    objectRef.element = t;
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                        return Unit.INSTANCE;
                    }
                    int depth2 = this.d.getDepth() - depth;
                    if (depth2 == 0) {
                        if (k.k(this.d)) {
                            XmlPullParser xmlPullParser = this.d;
                            this.e.element = k.b(xmlPullParser, "id");
                            this.f.element = k.m(xmlPullParser);
                        } else if (k.l(this.d) && (text = this.d.getText()) != null && !StringsKt.isBlank(text)) {
                            String text2 = this.d.getText();
                            Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                            StringsKt.trim((CharSequence) text2).toString();
                        } else if (k.i(this.d)) {
                            return Unit.INSTANCE;
                        }
                    } else if (depth2 == 1 && k.k(this.d)) {
                        XmlPullParser xmlPullParser2 = this.d;
                        objectRef = this.g;
                        if (objectRef.element == 0) {
                            String name = xmlPullParser2.getName();
                            if (Intrinsics.areEqual(name, k.e)) {
                                this.c = objectRef;
                                this.a = depth;
                                this.b = 1;
                                Object K = k.K(xmlPullParser2, this);
                                if (K != coroutine_suspended) {
                                    t = new AbstractC2867b.a((o) K);
                                    objectRef.element = t;
                                }
                                return coroutine_suspended;
                            }
                            if (Intrinsics.areEqual(name, k.f)) {
                                this.c = objectRef;
                                this.a = depth;
                                this.b = 2;
                                obj = k.V(xmlPullParser2, this);
                            }
                        }
                    }
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                }
                t = 0;
                objectRef.element = t;
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            }
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", i = {0, 0, 0}, l = {941}, m = "parseAdTag", n = {"id", "sequence", "adChild"}, s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$g, reason: case insensitive filesystem */
    public static final class C2847g extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int e;

        public C2847g(Continuation<? super C2847g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.e |= Integer.MIN_VALUE;
            return k.A(null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseCompanionAdsTag$$inlined$iterateTag$1", f = "VastParser.kt", i = {0}, l = {Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE}, m = "invokeSuspend", n = {"initialDepth"}, s = {"I$0"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$h, reason: case insensitive filesystem */
    public static final class C2848h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ XmlPullParser d;
        public final /* synthetic */ List e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2848h(XmlPullParser xmlPullParser, Continuation continuation, List list) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = list;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2848h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C2848h c2848h = new C2848h(this.d, continuation, this.e);
            c2848h.c = obj;
            return c2848h;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00ce  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0083  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005b -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0064 -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0072 -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x007c -> B:5:0x007f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x008f -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00a9 -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00c2 -> B:8:0x00c7). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int depth;
            String text;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScopeKt.ensureActive((CoroutineScope) this.c);
                if (k.j(this.d)) {
                    this.d.nextTag();
                }
                if (k.h(this.d)) {
                    return Unit.INSTANCE;
                }
                if (!k.k(this.d)) {
                    throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
                }
                depth = this.d.getDepth();
                if (this.d.getDepth() < depth) {
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                depth = this.a;
                ResultKt.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e eVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e) obj;
                if (eVar != null) {
                    this.e.add(eVar);
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                    return Unit.INSTANCE;
                }
                int depth2 = this.d.getDepth() - depth;
                if (depth2 == 0) {
                    if (!k.k(this.d)) {
                        if (k.l(this.d) && (text = this.d.getText()) != null && !StringsKt.isBlank(text)) {
                            String text2 = this.d.getText();
                            Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                            StringsKt.trim((CharSequence) text2).toString();
                        } else if (k.i(this.d)) {
                            return Unit.INSTANCE;
                        }
                    }
                } else if (depth2 == 1 && k.k(this.d)) {
                    XmlPullParser xmlPullParser = this.d;
                    if (Intrinsics.areEqual(xmlPullParser.getName(), k.M)) {
                        this.a = depth;
                        this.b = 1;
                        obj = k.C(xmlPullParser, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e eVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e) obj;
                        if (eVar2 != null) {
                        }
                    }
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            }
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", i = {0}, l = {941}, m = "parseCompanionAdsTag", n = {"companions"}, s = {"L$0"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$i, reason: case insensitive filesystem */
    public static final class C2849i extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int c;

        public C2849i(Continuation<? super C2849i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.c |= Integer.MIN_VALUE;
            return k.B(null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseCompanionTag$$inlined$iterateTag$1", f = "VastParser.kt", i = {0, 1, 2, 3, 4, 5, 6, 7}, l = {128, 130, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 141, 146, 147}, m = "invokeSuspend", n = {"initialDepth", "initialDepth", "initialDepth", "initialDepth", "initialDepth", "initialDepth", "initialDepth", "initialDepth"}, s = {"I$0", "I$0", "I$0", "I$0", "I$0", "I$0", "I$0", "I$0"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$j, reason: case insensitive filesystem */
    public static final class C2850j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ XmlPullParser d;
        public final /* synthetic */ Ref.ObjectRef e;
        public final /* synthetic */ Ref.ObjectRef f;
        public final /* synthetic */ Ref.ObjectRef g;
        public final /* synthetic */ Ref.ObjectRef h;
        public final /* synthetic */ Ref.ObjectRef i;
        public final /* synthetic */ Ref.ObjectRef j;
        public final /* synthetic */ List k;
        public final /* synthetic */ Ref.ObjectRef l;
        public final /* synthetic */ List m;
        public final /* synthetic */ List n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2850j(XmlPullParser xmlPullParser, Continuation continuation, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3, Ref.ObjectRef objectRef4, Ref.ObjectRef objectRef5, Ref.ObjectRef objectRef6, List list, Ref.ObjectRef objectRef7, List list2, List list3) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = objectRef;
            this.f = objectRef2;
            this.g = objectRef3;
            this.h = objectRef4;
            this.i = objectRef5;
            this.j = objectRef6;
            this.k = list;
            this.l = objectRef7;
            this.m = list2;
            this.n = list3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2850j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C2850j c2850j = new C2850j(this.d, continuation, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n);
            c2850j.c = obj;
            return c2850j;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00cf, code lost:
        
            if (r8 == r0) goto L106;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00f9, code lost:
        
            if (r8 == r0) goto L106;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x013b, code lost:
        
            if (r8 == r0) goto L106;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0166, code lost:
        
            if (r8 == r0) goto L106;
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x01c6, code lost:
        
            if (r8 == r0) goto L106;
         */
        /* JADX WARN: Code restructure failed: missing block: B:89:0x026e, code lost:
        
            r3.element = null;
            r7.h.element = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.b(r8, "apiFramework");
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:102:0x0275  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0092  */
        /* JADX WARN: Type inference failed for: r2v15, types: [T, java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r4v3, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r8v43, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r8v44, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r8v48, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v50, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v53, types: [T, java.lang.Object] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x009d -> B:10:0x026e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00a7 -> B:10:0x026e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00af -> B:10:0x026e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00b5 -> B:10:0x026e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00c0 -> B:10:0x026e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00d5 -> B:10:0x026e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00d7 -> B:10:0x026e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00e9 -> B:10:0x026e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00f9 -> B:7:0x00fd). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x010e -> B:10:0x026e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x012d -> B:10:0x026e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0141 -> B:10:0x026e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0143 -> B:10:0x026e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0155 -> B:10:0x026e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x018e -> B:10:0x026e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0199 -> B:10:0x026e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x01b7 -> B:10:0x026e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x01cb -> B:10:0x026e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x01cd -> B:10:0x026e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x01df -> B:10:0x026e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x0250 -> B:10:0x026e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x0269 -> B:10:0x026e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int depth;
            List list;
            Object obj2;
            Object obj3;
            Object obj4;
            Object obj5;
            String text;
            XmlPullParser xmlPullParser;
            String name;
            Object obj6;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.b) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    CoroutineScopeKt.ensureActive((CoroutineScope) this.c);
                    if (k.j(this.d)) {
                        this.d.nextTag();
                    }
                    if (k.h(this.d)) {
                        return Unit.INSTANCE;
                    }
                    if (!k.k(this.d)) {
                        throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
                    }
                    depth = this.d.getDepth();
                    if (this.d.getDepth() < depth) {
                        return Unit.INSTANCE;
                    }
                    int depth2 = this.d.getDepth() - depth;
                    if (depth2 != 0) {
                        if (depth2 == 1 && k.k(this.d) && (name = (xmlPullParser = this.d).getName()) != null) {
                            switch (name.hashCode()) {
                                case -1348833651:
                                    if (name.equals(k.r)) {
                                        Ref.ObjectRef objectRef = this.j;
                                        this.c = objectRef;
                                        this.a = depth;
                                        this.b = 5;
                                        ?? y = k.y(xmlPullParser, this);
                                        if (y != coroutine_suspended) {
                                            objectRef.element = y;
                                            break;
                                        }
                                        return coroutine_suspended;
                                    }
                                    break;
                                case -375340334:
                                    if (name.equals(k.E)) {
                                        this.c = null;
                                        this.a = depth;
                                        this.b = 3;
                                        Object F = k.F(xmlPullParser, this);
                                        obj2 = F;
                                        break;
                                    }
                                    break;
                                case -348198615:
                                    if (name.equals(k.N)) {
                                        Ref.ObjectRef objectRef2 = this.l;
                                        this.c = objectRef2;
                                        this.a = depth;
                                        this.b = 7;
                                        ?? P = k.P(xmlPullParser, this);
                                        if (P != coroutine_suspended) {
                                            objectRef2.element = P;
                                            break;
                                        }
                                        return coroutine_suspended;
                                    }
                                    break;
                                case 611554000:
                                    if (name.equals(k.v)) {
                                        list = this.k;
                                        this.c = list;
                                        this.a = depth;
                                        this.b = 6;
                                        Object Q = k.Q(xmlPullParser, this);
                                        obj3 = Q;
                                        break;
                                    }
                                    break;
                                case 676623548:
                                    if (name.equals(k.D)) {
                                        this.c = null;
                                        this.a = depth;
                                        this.b = 1;
                                        Object O = k.O(xmlPullParser, this);
                                        obj4 = O;
                                        break;
                                    }
                                    break;
                                case 759877206:
                                    if (name.equals(k.K)) {
                                        Ref.ObjectRef objectRef3 = this.i;
                                        this.c = objectRef3;
                                        this.a = depth;
                                        this.b = 4;
                                        ?? P2 = k.P(xmlPullParser, this);
                                        if (P2 != coroutine_suspended) {
                                            objectRef3.element = P2;
                                            break;
                                        }
                                        return coroutine_suspended;
                                    }
                                    break;
                                case 1877773523:
                                    if (name.equals(k.O)) {
                                        this.c = null;
                                        this.a = depth;
                                        this.b = 8;
                                        Object P3 = k.P(xmlPullParser, this);
                                        obj6 = P3;
                                        break;
                                    }
                                    break;
                                case 1928285401:
                                    if (name.equals(k.F)) {
                                        this.c = null;
                                        this.a = depth;
                                        this.b = 2;
                                        Object E = k.E(xmlPullParser, this);
                                        obj5 = E;
                                        break;
                                    }
                                    break;
                            }
                        }
                    } else if (k.k(this.d)) {
                        XmlPullParser xmlPullParser2 = this.d;
                        this.e.element = k.b(xmlPullParser2, "id");
                        Ref.ObjectRef objectRef4 = this.f;
                        String b = k.b(xmlPullParser2, "width");
                        objectRef4.element = b != null ? StringsKt.toIntOrNull(b) : 0;
                        Ref.ObjectRef objectRef5 = this.g;
                        String b2 = k.b(xmlPullParser2, "height");
                        if (b2 != null) {
                        }
                        objectRef5.element = StringsKt.toIntOrNull(b2);
                        this.h.element = k.b(xmlPullParser2, "apiFramework");
                    } else if (k.l(this.d) && (text = this.d.getText()) != null && !StringsKt.isBlank(text)) {
                        String text2 = this.d.getText();
                        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                        StringsKt.trim((CharSequence) text2).toString();
                    } else if (k.i(this.d)) {
                        return Unit.INSTANCE;
                    }
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 1:
                    depth = this.a;
                    ResultKt.throwOnFailure(obj);
                    obj4 = obj;
                    t tVar = (t) obj4;
                    if (tVar != null) {
                        this.m.add(new y.c(tVar));
                    }
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 2:
                    depth = this.a;
                    ResultKt.throwOnFailure(obj);
                    obj5 = obj;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j jVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j) obj5;
                    if (jVar != null) {
                        this.m.add(new y.a(jVar));
                    }
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 3:
                    depth = this.a;
                    ResultKt.throwOnFailure(obj);
                    obj2 = obj;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.k kVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.k) obj2;
                    if (kVar != null) {
                        this.m.add(new y.b(kVar));
                    }
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 4:
                    depth = this.a;
                    Ref.ObjectRef objectRef6 = (Ref.ObjectRef) this.c;
                    ResultKt.throwOnFailure(obj);
                    objectRef6.element = obj;
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 5:
                    depth = this.a;
                    Ref.ObjectRef objectRef7 = (Ref.ObjectRef) this.c;
                    ResultKt.throwOnFailure(obj);
                    objectRef7.element = obj;
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 6:
                    depth = this.a;
                    list = (List) this.c;
                    ResultKt.throwOnFailure(obj);
                    obj3 = obj;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj7 : (Iterable) obj3) {
                        if (((u) obj7).d() == v.a) {
                            arrayList.add(obj7);
                        }
                    }
                    list.addAll(arrayList);
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 7:
                    depth = this.a;
                    Ref.ObjectRef objectRef8 = (Ref.ObjectRef) this.c;
                    ResultKt.throwOnFailure(obj);
                    objectRef8.element = obj;
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 8:
                    depth = this.a;
                    ResultKt.throwOnFailure(obj);
                    obj6 = obj;
                    String str = (String) obj6;
                    if (str != null) {
                        this.n.add(str);
                    }
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {941}, m = "parseCompanionTag", n = {"id", "widthPx", "heightPx", "altText", "apiFramework", "adParameters", "creativeViewTrackingList", "resources", "clickThroughUrl", "clickTrackingList"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$k, reason: collision with other inner class name */
    public static final class C0343k extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public Object g;
        public Object h;
        public Object i;
        public Object j;
        public /* synthetic */ Object k;
        public int l;

        public C0343k(Continuation<? super C0343k> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.k = obj;
            this.l |= Integer.MIN_VALUE;
            return k.C(null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseCreativeTag$$inlined$iterateTag$1", f = "VastParser.kt", i = {0, 1}, l = {129, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE}, m = "invokeSuspend", n = {"initialDepth", "initialDepth"}, s = {"I$0", "I$0"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$l, reason: case insensitive filesystem */
    public static final class C2851l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ XmlPullParser d;
        public final /* synthetic */ Ref.ObjectRef e;
        public final /* synthetic */ Ref.ObjectRef f;
        public final /* synthetic */ Ref.ObjectRef g;
        public final /* synthetic */ Ref.ObjectRef h;
        public final /* synthetic */ Ref.ObjectRef i;
        public final /* synthetic */ boolean j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2851l(XmlPullParser xmlPullParser, Continuation continuation, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3, Ref.ObjectRef objectRef4, Ref.ObjectRef objectRef5, boolean z) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = objectRef;
            this.f = objectRef2;
            this.g = objectRef3;
            this.h = objectRef4;
            this.i = objectRef5;
            this.j = z;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2851l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C2851l c2851l = new C2851l(this.d, continuation, this.e, this.f, this.g, this.h, this.i, this.j);
            c2851l.c = obj;
            return c2851l;
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x009b, code lost:
        
            if (r9 == r0) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00ba, code lost:
        
            if (r9 == r0) goto L42;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0143  */
        /* JADX WARN: Type inference failed for: r6v3, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r6v4, types: [T, java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r6v6, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v36, types: [T, java.lang.String] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x006f -> B:13:0x013c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0079 -> B:13:0x013c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0081 -> B:13:0x013c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00a2 -> B:12:0x00d3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ba -> B:6:0x00bd). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00de -> B:13:0x013c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x011e -> B:13:0x013c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0137 -> B:13:0x013c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x00d2 -> B:12:0x00d3). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int depth;
            Ref.ObjectRef objectRef;
            T t;
            String text;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScopeKt.ensureActive((CoroutineScope) this.c);
                if (k.j(this.d)) {
                    this.d.nextTag();
                }
                if (k.h(this.d)) {
                    return Unit.INSTANCE;
                }
                if (!k.k(this.d)) {
                    throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
                }
                depth = this.d.getDepth();
                if (this.d.getDepth() < depth) {
                }
            } else if (i == 1) {
                depth = this.a;
                objectRef = (Ref.ObjectRef) this.c;
                ResultKt.throwOnFailure(obj);
                p pVar = (p) obj;
                if (pVar != null) {
                    t = new h.b(pVar);
                    objectRef.element = t;
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                }
                t = 0;
                objectRef.element = t;
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                depth = this.a;
                objectRef = (Ref.ObjectRef) this.c;
                ResultKt.throwOnFailure(obj);
                if (((List) obj).isEmpty()) {
                    obj = null;
                }
                List list = (List) obj;
                if (list != null) {
                    t = new h.a(list);
                    objectRef.element = t;
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                        return Unit.INSTANCE;
                    }
                    int depth2 = this.d.getDepth() - depth;
                    if (depth2 == 0) {
                        if (k.k(this.d)) {
                            XmlPullParser xmlPullParser = this.d;
                            this.e.element = k.b(xmlPullParser, "id");
                            this.f.element = k.m(xmlPullParser);
                            this.g.element = k.b(xmlPullParser, "adID");
                            this.h.element = k.b(xmlPullParser, "apiFramework");
                        } else if (k.l(this.d) && (text = this.d.getText()) != null && !StringsKt.isBlank(text)) {
                            String text2 = this.d.getText();
                            Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                            StringsKt.trim((CharSequence) text2).toString();
                        } else if (k.i(this.d)) {
                            return Unit.INSTANCE;
                        }
                    } else if (depth2 == 1 && k.k(this.d)) {
                        XmlPullParser xmlPullParser2 = this.d;
                        objectRef = this.i;
                        if (objectRef.element == 0) {
                            String name = xmlPullParser2.getName();
                            if (Intrinsics.areEqual(name, k.q)) {
                                boolean z = this.j;
                                this.c = objectRef;
                                this.a = depth;
                                this.b = 1;
                                obj = k.g(xmlPullParser2, z, this);
                            } else if (Intrinsics.areEqual(name, k.L)) {
                                this.c = objectRef;
                                this.a = depth;
                                this.b = 2;
                                obj = k.B(xmlPullParser2, this);
                            }
                            return coroutine_suspended;
                        }
                    }
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                }
                t = 0;
                objectRef.element = t;
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            }
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", i = {0, 0, 0, 0, 0}, l = {941}, m = "parseCreativeTag", n = {"id", "sequence", "adId", "apiFramework", "child"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$m, reason: case insensitive filesystem */
    public static final class C2852m extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public /* synthetic */ Object f;
        public int g;

        public C2852m(Continuation<? super C2852m> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f = obj;
            this.g |= Integer.MIN_VALUE;
            return k.e(null, false, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseCreativesTag$$inlined$iterateTag$1", f = "VastParser.kt", i = {0}, l = {Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE}, m = "invokeSuspend", n = {"initialDepth"}, s = {"I$0"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$n, reason: case insensitive filesystem */
    public static final class C2853n extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ XmlPullParser d;
        public final /* synthetic */ boolean e;
        public final /* synthetic */ List f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2853n(XmlPullParser xmlPullParser, Continuation continuation, boolean z, List list) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = z;
            this.f = list;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2853n) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C2853n c2853n = new C2853n(this.d, continuation, this.e, this.f);
            c2853n.c = obj;
            return c2853n;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00d1  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0086  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005c -> B:8:0x00ca). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0065 -> B:8:0x00ca). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0073 -> B:8:0x00ca). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x007f -> B:5:0x0082). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0092 -> B:8:0x00ca). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00ac -> B:8:0x00ca). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00c5 -> B:8:0x00ca). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int depth;
            String text;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScopeKt.ensureActive((CoroutineScope) this.c);
                if (k.j(this.d)) {
                    this.d.nextTag();
                }
                if (k.h(this.d)) {
                    return Unit.INSTANCE;
                }
                if (!k.k(this.d)) {
                    throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
                }
                depth = this.d.getDepth();
                if (this.d.getDepth() < depth) {
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                depth = this.a;
                ResultKt.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g gVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g) obj;
                if (gVar != null) {
                    this.f.add(gVar);
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                    return Unit.INSTANCE;
                }
                int depth2 = this.d.getDepth() - depth;
                if (depth2 == 0) {
                    if (!k.k(this.d)) {
                        if (k.l(this.d) && (text = this.d.getText()) != null && !StringsKt.isBlank(text)) {
                            String text2 = this.d.getText();
                            Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                            StringsKt.trim((CharSequence) text2).toString();
                        } else if (k.i(this.d)) {
                            return Unit.INSTANCE;
                        }
                    }
                } else if (depth2 == 1 && k.k(this.d)) {
                    XmlPullParser xmlPullParser = this.d;
                    if (Intrinsics.areEqual(xmlPullParser.getName(), k.p)) {
                        boolean z = this.e;
                        this.a = depth;
                        this.b = 1;
                        obj = k.e(xmlPullParser, z, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g gVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g) obj;
                        if (gVar2 != null) {
                        }
                    }
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            }
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", i = {0}, l = {941}, m = "parseCreativesTag", n = {"creatives"}, s = {"L$0"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$o, reason: case insensitive filesystem */
    public static final class C2854o extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int c;

        public C2854o(Continuation<? super C2854o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.c |= Integer.MIN_VALUE;
            return k.f(null, false, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", i = {}, l = {799}, m = "parseHtmlResourceTag", n = {}, s = {})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$p, reason: case insensitive filesystem */
    public static final class C2855p extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int b;

        public C2855p(Continuation<? super C2855p> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return k.E(null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", i = {}, l = {802}, m = "parseIFrameResourceTag", n = {}, s = {})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$q, reason: case insensitive filesystem */
    public static final class C2856q extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int b;

        public C2856q(Continuation<? super C2856q> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return k.F(null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseIconClicksTag$$inlined$iterateTag$1", f = "VastParser.kt", i = {0, 1}, l = {Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE}, m = "invokeSuspend", n = {"initialDepth", "initialDepth"}, s = {"I$0", "I$0"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$r, reason: case insensitive filesystem */
    public static final class C2857r extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ XmlPullParser d;
        public final /* synthetic */ Ref.ObjectRef e;
        public final /* synthetic */ List f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2857r(XmlPullParser xmlPullParser, Continuation continuation, Ref.ObjectRef objectRef, List list) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = objectRef;
            this.f = list;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2857r) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C2857r c2857r = new C2857r(this.d, continuation, this.e, this.f);
            c2857r.c = obj;
            return c2857r;
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x00a8, code lost:
        
            if (r7 == r0) goto L38;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00fa  */
        /* JADX WARN: Type inference failed for: r7v37, types: [T, java.lang.Object] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0069 -> B:9:0x00f3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0073 -> B:9:0x00f3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x009b -> B:9:0x00f3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00a8 -> B:6:0x00ab). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00bb -> B:9:0x00f3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00d5 -> B:9:0x00f3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00ee -> B:9:0x00f3). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int depth;
            String text;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScopeKt.ensureActive((CoroutineScope) this.c);
                if (k.j(this.d)) {
                    this.d.nextTag();
                }
                if (k.h(this.d)) {
                    return Unit.INSTANCE;
                }
                if (!k.k(this.d)) {
                    throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
                }
                depth = this.d.getDepth();
                if (this.d.getDepth() < depth) {
                }
            } else if (i == 1) {
                depth = this.a;
                Ref.ObjectRef objectRef = (Ref.ObjectRef) this.c;
                ResultKt.throwOnFailure(obj);
                objectRef.element = obj;
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                depth = this.a;
                ResultKt.throwOnFailure(obj);
                Object obj2 = obj;
                String str = (String) obj2;
                if (str != null) {
                    this.f.add(str);
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                    return Unit.INSTANCE;
                }
                int depth2 = this.d.getDepth() - depth;
                if (depth2 == 0) {
                    if (!k.k(this.d)) {
                        if (k.l(this.d) && (text = this.d.getText()) != null && !StringsKt.isBlank(text)) {
                            String text2 = this.d.getText();
                            Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                            StringsKt.trim((CharSequence) text2).toString();
                        } else if (k.i(this.d)) {
                            return Unit.INSTANCE;
                        }
                    }
                } else if (depth2 == 1 && k.k(this.d)) {
                    XmlPullParser xmlPullParser = this.d;
                    String name = xmlPullParser.getName();
                    if (Intrinsics.areEqual(name, k.H)) {
                        Ref.ObjectRef objectRef2 = this.e;
                        this.c = objectRef2;
                        this.a = depth;
                        this.b = 1;
                        ?? P = k.P(xmlPullParser, this);
                        if (P != coroutine_suspended) {
                            objectRef2.element = P;
                        }
                        return coroutine_suspended;
                    }
                    if (Intrinsics.areEqual(name, k.I)) {
                        this.c = null;
                        this.a = depth;
                        this.b = 2;
                        Object P2 = k.P(xmlPullParser, this);
                        obj2 = P2;
                    }
                    if (this.d.getDepth() < depth) {
                    }
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            }
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", i = {0, 0}, l = {941}, m = "parseIconClicksTag", n = {"clickThroughUrl", "clickTrackingUrlList"}, s = {"L$0", "L$1"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$s, reason: case insensitive filesystem */
    public static final class C2858s extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int d;

        public C2858s(Continuation<? super C2858s> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            return k.G(null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseIconTag$$inlined$iterateTag$1", f = "VastParser.kt", i = {0, 0, 1, 1, 2, 2, 3, 4}, l = {130, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 139, 140}, m = "invokeSuspend", n = {"$this$parseIconTag_u24lambda_u2498", "initialDepth", "$this$parseIconTag_u24lambda_u2498", "initialDepth", "$this$parseIconTag_u24lambda_u2498", "initialDepth", "initialDepth", "initialDepth"}, s = {"L$0", "I$0", "L$0", "I$0", "L$0", "I$0", "I$0", "I$0"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$t, reason: case insensitive filesystem */
    public static final class C2859t extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ XmlPullParser d;
        public final /* synthetic */ Ref.ObjectRef e;
        public final /* synthetic */ Ref.ObjectRef f;
        public final /* synthetic */ Ref.ObjectRef g;
        public final /* synthetic */ Ref.ObjectRef h;
        public final /* synthetic */ Ref.ObjectRef i;
        public final /* synthetic */ Ref.ObjectRef j;
        public final /* synthetic */ Ref.ObjectRef k;
        public final /* synthetic */ Ref.ObjectRef l;
        public final /* synthetic */ List m;
        public Object n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2859t(XmlPullParser xmlPullParser, Continuation continuation, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3, Ref.ObjectRef objectRef4, Ref.ObjectRef objectRef5, Ref.ObjectRef objectRef6, Ref.ObjectRef objectRef7, Ref.ObjectRef objectRef8, List list) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = objectRef;
            this.f = objectRef2;
            this.g = objectRef3;
            this.h = objectRef4;
            this.i = objectRef5;
            this.j = objectRef6;
            this.k = objectRef7;
            this.l = objectRef8;
            this.m = list;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2859t) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C2859t c2859t = new C2859t(this.d, continuation, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m);
            c2859t.c = obj;
            return c2859t;
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x00e5, code lost:
        
            if (r13 == r0) goto L83;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0107, code lost:
        
            if (r13 == r0) goto L83;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0129, code lost:
        
            if (r13 == r0) goto L83;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x016e, code lost:
        
            if (r13 == r0) goto L83;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0098  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0145  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x015a  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x0220  */
        /* JADX WARN: Type inference failed for: r13v17, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r13v46, types: [T, java.lang.Long] */
        /* JADX WARN: Type inference failed for: r9v17, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v7, types: [T, java.lang.String] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00a1 -> B:12:0x0219). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00ab -> B:12:0x0219). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0160 -> B:12:0x0219). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x016e -> B:9:0x0171). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x01fb -> B:12:0x0219). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x0214 -> B:12:0x0219). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int depth;
            XmlPullParser xmlPullParser;
            String name;
            Ref.ObjectRef objectRef;
            T t;
            Object obj2;
            Object obj3;
            Object obj4;
            String text;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScopeKt.ensureActive((CoroutineScope) this.c);
                if (k.j(this.d)) {
                    this.d.nextTag();
                }
                if (k.h(this.d)) {
                    return Unit.INSTANCE;
                }
                if (!k.k(this.d)) {
                    throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
                }
                depth = this.d.getDepth();
                if (this.d.getDepth() < depth) {
                }
            } else if (i == 1) {
                depth = this.a;
                objectRef = (Ref.ObjectRef) this.n;
                xmlPullParser = (XmlPullParser) this.c;
                ResultKt.throwOnFailure(obj);
                obj3 = obj;
                t tVar = (t) obj3;
                if (tVar != null) {
                    t = new y.c(tVar);
                    objectRef.element = t;
                    name = xmlPullParser.getName();
                    if (Intrinsics.areEqual(name, k.G)) {
                    }
                    if (this.d.getDepth() < depth) {
                    }
                }
                t = 0;
                objectRef.element = t;
                name = xmlPullParser.getName();
                if (Intrinsics.areEqual(name, k.G)) {
                }
                if (this.d.getDepth() < depth) {
                }
            } else if (i == 2) {
                depth = this.a;
                objectRef = (Ref.ObjectRef) this.n;
                xmlPullParser = (XmlPullParser) this.c;
                ResultKt.throwOnFailure(obj);
                obj4 = obj;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j jVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j) obj4;
                if (jVar != null) {
                    t = new y.a(jVar);
                    objectRef.element = t;
                    name = xmlPullParser.getName();
                    if (Intrinsics.areEqual(name, k.G)) {
                    }
                    if (this.d.getDepth() < depth) {
                    }
                }
                t = 0;
                objectRef.element = t;
                name = xmlPullParser.getName();
                if (Intrinsics.areEqual(name, k.G)) {
                }
                if (this.d.getDepth() < depth) {
                }
            } else if (i == 3) {
                depth = this.a;
                objectRef = (Ref.ObjectRef) this.n;
                xmlPullParser = (XmlPullParser) this.c;
                ResultKt.throwOnFailure(obj);
                obj2 = obj;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.k kVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.k) obj2;
                if (kVar != null) {
                    t = new y.b(kVar);
                    objectRef.element = t;
                    name = xmlPullParser.getName();
                    if (Intrinsics.areEqual(name, k.G)) {
                    }
                    if (this.d.getDepth() < depth) {
                    }
                }
                t = 0;
                objectRef.element = t;
                name = xmlPullParser.getName();
                if (Intrinsics.areEqual(name, k.G)) {
                }
                if (this.d.getDepth() < depth) {
                }
            } else if (i == 4) {
                depth = this.a;
                Ref.ObjectRef objectRef2 = (Ref.ObjectRef) this.c;
                ResultKt.throwOnFailure(obj);
                objectRef2.element = obj;
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            } else {
                if (i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                depth = this.a;
                ResultKt.throwOnFailure(obj);
                Object obj5 = obj;
                String str = (String) obj5;
                if (str != null) {
                    this.m.add(str);
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                    return Unit.INSTANCE;
                }
                int depth2 = this.d.getDepth() - depth;
                if (depth2 == 0) {
                    if (k.k(this.d)) {
                        XmlPullParser xmlPullParser2 = this.d;
                        this.e.element = k.b(xmlPullParser2, "program");
                        Ref.ObjectRef objectRef3 = this.f;
                        String b = k.b(xmlPullParser2, "width");
                        objectRef3.element = b != null ? StringsKt.toIntOrNull(b) : 0;
                        Ref.ObjectRef objectRef4 = this.g;
                        String b2 = k.b(xmlPullParser2, "height");
                        objectRef4.element = b2 != null ? StringsKt.toIntOrNull(b2) : 0;
                        this.h.element = k.b(xmlPullParser2, "apiFramework");
                        Ref.ObjectRef objectRef5 = this.i;
                        String b3 = k.b(xmlPullParser2, TypedValues.CycleType.S_WAVE_OFFSET);
                        objectRef5.element = b3 != null ? k.g(b3) : 0;
                        Ref.ObjectRef objectRef6 = this.j;
                        String b4 = k.b(xmlPullParser2, "duration");
                        if (b4 != null) {
                            objectRef6.element = k.f(b4);
                        } else {
                            objectRef6.element = null;
                        }
                    } else if (k.l(this.d) && (text = this.d.getText()) != null && !StringsKt.isBlank(text)) {
                        String text2 = this.d.getText();
                        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                        StringsKt.trim((CharSequence) text2).toString();
                    } else if (k.i(this.d)) {
                        return Unit.INSTANCE;
                    }
                } else if (depth2 == 1 && k.k(this.d)) {
                    xmlPullParser = this.d;
                    objectRef = this.k;
                    if (objectRef.element == 0) {
                        String name2 = xmlPullParser.getName();
                        if (name2 != null) {
                            int hashCode = name2.hashCode();
                            if (hashCode == -375340334) {
                                if (name2.equals(k.E)) {
                                    this.c = xmlPullParser;
                                    this.n = objectRef;
                                    this.a = depth;
                                    this.b = 3;
                                    Object F = k.F(xmlPullParser, this);
                                    obj2 = F;
                                }
                            } else if (hashCode == 676623548) {
                                if (name2.equals(k.D)) {
                                    this.c = xmlPullParser;
                                    this.n = objectRef;
                                    this.a = depth;
                                    this.b = 1;
                                    Object O = k.O(xmlPullParser, this);
                                    obj3 = O;
                                }
                            } else if (hashCode == 1928285401 && name2.equals(k.F)) {
                                this.c = xmlPullParser;
                                this.n = objectRef;
                                this.a = depth;
                                this.b = 2;
                                Object E = k.E(xmlPullParser, this);
                                obj4 = E;
                            }
                            objectRef.element = t;
                        }
                        t = 0;
                        objectRef.element = t;
                    }
                    name = xmlPullParser.getName();
                    if (Intrinsics.areEqual(name, k.G)) {
                        Ref.ObjectRef objectRef7 = this.l;
                        this.c = objectRef7;
                        this.n = null;
                        this.a = depth;
                        this.b = 4;
                        ?? G = k.G(xmlPullParser, this);
                        if (G != coroutine_suspended) {
                            objectRef7.element = G;
                        }
                        return coroutine_suspended;
                    }
                    if (Intrinsics.areEqual(name, k.J)) {
                        this.c = null;
                        this.n = null;
                        this.a = depth;
                        this.b = 5;
                        Object P = k.P(xmlPullParser, this);
                        obj5 = P;
                    }
                    if (this.d.getDepth() < depth) {
                    }
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            }
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {941}, m = "parseIconTag", n = {"program", "widthPx", "heightPx", "apiFramework", TypedValues.CycleType.S_WAVE_OFFSET, "durationMillis", "clicks", "resource", "viewTrackingUrlList"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$u, reason: case insensitive filesystem */
    public static final class C2860u extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public Object g;
        public Object h;
        public Object i;
        public /* synthetic */ Object j;
        public int k;

        public C2860u(Continuation<? super C2860u> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.k |= Integer.MIN_VALUE;
            return k.H(null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseIconsTag$$inlined$iterateTag$1", f = "VastParser.kt", i = {0}, l = {Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE}, m = "invokeSuspend", n = {"initialDepth"}, s = {"I$0"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$v, reason: case insensitive filesystem */
    public static final class C2861v extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ XmlPullParser d;
        public final /* synthetic */ List e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2861v(XmlPullParser xmlPullParser, Continuation continuation, List list) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = list;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2861v) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C2861v c2861v = new C2861v(this.d, continuation, this.e);
            c2861v.c = obj;
            return c2861v;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00ce  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0083  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005b -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0064 -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0072 -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x007c -> B:5:0x007f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x008f -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00a9 -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00c2 -> B:8:0x00c7). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int depth;
            String text;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScopeKt.ensureActive((CoroutineScope) this.c);
                if (k.j(this.d)) {
                    this.d.nextTag();
                }
                if (k.h(this.d)) {
                    return Unit.INSTANCE;
                }
                if (!k.k(this.d)) {
                    throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
                }
                depth = this.d.getDepth();
                if (this.d.getDepth() < depth) {
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                depth = this.a;
                ResultKt.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l lVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l) obj;
                if (lVar != null) {
                    this.e.add(lVar);
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                    return Unit.INSTANCE;
                }
                int depth2 = this.d.getDepth() - depth;
                if (depth2 == 0) {
                    if (!k.k(this.d)) {
                        if (k.l(this.d) && (text = this.d.getText()) != null && !StringsKt.isBlank(text)) {
                            String text2 = this.d.getText();
                            Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                            StringsKt.trim((CharSequence) text2).toString();
                        } else if (k.i(this.d)) {
                            return Unit.INSTANCE;
                        }
                    }
                } else if (depth2 == 1 && k.k(this.d)) {
                    XmlPullParser xmlPullParser = this.d;
                    if (Intrinsics.areEqual(xmlPullParser.getName(), k.C)) {
                        this.a = depth;
                        this.b = 1;
                        obj = k.H(xmlPullParser, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l lVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l) obj;
                        if (lVar2 != null) {
                        }
                    }
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            }
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", i = {0}, l = {941}, m = "parseIconsTag", n = {"icons"}, s = {"L$0"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$w, reason: case insensitive filesystem */
    public static final class C2862w extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int c;

        public C2862w(Continuation<? super C2862w> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.c |= Integer.MIN_VALUE;
            return k.I(null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseImpressionTag$$inlined$iterateTag$1", f = "VastParser.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$x, reason: case insensitive filesystem */
    public static final class C2863x extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ XmlPullParser d;
        public final /* synthetic */ Ref.ObjectRef e;
        public final /* synthetic */ Ref.ObjectRef f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2863x(XmlPullParser xmlPullParser, Continuation continuation, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = objectRef;
            this.f = objectRef2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2863x) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C2863x c2863x = new C2863x(this.d, continuation, this.e, this.f);
            c2863x.c = obj;
            return c2863x;
        }

        /* JADX WARN: Type inference failed for: r0v20, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v22, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String text;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScopeKt.ensureActive((CoroutineScope) this.c);
            if (k.j(this.d)) {
                this.d.nextTag();
            }
            if (k.h(this.d)) {
                return Unit.INSTANCE;
            }
            if (!k.k(this.d)) {
                throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = this.d.getDepth();
            while (this.d.getDepth() >= depth) {
                int depth2 = this.d.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1) {
                        k.k(this.d);
                    }
                } else if (k.k(this.d)) {
                    this.e.element = k.b(this.d, "id");
                } else if (k.l(this.d) && (text = this.d.getText()) != null && !StringsKt.isBlank(text)) {
                    String text2 = this.d.getText();
                    Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                    this.f.element = StringsKt.trim((CharSequence) text2).toString();
                } else if (k.i(this.d)) {
                    return Unit.INSTANCE;
                }
                this.d.next();
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", i = {0, 0}, l = {941}, m = "parseImpressionTag", n = {"id", "impressionUrl"}, s = {"L$0", "L$1"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$y, reason: case insensitive filesystem */
    public static final class C2864y extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int d;

        public C2864y(Continuation<? super C2864y> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            return k.J(null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseInLineTag$$inlined$iterateTag$1", f = "VastParser.kt", i = {0, 1, 2, 3, 4, 5, 6, 7}, l = {Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, 126, 127, 128, 130, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE}, m = "invokeSuspend", n = {"initialDepth", "initialDepth", "initialDepth", "initialDepth", "initialDepth", "initialDepth", "initialDepth", "initialDepth"}, s = {"I$0", "I$0", "I$0", "I$0", "I$0", "I$0", "I$0", "I$0"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$z, reason: case insensitive filesystem */
    public static final class C2865z extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ XmlPullParser d;
        public final /* synthetic */ Ref.ObjectRef e;
        public final /* synthetic */ Ref.ObjectRef f;
        public final /* synthetic */ Ref.ObjectRef g;
        public final /* synthetic */ Ref.ObjectRef h;
        public final /* synthetic */ Ref.ObjectRef i;
        public final /* synthetic */ List j;
        public final /* synthetic */ List k;
        public final /* synthetic */ List l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2865z(XmlPullParser xmlPullParser, Continuation continuation, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3, Ref.ObjectRef objectRef4, Ref.ObjectRef objectRef5, List list, List list2, List list3) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = objectRef;
            this.f = objectRef2;
            this.g = objectRef3;
            this.h = objectRef4;
            this.i = objectRef5;
            this.j = list;
            this.k = list2;
            this.l = list3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2865z) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C2865z c2865z = new C2865z(this.d, continuation, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
            c2865z.c = obj;
            return c2865z;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00d3, code lost:
        
            if (r7 == r0) goto L97;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0154, code lost:
        
            if (r7 == r0) goto L97;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x01b2, code lost:
        
            if (r7 == r0) goto L97;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0202  */
        /* JADX WARN: Type inference failed for: r7v41, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v42, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v44, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v45, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v46, types: [T, java.lang.Object] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00a0 -> B:8:0x01fb). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00aa -> B:8:0x01fb). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00b2 -> B:8:0x01fb). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00b9 -> B:8:0x01fb). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00c4 -> B:8:0x01fb). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00d9 -> B:8:0x01fb). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00db -> B:8:0x01fb). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00e8 -> B:8:0x01fb). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0107 -> B:8:0x01fb). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0126 -> B:8:0x01fb). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0145 -> B:8:0x01fb). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0159 -> B:8:0x01fb). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x015b -> B:8:0x01fb). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0168 -> B:8:0x01fb). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0186 -> B:8:0x01fb). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x01a3 -> B:8:0x01fb). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x01b2 -> B:7:0x01b5). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x01c3 -> B:8:0x01fb). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x01dd -> B:8:0x01fb). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x01f6 -> B:8:0x01fb). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int depth;
            Object obj2;
            Object obj3;
            String text;
            XmlPullParser xmlPullParser;
            String name;
            Object obj4;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.b) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    CoroutineScopeKt.ensureActive((CoroutineScope) this.c);
                    if (k.j(this.d)) {
                        this.d.nextTag();
                    }
                    if (k.h(this.d)) {
                        return Unit.INSTANCE;
                    }
                    if (!k.k(this.d)) {
                        throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
                    }
                    depth = this.d.getDepth();
                    if (this.d.getDepth() < depth) {
                        return Unit.INSTANCE;
                    }
                    int depth2 = this.d.getDepth() - depth;
                    if (depth2 != 0) {
                        if (depth2 == 1 && k.k(this.d) && (name = (xmlPullParser = this.d).getName()) != null) {
                            switch (name.hashCode()) {
                                case -1692490108:
                                    if (name.equals(k.o)) {
                                        this.c = null;
                                        this.a = depth;
                                        this.b = 8;
                                        Object f = k.f(xmlPullParser, true, this);
                                        obj4 = f;
                                        break;
                                    }
                                    break;
                                case -1633884078:
                                    if (name.equals(k.h)) {
                                        Ref.ObjectRef objectRef = this.e;
                                        this.c = objectRef;
                                        this.a = depth;
                                        this.b = 1;
                                        ?? z = k.z(xmlPullParser, this);
                                        if (z != coroutine_suspended) {
                                            objectRef.element = z;
                                            break;
                                        }
                                        return coroutine_suspended;
                                    }
                                    break;
                                case -56677412:
                                    if (name.equals(k.j)) {
                                        Ref.ObjectRef objectRef2 = this.g;
                                        this.c = objectRef2;
                                        this.a = depth;
                                        this.b = 3;
                                        ?? P = k.P(xmlPullParser, this);
                                        if (P != coroutine_suspended) {
                                            objectRef2.element = P;
                                            break;
                                        }
                                        return coroutine_suspended;
                                    }
                                    break;
                                case 67232232:
                                    if (name.equals(k.c)) {
                                        this.c = null;
                                        this.a = depth;
                                        this.b = 7;
                                        Object D = k.D(xmlPullParser, this);
                                        obj2 = D;
                                        break;
                                    }
                                    break;
                                case 501930965:
                                    if (name.equals(k.i)) {
                                        Ref.ObjectRef objectRef3 = this.f;
                                        this.c = objectRef3;
                                        this.a = depth;
                                        this.b = 2;
                                        ?? P2 = k.P(xmlPullParser, this);
                                        if (P2 != coroutine_suspended) {
                                            objectRef3.element = P2;
                                            break;
                                        }
                                        return coroutine_suspended;
                                    }
                                    break;
                                case 1349597094:
                                    if (name.equals(k.l)) {
                                        Ref.ObjectRef objectRef4 = this.i;
                                        this.c = objectRef4;
                                        this.a = depth;
                                        this.b = 5;
                                        ?? N = k.N(xmlPullParser, this);
                                        if (N != coroutine_suspended) {
                                            objectRef4.element = N;
                                            break;
                                        }
                                        return coroutine_suspended;
                                    }
                                    break;
                                case 2065545547:
                                    if (name.equals(k.k)) {
                                        Ref.ObjectRef objectRef5 = this.h;
                                        this.c = objectRef5;
                                        this.a = depth;
                                        this.b = 4;
                                        ?? P3 = k.P(xmlPullParser, this);
                                        if (P3 != coroutine_suspended) {
                                            objectRef5.element = P3;
                                            break;
                                        }
                                        return coroutine_suspended;
                                    }
                                    break;
                                case 2114088489:
                                    if (name.equals(k.n)) {
                                        this.c = null;
                                        this.a = depth;
                                        this.b = 6;
                                        Object J = k.J(xmlPullParser, this);
                                        obj3 = J;
                                        break;
                                    }
                                    break;
                            }
                        }
                    } else if (!k.k(this.d)) {
                        if (k.l(this.d) && (text = this.d.getText()) != null && !StringsKt.isBlank(text)) {
                            String text2 = this.d.getText();
                            Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                            StringsKt.trim((CharSequence) text2).toString();
                        } else if (k.i(this.d)) {
                            return Unit.INSTANCE;
                        }
                    }
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 1:
                    depth = this.a;
                    Ref.ObjectRef objectRef6 = (Ref.ObjectRef) this.c;
                    ResultKt.throwOnFailure(obj);
                    objectRef6.element = obj;
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 2:
                    depth = this.a;
                    Ref.ObjectRef objectRef7 = (Ref.ObjectRef) this.c;
                    ResultKt.throwOnFailure(obj);
                    objectRef7.element = obj;
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 3:
                    depth = this.a;
                    Ref.ObjectRef objectRef8 = (Ref.ObjectRef) this.c;
                    ResultKt.throwOnFailure(obj);
                    objectRef8.element = obj;
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 4:
                    depth = this.a;
                    Ref.ObjectRef objectRef9 = (Ref.ObjectRef) this.c;
                    ResultKt.throwOnFailure(obj);
                    objectRef9.element = obj;
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 5:
                    depth = this.a;
                    Ref.ObjectRef objectRef10 = (Ref.ObjectRef) this.c;
                    ResultKt.throwOnFailure(obj);
                    objectRef10.element = obj;
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 6:
                    depth = this.a;
                    ResultKt.throwOnFailure(obj);
                    obj3 = obj;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n nVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n) obj3;
                    if (nVar != null) {
                        this.j.add(nVar);
                    }
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 7:
                    depth = this.a;
                    ResultKt.throwOnFailure(obj);
                    obj2 = obj;
                    String str = (String) obj2;
                    if (str != null) {
                        this.k.add(str);
                    }
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 8:
                    depth = this.a;
                    ResultKt.throwOnFailure(obj);
                    obj4 = obj;
                    this.l.addAll((List) obj4);
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object A(XmlPullParser xmlPullParser, Continuation<? super C2866a> continuation) {
        C2847g c2847g;
        int i2;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        Ref.ObjectRef objectRef3;
        AbstractC2867b abstractC2867b;
        if (continuation instanceof C2847g) {
            c2847g = (C2847g) continuation;
            int i3 = c2847g.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c2847g.e = i3 - Integer.MIN_VALUE;
                Object obj = c2847g.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c2847g.e;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef5 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef6 = new Ref.ObjectRef();
                    C2846f c2846f = new C2846f(xmlPullParser, null, objectRef4, objectRef5, objectRef6);
                    c2847g.a = objectRef4;
                    c2847g.b = objectRef5;
                    c2847g.c = objectRef6;
                    c2847g.e = 1;
                    if (CoroutineScopeKt.coroutineScope(c2846f, c2847g) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef4;
                    objectRef2 = objectRef5;
                    objectRef3 = objectRef6;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef3 = (Ref.ObjectRef) c2847g.c;
                    objectRef2 = (Ref.ObjectRef) c2847g.b;
                    objectRef = (Ref.ObjectRef) c2847g.a;
                    ResultKt.throwOnFailure(obj);
                }
                abstractC2867b = (AbstractC2867b) objectRef3.element;
                if (abstractC2867b == null) {
                    return new C2866a((String) objectRef.element, (Integer) objectRef2.element, abstractC2867b);
                }
                return null;
            }
        }
        c2847g = new C2847g(continuation);
        Object obj2 = c2847g.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c2847g.e;
        if (i2 != 0) {
        }
        abstractC2867b = (AbstractC2867b) objectRef3.element;
        if (abstractC2867b == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object B(XmlPullParser xmlPullParser, Continuation<? super List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e>> continuation) {
        C2849i c2849i;
        int i2;
        if (continuation instanceof C2849i) {
            c2849i = (C2849i) continuation;
            int i3 = c2849i.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c2849i.c = i3 - Integer.MIN_VALUE;
                Object obj = c2849i.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c2849i.c;
                if (i2 == 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list = (List) c2849i.a;
                    ResultKt.throwOnFailure(obj);
                    return list;
                }
                ResultKt.throwOnFailure(obj);
                ArrayList arrayList = new ArrayList();
                C2848h c2848h = new C2848h(xmlPullParser, null, arrayList);
                c2849i.a = arrayList;
                c2849i.c = 1;
                return CoroutineScopeKt.coroutineScope(c2848h, c2849i) == coroutine_suspended ? coroutine_suspended : arrayList;
            }
        }
        c2849i = new C2849i(continuation);
        Object obj2 = c2849i.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c2849i.c;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00db A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object C(XmlPullParser xmlPullParser, Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e> continuation) {
        C0343k c0343k;
        int i2;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        List list;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        Ref.ObjectRef objectRef5;
        Ref.ObjectRef objectRef6;
        ArrayList arrayList;
        ArrayList arrayList2;
        Ref.ObjectRef objectRef7;
        if (continuation instanceof C0343k) {
            c0343k = (C0343k) continuation;
            int i3 = c0343k.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0343k.l = i3 - Integer.MIN_VALUE;
                Object obj = c0343k.k;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c0343k.l;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.ObjectRef objectRef8 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef9 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef10 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef11 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef12 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef13 = new Ref.ObjectRef();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    Ref.ObjectRef objectRef14 = new Ref.ObjectRef();
                    ArrayList arrayList5 = new ArrayList();
                    C2850j c2850j = new C2850j(xmlPullParser, null, objectRef8, objectRef9, objectRef10, objectRef12, objectRef11, objectRef13, arrayList3, objectRef14, arrayList4, arrayList5);
                    c0343k.a = objectRef8;
                    c0343k.b = objectRef9;
                    c0343k.c = objectRef10;
                    c0343k.d = objectRef11;
                    c0343k.e = objectRef12;
                    c0343k.f = objectRef13;
                    c0343k.g = arrayList3;
                    c0343k.h = arrayList4;
                    c0343k.i = objectRef14;
                    c0343k.j = arrayList5;
                    c0343k.l = 1;
                    if (CoroutineScopeKt.coroutineScope(c2850j, c0343k) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef9;
                    objectRef2 = objectRef10;
                    list = arrayList5;
                    objectRef3 = objectRef8;
                    objectRef4 = objectRef12;
                    objectRef5 = objectRef11;
                    objectRef6 = objectRef13;
                    arrayList = arrayList3;
                    arrayList2 = arrayList4;
                    objectRef7 = objectRef14;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (List) c0343k.j;
                    objectRef7 = (Ref.ObjectRef) c0343k.i;
                    ?? r4 = (List) c0343k.h;
                    ?? r5 = (List) c0343k.g;
                    objectRef6 = (Ref.ObjectRef) c0343k.f;
                    objectRef4 = (Ref.ObjectRef) c0343k.e;
                    objectRef5 = (Ref.ObjectRef) c0343k.d;
                    objectRef2 = (Ref.ObjectRef) c0343k.c;
                    objectRef = (Ref.ObjectRef) c0343k.b;
                    objectRef3 = (Ref.ObjectRef) c0343k.a;
                    ResultKt.throwOnFailure(obj);
                    arrayList2 = r4;
                    arrayList = r5;
                }
                String str = (String) objectRef7.element;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.f fVar = str == null ? new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.f(str, list) : null;
                if (arrayList2.isEmpty()) {
                    return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e((String) objectRef3.element, (Integer) objectRef.element, (Integer) objectRef2.element, (String) objectRef5.element, (String) objectRef4.element, fVar, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c) objectRef6.element, arrayList, arrayList2);
                }
                return null;
            }
        }
        c0343k = new C0343k(continuation);
        Object obj2 = c0343k.k;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c0343k.l;
        if (i2 != 0) {
        }
        String str2 = (String) objectRef7.element;
        if (str2 == null) {
        }
        if (arrayList2.isEmpty()) {
        }
    }

    public static final Object D(XmlPullParser xmlPullParser, Continuation<? super String> continuation) {
        return P(xmlPullParser, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object E(XmlPullParser xmlPullParser, Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j> continuation) {
        C2855p c2855p;
        int i2;
        String str;
        if (continuation instanceof C2855p) {
            c2855p = (C2855p) continuation;
            int i3 = c2855p.b;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c2855p.b = i3 - Integer.MIN_VALUE;
                Object obj = c2855p.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c2855p.b;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    c2855p.b = 1;
                    obj = P(xmlPullParser, c2855p);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                str = (String) obj;
                if (str == null) {
                    return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j(str);
                }
                return null;
            }
        }
        c2855p = new C2855p(continuation);
        Object obj2 = c2855p.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c2855p.b;
        if (i2 != 0) {
        }
        str = (String) obj2;
        if (str == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object F(XmlPullParser xmlPullParser, Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.k> continuation) {
        C2856q c2856q;
        int i2;
        String str;
        if (continuation instanceof C2856q) {
            c2856q = (C2856q) continuation;
            int i3 = c2856q.b;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c2856q.b = i3 - Integer.MIN_VALUE;
                Object obj = c2856q.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c2856q.b;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    c2856q.b = 1;
                    obj = P(xmlPullParser, c2856q);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                str = (String) obj;
                if (str == null) {
                    return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.k(str);
                }
                return null;
            }
        }
        c2856q = new C2856q(continuation);
        Object obj2 = c2856q.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c2856q.b;
        if (i2 != 0) {
        }
        str = (String) obj2;
        if (str == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object G(XmlPullParser xmlPullParser, Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.m> continuation) {
        C2858s c2858s;
        int i2;
        Ref.ObjectRef objectRef;
        List list;
        String str;
        if (continuation instanceof C2858s) {
            c2858s = (C2858s) continuation;
            int i3 = c2858s.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c2858s.d = i3 - Integer.MIN_VALUE;
                Object obj = c2858s.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c2858s.d;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    ArrayList arrayList = new ArrayList();
                    C2857r c2857r = new C2857r(xmlPullParser, null, objectRef2, arrayList);
                    c2858s.a = objectRef2;
                    c2858s.b = arrayList;
                    c2858s.d = 1;
                    if (CoroutineScopeKt.coroutineScope(c2857r, c2858s) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef2;
                    list = arrayList;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (List) c2858s.b;
                    objectRef = (Ref.ObjectRef) c2858s.a;
                    ResultKt.throwOnFailure(obj);
                }
                str = (String) objectRef.element;
                if (str == null) {
                    return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.m(str, list);
                }
                return null;
            }
        }
        c2858s = new C2858s(continuation);
        Object obj2 = c2858s.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c2858s.d;
        if (i2 != 0) {
        }
        str = (String) objectRef.element;
        if (str == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object H(XmlPullParser xmlPullParser, Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l> continuation) {
        C2860u c2860u;
        int i2;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        Ref.ObjectRef objectRef5;
        Ref.ObjectRef objectRef6;
        Ref.ObjectRef objectRef7;
        Ref.ObjectRef objectRef8;
        ArrayList arrayList;
        y yVar;
        if (continuation instanceof C2860u) {
            c2860u = (C2860u) continuation;
            int i3 = c2860u.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c2860u.k = i3 - Integer.MIN_VALUE;
                Object obj = c2860u.j;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c2860u.k;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.ObjectRef objectRef9 = new Ref.ObjectRef();
                    objectRef = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef10 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef11 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef12 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef13 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef14 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef15 = new Ref.ObjectRef();
                    ArrayList arrayList2 = new ArrayList();
                    C2859t c2859t = new C2859t(xmlPullParser, null, objectRef9, objectRef, objectRef10, objectRef11, objectRef12, objectRef13, objectRef15, objectRef14, arrayList2);
                    c2860u.a = objectRef9;
                    c2860u.b = objectRef;
                    c2860u.c = objectRef10;
                    c2860u.d = objectRef11;
                    c2860u.e = objectRef12;
                    c2860u.f = objectRef13;
                    c2860u.g = objectRef14;
                    c2860u.h = objectRef15;
                    c2860u.i = arrayList2;
                    c2860u.k = 1;
                    if (CoroutineScopeKt.coroutineScope(c2859t, c2860u) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef2 = objectRef9;
                    objectRef3 = objectRef10;
                    objectRef4 = objectRef11;
                    objectRef5 = objectRef12;
                    objectRef6 = objectRef13;
                    objectRef7 = objectRef15;
                    objectRef8 = objectRef14;
                    arrayList = arrayList2;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ?? r2 = (List) c2860u.i;
                    objectRef7 = (Ref.ObjectRef) c2860u.h;
                    objectRef8 = (Ref.ObjectRef) c2860u.g;
                    objectRef6 = (Ref.ObjectRef) c2860u.f;
                    objectRef5 = (Ref.ObjectRef) c2860u.e;
                    objectRef4 = (Ref.ObjectRef) c2860u.d;
                    objectRef3 = (Ref.ObjectRef) c2860u.c;
                    objectRef = (Ref.ObjectRef) c2860u.b;
                    objectRef2 = (Ref.ObjectRef) c2860u.a;
                    ResultKt.throwOnFailure(obj);
                    arrayList = r2;
                }
                yVar = (y) objectRef7.element;
                if (yVar == null) {
                    return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l((String) objectRef2.element, (Integer) objectRef.element, (Integer) objectRef3.element, (String) objectRef4.element, (r) objectRef5.element, (Long) objectRef6.element, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.m) objectRef8.element, arrayList, yVar);
                }
                return null;
            }
        }
        c2860u = new C2860u(continuation);
        Object obj2 = c2860u.j;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c2860u.k;
        if (i2 != 0) {
        }
        yVar = (y) objectRef7.element;
        if (yVar == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object I(XmlPullParser xmlPullParser, Continuation<? super List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l>> continuation) {
        C2862w c2862w;
        int i2;
        if (continuation instanceof C2862w) {
            c2862w = (C2862w) continuation;
            int i3 = c2862w.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c2862w.c = i3 - Integer.MIN_VALUE;
                Object obj = c2862w.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c2862w.c;
                if (i2 == 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list = (List) c2862w.a;
                    ResultKt.throwOnFailure(obj);
                    return list;
                }
                ResultKt.throwOnFailure(obj);
                ArrayList arrayList = new ArrayList();
                C2861v c2861v = new C2861v(xmlPullParser, null, arrayList);
                c2862w.a = arrayList;
                c2862w.c = 1;
                return CoroutineScopeKt.coroutineScope(c2861v, c2862w) == coroutine_suspended ? coroutine_suspended : arrayList;
            }
        }
        c2862w = new C2862w(continuation);
        Object obj2 = c2862w.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c2862w.c;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object J(XmlPullParser xmlPullParser, Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n> continuation) {
        C2864y c2864y;
        int i2;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        String str;
        if (continuation instanceof C2864y) {
            c2864y = (C2864y) continuation;
            int i3 = c2864y.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c2864y.d = i3 - Integer.MIN_VALUE;
                Object obj = c2864y.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c2864y.d;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
                    C2863x c2863x = new C2863x(xmlPullParser, null, objectRef3, objectRef4);
                    c2864y.a = objectRef3;
                    c2864y.b = objectRef4;
                    c2864y.d = 1;
                    if (CoroutineScopeKt.coroutineScope(c2863x, c2864y) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef3;
                    objectRef2 = objectRef4;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef2 = (Ref.ObjectRef) c2864y.b;
                    objectRef = (Ref.ObjectRef) c2864y.a;
                    ResultKt.throwOnFailure(obj);
                }
                str = (String) objectRef2.element;
                if (str == null) {
                    return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n((String) objectRef.element, str);
                }
                return null;
            }
        }
        c2864y = new C2864y(continuation);
        Object obj2 = c2864y.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c2864y.d;
        if (i2 != 0) {
        }
        str = (String) objectRef2.element;
        if (str == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object K(XmlPullParser xmlPullParser, Continuation<? super o> continuation) {
        A a2;
        int i2;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        Ref.ObjectRef objectRef5;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        if (continuation instanceof A) {
            a2 = (A) continuation;
            int i3 = a2.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                a2.j = i3 - Integer.MIN_VALUE;
                Object obj = a2.i;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = a2.j;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.ObjectRef objectRef6 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef7 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef8 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef9 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef10 = new Ref.ObjectRef();
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    C2865z c2865z = new C2865z(xmlPullParser, null, objectRef6, objectRef7, objectRef8, objectRef9, objectRef10, arrayList4, arrayList5, arrayList6);
                    a2.a = objectRef6;
                    a2.b = objectRef7;
                    a2.c = objectRef8;
                    a2.d = objectRef9;
                    a2.e = objectRef10;
                    a2.f = arrayList4;
                    a2.g = arrayList5;
                    a2.h = arrayList6;
                    a2.j = 1;
                    if (CoroutineScopeKt.coroutineScope(c2865z, a2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef6;
                    objectRef2 = objectRef7;
                    objectRef3 = objectRef8;
                    objectRef4 = objectRef9;
                    objectRef5 = objectRef10;
                    arrayList = arrayList4;
                    arrayList2 = arrayList5;
                    arrayList3 = arrayList6;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ?? r2 = (List) a2.h;
                    ?? r3 = (List) a2.g;
                    ?? r4 = (List) a2.f;
                    objectRef5 = (Ref.ObjectRef) a2.e;
                    objectRef4 = (Ref.ObjectRef) a2.d;
                    objectRef3 = (Ref.ObjectRef) a2.c;
                    Ref.ObjectRef objectRef11 = (Ref.ObjectRef) a2.b;
                    objectRef = (Ref.ObjectRef) a2.a;
                    ResultKt.throwOnFailure(obj);
                    arrayList3 = r2;
                    arrayList2 = r3;
                    objectRef2 = objectRef11;
                    arrayList = r4;
                }
                return new o((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.d) objectRef.element, (String) objectRef2.element, (String) objectRef3.element, (String) objectRef4.element, (s) objectRef5.element, arrayList, arrayList2, arrayList3);
            }
        }
        a2 = new A(continuation);
        Object obj2 = a2.i;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = a2.j;
        if (i2 != 0) {
        }
        return new o((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.d) objectRef.element, (String) objectRef2.element, (String) objectRef3.element, (String) objectRef4.element, (s) objectRef5.element, arrayList, arrayList2, arrayList3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object L(XmlPullParser xmlPullParser, Continuation<? super q> continuation) {
        E e2;
        int i2;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        Ref.ObjectRef objectRef5;
        Ref.ObjectRef objectRef6;
        Ref.ObjectRef objectRef7;
        Ref.ObjectRef objectRef8;
        Ref.ObjectRef objectRef9;
        Ref.ObjectRef objectRef10;
        Ref.ObjectRef objectRef11;
        Ref.ObjectRef objectRef12;
        if (continuation instanceof E) {
            e2 = (E) continuation;
            int i3 = e2.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                e2.n = i3 - Integer.MIN_VALUE;
                Object obj = e2.m;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = e2.n;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.ObjectRef objectRef13 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef14 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef15 = new Ref.ObjectRef();
                    objectRef = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef16 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef17 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef18 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef19 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef20 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef21 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef22 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef23 = new Ref.ObjectRef();
                    D d2 = new D(xmlPullParser, null, objectRef14, objectRef15, objectRef, objectRef16, objectRef17, objectRef18, objectRef19, objectRef20, objectRef21, objectRef22, objectRef23, objectRef13);
                    e2.a = objectRef13;
                    e2.b = objectRef14;
                    e2.c = objectRef15;
                    e2.d = objectRef;
                    e2.e = objectRef16;
                    e2.f = objectRef17;
                    e2.g = objectRef18;
                    e2.h = objectRef19;
                    e2.i = objectRef20;
                    e2.j = objectRef21;
                    e2.k = objectRef22;
                    e2.l = objectRef23;
                    e2.n = 1;
                    if (CoroutineScopeKt.coroutineScope(d2, e2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef2 = objectRef14;
                    objectRef3 = objectRef17;
                    objectRef4 = objectRef15;
                    objectRef5 = objectRef16;
                    objectRef6 = objectRef13;
                    objectRef7 = objectRef23;
                    objectRef8 = objectRef22;
                    objectRef9 = objectRef21;
                    objectRef10 = objectRef18;
                    objectRef11 = objectRef19;
                    objectRef12 = objectRef20;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef7 = (Ref.ObjectRef) e2.l;
                    objectRef8 = (Ref.ObjectRef) e2.k;
                    objectRef9 = (Ref.ObjectRef) e2.j;
                    objectRef12 = (Ref.ObjectRef) e2.i;
                    objectRef11 = (Ref.ObjectRef) e2.h;
                    objectRef10 = (Ref.ObjectRef) e2.g;
                    objectRef3 = (Ref.ObjectRef) e2.f;
                    objectRef5 = (Ref.ObjectRef) e2.e;
                    objectRef = (Ref.ObjectRef) e2.d;
                    objectRef4 = (Ref.ObjectRef) e2.c;
                    objectRef2 = (Ref.ObjectRef) e2.b;
                    objectRef6 = (Ref.ObjectRef) e2.a;
                    ResultKt.throwOnFailure(obj);
                }
                if (objectRef6.element != 0 || objectRef.element == 0 || objectRef4.element == 0) {
                    return null;
                }
                T t2 = objectRef6.element;
                Intrinsics.checkNotNull(t2);
                String str = (String) t2;
                String str2 = (String) objectRef2.element;
                T t3 = objectRef4.element;
                Intrinsics.checkNotNull(t3);
                boolean booleanValue = ((Boolean) t3).booleanValue();
                T t4 = objectRef.element;
                Intrinsics.checkNotNull(t4);
                return new q(str, str2, booleanValue, (String) t4, (Integer) objectRef5.element, (Integer) objectRef3.element, (String) objectRef10.element, (Integer) objectRef11.element, (Integer) objectRef12.element, (Integer) objectRef9.element, (Boolean) objectRef8.element, (String) objectRef7.element);
            }
        }
        e2 = new E(continuation);
        Object obj2 = e2.m;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = e2.n;
        if (i2 != 0) {
        }
        return objectRef6.element != 0 ? null : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object M(XmlPullParser xmlPullParser, Continuation<? super List<q>> continuation) {
        G g2;
        int i2;
        if (continuation instanceof G) {
            g2 = (G) continuation;
            int i3 = g2.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                g2.c = i3 - Integer.MIN_VALUE;
                Object obj = g2.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = g2.c;
                if (i2 == 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list = (List) g2.a;
                    ResultKt.throwOnFailure(obj);
                    return list;
                }
                ResultKt.throwOnFailure(obj);
                ArrayList arrayList = new ArrayList();
                F f2 = new F(xmlPullParser, null, arrayList);
                g2.a = arrayList;
                g2.c = 1;
                return CoroutineScopeKt.coroutineScope(f2, g2) == coroutine_suspended ? coroutine_suspended : arrayList;
            }
        }
        g2 = new G(continuation);
        Object obj2 = g2.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = g2.c;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object N(XmlPullParser xmlPullParser, Continuation<? super s> continuation) {
        I i2;
        int i3;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        if (continuation instanceof I) {
            i2 = (I) continuation;
            int i4 = i2.d;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                i2.d = i4 - Integer.MIN_VALUE;
                Object obj = i2.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i3 = i2.d;
                if (i3 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
                    H h2 = new H(xmlPullParser, null, objectRef3, objectRef4);
                    i2.a = objectRef3;
                    i2.b = objectRef4;
                    i2.d = 1;
                    if (CoroutineScopeKt.coroutineScope(h2, i2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef3;
                    objectRef2 = objectRef4;
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef2 = (Ref.ObjectRef) i2.b;
                    objectRef = (Ref.ObjectRef) i2.a;
                    ResultKt.throwOnFailure(obj);
                }
                if (objectRef.element == 0 || objectRef2.element != 0) {
                    return new s((String) objectRef.element, (String) objectRef2.element);
                }
                return null;
            }
        }
        i2 = new I(continuation);
        Object obj2 = i2.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i3 = i2.d;
        if (i3 != 0) {
        }
        if (objectRef.element == 0) {
        }
        return new s((String) objectRef.element, (String) objectRef2.element);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object O(XmlPullParser xmlPullParser, Continuation<? super t> continuation) {
        K k2;
        int i2;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        if (continuation instanceof K) {
            k2 = (K) continuation;
            int i3 = k2.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                k2.d = i3 - Integer.MIN_VALUE;
                Object obj = k2.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = k2.d;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
                    J j2 = new J(xmlPullParser, null, objectRef4, objectRef3);
                    k2.a = objectRef3;
                    k2.b = objectRef4;
                    k2.d = 1;
                    if (CoroutineScopeKt.coroutineScope(j2, k2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef3;
                    objectRef2 = objectRef4;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef2 = (Ref.ObjectRef) k2.b;
                    objectRef = (Ref.ObjectRef) k2.a;
                    ResultKt.throwOnFailure(obj);
                }
                if (objectRef.element != 0 || objectRef2.element == 0) {
                    return null;
                }
                T t2 = objectRef.element;
                Intrinsics.checkNotNull(t2);
                T t3 = objectRef2.element;
                Intrinsics.checkNotNull(t3);
                return new t((String) t2, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i) t3);
            }
        }
        k2 = new K(continuation);
        Object obj2 = k2.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = k2.d;
        if (i2 != 0) {
        }
        if (objectRef.element != 0) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(XmlPullParser xmlPullParser, Continuation<? super String> continuation) {
        M m2;
        int i2;
        Ref.ObjectRef objectRef;
        if (continuation instanceof M) {
            m2 = (M) continuation;
            int i3 = m2.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                m2.c = i3 - Integer.MIN_VALUE;
                Object obj = m2.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = m2.c;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    L l2 = new L(xmlPullParser, null, objectRef2);
                    m2.a = objectRef2;
                    m2.c = 1;
                    if (CoroutineScopeKt.coroutineScope(l2, m2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef2;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef = (Ref.ObjectRef) m2.a;
                    ResultKt.throwOnFailure(obj);
                }
                return objectRef.element;
            }
        }
        m2 = new M(continuation);
        Object obj2 = m2.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = m2.c;
        if (i2 != 0) {
        }
        return objectRef.element;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Q(XmlPullParser xmlPullParser, Continuation<? super List<u>> continuation) {
        O o2;
        int i2;
        if (continuation instanceof O) {
            o2 = (O) continuation;
            int i3 = o2.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                o2.c = i3 - Integer.MIN_VALUE;
                Object obj = o2.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = o2.c;
                if (i2 == 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list = (List) o2.a;
                    ResultKt.throwOnFailure(obj);
                    return list;
                }
                ResultKt.throwOnFailure(obj);
                ArrayList arrayList = new ArrayList();
                N n2 = new N(xmlPullParser, null, arrayList);
                o2.a = arrayList;
                o2.c = 1;
                return CoroutineScopeKt.coroutineScope(n2, o2) == coroutine_suspended ? coroutine_suspended : arrayList;
            }
        }
        o2 = new O(continuation);
        Object obj2 = o2.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = o2.c;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object R(XmlPullParser xmlPullParser, Continuation<? super u> continuation) {
        Q q2;
        int i2;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        Ref.ObjectRef objectRef3;
        T t2;
        if (continuation instanceof Q) {
            q2 = (Q) continuation;
            int i3 = q2.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                q2.e = i3 - Integer.MIN_VALUE;
                Object obj = q2.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = q2.e;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef5 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef6 = new Ref.ObjectRef();
                    P p2 = new P(xmlPullParser, null, objectRef4, objectRef6, objectRef5);
                    q2.a = objectRef4;
                    q2.b = objectRef5;
                    q2.c = objectRef6;
                    q2.e = 1;
                    if (CoroutineScopeKt.coroutineScope(p2, q2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef4;
                    objectRef2 = objectRef6;
                    objectRef3 = objectRef5;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef2 = (Ref.ObjectRef) q2.c;
                    objectRef3 = (Ref.ObjectRef) q2.b;
                    objectRef = (Ref.ObjectRef) q2.a;
                    ResultKt.throwOnFailure(obj);
                }
                t2 = objectRef.element;
                if (t2 == 0 && objectRef3.element != 0) {
                    if (t2 == v.n && objectRef2.element == 0) {
                        return null;
                    }
                    T t3 = objectRef.element;
                    Intrinsics.checkNotNull(t3);
                    T t4 = objectRef3.element;
                    Intrinsics.checkNotNull(t4);
                    return new u((v) t3, (String) t4, (r) objectRef2.element);
                }
            }
        }
        q2 = new Q(continuation);
        Object obj2 = q2.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = q2.e;
        if (i2 != 0) {
        }
        t2 = objectRef.element;
        return t2 == 0 ? null : null;
    }

    public static final Object S(XmlPullParser xmlPullParser, Continuation<? super w> continuation) {
        return BuildersKt.withContext(com.moloco.sdk.internal.scheduling.b.a().getIo(), new R(xmlPullParser, null), continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object T(XmlPullParser xmlPullParser, Continuation<? super w> continuation) {
        T t2;
        int i2;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        List list;
        if (continuation instanceof T) {
            t2 = (T) continuation;
            int i3 = t2.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                t2.e = i3 - Integer.MIN_VALUE;
                Object obj = t2.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = t2.e;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    ArrayList arrayList = new ArrayList();
                    Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
                    S s2 = new S(xmlPullParser, null, objectRef3, objectRef4, arrayList);
                    t2.a = arrayList;
                    t2.b = objectRef3;
                    t2.c = objectRef4;
                    t2.e = 1;
                    if (CoroutineScopeKt.coroutineScope(s2, t2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef3;
                    objectRef2 = objectRef4;
                    list = arrayList;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef2 = (Ref.ObjectRef) t2.c;
                    objectRef = (Ref.ObjectRef) t2.b;
                    list = (List) t2.a;
                    ResultKt.throwOnFailure(obj);
                }
                if (list.isEmpty() || objectRef2.element != 0) {
                    return new w(list, (String) objectRef2.element, (String) objectRef.element);
                }
                return null;
            }
        }
        t2 = new T(continuation);
        Object obj2 = t2.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = t2.e;
        if (i2 != 0) {
        }
        if (list.isEmpty()) {
        }
        return new w(list, (String) objectRef2.element, (String) objectRef.element);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object U(XmlPullParser xmlPullParser, Continuation<? super z> continuation) {
        V v2;
        int i2;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        String str;
        if (continuation instanceof V) {
            v2 = (V) continuation;
            int i3 = v2.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                v2.d = i3 - Integer.MIN_VALUE;
                Object obj = v2.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = v2.d;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
                    U u2 = new U(xmlPullParser, null, objectRef3, objectRef4);
                    v2.a = objectRef3;
                    v2.b = objectRef4;
                    v2.d = 1;
                    if (CoroutineScopeKt.coroutineScope(u2, v2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef3;
                    objectRef2 = objectRef4;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef2 = (Ref.ObjectRef) v2.b;
                    objectRef = (Ref.ObjectRef) v2.a;
                    ResultKt.throwOnFailure(obj);
                }
                str = (String) objectRef2.element;
                if (str == null) {
                    return new z((String) objectRef.element, str);
                }
                return null;
            }
        }
        v2 = new V(continuation);
        Object obj2 = v2.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = v2.d;
        if (i2 != 0) {
        }
        str = (String) objectRef2.element;
        if (str == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object V(XmlPullParser xmlPullParser, Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.B> continuation) {
        Z z2;
        int i2;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        Ref.ObjectRef objectRef3;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        String str;
        if (continuation instanceof Z) {
            z2 = (Z) continuation;
            int i3 = z2.h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                z2.h = i3 - Integer.MIN_VALUE;
                Object obj = z2.g;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = z2.h;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef5 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef6 = new Ref.ObjectRef();
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    Y y2 = new Y(xmlPullParser, null, objectRef5, objectRef4, objectRef6, arrayList4, arrayList5, arrayList6);
                    z2.a = objectRef4;
                    z2.b = objectRef5;
                    z2.c = objectRef6;
                    z2.d = arrayList4;
                    z2.e = arrayList5;
                    z2.f = arrayList6;
                    z2.h = 1;
                    if (CoroutineScopeKt.coroutineScope(y2, z2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef5;
                    objectRef2 = objectRef4;
                    objectRef3 = objectRef6;
                    arrayList = arrayList4;
                    arrayList2 = arrayList5;
                    arrayList3 = arrayList6;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ?? r2 = (List) z2.f;
                    ?? r3 = (List) z2.e;
                    ?? r4 = (List) z2.d;
                    objectRef3 = (Ref.ObjectRef) z2.c;
                    Ref.ObjectRef objectRef7 = (Ref.ObjectRef) z2.b;
                    objectRef2 = (Ref.ObjectRef) z2.a;
                    ResultKt.throwOnFailure(obj);
                    arrayList3 = r2;
                    arrayList2 = r3;
                    objectRef = objectRef7;
                    arrayList = r4;
                }
                str = (String) objectRef2.element;
                if (str == null) {
                    return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.B(str, (Boolean) objectRef.element, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.d) objectRef3.element, arrayList, arrayList2, arrayList3);
                }
                return null;
            }
        }
        z2 = new Z(continuation);
        Object obj2 = z2.g;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = z2.h;
        if (i2 != 0) {
        }
        str = (String) objectRef2.element;
        if (str == null) {
        }
    }

    public static /* synthetic */ void d() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object y(XmlPullParser xmlPullParser, Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c> continuation) {
        C2843c c2843c;
        int i2;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        String str;
        if (continuation instanceof C2843c) {
            c2843c = (C2843c) continuation;
            int i3 = c2843c.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c2843c.d = i3 - Integer.MIN_VALUE;
                Object obj = c2843c.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c2843c.d;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
                    C2842b c2842b = new C2842b(xmlPullParser, null, objectRef4, objectRef3);
                    c2843c.a = objectRef3;
                    c2843c.b = objectRef4;
                    c2843c.d = 1;
                    if (CoroutineScopeKt.coroutineScope(c2842b, c2843c) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef3;
                    objectRef2 = objectRef4;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef2 = (Ref.ObjectRef) c2843c.b;
                    objectRef = (Ref.ObjectRef) c2843c.a;
                    ResultKt.throwOnFailure(obj);
                }
                str = (String) objectRef.element;
                if (str == null) {
                    return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c(str, (Boolean) objectRef2.element);
                }
                return null;
            }
        }
        c2843c = new C2843c(continuation);
        Object obj2 = c2843c.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c2843c.d;
        if (i2 != 0) {
        }
        str = (String) objectRef.element;
        if (str == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object z(XmlPullParser xmlPullParser, Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.d> continuation) {
        C2845e c2845e;
        int i2;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        if (continuation instanceof C2845e) {
            c2845e = (C2845e) continuation;
            int i3 = c2845e.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c2845e.d = i3 - Integer.MIN_VALUE;
                Object obj = c2845e.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c2845e.d;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
                    C2844d c2844d = new C2844d(xmlPullParser, null, objectRef4, objectRef3);
                    c2845e.a = objectRef3;
                    c2845e.b = objectRef4;
                    c2845e.d = 1;
                    if (CoroutineScopeKt.coroutineScope(c2844d, c2845e) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef3;
                    objectRef2 = objectRef4;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef2 = (Ref.ObjectRef) c2845e.b;
                    objectRef = (Ref.ObjectRef) c2845e.a;
                    ResultKt.throwOnFailure(obj);
                }
                if (objectRef.element == 0 || objectRef2.element != 0) {
                    return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.d((String) objectRef.element, (String) objectRef2.element);
                }
                return null;
            }
        }
        c2845e = new C2845e(continuation);
        Object obj2 = c2845e.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c2845e.d;
        if (i2 != 0) {
        }
        if (objectRef.element == 0) {
        }
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.d((String) objectRef.element, (String) objectRef2.element);
    }

    public static final boolean h(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 1;
    }

    public static final boolean i(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 3;
    }

    public static final boolean j(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 0;
    }

    public static final boolean k(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    public static final boolean l(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 4;
    }

    public static final Integer m(XmlPullParser xmlPullParser) {
        String b2 = b(xmlPullParser, "sequence");
        if (b2 == null) {
            return null;
        }
        Integer intOrNull = StringsKt.toIntOrNull(b2);
        return Integer.valueOf(intOrNull != null ? intOrNull.intValue() : 999);
    }

    public static final r n(XmlPullParser xmlPullParser) {
        String b2 = b(xmlPullParser, "skipoffset");
        if (b2 != null) {
            return g(b2);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(XmlPullParser xmlPullParser, boolean z2, Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g> continuation) {
        C2852m c2852m;
        int i2;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        Ref.ObjectRef objectRef5;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h hVar;
        if (continuation instanceof C2852m) {
            c2852m = (C2852m) continuation;
            int i3 = c2852m.g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c2852m.g = i3 - Integer.MIN_VALUE;
                Object obj = c2852m.f;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c2852m.g;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.ObjectRef objectRef6 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef7 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef8 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef9 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef10 = new Ref.ObjectRef();
                    C2851l c2851l = new C2851l(xmlPullParser, null, objectRef6, objectRef7, objectRef8, objectRef9, objectRef10, z2);
                    c2852m.a = objectRef6;
                    c2852m.b = objectRef7;
                    c2852m.c = objectRef8;
                    c2852m.d = objectRef9;
                    c2852m.e = objectRef10;
                    c2852m.g = 1;
                    if (CoroutineScopeKt.coroutineScope(c2851l, c2852m) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef6;
                    objectRef2 = objectRef7;
                    objectRef3 = objectRef8;
                    objectRef4 = objectRef9;
                    objectRef5 = objectRef10;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef5 = (Ref.ObjectRef) c2852m.e;
                    objectRef4 = (Ref.ObjectRef) c2852m.d;
                    objectRef3 = (Ref.ObjectRef) c2852m.c;
                    objectRef2 = (Ref.ObjectRef) c2852m.b;
                    objectRef = (Ref.ObjectRef) c2852m.a;
                    ResultKt.throwOnFailure(obj);
                }
                hVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h) objectRef5.element;
                if (hVar == null) {
                    return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g((String) objectRef.element, (Integer) objectRef2.element, (String) objectRef3.element, (String) objectRef4.element, hVar);
                }
                return null;
            }
        }
        c2852m = new C2852m(continuation);
        Object obj2 = c2852m.f;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c2852m.g;
        if (i2 != 0) {
        }
        hVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h) objectRef5.element;
        if (hVar == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(XmlPullParser xmlPullParser, boolean z2, Continuation<? super List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g>> continuation) {
        C2854o c2854o;
        int i2;
        if (continuation instanceof C2854o) {
            c2854o = (C2854o) continuation;
            int i3 = c2854o.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c2854o.c = i3 - Integer.MIN_VALUE;
                Object obj = c2854o.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c2854o.c;
                if (i2 == 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list = (List) c2854o.a;
                    ResultKt.throwOnFailure(obj);
                    return list;
                }
                ResultKt.throwOnFailure(obj);
                ArrayList arrayList = new ArrayList();
                C2853n c2853n = new C2853n(xmlPullParser, null, z2, arrayList);
                c2854o.a = arrayList;
                c2854o.c = 1;
                return CoroutineScopeKt.coroutineScope(c2853n, c2854o) == coroutine_suspended ? coroutine_suspended : arrayList;
            }
        }
        c2854o = new C2854o(continuation);
        Object obj2 = c2854o.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c2854o.c;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(XmlPullParser xmlPullParser, boolean z2, Continuation<? super p> continuation) {
        C c2;
        int i2;
        Ref.ObjectRef objectRef;
        boolean z3;
        Ref.ObjectRef objectRef2;
        Ref.ObjectRef objectRef3;
        List list;
        ArrayList arrayList;
        Ref.ObjectRef objectRef4;
        ArrayList arrayList2;
        if (continuation instanceof C) {
            c2 = (C) continuation;
            int i3 = c2.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c2.j = i3 - Integer.MIN_VALUE;
                Object obj = c2.i;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c2.j;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.ObjectRef objectRef5 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef6 = new Ref.ObjectRef();
                    objectRef = new Ref.ObjectRef();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    Ref.ObjectRef objectRef7 = new Ref.ObjectRef();
                    ArrayList arrayList5 = new ArrayList();
                    z3 = z2;
                    B b2 = new B(xmlPullParser, null, objectRef5, objectRef6, objectRef, arrayList3, arrayList4, objectRef7, z3, arrayList5);
                    c2.b = objectRef5;
                    c2.c = objectRef6;
                    c2.d = objectRef;
                    c2.e = arrayList3;
                    c2.f = arrayList4;
                    c2.g = objectRef7;
                    c2.h = arrayList5;
                    c2.a = z3;
                    c2.j = 1;
                    if (CoroutineScopeKt.coroutineScope(b2, c2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef2 = objectRef5;
                    objectRef3 = objectRef6;
                    list = arrayList3;
                    arrayList = arrayList4;
                    objectRef4 = objectRef7;
                    arrayList2 = arrayList5;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z4 = c2.a;
                    ?? r3 = (List) c2.h;
                    objectRef4 = (Ref.ObjectRef) c2.g;
                    ?? r5 = (List) c2.f;
                    list = (List) c2.e;
                    Ref.ObjectRef objectRef8 = (Ref.ObjectRef) c2.d;
                    objectRef3 = (Ref.ObjectRef) c2.c;
                    objectRef2 = (Ref.ObjectRef) c2.b;
                    ResultKt.throwOnFailure(obj);
                    z3 = z4;
                    arrayList2 = r3;
                    objectRef = objectRef8;
                    arrayList = r5;
                }
                if (z3 || !list.isEmpty()) {
                    return new p((r) objectRef2.element, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c) objectRef3.element, (Long) objectRef.element, list, arrayList, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.A) objectRef4.element, arrayList2);
                }
                return null;
            }
        }
        c2 = new C(continuation);
        Object obj2 = c2.i;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c2.j;
        if (i2 != 0) {
        }
        if (z3) {
        }
        return new p((r) objectRef2.element, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c) objectRef3.element, (Long) objectRef.element, list, arrayList, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.A) objectRef4.element, arrayList2);
    }

    public static final Integer h(String str) {
        Object m11180constructorimpl;
        Integer num;
        int intValue;
        try {
            Result.Companion companion = Result.INSTANCE;
            Number parse = b.parse(str);
            if (parse == null || (intValue = (num = Integer.valueOf((int) (parse.floatValue() * 100))).intValue()) < 0 || intValue >= 101) {
                num = null;
            }
            m11180constructorimpl = Result.m11180constructorimpl(num);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
        }
        return (Integer) (Result.m11186isFailureimpl(m11180constructorimpl) ? null : m11180constructorimpl);
    }

    public static final v i(String str) {
        switch (str.hashCode()) {
            case -1638835128:
                if (str.equals("midpoint")) {
                    return v.d;
                }
                return null;
            case -1337830390:
                if (str.equals("thirdQuartile")) {
                    return v.e;
                }
                return null;
            case -1001078227:
                if (str.equals("progress")) {
                    return v.n;
                }
                return null;
            case -934426579:
                if (str.equals("resume")) {
                    return v.k;
                }
                return null;
            case -934318917:
                if (str.equals("rewind")) {
                    return v.j;
                }
                return null;
            case -840405966:
                if (str.equals("unmute")) {
                    return v.h;
                }
                return null;
            case -599445191:
                if (str.equals("complete")) {
                    return v.f;
                }
                return null;
            case -37683395:
                if (str.equals("closeLinear")) {
                    return v.l;
                }
                return null;
            case 3363353:
                if (str.equals("mute")) {
                    return v.g;
                }
                return null;
            case 3532159:
                if (str.equals("skip")) {
                    return v.m;
                }
                return null;
            case 106440182:
                if (str.equals("pause")) {
                    return v.i;
                }
                return null;
            case 109757538:
                if (str.equals(TtmlNode.START)) {
                    return v.b;
                }
                return null;
            case 560220243:
                if (str.equals("firstQuartile")) {
                    return v.c;
                }
                return null;
            case 1778167540:
                if (str.equals("creativeView")) {
                    return v.a;
                }
                return null;
            default:
                return null;
        }
    }

    public static final i b() {
        return c();
    }

    public static final j c() {
        return (j) a.getValue();
    }

    public static final j a() {
        return new j();
    }

    public static final String b(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null || StringsKt.isBlank(attributeValue)) {
            return null;
        }
        return attributeValue;
    }

    public static final Object a(XmlPullParser xmlPullParser, Function2<? super XmlPullParser, ? super Continuation<? super Unit>, ? extends Object> function2, Function3<? super XmlPullParser, ? super String, ? super Continuation<? super Unit>, ? extends Object> function3, Function2<? super XmlPullParser, ? super Continuation<? super Unit>, ? extends Object> function22, Continuation<? super Unit> continuation) {
        C2841a c2841a = new C2841a(xmlPullParser, function2, function3, function22, null);
        InlineMarker.mark(0);
        CoroutineScopeKt.coroutineScope(c2841a, continuation);
        InlineMarker.mark(1);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(XmlPullParser xmlPullParser, boolean z2, Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.A> continuation) {
        X x2;
        int i2;
        Ref.ObjectRef objectRef;
        List list;
        List list2;
        if (continuation instanceof X) {
            x2 = (X) continuation;
            int i3 = x2.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                x2.f = i3 - Integer.MIN_VALUE;
                Object obj = x2.e;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = x2.f;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    W w2 = new W(xmlPullParser, null, objectRef2, arrayList, arrayList2);
                    x2.b = objectRef2;
                    x2.c = arrayList;
                    x2.d = arrayList2;
                    x2.a = z2;
                    x2.f = 1;
                    if (CoroutineScopeKt.coroutineScope(w2, x2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef2;
                    list = arrayList;
                    list2 = arrayList2;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z2 = x2.a;
                    list2 = (List) x2.d;
                    list = (List) x2.c;
                    objectRef = (Ref.ObjectRef) x2.b;
                    ResultKt.throwOnFailure(obj);
                }
                if (z2 || objectRef.element != 0) {
                    return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.A((z) objectRef.element, list, list2);
                }
                return null;
            }
        }
        x2 = new X(continuation);
        Object obj2 = x2.e;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = x2.f;
        if (i2 != 0) {
        }
        if (z2) {
        }
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.A((z) objectRef.element, list, list2);
    }

    public static final r g(String str) {
        Long f2 = f(str);
        if (f2 != null) {
            return new r.b(f2.longValue());
        }
        Integer h2 = h(str);
        if (h2 != null) {
            return new r.a(h2.intValue());
        }
        return null;
    }

    public static final SimpleDateFormat e() {
        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.K.a("HH:mm:ss.SSS");
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i e(String str) {
        if (StringsKt.startsWith(str, "image/", true)) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i.a;
        }
        if (StringsKt.contains((CharSequence) str, (CharSequence) "javascript", true)) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i.b;
        }
        return null;
    }

    public static final Long f(String str) {
        Object m11180constructorimpl;
        Object m11180constructorimpl2;
        try {
            Result.Companion companion = Result.INSTANCE;
            Date parse = e().parse(str);
            m11180constructorimpl = Result.m11180constructorimpl(parse != null ? Long.valueOf(parse.getTime()) : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m11186isFailureimpl(m11180constructorimpl)) {
            m11180constructorimpl = null;
        }
        Long l2 = (Long) m11180constructorimpl;
        if (l2 != null) {
            return l2;
        }
        try {
            Result.Companion companion3 = Result.INSTANCE;
            Date parse2 = f().parse(str);
            m11180constructorimpl2 = Result.m11180constructorimpl(parse2 != null ? Long.valueOf(parse2.getTime()) : null);
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            m11180constructorimpl2 = Result.m11180constructorimpl(ResultKt.createFailure(th2));
        }
        return (Long) (Result.m11186isFailureimpl(m11180constructorimpl2) ? null : m11180constructorimpl2);
    }

    public static final SimpleDateFormat f() {
        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.K.a("HH:mm:ss");
    }
}
