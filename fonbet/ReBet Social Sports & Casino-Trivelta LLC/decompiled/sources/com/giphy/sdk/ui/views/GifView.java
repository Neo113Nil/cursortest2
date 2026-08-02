package com.giphy.sdk.ui.views;

import N8.j;
import O8.k;
import O8.p;
import O8.w;
import Ph.AbstractC1459k;
import Ph.C1452g0;
import Ph.C1483w0;
import Ph.P;
import X9.m;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import b7.InterfaceC2406a;
import com.facebook.drawee.drawable.r;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.request.b;
import com.facebook.react.devsupport.StackTraceHelper;
import com.giphy.sdk.core.models.Image;
import com.giphy.sdk.core.models.Images;
import com.giphy.sdk.core.models.Media;
import com.giphy.sdk.core.models.enums.RenditionType;
import com.giphy.sdk.ui.views.GifView;
import com.google.android.material.shape.i;
import com.twilio.voice.EventKeys;
import i3.C4527h;
import java.util.List;
import k7.C5205b;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import l0.AbstractC5338c;
import lb.C5444x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import timber.log.a;

@Metadata(d1 = {"\u0000±\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001e*\u0001\u001a\b\u0016\u0018\u0000 :2\u00020\u0001:\u0004\u009b\u0001\u009c\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\fJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\fJ\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\nH\u0014¢\u0006\u0004\b \u0010\fJ/\u0010'\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\n2\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u0006H\u0014¢\u0006\u0004\b/\u00100J-\u00106\u001a\u00020\n2\b\u00101\u001a\u0004\u0018\u00010)2\b\u00103\u001a\u0004\u0018\u0001022\b\u00105\u001a\u0004\u0018\u000104H\u0016¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\n¢\u0006\u0004\b8\u0010\fJ\r\u00109\u001a\u00020\n¢\u0006\u0004\b9\u0010\fJ\r\u0010:\u001a\u00020\n¢\u0006\u0004\b:\u0010\fJ\r\u0010;\u001a\u00020\n¢\u0006\u0004\b;\u0010\fJ\r\u0010<\u001a\u00020\n¢\u0006\u0004\b<\u0010\fR\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010C\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010E\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010?R\u0014\u0010I\u001a\u00020F8\u0002X\u0082D¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010N\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010Q\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR \u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020T0S0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR$\u0010_\u001a\u0004\u0018\u00010X8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R*\u0010f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010`8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR$\u0010l\u001a\u0004\u0018\u00010F8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u0016\u0010m\u001a\u00020F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010HR\"\u0010r\u001a\u00020=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010?\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\"\u0010s\u001a\u00020=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010?\u001a\u0004\bs\u0010o\"\u0004\bt\u0010qR\"\u0010{\u001a\u00020u8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR\"\u0010~\u001a\u00020=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010?\u001a\u0004\b|\u0010o\"\u0004\b}\u0010qR*\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u007f8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b9\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R'\u0010\u008a\u0001\u001a\u00020F8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0004\b8\u0010H\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R4\u0010\"\u001a\u0004\u0018\u00010!2\t\u0010\u008b\u0001\u001a\u0004\u0018\u00010!8\u0006@BX\u0086\u000e¢\u0006\u0017\n\u0005\b<\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R)\u0010\u0095\u0001\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b;\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0005\b\u0094\u0001\u0010,R)\u0010\u009a\u0001\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0004\b\u0012\u0010K\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001¨\u0006\u009d\u0001"}, d2 = {"Lcom/giphy/sdk/ui/views/GifView;", "Lcom/facebook/drawee/view/SimpleDraweeView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "p", "()V", "B", "A", "n", "Landroid/net/Uri;", "uri", "w", "(Landroid/net/Uri;)V", "o", "", "LQ8/f;", "getLoadingSteps", "()Ljava/util/List;", "l", "com/giphy/sdk/ui/views/GifView$e", "getControllerListener", "()Lcom/giphy/sdk/ui/views/GifView$e;", "Lcom/facebook/drawee/drawable/i;", "getProgressDrawable", "()Lcom/facebook/drawee/drawable/i;", "r", "Lcom/giphy/sdk/core/models/Media;", "media", "Lcom/giphy/sdk/core/models/enums/RenditionType;", "renditionType", "Landroid/graphics/drawable/Drawable;", "placeholderDrawable", "y", "(Lcom/giphy/sdk/core/models/Media;Lcom/giphy/sdk/core/models/enums/RenditionType;Landroid/graphics/drawable/Drawable;)V", "", EventKeys.URL, m.f13664a, "(Ljava/lang/String;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", StackTraceHelper.ID_KEY, "LH7/m;", "imageInfo", "Landroid/graphics/drawable/Animatable;", "anim", "q", "(Ljava/lang/String;LH7/m;Landroid/graphics/drawable/Animatable;)V", "t", "s", C5444x.f55808b, "v", "u", "", "c", "Z", "keepGifRatio", W9.d.f13160a, "Lcom/giphy/sdk/core/models/enums/RenditionType;", "targetRendition", com.bumptech.glide.gifdecoder.e.f29601m, "autoPlay", "", "f", "F", "defaultAspectRatio", "g", "Landroid/graphics/drawable/Drawable;", C4527h.f48087o, "I", "stepIndex", i.f35755A, "LQ8/f;", "step", "LM6/i;", "LH6/a;", "LH7/e;", "j", "LM6/i;", "retainingSupplier", "Lcom/giphy/sdk/ui/views/GifView$b;", "k", "Lcom/giphy/sdk/ui/views/GifView$b;", "getGifCallback", "()Lcom/giphy/sdk/ui/views/GifView$b;", "setGifCallback", "(Lcom/giphy/sdk/ui/views/GifView$b;)V", "gifCallback", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "getOnPingbackGifLoadSuccess", "()Lkotlin/jvm/functions/Function0;", "setOnPingbackGifLoadSuccess", "(Lkotlin/jvm/functions/Function0;)V", "onPingbackGifLoadSuccess", "Ljava/lang/Float;", "getFixedAspectRatio", "()Ljava/lang/Float;", "setFixedAspectRatio", "(Ljava/lang/Float;)V", "fixedAspectRatio", "renditionAspectRatio", "getShowProgress", "()Z", "setShowProgress", "(Z)V", "showProgress", "isBackgroundVisible", "setBackgroundVisible", "LQ8/e;", "LQ8/e;", "getImageFormat", "()LQ8/e;", "setImageFormat", "(LQ8/e;)V", "imageFormat", "getLoaded", "setLoaded", "loaded", "Lcom/facebook/drawee/drawable/r;", "Lcom/facebook/drawee/drawable/r;", "getScaleType", "()Lcom/facebook/drawee/drawable/r;", "setScaleType", "(Lcom/facebook/drawee/drawable/r;)V", "scaleType", "getCornerRadius", "()F", "setCornerRadius", "(F)V", "cornerRadius", EventKeys.VALUE_KEY, "Lcom/giphy/sdk/core/models/Media;", "getMedia", "()Lcom/giphy/sdk/core/models/Media;", "setMedia", "(Lcom/giphy/sdk/core/models/Media;)V", "Ljava/lang/String;", "getMediaId", "()Ljava/lang/String;", "setMediaId", "mediaId", "getBgDrawable", "()Landroid/graphics/drawable/Drawable;", "setBgDrawable", "(Landroid/graphics/drawable/Drawable;)V", "bgDrawable", "a", com.google.crypto.tink.integration.android.b.f37029b, "giphy-ui-2.3.17_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public class GifView extends SimpleDraweeView {

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: y, reason: collision with root package name */
    public static final float f31827y = U8.f.a(4);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final boolean keepGifRatio;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public RenditionType targetRendition;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean autoPlay;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final float defaultAspectRatio;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public Drawable placeholderDrawable;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public int stepIndex;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public Q8.f step;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final M6.i retainingSupplier;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public b gifCallback;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public Function0 onPingbackGifLoadSuccess;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public Float fixedAspectRatio;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public float renditionAspectRatio;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public boolean showProgress;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public boolean isBackgroundVisible;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public Q8.e imageFormat;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public boolean loaded;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public r scaleType;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public float cornerRadius;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public Media media;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public String mediaId;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public Drawable bgDrawable;

    /* renamed from: com.giphy.sdk.ui.views.GifView$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float a() {
            return GifView.f31827y;
        }

        public Companion() {
        }
    }

    public interface b {

        public static final class a {
            public static /* synthetic */ void a(b bVar, H7.m mVar, Animatable animatable, long j10, int i10, int i11, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onImageSet");
                }
                if ((i11 & 4) != 0) {
                    j10 = -1;
                }
                long j11 = j10;
                if ((i11 & 8) != 0) {
                    i10 = 0;
                }
                bVar.a(mVar, animatable, j11, i10);
            }
        }

        void a(H7.m mVar, Animatable animatable, long j10, int i10);

        void onFailure(Throwable th2);
    }

    public /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Q8.c.values().length];
            try {
                iArr[Q8.c.NEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Q8.c.SKIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Q8.c.TERMINATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class d extends ViewOutlineProvider {
        public d() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(outline, "outline");
            outline.setRoundRect(0, 0, GifView.this.getWidth(), GifView.this.getHeight(), GifView.this.getCornerRadius());
        }
    }

    public static final class e extends W6.c {
        public e() {
        }

        @Override // W6.c, W6.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onFinalImageSet(String str, H7.m mVar, Animatable animatable) {
            GifView.this.q(str, mVar, animatable);
        }

        @Override // W6.c, W6.d
        public void onFailure(String str, Throwable th2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to load media: ");
            if (str == null) {
                str = "";
            }
            sb2.append(str);
            a.b(sb2.toString(), new Object[0]);
            if (th2 != null) {
                th2.printStackTrace();
            }
            b gifCallback = GifView.this.getGifCallback();
            if (gifCallback != null) {
                gifCallback.onFailure(th2);
            }
        }
    }

    public static final class f extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f31851n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ com.facebook.imagepipeline.request.b f31853p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.facebook.imagepipeline.request.b bVar, Continuation continuation) {
            super(2, continuation);
            this.f31853p = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return GifView.this.new f(this.f31853p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((f) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f31851n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            GifView.this.retainingSupplier.b(com.facebook.drawee.backends.pipeline.d.a().s(this.f31853p, null, b.c.FULL_FETCH));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GifView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final e getControllerListener() {
        return new e();
    }

    private final List<Q8.f> getLoadingSteps() {
        RenditionType renditionType = this.targetRendition;
        if (renditionType == null) {
            Media media = this.media;
            return media != null ? Intrinsics.areEqual(j.a(media), Boolean.TRUE) : false ? Q8.d.f9535a.a() : Q8.d.f9535a.b();
        }
        Q8.d dVar = Q8.d.f9535a;
        Intrinsics.checkNotNull(renditionType);
        return dVar.c(renditionType);
    }

    private final com.facebook.drawee.drawable.i getProgressDrawable() {
        com.facebook.drawee.drawable.i iVar = new com.facebook.drawee.drawable.i();
        iVar.d(AbstractC5338c.getColor(getContext(), p.f8401a));
        iVar.setBounds(0, getHeight() - 6, getWidth(), getHeight());
        iVar.e(0);
        return iVar;
    }

    public static final void i(GifView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.p();
    }

    private final void setMedia(Media media) {
        this.loaded = false;
        String altText = media != null ? media.getAltText() : null;
        if (altText == null || altText.length() == 0) {
            String title = media != null ? media.getTitle() : null;
            if (title != null && title.length() != 0) {
                setContentDescription(media != null ? media.getTitle() : null);
            }
        } else {
            setContentDescription(media != null ? media.getAltText() : null);
        }
        this.media = media;
        r();
        requestLayout();
        post(new Runnable() { // from class: V8.M
            @Override // java.lang.Runnable
            public final void run() {
                GifView.i(GifView.this);
            }
        });
    }

    public static /* synthetic */ void z(GifView gifView, Media media, RenditionType renditionType, Drawable drawable, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setMedia");
        }
        if ((i10 & 2) != 0) {
            renditionType = null;
        }
        if ((i10 & 4) != 0) {
            drawable = null;
        }
        gifView.y(media, renditionType, drawable);
    }

    public final void A() {
        if (this.stepIndex < getLoadingSteps().size()) {
            n();
        }
    }

    public final void B() {
        if (this.stepIndex >= getLoadingSteps().size()) {
            return;
        }
        int i10 = c.$EnumSwitchMapping$0[getLoadingSteps().get(this.stepIndex).a().ordinal()];
        if (i10 == 1) {
            this.stepIndex++;
            A();
        } else {
            if (i10 != 2) {
                return;
            }
            this.stepIndex += 2;
            A();
        }
    }

    @Nullable
    public final Drawable getBgDrawable() {
        return this.bgDrawable;
    }

    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    @Nullable
    public final Float getFixedAspectRatio() {
        return this.fixedAspectRatio;
    }

    @Nullable
    public final b getGifCallback() {
        return this.gifCallback;
    }

    @NotNull
    public final Q8.e getImageFormat() {
        return this.imageFormat;
    }

    public final boolean getLoaded() {
        return this.loaded;
    }

    @Nullable
    public final Media getMedia() {
        return this.media;
    }

    @Nullable
    public final String getMediaId() {
        return this.mediaId;
    }

    @Nullable
    public final Function0<Unit> getOnPingbackGifLoadSuccess() {
        return this.onPingbackGifLoadSuccess;
    }

    @Override // android.widget.ImageView
    @Nullable
    public final r getScaleType() {
        return this.scaleType;
    }

    public final boolean getShowProgress() {
        return this.showProgress;
    }

    public final void l() {
        if (this.cornerRadius > 0.0f) {
            setOutlineProvider(new d());
            setClipToOutline(true);
        }
    }

    public final void m(String url) {
        try {
            setMedia(null);
            Uri parse = Uri.parse(url);
            Intrinsics.checkNotNullExpressionValue(parse, "parse(url)");
            o(parse);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void n() {
        List<Q8.f> loadingSteps = getLoadingSteps();
        Q8.f fVar = loadingSteps.get(this.stepIndex);
        Media media = this.media;
        Image a10 = media != null ? U8.e.a(media, fVar.b()) : null;
        Uri c10 = a10 != null ? U8.e.c(a10, this.imageFormat) : null;
        if (c10 == null) {
            B();
        } else if (loadingSteps.size() <= 1) {
            o(c10);
        } else {
            setController(((com.facebook.drawee.backends.pipeline.f) ((com.facebook.drawee.backends.pipeline.f) ((com.facebook.drawee.backends.pipeline.f) com.facebook.drawee.backends.pipeline.d.i().a(getController())).C(getControllerListener())).D(this.retainingSupplier)).build());
            w(c10);
        }
    }

    public final void o(Uri uri) {
        setController(((com.facebook.drawee.backends.pipeline.f) ((com.facebook.drawee.backends.pipeline.f) ((com.facebook.drawee.backends.pipeline.f) com.facebook.drawee.backends.pipeline.d.i().a(getController())).C(getControllerListener())).E(k.f8390a.f().a(uri, J8.d.f5962a.c(), b.EnumC0484b.DEFAULT))).build());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0109  */
    @Override // c7.AbstractC2893c, android.widget.ImageView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i10;
        int i11;
        float f10;
        int mode;
        int mode2;
        float f11;
        float f12;
        Image original;
        Images images;
        Images images2;
        a.a("onMeasure " + getSuggestedMinimumHeight() + ' ' + View.MeasureSpec.toString(widthMeasureSpec) + ' ' + View.MeasureSpec.toString(heightMeasureSpec) + ' ' + this.media, new Object[0]);
        if (this.media != null) {
            Q8.f fVar = (Q8.f) CollectionsKt.last((List) getLoadingSteps());
            Media media = this.media;
            if (media == null || (original = U8.e.a(media, fVar.b())) == null) {
                Media media2 = this.media;
                original = (media2 == null || (images2 = media2.getImages()) == null) ? null : images2.getOriginal();
                if (original == null) {
                    Media media3 = this.media;
                    original = (media3 == null || (images = media3.getImages()) == null) ? null : images.getFixedWidth();
                }
            }
            if (original != null) {
                this.renditionAspectRatio = original.getWidth() / original.getHeight();
                i10 = U8.f.a(original.getWidth());
                i11 = U8.f.a(original.getHeight());
                f10 = i10 / i11;
                this.renditionAspectRatio = f10;
                if (f10 != 0.0f || Float.isNaN(f10)) {
                    this.renditionAspectRatio = this.defaultAspectRatio;
                }
                a.a("rendition size [" + i10 + " x " + i11 + "] measured=[" + getMeasuredWidth() + " x " + getMeasuredHeight() + "] " + this.renditionAspectRatio, new Object[0]);
                mode = View.MeasureSpec.getMode(widthMeasureSpec);
                int size = View.MeasureSpec.getSize(widthMeasureSpec);
                mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
                int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
                if (mode != Integer.MIN_VALUE) {
                    size = RangesKt.coerceAtMost(i10, size);
                } else if (mode != 1073741824) {
                    size = i10;
                }
                if (mode2 != Integer.MIN_VALUE) {
                    i11 = RangesKt.coerceAtMost(i11, size2);
                } else if (mode2 == 1073741824) {
                    i11 = size2;
                }
                float f13 = size;
                f11 = f13 / i11;
                a.a("[1] aspectRatio=" + this.renditionAspectRatio + " actualRatio=" + f11, new Object[0]);
                f12 = this.renditionAspectRatio;
                if (f11 != f12) {
                    if (mode2 == Integer.MIN_VALUE) {
                        i11 = RangesKt.coerceAtMost((int) (f13 / f12), i11);
                    } else if (mode2 == 0) {
                        Float f14 = this.fixedAspectRatio;
                        if (f14 != null) {
                            f12 = f14.floatValue();
                        }
                        i11 = (int) (f13 / f12);
                    }
                    if (mode == Integer.MIN_VALUE) {
                        size = RangesKt.coerceAtMost((int) (i11 * this.renditionAspectRatio), i10);
                    } else if (mode == 0) {
                        float f15 = i11;
                        Float f16 = this.fixedAspectRatio;
                        size = (int) (f15 * (f16 != null ? f16.floatValue() : this.renditionAspectRatio));
                    }
                }
                a.a("[2] aspectRatio=" + this.renditionAspectRatio + " actualRatio=" + (size / i11), new Object[0]);
                setMeasuredDimension(size, i11);
                l();
            }
        }
        i10 = 300;
        i11 = 200;
        f10 = i10 / i11;
        this.renditionAspectRatio = f10;
        if (f10 != 0.0f) {
        }
        this.renditionAspectRatio = this.defaultAspectRatio;
        a.a("rendition size [" + i10 + " x " + i11 + "] measured=[" + getMeasuredWidth() + " x " + getMeasuredHeight() + "] " + this.renditionAspectRatio, new Object[0]);
        mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int size3 = View.MeasureSpec.getSize(widthMeasureSpec);
        mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int size22 = View.MeasureSpec.getSize(heightMeasureSpec);
        if (mode != Integer.MIN_VALUE) {
        }
        if (mode2 != Integer.MIN_VALUE) {
        }
        float f132 = size3;
        f11 = f132 / i11;
        a.a("[1] aspectRatio=" + this.renditionAspectRatio + " actualRatio=" + f11, new Object[0]);
        f12 = this.renditionAspectRatio;
        if (f11 != f12) {
        }
        a.a("[2] aspectRatio=" + this.renditionAspectRatio + " actualRatio=" + (size3 / i11), new Object[0]);
        setMeasuredDimension(size3, i11);
        l();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p() {
        Drawable drawable;
        this.loaded = false;
        this.stepIndex = 0;
        Drawable drawable2 = this.placeholderDrawable;
        if (drawable2 != null) {
            ((Z6.a) getHierarchy()).y(drawable2);
        }
        if (this.showProgress) {
            ((Z6.a) getHierarchy()).B(getProgressDrawable());
        }
        Media media = this.media;
        if (media != null && media.getIsSticker()) {
            Media media2 = this.media;
            if (!(media2 != null ? Intrinsics.areEqual(j.a(media2), Boolean.TRUE) : false) && this.isBackgroundVisible) {
                drawable = this.bgDrawable;
                setBackground(drawable);
                if (this.media != null) {
                    n();
                }
                if (this.scaleType == null) {
                    ((Z6.a) getHierarchy()).t(this.scaleType);
                    return;
                }
                return;
            }
        }
        drawable = null;
        setBackground(drawable);
        if (this.media != null) {
        }
        if (this.scaleType == null) {
        }
    }

    public void q(String id2, H7.m imageInfo, Animatable anim) {
        int i10;
        long j10;
        if (!this.loaded) {
            this.loaded = true;
            b bVar = this.gifCallback;
            if (bVar != null) {
                b.a.a(bVar, imageInfo, anim, 0L, 0, 12, null);
            }
            Function0 function0 = this.onPingbackGifLoadSuccess;
            if (function0 != null) {
                function0.invoke();
            }
        }
        C5205b c5205b = anim instanceof C5205b ? (C5205b) anim : null;
        if (c5205b != null) {
            i10 = c5205b.d();
            j10 = c5205b.e();
        } else {
            i10 = 0;
            j10 = -1;
        }
        int i11 = i10;
        if (this.autoPlay && anim != null) {
            anim.start();
        }
        b bVar2 = this.gifCallback;
        if (bVar2 != null) {
            bVar2.a(imageInfo, anim, j10, i11);
        }
        B();
    }

    public void r() {
    }

    public final void s() {
        Animatable h10;
        InterfaceC2406a controller;
        Animatable h11;
        this.autoPlay = false;
        InterfaceC2406a controller2 = getController();
        if (controller2 == null || (h10 = controller2.h()) == null || !h10.isRunning() || (controller = getController()) == null || (h11 = controller.h()) == null) {
            return;
        }
        h11.stop();
    }

    public final void setBackgroundVisible(boolean z10) {
        this.isBackgroundVisible = z10;
    }

    public final void setBgDrawable(@Nullable Drawable drawable) {
        this.bgDrawable = drawable;
    }

    public final void setCornerRadius(float f10) {
        this.cornerRadius = f10;
    }

    public final void setFixedAspectRatio(@Nullable Float f10) {
        this.fixedAspectRatio = f10;
    }

    public final void setGifCallback(@Nullable b bVar) {
        this.gifCallback = bVar;
    }

    public final void setImageFormat(@NotNull Q8.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.imageFormat = eVar;
    }

    public final void setLoaded(boolean z10) {
        this.loaded = z10;
    }

    public final void setMediaId(@Nullable String str) {
        this.mediaId = str;
    }

    public final void setOnPingbackGifLoadSuccess(@Nullable Function0<Unit> function0) {
        this.onPingbackGifLoadSuccess = function0;
    }

    public final void setScaleType(@Nullable r rVar) {
        this.scaleType = rVar;
    }

    public final void setShowProgress(boolean z10) {
        this.showProgress = z10;
    }

    public final void t() {
        Animatable h10;
        InterfaceC2406a controller;
        Animatable h11;
        this.autoPlay = true;
        InterfaceC2406a controller2 = getController();
        if (controller2 == null || (h10 = controller2.h()) == null || h10.isRunning() || (controller = getController()) == null || (h11 = controller.h()) == null) {
            return;
        }
        h11.start();
    }

    public final void u() {
        setMedia(null);
        this.placeholderDrawable = null;
        ((Z6.a) getHierarchy()).y(null);
    }

    public final void v() {
        ((Z6.a) getHierarchy()).x(null);
        invalidate();
    }

    public final void w(Uri uri) {
        Q8.f fVar = this.step;
        AbstractC1459k.b(C1483w0.f9135a, C1452g0.c(), null, new f(k.f8390a.f().a(uri, J8.d.f5962a.c(), (fVar != null ? fVar.a() : null) == Q8.c.TERMINATE ? b.EnumC0484b.DEFAULT : b.EnumC0484b.SMALL), null), 2, null);
    }

    public final void x() {
        ((Z6.a) getHierarchy()).x(new com.facebook.drawee.drawable.p(AbstractC5338c.getDrawable(getContext(), O8.r.f8422j), r.f30527h));
        invalidate();
    }

    public final void y(Media media, RenditionType renditionType, Drawable placeholderDrawable) {
        setMedia(media);
        this.targetRendition = renditionType;
        this.placeholderDrawable = placeholderDrawable;
    }

    public /* synthetic */ GifView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GifView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        k kVar = k.f8390a;
        this.autoPlay = kVar.e();
        this.defaultAspectRatio = 1.7777778f;
        this.retainingSupplier = new M6.i();
        this.renditionAspectRatio = 1.7777778f;
        this.isBackgroundVisible = true;
        this.imageFormat = Q8.e.WEBP;
        this.cornerRadius = U8.f.a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w.GifView, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr….styleable.GifView, 0, 0)");
        this.keepGifRatio = obtainStyledAttributes.getBoolean(w.f8570c, true);
        this.cornerRadius = obtainStyledAttributes.getDimension(w.f8569b, 0.0f);
        obtainStyledAttributes.recycle();
        this.bgDrawable = AbstractC5338c.getDrawable(context, Intrinsics.areEqual(kVar.h(), S8.d.f10680a) ? O8.r.f8436x : O8.r.f8435w);
    }
}
