package ru.ozon.android.messenger.blocks.input.attachments.presentation;

import Bo.ViewOnClickListenerC2667a;
import Sc.o;
import android.content.Context;
import android.content.res.Resources;
import androidx.recyclerview.widget.RecyclerView;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.input.attachments.presentation.b;
import ru.ozon.android.messenger.utils.h;
import ru.ozon.app.android.messenger.R$attr;
import ru.ozon.app.android.messenger.R$color;
import ru.ozon.app.android.messenger.R$drawable;
import ru.ozon.app.android.messenger.databinding.MAttachmentItemBinding;
import ru.ozon.uni.android.atom.loader.data.LoaderSize;
import ru.ozon.uni.android.atom.loader.ui.LoaderView;
import ru.ozon.uni.android.atom.productMedia.ProductMediaView;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.resources.DrawableResource;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.core.UniTextStyles;

/* loaded from: classes10.dex */
public final class a extends RecyclerView.C {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final MAttachmentItemBinding f85447a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<UUID, Unit> f85448b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<UUID, Unit> f85449c;

    /* renamed from: d, reason: collision with root package name */
    private b f85450d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(@NotNull MAttachmentItemBinding binding, @NotNull Function1<? super UUID, Unit> onRetryLoadAttachmentClick, @NotNull Function1<? super UUID, Unit> onCancelLoadingAttachment, @NotNull Function1<? super UUID, Unit> onRemoveAttachmentClick) {
        super(binding.getConstraintLayout());
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(onRetryLoadAttachmentClick, "onRetryLoadAttachmentClick");
        Intrinsics.checkNotNullParameter(onCancelLoadingAttachment, "onCancelLoadingAttachment");
        Intrinsics.checkNotNullParameter(onRemoveAttachmentClick, "onRemoveAttachmentClick");
        this.f85447a = binding;
        this.f85448b = onRetryLoadAttachmentClick;
        this.f85449c = onCancelLoadingAttachment;
        ProductMediaView productMediaView = binding.attachmentPreview;
        productMediaView.setFixedWidth(56);
        Context context = binding.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        productMediaView.setCornerRadius(h.b(context) ? UiExtKt.toPxF(32) : UiExtKt.toPxF(16));
        productMediaView.setBackgroundColor(new Color.Solid(androidx.core.content.a.getColor(this.itemView.getContext(), R$color.bg_secondary)));
        IconButtonV3View iconButtonV3View = binding.removePhotoBtn;
        iconButtonV3View.setOnClickListener(new ViewOnClickListenerC2667a(3, this, onRemoveAttachmentClick));
        IconButtonV3DTO.IconButtonShape iconButtonShape = IconButtonV3DTO.IconButtonShape.SHAPE_CIRCLE;
        iconButtonV3View.setShape(iconButtonShape);
        iconButtonV3View.setSize(IconButtonV3DTO.Sizes.SIZE_300);
        DrawableResource.Companion companion = DrawableResource.INSTANCE;
        Resources resources = this.itemView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        iconButtonV3View.setIconDrawable(companion.fromResources(resources, R$drawable.ic_s_cross_filled));
        Context context2 = iconButtonV3View.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        iconButtonV3View.setIconColor(ThemeExtKt.themeColor(context2, R$attr.graphicPrimaryInverted));
        iconButtonV3View.setBackColor(new Color.Solid(androidx.core.content.a.getColor(this.itemView.getContext(), R$color.bg_primary_inverted)));
        IconButtonV3View iconButtonV3View2 = binding.cancelOrRefreshBtn;
        iconButtonV3View2.setShape(iconButtonShape);
        iconButtonV3View2.setSize(IconButtonV3DTO.Sizes.SIZE_400);
        Context context3 = iconButtonV3View2.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        iconButtonV3View2.setIconColor(ThemeExtKt.themeColor(context3, R$attr.bgLightKey));
        iconButtonV3View2.setBackColor(new Color.Solid(androidx.core.content.a.getColor(this.itemView.getContext(), R$color.clear_dark_key_600)));
        LoaderView loaderView = binding.loaderView;
        loaderView.setLoaderSize(LoaderSize.LOADER_400);
        loaderView.setColor(androidx.core.content.a.getColor(this.itemView.getContext(), R$color.bg_light_key));
        binding.getConstraintLayout().setClipToOutline(true);
    }

    public static void e(a aVar, Function1 function1) {
        UUID b11;
        b bVar = aVar.f85450d;
        if (bVar == null || (b11 = bVar.b()) == null) {
            return;
        }
        function1.invoke(b11);
    }

    public static void f(a aVar, b bVar) {
        aVar.f85448b.invoke(bVar.b());
    }

    public static void g(a aVar, b bVar) {
        aVar.f85449c.invoke(bVar.b());
    }

    public final void h(@NotNull b item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f85450d = item;
        MAttachmentItemBinding mAttachmentItemBinding = this.f85447a;
        ProductMediaView productMediaView = mAttachmentItemBinding.attachmentPreview;
        if (item instanceof b.C1500b) {
            productMediaView.setImage(((b.C1500b) item).c().toString());
            productMediaView.setLabel(null);
        } else {
            if (!(item instanceof b.a)) {
                throw new o();
            }
            productMediaView.setImage(null);
            productMediaView.setTextStyle(UniTextStyles.BODY_200_X_SMALL.getResId());
            productMediaView.setLabel(((b.a) item).j());
        }
        productMediaView.setHasOverlay(item.f().R1());
        if (item.f().m1()) {
            productMediaView.setBorder(Integer.valueOf(androidx.core.content.a.getColor(this.itemView.getContext(), R$color.bg_negative_primary)), Integer.valueOf(UiExtKt.toPx(2)), false);
        } else {
            productMediaView.clearBorder();
        }
        IconButtonV3View iconButtonV3View = mAttachmentItemBinding.cancelOrRefreshBtn;
        if (item.f().L()) {
            Intrinsics.f(iconButtonV3View);
            iconButtonV3View.setVisibility(0);
            DrawableResource.Companion companion = DrawableResource.INSTANCE;
            Resources resources = this.itemView.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            iconButtonV3View.setIconDrawable(companion.fromResources(resources, R$drawable.ic_s_reload_filled));
            iconButtonV3View.setOnClickListener(new BP.a(7, this, item));
        } else if (item.f().S1()) {
            Intrinsics.f(iconButtonV3View);
            iconButtonV3View.setVisibility(0);
            DrawableResource.Companion companion2 = DrawableResource.INSTANCE;
            Resources resources2 = this.itemView.getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            iconButtonV3View.setIconDrawable(companion2.fromResources(resources2, R$drawable.ic_s_cross_filled));
            iconButtonV3View.setOnClickListener(new Au.c(6, this, item));
        } else {
            Intrinsics.f(iconButtonV3View);
            iconButtonV3View.setVisibility(8);
        }
        LoaderView loaderView = mAttachmentItemBinding.loaderView;
        Intrinsics.checkNotNullExpressionValue(loaderView, "loaderView");
        loaderView.setVisibility(item.f().a1() ? 0 : 8);
        IconButtonV3View removePhotoBtn = mAttachmentItemBinding.removePhotoBtn;
        Intrinsics.checkNotNullExpressionValue(removePhotoBtn, "removePhotoBtn");
        removePhotoBtn.setVisibility(item.f().d0() ? 0 : 8);
    }
}
