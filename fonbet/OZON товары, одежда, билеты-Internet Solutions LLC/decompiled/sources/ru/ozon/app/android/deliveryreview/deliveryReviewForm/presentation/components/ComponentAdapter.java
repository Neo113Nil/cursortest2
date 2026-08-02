package ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components;

import Ve.C4636t5;
import Xc.a;
import Xc.b;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.deliveryreview.databinding.ItemDeliveryReviewComponentAtomBinding;
import ru.ozon.app.android.deliveryreview.databinding.ItemDeliveryReviewComponentCarouselBinding;
import ru.ozon.app.android.deliveryreview.databinding.ItemDeliveryReviewComponentCheckboxBinding;
import ru.ozon.app.android.deliveryreview.databinding.ItemDeliveryReviewComponentGalleryBinding;
import ru.ozon.app.android.deliveryreview.databinding.ItemDeliveryReviewComponentRadioBinding;
import ru.ozon.app.android.deliveryreview.databinding.ItemDeliveryReviewComponentTextareaBinding;
import ru.ozon.app.android.deliveryreview.databinding.ItemDeliveryReviewComponentToggleBinding;
import ru.ozon.app.android.deliveryreview.databinding.ItemDeliveryReviewComponentUploadPhotosBinding;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.viewmodel.DeliveryReviewFormViewModel;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.ElementVO;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.atom.AtomItemVH;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.carousel.CarouselVH;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.checkbox.CheckboxVH;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.gallery.GalleryVH;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.radio.RadioVH;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.textarea.TextareaVH;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.toggle.ToggleVH;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.uploadphotos.UploadPhotosVH;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.uploadphotos.viewmodel.ComponentUploadPhotosViewModel;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00010B;\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00142\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016¢\u0006\u0004\b\u001c\u0010!J\u0017\u0010\"\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b$\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010'R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010(R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010)R\"\u0010*\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00061"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ComponentAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ComponentVO;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/uploadphotos/viewmodel/ComponentUploadPhotosViewModel;", "uploadPhotosViewModel", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/viewmodel/DeliveryReviewFormViewModel;", "deliveryReviewFormViewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "", "isSelect", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/uploadphotos/viewmodel/ComponentUploadPhotosViewModel;Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/viewmodel/DeliveryReviewFormViewModel;Lru/ozon/app/android/composer/ComposerReferences;ZLkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$C;", "position", "getItemViewType", "(I)I", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$C;I)V", "", "", "payloads", "(Landroidx/recyclerview/widget/RecyclerView$C;ILjava/util/List;)V", "onViewRecycled", "(Landroidx/recyclerview/widget/RecyclerView$C;)V", "onViewDetachedFromWindow", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/uploadphotos/viewmodel/ComponentUploadPhotosViewModel;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/viewmodel/DeliveryReviewFormViewModel;", "Lru/ozon/app/android/composer/ComposerReferences;", "Z", "Lkotlin/jvm/functions/Function1;", "groupId", "I", "getGroupId", "()I", "setGroupId", "(I)V", "ElementType", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ComponentAdapter extends t<ComponentVO, RecyclerView.C> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final DeliveryReviewFormViewModel deliveryReviewFormViewModel;
    private int groupId;
    private final boolean isSelect;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final ComponentUploadPhotosViewModel uploadPhotosViewModel;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ComponentAdapter$ElementType;", "", "id", "", "<init>", "(Ljava/lang/String;II)V", "getId", "()I", "ATOM", "CHECKBOX", "RADIO", "CAROUSEL", "GALLERY", "TEXTAREA", "TOGGLE", "UPLOAD_PHOTOS", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ElementType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ElementType[] $VALUES;
        private final int id;
        public static final ElementType ATOM = new ElementType("ATOM", 0, 1);
        public static final ElementType CHECKBOX = new ElementType("CHECKBOX", 1, 2);
        public static final ElementType RADIO = new ElementType("RADIO", 2, 3);
        public static final ElementType CAROUSEL = new ElementType("CAROUSEL", 3, 4);
        public static final ElementType GALLERY = new ElementType("GALLERY", 4, 5);
        public static final ElementType TEXTAREA = new ElementType("TEXTAREA", 5, 6);
        public static final ElementType TOGGLE = new ElementType("TOGGLE", 6, 7);
        public static final ElementType UPLOAD_PHOTOS = new ElementType("UPLOAD_PHOTOS", 7, 8);

        private static final /* synthetic */ ElementType[] $values() {
            return new ElementType[]{ATOM, CHECKBOX, RADIO, CAROUSEL, GALLERY, TEXTAREA, TOGGLE, UPLOAD_PHOTOS};
        }

        static {
            ElementType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ElementType(String str, int i11, int i12) {
            this.id = i12;
        }

        public static ElementType valueOf(String str) {
            return (ElementType) Enum.valueOf(ElementType.class, str);
        }

        public static ElementType[] values() {
            return (ElementType[]) $VALUES.clone();
        }

        public final int getId() {
            return this.id;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ComponentAdapter(@NotNull ComponentUploadPhotosViewModel uploadPhotosViewModel, @NotNull DeliveryReviewFormViewModel deliveryReviewFormViewModel, @NotNull ComposerReferences refs, boolean z11, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(new i.d<ComponentVO>() { // from class: ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.ComponentAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public Object getChangePayload(ComponentVO oldItem, ComponentVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return newItem;
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(ComponentVO oldItem, ComponentVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(ComponentVO oldItem, ComponentVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem.getId(), newItem.getId());
            }
        });
        Intrinsics.checkNotNullParameter(uploadPhotosViewModel, "uploadPhotosViewModel");
        Intrinsics.checkNotNullParameter(deliveryReviewFormViewModel, "deliveryReviewFormViewModel");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.uploadPhotosViewModel = uploadPhotosViewModel;
        this.deliveryReviewFormViewModel = deliveryReviewFormViewModel;
        this.refs = refs;
        this.isSelect = z11;
        this.actionHandler = actionHandler;
        this.groupId = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        ElementVO element = getItem(position).getElement();
        if (element instanceof ElementVO.Atom) {
            return ElementType.ATOM.getId();
        }
        if (element instanceof ElementVO.Checkbox) {
            return ElementType.CHECKBOX.getId();
        }
        if (element instanceof ElementVO.Radio) {
            return ElementType.RADIO.getId();
        }
        if (element instanceof ElementVO.Carousel) {
            return ElementType.CAROUSEL.getId();
        }
        if (element instanceof ElementVO.Gallery) {
            return ElementType.GALLERY.getId();
        }
        if (element instanceof ElementVO.Textarea) {
            return ElementType.TEXTAREA.getId();
        }
        if (element instanceof ElementVO.Toggle) {
            return ElementType.TOGGLE.getId();
        }
        if (element instanceof ElementVO.UploadPhotos) {
            return ElementType.UPLOAD_PHOTOS.getId();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull RecyclerView.C holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        onBindViewHolder(holder, position, new ArrayList());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public RecyclerView.C onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        LayoutInflater a11 = C4636t5.a(parent, "parent");
        if (viewType == ElementType.ATOM.getId()) {
            ItemDeliveryReviewComponentAtomBinding inflate = ItemDeliveryReviewComponentAtomBinding.inflate(a11, parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            return new AtomItemVH(inflate);
        }
        if (viewType == ElementType.CHECKBOX.getId()) {
            ItemDeliveryReviewComponentCheckboxBinding inflate2 = ItemDeliveryReviewComponentCheckboxBinding.inflate(a11, parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(...)");
            return new CheckboxVH(inflate2, this.refs, this.deliveryReviewFormViewModel);
        }
        if (viewType == ElementType.RADIO.getId()) {
            ItemDeliveryReviewComponentRadioBinding inflate3 = ItemDeliveryReviewComponentRadioBinding.inflate(a11, parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate3, "inflate(...)");
            return new RadioVH(inflate3, this.refs);
        }
        if (viewType == ElementType.CAROUSEL.getId()) {
            ItemDeliveryReviewComponentCarouselBinding inflate4 = ItemDeliveryReviewComponentCarouselBinding.inflate(a11, parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate4, "inflate(...)");
            return new CarouselVH(inflate4, this.refs);
        }
        if (viewType == ElementType.GALLERY.getId()) {
            ItemDeliveryReviewComponentGalleryBinding inflate5 = ItemDeliveryReviewComponentGalleryBinding.inflate(a11, parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate5, "inflate(...)");
            return new GalleryVH(inflate5, this.refs, this.actionHandler);
        }
        if (viewType == ElementType.TEXTAREA.getId()) {
            ItemDeliveryReviewComponentTextareaBinding inflate6 = ItemDeliveryReviewComponentTextareaBinding.inflate(a11, parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate6, "inflate(...)");
            return new TextareaVH(inflate6, this.refs, this.deliveryReviewFormViewModel);
        }
        if (viewType == ElementType.TOGGLE.getId()) {
            ItemDeliveryReviewComponentToggleBinding inflate7 = ItemDeliveryReviewComponentToggleBinding.inflate(a11, parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate7, "inflate(...)");
            return new ToggleVH(inflate7, this.refs, this.deliveryReviewFormViewModel);
        }
        if (viewType != ElementType.UPLOAD_PHOTOS.getId()) {
            throw new IllegalArgumentException(Ej.b.a(viewType, "Wrong viewType: "));
        }
        ItemDeliveryReviewComponentUploadPhotosBinding inflate8 = ItemDeliveryReviewComponentUploadPhotosBinding.inflate(a11, parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate8, "inflate(...)");
        return new UploadPhotosVH(inflate8, this.refs, this.uploadPhotosViewModel, this.deliveryReviewFormViewModel, this.isSelect);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onViewDetachedFromWindow(@NotNull RecyclerView.C holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        if (holder instanceof TextareaVH) {
            ((TextareaVH) holder).onViewDetachedFromWindow();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onViewRecycled(@NotNull RecyclerView.C holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewRecycled(holder);
        if (holder instanceof TextareaVH) {
            ((TextareaVH) holder).onViewRecycled();
        }
    }

    public final void setGroupId(int i11) {
        this.groupId = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull RecyclerView.C holder, int position, @NotNull List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        ComponentVO item = getItem(position);
        if (holder instanceof AtomItemVH) {
            Intrinsics.f(item);
            ((AtomItemVH) holder).bind(item);
            return;
        }
        if (holder instanceof CheckboxVH) {
            int i11 = this.groupId;
            Intrinsics.f(item);
            ((CheckboxVH) holder).bind(i11, item);
            return;
        }
        if (holder instanceof RadioVH) {
            int i12 = this.groupId;
            Intrinsics.f(item);
            ((RadioVH) holder).bind(i12, item);
            return;
        }
        if (holder instanceof GalleryVH) {
            Intrinsics.f(item);
            ((GalleryVH) holder).bind(item);
            return;
        }
        if (holder instanceof TextareaVH) {
            if (payloads.isEmpty()) {
                int i13 = this.groupId;
                Intrinsics.f(item);
                ((TextareaVH) holder).bind(i13, item);
                return;
            } else {
                TextareaVH textareaVH = (TextareaVH) holder;
                int i14 = this.groupId;
                Object obj = payloads.get(0);
                textareaVH.updateData(i14, obj instanceof ComponentVO ? (ComponentVO) obj : null);
                return;
            }
        }
        if (holder instanceof ToggleVH) {
            int i15 = this.groupId;
            Intrinsics.f(item);
            ((ToggleVH) holder).bind(i15, item);
        } else if (holder instanceof CarouselVH) {
            int i16 = this.groupId;
            Intrinsics.f(item);
            ((CarouselVH) holder).bind(i16, item);
        } else if (holder instanceof UploadPhotosVH) {
            Intrinsics.f(item);
            ((UploadPhotosVH) holder).bind(item);
        }
    }
}
