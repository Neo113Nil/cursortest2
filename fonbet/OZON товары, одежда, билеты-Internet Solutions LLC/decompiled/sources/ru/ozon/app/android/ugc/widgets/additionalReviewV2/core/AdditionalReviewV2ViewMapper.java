package ru.ozon.app.android.ugc.widgets.additionalReviewV2.core;

import A00.a;
import android.view.View;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.ugc.R$layout;
import ru.ozon.app.android.ugc.widgets.additionalReviewV2.data.AdditionalReviewV2DTO;
import ru.ozon.app.android.ugc.widgets.additionalReviewV2.di.AdditionalReviewV2Component;
import ru.ozon.app.android.ugc.widgets.additionalReviewV2.presentation.AdditionalReviewV2VH;
import ru.ozon.app.android.ugc.widgets.additionalReviewV2.presentation.AdditionalReviewV2VO;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001.B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR&\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R,\u0010&\u001a\u0014\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lru/ozon/app/android/ugc/widgets/additionalReviewV2/core/AdditionalReviewV2ViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/ugc/widgets/additionalReviewV2/di/AdditionalReviewV2Component;", "Lru/ozon/app/android/ugc/widgets/additionalReviewV2/data/AdditionalReviewV2DTO;", "Lru/ozon/app/android/ugc/widgets/additionalReviewV2/presentation/AdditionalReviewV2VO;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/ugc/widgets/additionalReviewV2/presentation/AdditionalReviewV2VO;)Lru/ozon/app/android/ugc/widgets/additionalReviewV2/presentation/AdditionalReviewV2VO;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "newItem", "Lru/ozon/app/android/ugc/widgets/additionalReviewV2/core/AdditionalReviewV2ViewMapper$ShowAdditionalReviewV2Payload;", "getPayload", "(Lru/ozon/app/android/ugc/widgets/additionalReviewV2/presentation/AdditionalReviewV2VO;Lru/ozon/app/android/ugc/widgets/additionalReviewV2/presentation/AdditionalReviewV2VO;)Lru/ozon/app/android/ugc/widgets/additionalReviewV2/core/AdditionalReviewV2ViewMapper$ShowAdditionalReviewV2Payload;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "", "Ljava/lang/Class;", "Lru/ozon/app/android/ugc/widgets/additionalReviewV2/core/AdditionalReviewShowUpdate;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/ugc/widgets/additionalReviewV2/presentation/AdditionalReviewV2VH;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/ugc/widgets/additionalReviewV2/core/AdditionalReviewV2Mapper;", "getMapper", "()Lru/ozon/app/android/ugc/widgets/additionalReviewV2/core/AdditionalReviewV2Mapper;", "mapper", "ShowAdditionalReviewV2Payload", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AdditionalReviewV2ViewMapper extends WidgetViewMapper2<AdditionalReviewV2Component, AdditionalReviewV2DTO, AdditionalReviewV2VO> {
    private final int layout = R$layout.widget_additional_review_v2;

    @NotNull
    private final List<Class<AdditionalReviewShowUpdate>> supportedUpdates = C7714v.a0(AdditionalReviewShowUpdate.class);

    @NotNull
    private final Function2<View, ComposerReferences, AdditionalReviewV2VH> holderProducer = new AdditionalReviewV2ViewMapper$holderProducer$1(this);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/ugc/widgets/additionalReviewV2/core/AdditionalReviewV2ViewMapper$ShowAdditionalReviewV2Payload;", "", "<init>", "()V", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class ShowAdditionalReviewV2Payload {

        @NotNull
        public static final ShowAdditionalReviewV2Payload INSTANCE = new ShowAdditionalReviewV2Payload();

        private ShowAdditionalReviewV2Payload() {
        }
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, AdditionalReviewV2VH> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<AdditionalReviewShowUpdate>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<AdditionalReviewV2Component> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return AdditionalReviewV2Component.INSTANCE.getInstance(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public AdditionalReviewV2Mapper getMapper() {
        return component().mapper();
    }

    @Override // ru.ozon.composer.ui.widget.g
    public ShowAdditionalReviewV2Payload getPayload(@NotNull AdditionalReviewV2VO oldItem, @NotNull AdditionalReviewV2VO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if (oldItem.getNeedToShow() != newItem.getNeedToShow()) {
            return ShowAdditionalReviewV2Payload.INSTANCE;
        }
        return null;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public AdditionalReviewV2VO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull AdditionalReviewV2VO oldItem) {
        AdditionalReviewV2VO copy;
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(update instanceof AdditionalReviewShowUpdate) || ((AdditionalReviewShowUpdate) update).getItemId() != oldItem.getId()) {
            return oldItem;
        }
        copy = oldItem.copy((r27 & 1) != 0 ? oldItem.id : 0L, (r27 & 2) != 0 ? oldItem.title : null, (r27 & 4) != 0 ? oldItem.cornerIcon : null, (r27 & 8) != 0 ? oldItem.subtitle : null, (r27 & 16) != 0 ? oldItem.rating : null, (r27 & 32) != 0 ? oldItem.tokenizedEvent : null, (r27 & 64) != 0 ? oldItem.rightCornerButton : null, (r27 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? oldItem.buttonTokenizedEvent : null, (r27 & 256) != 0 ? oldItem.needToShow : true, (r27 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? oldItem.imageAtom : null, (r27 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? oldItem.action : null, (r27 & 2048) != 0 ? oldItem.hideButton : null);
        return copy;
    }
}
