package ru.ozon.android.messenger.blocks.messageimage.presentation;

import Sc.o;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Q;
import com.google.android.material.imageview.ShapeableImageView;
import j.C7232a;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.core.initialization.newinit.d;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.i;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.android.messenger.framework.presentation.common.view.timestatus.TimeStatusView;
import ru.ozon.android.messenger.framework.presentation.models.p;
import ru.ozon.android.messenger.framework.presentation.models.s;
import ru.ozon.android.messenger.framework.presentation.models.z;
import ru.ozon.android.messenger.utils.n;
import ru.ozon.app.android.messenger.R$dimen;
import ru.ozon.app.android.messenger.R$drawable;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.databinding.MBlockImageBinding;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.pikazon.image.ImageSize;
import y7.k;

/* loaded from: classes10.dex */
public final class e extends q<ru.ozon.android.messenger.blocks.messageimage.c, MBlockImageBinding> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.core.d f85770a;

    /* renamed from: b, reason: collision with root package name */
    private final int f85771b;

    /* renamed from: c, reason: collision with root package name */
    private final int f85772c;

    /* renamed from: d, reason: collision with root package name */
    private final int f85773d;

    /* renamed from: e, reason: collision with root package name */
    private final int f85774e;

    /* renamed from: f, reason: collision with root package name */
    private final int f85775f;

    static final class a extends AbstractC7737t implements Function1<MBlockImageBinding, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.blocks.messageimage.c f85777c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ p f85778d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.presentation.models.d f85779e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f85780f;

        /* renamed from: ru.ozon.android.messenger.blocks.messageimage.presentation.e$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C1511a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f85781a;

            static {
                int[] iArr = new int[i.a.values().length];
                try {
                    iArr[i.a.STATUS_CHANGED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f85781a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ru.ozon.android.messenger.blocks.messageimage.c cVar, p pVar, ru.ozon.android.messenger.framework.presentation.models.d dVar, Object obj) {
            super(1);
            this.f85777c = cVar;
            this.f85778d = pVar;
            this.f85779e = dVar;
            this.f85780f = obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MBlockImageBinding mBlockImageBinding) {
            MBlockImageBinding withBinding = mBlockImageBinding;
            Intrinsics.checkNotNullParameter(withBinding, "$this$withBinding");
            e eVar = e.this;
            ru.ozon.android.messenger.blocks.messageimage.c cVar = this.f85777c;
            p pVar = this.f85778d;
            ru.ozon.android.messenger.framework.presentation.models.d dVar = this.f85779e;
            Object obj = this.f85780f;
            e.super.bind(cVar, pVar, dVar, obj);
            if (!(pVar instanceof s)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (obj != null) {
                List list = obj instanceof List ? (List) obj : null;
                if (list == null || list.isEmpty()) {
                    list = C7705l.f0(i.a.values());
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (C1511a.f85781a[((i.a) ((Enum) it.next())).ordinal()] != 1) {
                        throw new o();
                    }
                    e.l(eVar, withBinding, cVar, (s) pVar, dVar);
                }
            } else {
                s sVar = (s) pVar;
                ru.ozon.android.messenger.framework.presentation.models.d dVar2 = this.f85779e;
                e.l(eVar, withBinding, cVar, sVar, dVar2);
                e.g(eVar, withBinding, cVar, e.c(eVar, cVar.getWidth(), cVar.getHeight()), sVar, dVar2);
                FrameLayout blockImageRootFl = eVar.getBinding().blockImageRootFl;
                Intrinsics.checkNotNullExpressionValue(blockImageRootFl, "blockImageRootFl");
                ru.ozon.android.messenger.utils.view.s.c(blockImageRootFl, new i(pVar, eVar, cVar));
                if (cVar.getSendTime() != null) {
                    FrameLayout blockImageRootFl2 = withBinding.blockImageRootFl;
                    Intrinsics.checkNotNullExpressionValue(blockImageRootFl2, "blockImageRootFl");
                    eVar.makeViewInMultipleFilledWidth(blockImageRootFl2);
                }
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@NotNull MBlockImageBinding binding, @NotNull ru.ozon.android.messenger.framework.core.d references) {
        super(binding, references);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        this.f85770a = references;
        this.f85771b = ru.ozon.android.messenger.utils.h.a(getContext(), R$dimen.m_msg_bg_large_corner_radius);
        this.f85772c = ru.ozon.android.messenger.utils.h.a(getContext(), R$dimen.m_image_max_height);
        this.f85773d = ru.ozon.android.messenger.utils.h.a(getContext(), R$dimen.m_image_min_size);
        int width = (int) (references.e().getWidth() * 0.8d);
        this.f85774e = width;
        this.f85775f = ru.ozon.android.messenger.utils.h.a(getContext(), R$dimen.m_default_image_placeholder_height);
        binding.mainImageIv.setMaxWidth(width);
    }

    public static final ImageSize c(e eVar, Integer num, Integer num2) {
        eVar.getClass();
        if (num == null || num2 == null) {
            return null;
        }
        return ru.ozon.android.messenger.utils.image.e.a(new ImageSize(ru.ozon.android.messenger.utils.h.c(num.intValue()), ru.ozon.android.messenger.utils.h.c(num2.intValue())), eVar.f85774e, eVar.f85772c);
    }

    public static final void g(e eVar, MBlockImageBinding mBlockImageBinding, ru.ozon.android.messenger.blocks.messageimage.c cVar, ImageSize imageSize, s sVar, ru.ozon.android.messenger.framework.presentation.models.d dVar) {
        eVar.getClass();
        ShapeableImageView shapeableImageView = mBlockImageBinding.mainImageIv;
        Intrinsics.f(shapeableImageView);
        shapeableImageView.setShapeAppearanceModel(new k());
        shapeableImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        ViewGroup.LayoutParams layoutParams = shapeableImageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = imageSize != null ? imageSize.getWidth() : eVar.f85774e;
        layoutParams.height = imageSize != null ? imageSize.getHeight() : eVar.f85775f;
        shapeableImageView.setLayoutParams(layoutParams);
        boolean f7 = cVar.f();
        ru.ozon.android.messenger.framework.core.d dVar2 = eVar.f85770a;
        if (f7) {
            d.a f11 = ru.ozon.android.messenger.utils.g.f(dVar2.d());
            shapeableImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            ImageViewExtKt.load$default(shapeableImageView, n.b(cVar.e(), f11.a(), f11.b()), sVar.r() ? C7714v.a0(new ImageTransformation.Blur(0, 1, 1, null)) : K.f71697a, null, null, imageSize, false, null, 108, null);
            eVar.n(shapeableImageView, sVar.p(), dVar.a(), sVar.a());
        } else {
            g gVar = new g(shapeableImageView, eVar, dVar, sVar);
            d.a f12 = ru.ozon.android.messenger.utils.g.f(dVar2.d());
            Context context = shapeableImageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            String c11 = cVar.c();
            if (c11 == null) {
                c11 = n.b(cVar.e(), f12.a(), f12.b());
            }
            ContextExtKt.loadAsBitmap$default(context, c11, sVar.r() ? C7714v.a0(new ImageTransformation.Blur(0, 1, 1, null)) : K.f71697a, imageSize, null, new h(imageSize, eVar, shapeableImageView, gVar), 8, null);
        }
        if (cVar.getSendTime() != null) {
            FrameLayout blockImageRootFl = mBlockImageBinding.blockImageRootFl;
            Intrinsics.checkNotNullExpressionValue(blockImageRootFl, "blockImageRootFl");
            eVar.makeViewInMultipleFilledWidth(blockImageRootFl);
        }
    }

    public static final void i(e eVar, ru.ozon.android.messenger.blocks.messageimage.c imageVO) {
        eVar.getClass();
        Intrinsics.checkNotNullParameter(imageVO, "imageVO");
        ru.ozon.android.messenger.blocks.messageimage.presentation.a aVar = new ru.ozon.android.messenger.blocks.messageimage.presentation.a();
        ru.ozon.android.messenger.utils.g.g(aVar, new Pair("ARG_IMAGE_VO", imageVO));
        Q p11 = eVar.f85770a.d().getParentFragmentManager().p();
        p11.g(ru.ozon.android.messenger.blocks.messageimage.presentation.a.f85751e.toString());
        p11.r(R$id.fragmentChatContainer, aVar, null);
        p11.i();
    }

    public static final void k(e eVar, View view, ImageSize imageSize) {
        eVar.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = -2;
        layoutParams.width = -2;
        int height = imageSize.getHeight();
        int i11 = eVar.f85773d;
        if (height < i11) {
            layoutParams.height = i11;
        }
        if (imageSize.getWidth() < i11) {
            layoutParams.width = i11;
        }
        int height2 = imageSize.getHeight();
        int i12 = eVar.f85774e;
        int i13 = eVar.f85772c;
        if (height2 > i13 || imageSize.getWidth() > i12) {
            ImageSize a11 = ru.ozon.android.messenger.utils.image.e.a(imageSize, i12, i13);
            layoutParams.height = a11.getHeight();
            layoutParams.width = a11.getWidth();
        }
        view.setLayoutParams(layoutParams);
    }

    public static final void l(e eVar, MBlockImageBinding mBlockImageBinding, ru.ozon.android.messenger.blocks.messageimage.c cVar, s sVar, ru.ozon.android.messenger.framework.presentation.models.d dVar) {
        eVar.getClass();
        if (sVar.a() != 1) {
            TimeStatusView timeStatusView = mBlockImageBinding.timeStatusView;
            Intrinsics.checkNotNullExpressionValue(timeStatusView, "timeStatusView");
            ru.ozon.android.messenger.utils.view.s.a(timeStatusView);
        }
        if ((sVar.k() instanceof z.b) || (sVar.k() instanceof z.c)) {
            mBlockImageBinding.mainImageIv.setForeground(C7232a.a(eVar.getContext(), R$drawable.m_fg_rounded_layer_overlay_paranja));
            mBlockImageBinding.mainImageIv.setAlpha(0.5f);
        } else {
            mBlockImageBinding.mainImageIv.setForeground(null);
            mBlockImageBinding.mainImageIv.setAlpha(1.0f);
        }
        String sendTime = cVar.getSendTime();
        if (sendTime == null) {
            sendTime = "";
        }
        ru.ozon.android.messenger.framework.presentation.common.view.timestatus.c cVar2 = new ru.ozon.android.messenger.framework.presentation.common.view.timestatus.c(sendTime, sVar.k(), sVar.n());
        TimeStatusView timeStatusView2 = mBlockImageBinding.timeStatusView;
        Intrinsics.checkNotNullExpressionValue(timeStatusView2, "timeStatusView");
        cVar2.a(timeStatusView2);
        ShapeableImageView shapeableImageView = mBlockImageBinding.mainImageIv;
        Intrinsics.f(shapeableImageView);
        shapeableImageView.addOnLayoutChangeListener(new j(shapeableImageView, eVar, dVar, sVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(ShapeableImageView shapeableImageView, boolean z11, int i11, int i12) {
        boolean z12 = i11 == i12 - 1;
        boolean z13 = (i11 == 0) && !(getBinding().getConstraintLayout().getWidth() > getBinding().mainImageIv.getWidth());
        k.a aVar = new k.a(new k());
        Intrinsics.checkNotNullExpressionValue(aVar, "toBuilder(...)");
        float f7 = this.f85771b;
        boolean z14 = z11 && z12;
        boolean z15 = !z11 && z12;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (z13) {
            aVar.n(f7);
        }
        if (z13) {
            aVar.r(f7);
        }
        if (z14) {
            aVar.f(f7);
        }
        if (z15) {
            aVar.j(f7);
        }
        shapeableImageView.setShapeAppearanceModel(aVar.a());
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.q
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void bind(@NotNull ru.ozon.android.messenger.blocks.messageimage.c block, @NotNull p itemInfo, @NotNull ru.ozon.android.messenger.framework.presentation.models.d blockInfo, Object obj) {
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(itemInfo, "itemInfo");
        Intrinsics.checkNotNullParameter(blockInfo, "blockInfo");
        withBinding(new a(block, itemInfo, blockInfo, obj));
    }
}
