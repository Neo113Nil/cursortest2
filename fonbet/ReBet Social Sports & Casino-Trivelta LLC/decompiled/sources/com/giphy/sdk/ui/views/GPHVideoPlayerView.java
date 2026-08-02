package com.giphy.sdk.ui.views;

import O8.t;
import O8.w;
import P8.k;
import U8.c;
import U8.f;
import U8.g;
import W9.d;
import X9.m;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import com.bumptech.glide.gifdecoder.e;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.uimanager.ViewProps;
import com.giphy.sdk.core.models.Image;
import com.giphy.sdk.core.models.Media;
import com.giphy.sdk.ui.views.GPHVideoPlayerView;
import com.google.android.material.shape.i;
import com.twilio.voice.EventKeys;
import i3.C4527h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0016\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\fJ\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\fJ\r\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\fJ\u000f\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\fJ\u001b\u0010\u001b\u001a\u00020\n2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\"\u0010*\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0016\u0010-\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\"\u00103\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010,\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010?\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010,\u001a\u0004\b=\u00100\"\u0004\b>\u00102R\"\u0010C\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010,\u001a\u0004\bA\u00100\"\u0004\bB\u00102R\"\u0010G\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010,\u001a\u0004\bE\u00100\"\u0004\bF\u00102R.\u0010O\u001a\u0004\u0018\u00010H2\b\u0010I\u001a\u0004\u0018\u00010H8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0016\u0010R\u001a\u00020P8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010QR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR$\u0010Y\u001a\u0012\u0012\u0004\u0012\u00020V\u0012\u0004\u0012\u00020\n0Uj\u0002`W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010XR\u0014\u0010\\\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010[R\u0014\u0010_\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010^R\"\u0010g\u001a\u00020`8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010k\u001a\u00020`8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bh\u0010b\u001a\u0004\bi\u0010d\"\u0004\bj\u0010fR(\u0010p\u001a\u0004\u0018\u00010P2\b\u0010I\u001a\u0004\u0018\u00010P8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bl\u0010m\"\u0004\bn\u0010o¨\u0006q"}, d2 = {"Lcom/giphy/sdk/ui/views/GPHVideoPlayerView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "j", "()V", "Lcom/giphy/sdk/core/models/Media;", "media", "o", "(Lcom/giphy/sdk/core/models/Media;)V", "requestLayout", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "n", m.f13664a, "k", "Lkotlin/Function0;", ViewProps.ON_CLICK, "setPreviewMode", "(Lkotlin/jvm/functions/Function0;)V", "", "a", "Z", "isFirstLoading", "", com.google.crypto.tink.integration.android.b.f37029b, "J", "prepareTime", "c", "getShowControls", "()Z", "setShowControls", "(Z)V", "showControls", d.f13160a, "I", "loopCount", e.f29601m, "getMaxLoopsBeforeMute", "()I", "setMaxLoopsBeforeMute", "(I)V", "maxLoopsBeforeMute", "", "f", "F", "getCornerRadius", "()F", "setCornerRadius", "(F)V", "cornerRadius", "g", "getDesiredWidth", "setDesiredWidth", "desiredWidth", C4527h.f48087o, "getDesiredHeight", "setDesiredHeight", "desiredHeight", i.f35755A, "getMaxHeight", "setMaxHeight", ViewProps.MAX_HEIGHT, "", EventKeys.VALUE_KEY, "Ljava/lang/String;", "getVideoTitle", "()Ljava/lang/String;", "setVideoTitle", "(Ljava/lang/String;)V", "videoTitle", "LU8/b;", "LU8/b;", "player", "l", "Lcom/giphy/sdk/core/models/Media;", "Lkotlin/Function1;", "LU8/c;", "Lcom/giphy/sdk/ui/utils/GPHPlayerStateListener;", "Lkotlin/jvm/functions/Function1;", "listener", "LP8/k;", "LP8/k;", "viewBinding", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "measureAndLayout", "Landroid/widget/FrameLayout$LayoutParams;", "p", "Landroid/widget/FrameLayout$LayoutParams;", "getParams", "()Landroid/widget/FrameLayout$LayoutParams;", "setParams", "(Landroid/widget/FrameLayout$LayoutParams;)V", "params", "q", "getTitleParams", "setTitleParams", "titleParams", "getVideoPlayer", "()LU8/b;", "setVideoPlayer", "(LU8/b;)V", "videoPlayer", "giphy-ui-2.3.17_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public class GPHVideoPlayerView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public boolean isFirstLoading;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public long prepareTime;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean showControls;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int loopCount;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int maxLoopsBeforeMute;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public float cornerRadius;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int desiredWidth;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public int desiredHeight;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public int maxHeight;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public String videoTitle;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public U8.b player;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public Media media;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final Function1 listener;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final k viewBinding;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final Runnable measureAndLayout;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public FrameLayout.LayoutParams params;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public FrameLayout.LayoutParams titleParams;

    public static final class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(outline, "outline");
            outline.setRoundRect(0, 0, GPHVideoPlayerView.this.getWidth(), GPHVideoPlayerView.this.getHeight(), GPHVideoPlayerView.this.getCornerRadius());
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        public final void a(c it) {
            Intrinsics.checkNotNullParameter(it, "it");
            U8.b bVar = GPHVideoPlayerView.this.player;
            U8.b bVar2 = null;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("player");
                bVar = null;
            }
            String id2 = bVar.e().getId();
            Media media = GPHVideoPlayerView.this.media;
            if (!Intrinsics.areEqual(id2, media != null ? media.getId() : null)) {
                if (it instanceof c.e) {
                    GPHVideoPlayerView.this.viewBinding.f8922e.setVisibility(0);
                    GPHVideoPlayerView.this.viewBinding.f8926i.setVisibility(8);
                    GPHVideoPlayerView.this.viewBinding.f8919b.setVisibility(8);
                    return;
                }
                return;
            }
            if (Intrinsics.areEqual(it, c.g.f12142a)) {
                GPHVideoPlayerView.this.viewBinding.f8929l.setAlpha(1.0f);
                GPHVideoPlayerView.this.viewBinding.f8919b.setVisibility(8);
                if (GPHVideoPlayerView.this.isFirstLoading) {
                    timber.log.a.a("initialLoadTime=" + (SystemClock.elapsedRealtime() - GPHVideoPlayerView.this.prepareTime), new Object[0]);
                    GPHVideoPlayerView.this.isFirstLoading = false;
                    return;
                }
                return;
            }
            if (Intrinsics.areEqual(it, c.f.f12141a)) {
                GPHVideoPlayerView.this.viewBinding.f8929l.setAlpha(1.0f);
                GPHVideoPlayerView.this.viewBinding.f8926i.setVisibility(0);
                GPHVideoPlayerView.this.viewBinding.f8922e.setVisibility(8);
                return;
            }
            if (Intrinsics.areEqual(it, c.a.f12136a)) {
                GPHVideoPlayerView.this.viewBinding.f8919b.setVisibility(0);
                return;
            }
            if (!Intrinsics.areEqual(it, c.h.f12143a)) {
                if (it instanceof c.b) {
                    GPHVideoPlayerView.this.viewBinding.f8924g.setVisibility(((c.b) it).a() ? 0 : 4);
                    return;
                }
                return;
            }
            if (GPHVideoPlayerView.this.loopCount + 1 > GPHVideoPlayerView.this.getMaxLoopsBeforeMute() - 1) {
                U8.b bVar3 = GPHVideoPlayerView.this.player;
                if (bVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("player");
                } else {
                    bVar2 = bVar3;
                }
                bVar2.u(0.0f);
                return;
            }
            U8.b bVar4 = GPHVideoPlayerView.this.player;
            if (bVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("player");
            } else {
                bVar2 = bVar4;
            }
            if (bVar2.j() > 0.0f) {
                GPHVideoPlayerView.this.loopCount++;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((c) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GPHVideoPlayerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void l(GPHVideoPlayerView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.measure(View.MeasureSpec.makeMeasureSpec(this$0.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(this$0.getHeight(), 1073741824));
        this$0.layout(this$0.getLeft(), this$0.getTop(), this$0.getRight(), this$0.getBottom());
    }

    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    public final int getDesiredHeight() {
        return this.desiredHeight;
    }

    public final int getDesiredWidth() {
        return this.desiredWidth;
    }

    public final int getMaxHeight() {
        return this.maxHeight;
    }

    public final int getMaxLoopsBeforeMute() {
        return this.maxLoopsBeforeMute;
    }

    @NotNull
    public final FrameLayout.LayoutParams getParams() {
        return this.params;
    }

    public final boolean getShowControls() {
        return this.showControls;
    }

    @NotNull
    public final FrameLayout.LayoutParams getTitleParams() {
        return this.titleParams;
    }

    @Nullable
    public final U8.b getVideoPlayer() {
        U8.b bVar = this.player;
        if (bVar == null) {
            return null;
        }
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("player");
        return null;
    }

    @Nullable
    public final String getVideoTitle() {
        return this.videoTitle;
    }

    public final void j() {
        if (this.cornerRadius > 0.0f) {
            setOutlineProvider(new a());
            setClipToOutline(true);
        }
    }

    public void k() {
    }

    public final void m() {
        this.viewBinding.f8929l.s();
    }

    public final void n() {
        this.viewBinding.f8929l.setVisibility(0);
        this.viewBinding.f8929l.t();
    }

    public final void o(Media media) {
        Intrinsics.checkNotNullParameter(media, "media");
        this.media = media;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("preloadFirstFrame ");
        Image originalStill = media.getImages().getOriginalStill();
        sb2.append(originalStill != null ? originalStill.getGifUrl() : null);
        timber.log.a.a(sb2.toString(), new Object[0]);
        SimpleDraweeView simpleDraweeView = this.viewBinding.f8922e;
        Image originalStill2 = media.getImages().getOriginalStill();
        simpleDraweeView.setImageURI(originalStill2 != null ? originalStill2.getGifUrl() : null);
        this.viewBinding.f8922e.setVisibility(0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Media media = this.media;
        if (media == null) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        float d10 = media != null ? g.d(media) : 1.7777778f;
        int size = View.MeasureSpec.getSize(heightMeasureSpec);
        int i10 = (int) (size * d10);
        if (size == 0) {
            if (i10 == 0) {
                i10 = this.desiredWidth;
            }
            size = (int) (i10 / d10);
        } else if (i10 == 0) {
            if (size == 0) {
                size = this.desiredHeight;
            }
            i10 = (int) (size * d10);
        }
        int size2 = View.MeasureSpec.getSize(widthMeasureSpec);
        if (i10 > size2 && size2 > 0) {
            i10 = View.MeasureSpec.getSize(widthMeasureSpec);
            size = (int) (i10 / d10);
        }
        int i11 = this.maxHeight;
        if (size > i11) {
            i10 = (int) (i11 * d10);
            size = i11;
        }
        if (i10 < 600) {
            this.viewBinding.f8924g.setTextSize(6.0f);
        } else {
            this.viewBinding.f8924g.setTextSize(13.0f);
        }
        if (this.videoTitle == null || size < i10) {
            FrameLayout.LayoutParams layoutParams = this.params;
            layoutParams.height = size;
            layoutParams.width = i10;
        } else {
            this.params.height = size - f.a(55);
            this.params.width = (int) (r5.height * d10);
        }
        this.viewBinding.f8926i.setLayoutParams(this.params);
        this.viewBinding.f8922e.setLayoutParams(this.params);
        this.viewBinding.f8919b.setLayoutParams(this.params);
        this.viewBinding.f8929l.setLayoutParams(this.params);
        this.viewBinding.f8921d.setLayoutParams(this.params);
        this.viewBinding.f8925h.setLayoutParams(this.params);
        if (this.videoTitle != null) {
            this.titleParams.height = size >= i10 ? size : f.a(55) + size;
            FrameLayout.LayoutParams layoutParams2 = this.titleParams;
            layoutParams2.width = i10;
            this.viewBinding.f8928k.setLayoutParams(layoutParams2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        j();
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        post(this.measureAndLayout);
    }

    public final void setCornerRadius(float f10) {
        this.cornerRadius = f10;
    }

    public final void setDesiredHeight(int i10) {
        this.desiredHeight = i10;
    }

    public final void setDesiredWidth(int i10) {
        this.desiredWidth = i10;
    }

    public final void setMaxHeight(int i10) {
        this.maxHeight = i10;
    }

    public final void setMaxLoopsBeforeMute(int i10) {
        this.maxLoopsBeforeMute = i10;
    }

    public final void setParams(@NotNull FrameLayout.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(layoutParams, "<set-?>");
        this.params = layoutParams;
    }

    public final void setPreviewMode(@NotNull Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.viewBinding.f8929l.setPreviewMode(onClick);
    }

    public final void setShowControls(boolean z10) {
        this.showControls = z10;
    }

    public final void setTitleParams(@NotNull FrameLayout.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(layoutParams, "<set-?>");
        this.titleParams = layoutParams;
    }

    public final void setVideoPlayer(@Nullable U8.b bVar) {
        if (bVar == null) {
            throw new NullPointerException("videoPlayer must not be null");
        }
        this.player = bVar;
    }

    public final void setVideoTitle(@Nullable String str) {
        this.videoTitle = str;
        requestLayout();
        this.viewBinding.f8927j.setText(str);
        this.viewBinding.f8928k.setVisibility(str != null ? 0 : 8);
    }

    public /* synthetic */ GPHVideoPlayerView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GPHVideoPlayerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.showControls = true;
        this.maxLoopsBeforeMute = 3;
        this.cornerRadius = f.a(0);
        this.desiredWidth = f.a(200);
        this.desiredHeight = f.a(112);
        this.maxHeight = Integer.MAX_VALUE;
        this.listener = new b();
        k a10 = k.a(View.inflate(context, t.f8546q, this));
        Intrinsics.checkNotNullExpressionValue(a10, "bind(View.inflate(contex…video_player_view, this))");
        this.viewBinding = a10;
        a10.f8922e.setLegacyVisibilityHandlingEnabled(true);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-1442840576);
        gradientDrawable.setCornerRadius(8.0f);
        a10.f8924g.setBackground(gradientDrawable);
        a10.f8924g.setTextSize(13.0f);
        a10.f8927j.setBackgroundColor(O8.k.f8390a.h().a());
        a10.f8927j.setTextColor(-6579301);
        a10.f8927j.setTextSize(18.0f);
        a10.f8928k.setVisibility(this.videoTitle != null ? 0 : 8);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w.GPHVideoPlayerView, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…GPHVideoPlayerView, 0, 0)");
        boolean z10 = obtainStyledAttributes.getBoolean(w.f8568a, true);
        this.showControls = z10;
        a10.f8929l.setVisibility(z10 ? 0 : 8);
        obtainStyledAttributes.recycle();
        this.measureAndLayout = new Runnable() { // from class: V8.L
            @Override // java.lang.Runnable
            public final void run() {
                GPHVideoPlayerView.l(GPHVideoPlayerView.this);
            }
        };
        this.params = new FrameLayout.LayoutParams(0, 0, 17);
        this.titleParams = new FrameLayout.LayoutParams(0, 0, 17);
    }
}
