package ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.presentation.view;

import Sc.r;
import Sc.s;
import Wc.a;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.presentation.Banner;
import xe.C10727i;
import xe.M;
import xe.U;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.presentation.view.LoadImages$load$1", f = "LoadImages.kt", l = {50, 51, 52}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class LoadImages$load$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Banner.Images $images;
    final /* synthetic */ ConstraintLayout $rootView;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ LoadImages this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LoadImages$load$1(Banner.Images images, LoadImages loadImages, ConstraintLayout constraintLayout, d<? super LoadImages$load$1> dVar) {
        super(2, dVar);
        this.$images = images;
        this.this$0 = loadImages;
        this.$rootView = constraintLayout;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        LoadImages$load$1 loadImages$load$1 = new LoadImages$load$1(this.$images, this.this$0, this.$rootView, dVar);
        loadImages$load$1.L$0 = obj;
        return loadImages$load$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00d1 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:8:0x001c, B:9:0x00c9, B:12:0x00d1, B:14:0x00dd, B:16:0x00e8, B:17:0x00ed, B:19:0x00f2, B:20:0x00fc, B:28:0x0038, B:29:0x00b3, B:31:0x00b7, B:36:0x0049, B:37:0x009a, B:38:0x009f, B:43:0x005a, B:45:0x0062, B:46:0x006d, B:48:0x007c, B:50:0x008a), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00dd A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:8:0x001c, B:9:0x00c9, B:12:0x00d1, B:14:0x00dd, B:16:0x00e8, B:17:0x00ed, B:19:0x00f2, B:20:0x00fc, B:28:0x0038, B:29:0x00b3, B:31:0x00b7, B:36:0x0049, B:37:0x009a, B:38:0x009f, B:43:0x005a, B:45:0x0062, B:46:0x006d, B:48:0x007c, B:50:0x008a), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f2 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:8:0x001c, B:9:0x00c9, B:12:0x00d1, B:14:0x00dd, B:16:0x00e8, B:17:0x00ed, B:19:0x00f2, B:20:0x00fc, B:28:0x0038, B:29:0x00b3, B:31:0x00b7, B:36:0x0049, B:37:0x009a, B:38:0x009f, B:43:0x005a, B:45:0x0062, B:46:0x006d, B:48:0x007c, B:50:0x008a), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b7 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:8:0x001c, B:9:0x00c9, B:12:0x00d1, B:14:0x00dd, B:16:0x00e8, B:17:0x00ed, B:19:0x00f2, B:20:0x00fc, B:28:0x0038, B:29:0x00b3, B:31:0x00b7, B:36:0x0049, B:37:0x009a, B:38:0x009f, B:43:0x005a, B:45:0x0062, B:46:0x006d, B:48:0x007c, B:50:0x008a), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        LoadImages loadImages;
        U a11;
        U a12;
        Drawable drawable;
        U u11;
        Object s11;
        Drawable drawable2;
        U u12;
        LoadImages loadImages2;
        Drawable drawable3;
        LoadImages loadImages3;
        Drawable drawable4;
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        AppCompatImageView appCompatImageView3;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        Drawable drawable5 = null;
        try {
        } catch (Throwable th2) {
            r.Companion companion = r.INSTANCE;
            s.a(th2);
        }
        if (i11 == 0) {
            s.b(obj);
            M m11 = (M) this.L$0;
            Banner.Images images = this.$images;
            loadImages = this.this$0;
            ConstraintLayout constraintLayout = this.$rootView;
            r.Companion companion2 = r.INSTANCE;
            String underImage = images.getUnderImage();
            U a13 = underImage != null ? C10727i.a(m11, null, null, new LoadImages$load$1$1$underDeferred$1$1(loadImages, constraintLayout, underImage, null), 3) : null;
            a11 = C10727i.a(m11, null, null, new LoadImages$load$1$1$animationDeferred$1(loadImages, constraintLayout, images, null), 3);
            String overImage = images.getOverImage();
            a12 = overImage != null ? C10727i.a(m11, null, null, new LoadImages$load$1$1$overDeferred$1$1(loadImages, constraintLayout, overImage, null), 3) : null;
            if (a13 == null) {
                drawable = null;
                this.L$0 = loadImages;
                this.L$1 = a12;
                this.L$2 = drawable;
                this.label = 2;
                s11 = a11.s(this);
                if (s11 != aVar) {
                    return aVar;
                }
                U u13 = a12;
                drawable2 = drawable;
                obj = s11;
                u12 = u13;
                loadImages2 = loadImages;
                Drawable drawable6 = (Drawable) obj;
                drawable4 = drawable6;
                if (u12 != null) {
                }
                if (drawable2 != null) {
                }
                if (drawable4 != 0) {
                }
                if (drawable5 != null) {
                }
                Unit unit = Unit.f71690a;
                r.Companion companion3 = r.INSTANCE;
                return Unit.f71690a;
            }
            this.L$0 = loadImages;
            this.L$1 = a11;
            this.L$2 = a12;
            this.label = 1;
            obj = a13.s(this);
            if (obj == aVar) {
                return aVar;
            }
            u11 = a11;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    drawable3 = (Drawable) this.L$2;
                    drawable2 = (Drawable) this.L$1;
                    loadImages3 = (LoadImages) this.L$0;
                    s.b(obj);
                    drawable5 = (Drawable) obj;
                    drawable4 = drawable3;
                    loadImages2 = loadImages3;
                    if (drawable2 != null) {
                        appCompatImageView3 = loadImages2.underImageView;
                        appCompatImageView3.setImageDrawable(drawable2);
                        appCompatImageView3.setVisibility(0);
                    }
                    if (drawable4 != 0) {
                        appCompatImageView2 = loadImages2.animationImageView;
                        appCompatImageView2.setImageDrawable(drawable4);
                        if (drawable4 instanceof Animatable) {
                            ((Animatable) drawable4).start();
                        }
                        appCompatImageView2.setVisibility(0);
                    }
                    if (drawable5 != null) {
                        appCompatImageView = loadImages2.overImageView;
                        appCompatImageView.setImageDrawable(drawable5);
                        appCompatImageView.setVisibility(0);
                    }
                    Unit unit2 = Unit.f71690a;
                    r.Companion companion32 = r.INSTANCE;
                    return Unit.f71690a;
                }
                drawable2 = (Drawable) this.L$2;
                u12 = (U) this.L$1;
                loadImages2 = (LoadImages) this.L$0;
                s.b(obj);
                Drawable drawable62 = (Drawable) obj;
                drawable4 = drawable62;
                if (u12 != null) {
                    this.L$0 = loadImages2;
                    this.L$1 = drawable2;
                    this.L$2 = drawable62;
                    this.label = 3;
                    Object s12 = u12.s(this);
                    if (s12 != aVar) {
                        drawable3 = drawable62;
                        obj = s12;
                        loadImages3 = loadImages2;
                        drawable5 = (Drawable) obj;
                        drawable4 = drawable3;
                        loadImages2 = loadImages3;
                    }
                    return aVar;
                }
                if (drawable2 != null) {
                }
                if (drawable4 != 0) {
                }
                if (drawable5 != null) {
                }
                Unit unit22 = Unit.f71690a;
                r.Companion companion322 = r.INSTANCE;
                return Unit.f71690a;
            }
            a12 = (U) this.L$2;
            u11 = (U) this.L$1;
            loadImages = (LoadImages) this.L$0;
            s.b(obj);
        }
        drawable = (Drawable) obj;
        a11 = u11;
        this.L$0 = loadImages;
        this.L$1 = a12;
        this.L$2 = drawable;
        this.label = 2;
        s11 = a11.s(this);
        if (s11 != aVar) {
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((LoadImages$load$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
