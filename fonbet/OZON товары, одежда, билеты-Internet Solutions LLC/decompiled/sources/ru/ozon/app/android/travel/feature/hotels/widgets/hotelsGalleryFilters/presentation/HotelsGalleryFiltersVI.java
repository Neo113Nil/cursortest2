package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.presentation;

import G.g;
import Gl.C3124a;
import Lh.b;
import Pk0.a;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00020\u0001:\u0002'(BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b$\u0010#R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b&\u0010\u0014¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/HotelsGalleryFiltersVI;", "Ll20/c;", "", "id", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/HotelsGalleryFiltersVI$FiltersItem;", "items", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/HotelsGalleryFiltersVI$StickyFiltersItem;", "stickyItems", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "selectedTagButton", "defaultTagButton", "", "selectedPosition", "<init>", "(JLjava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "getStickyItems", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "getSelectedTagButton", "()Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "getDefaultTagButton", "I", "getSelectedPosition", "FiltersItem", "StickyFiltersItem", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotelsGalleryFiltersVI implements c {
    private final TagButtonDTO defaultTagButton;
    private final long id;

    @NotNull
    private final List<FiltersItem> items;
    private final int selectedPosition;
    private final TagButtonDTO selectedTagButton;

    @NotNull
    private final List<StickyFiltersItem> stickyItems;

    public HotelsGalleryFiltersVI(long j11, @NotNull List<FiltersItem> items, @NotNull List<StickyFiltersItem> stickyItems, TagButtonDTO tagButtonDTO, TagButtonDTO tagButtonDTO2, int i11) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(stickyItems, "stickyItems");
        this.id = j11;
        this.items = items;
        this.stickyItems = stickyItems;
        this.selectedTagButton = tagButtonDTO;
        this.defaultTagButton = tagButtonDTO2;
        this.selectedPosition = i11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsGalleryFiltersVI)) {
            return false;
        }
        HotelsGalleryFiltersVI hotelsGalleryFiltersVI = (HotelsGalleryFiltersVI) other;
        return this.id == hotelsGalleryFiltersVI.id && Intrinsics.d(this.items, hotelsGalleryFiltersVI.items) && Intrinsics.d(this.stickyItems, hotelsGalleryFiltersVI.stickyItems) && Intrinsics.d(this.selectedTagButton, hotelsGalleryFiltersVI.selectedTagButton) && Intrinsics.d(this.defaultTagButton, hotelsGalleryFiltersVI.defaultTagButton) && this.selectedPosition == hotelsGalleryFiltersVI.selectedPosition;
    }

    public final TagButtonDTO getDefaultTagButton() {
        return this.defaultTagButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<FiltersItem> getItems() {
        return this.items;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final int getSelectedPosition() {
        return this.selectedPosition;
    }

    public final TagButtonDTO getSelectedTagButton() {
        return this.selectedTagButton;
    }

    @NotNull
    public final List<StickyFiltersItem> getStickyItems() {
        return this.stickyItems;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b(g.b(Long.hashCode(this.id) * 31, 31, this.items), 31, this.stickyItems);
        TagButtonDTO tagButtonDTO = this.selectedTagButton;
        int hashCode = (b11 + (tagButtonDTO == null ? 0 : tagButtonDTO.hashCode())) * 31;
        TagButtonDTO tagButtonDTO2 = this.defaultTagButton;
        return Integer.hashCode(this.selectedPosition) + ((hashCode + (tagButtonDTO2 != null ? tagButtonDTO2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<FiltersItem> list = this.items;
        List<StickyFiltersItem> list2 = this.stickyItems;
        TagButtonDTO tagButtonDTO = this.selectedTagButton;
        TagButtonDTO tagButtonDTO2 = this.defaultTagButton;
        int i11 = this.selectedPosition;
        StringBuilder b11 = b.b(j11, "HotelsGalleryFiltersVI(id=", ", items=", list);
        b11.append(", stickyItems=");
        b11.append(list2);
        b11.append(", selectedTagButton=");
        b11.append(tagButtonDTO);
        b11.append(", defaultTagButton=");
        b11.append(tagButtonDTO2);
        b11.append(", selectedPosition=");
        b11.append(i11);
        b11.append(")");
        return b11.toString();
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0012\u0010\u0013JL\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u001f\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010(R\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010)\u001a\u0004\b\f\u0010*\"\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/HotelsGalleryFiltersVI$StickyFiltersItem;", "", "", "id", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "tagButton", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "isViewEventSent", "<init>", "(ILru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;LWZ/t;Lru/ozon/uni/atoms/af/AtomAction;Z)V", "isSelected", "selectedTagButton", "defaultTagButton", "withSelected", "(ZLru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/HotelsGalleryFiltersVI$StickyFiltersItem;", "copy", "(ILru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;LWZ/t;Lru/ozon/uni/atoms/af/AtomAction;Z)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/HotelsGalleryFiltersVI$StickyFiltersItem;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "getTagButton", "()Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Z", "()Z", "setViewEventSent", "(Z)V", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StickyFiltersItem {
        private final AtomAction action;
        private final int id;
        private boolean isViewEventSent;

        @NotNull
        private final TagButtonDTO tagButton;
        private final t tokenizedEvent;

        public StickyFiltersItem(int i11, @NotNull TagButtonDTO tagButton, t tVar, AtomAction atomAction, boolean z11) {
            Intrinsics.checkNotNullParameter(tagButton, "tagButton");
            this.id = i11;
            this.tagButton = tagButton;
            this.tokenizedEvent = tVar;
            this.action = atomAction;
            this.isViewEventSent = z11;
        }

        public static /* synthetic */ StickyFiltersItem copy$default(StickyFiltersItem stickyFiltersItem, int i11, TagButtonDTO tagButtonDTO, t tVar, AtomAction atomAction, boolean z11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = stickyFiltersItem.id;
            }
            if ((i12 & 2) != 0) {
                tagButtonDTO = stickyFiltersItem.tagButton;
            }
            if ((i12 & 4) != 0) {
                tVar = stickyFiltersItem.tokenizedEvent;
            }
            if ((i12 & 8) != 0) {
                atomAction = stickyFiltersItem.action;
            }
            if ((i12 & 16) != 0) {
                z11 = stickyFiltersItem.isViewEventSent;
            }
            boolean z12 = z11;
            t tVar2 = tVar;
            return stickyFiltersItem.copy(i11, tagButtonDTO, tVar2, atomAction, z12);
        }

        @NotNull
        public final StickyFiltersItem copy(int id2, @NotNull TagButtonDTO tagButton, t tokenizedEvent, AtomAction action, boolean isViewEventSent) {
            Intrinsics.checkNotNullParameter(tagButton, "tagButton");
            return new StickyFiltersItem(id2, tagButton, tokenizedEvent, action, isViewEventSent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StickyFiltersItem)) {
                return false;
            }
            StickyFiltersItem stickyFiltersItem = (StickyFiltersItem) other;
            return this.id == stickyFiltersItem.id && Intrinsics.d(this.tagButton, stickyFiltersItem.tagButton) && Intrinsics.d(this.tokenizedEvent, stickyFiltersItem.tokenizedEvent) && Intrinsics.d(this.action, stickyFiltersItem.action) && this.isViewEventSent == stickyFiltersItem.isViewEventSent;
        }

        public final int getId() {
            return this.id;
        }

        @NotNull
        public final TagButtonDTO getTagButton() {
            return this.tagButton;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            int hashCode = (this.tagButton.hashCode() + (Integer.hashCode(this.id) * 31)) * 31;
            t tVar = this.tokenizedEvent;
            int hashCode2 = (hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31;
            AtomAction atomAction = this.action;
            return Boolean.hashCode(this.isViewEventSent) + ((hashCode2 + (atomAction != null ? atomAction.hashCode() : 0)) * 31);
        }

        /* renamed from: isViewEventSent, reason: from getter */
        public final boolean getIsViewEventSent() {
            return this.isViewEventSent;
        }

        public final void setViewEventSent(boolean z11) {
            this.isViewEventSent = z11;
        }

        @NotNull
        public String toString() {
            int i11 = this.id;
            TagButtonDTO tagButtonDTO = this.tagButton;
            t tVar = this.tokenizedEvent;
            AtomAction atomAction = this.action;
            boolean z11 = this.isViewEventSent;
            StringBuilder sb2 = new StringBuilder("StickyFiltersItem(id=");
            sb2.append(i11);
            sb2.append(", tagButton=");
            sb2.append(tagButtonDTO);
            sb2.append(", tokenizedEvent=");
            sb2.append(tVar);
            sb2.append(", action=");
            sb2.append(atomAction);
            sb2.append(", isViewEventSent=");
            return a.a(")", sb2, z11);
        }

        @NotNull
        public final StickyFiltersItem withSelected(boolean isSelected, TagButtonDTO selectedTagButton, TagButtonDTO defaultTagButton) {
            TagButtonDTO copy;
            TagButtonDTO tagButtonDTO;
            TagButtonDTO copy2;
            if (isSelected && selectedTagButton != null) {
                tagButtonDTO = selectedTagButton;
            } else {
                if (isSelected || defaultTagButton == null) {
                    copy = r2.copy((r34 & 1) != 0 ? r2.styleType : null, (r34 & 2) != 0 ? r2.size : null, (r34 & 4) != 0 ? r2.isSelected : Boolean.valueOf(isSelected), (r34 & 8) != 0 ? r2.isDisabled : null, (r34 & 16) != 0 ? r2.isClosable : null, (r34 & 32) != 0 ? r2.icon : null, (r34 & 64) != 0 ? r2.text : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r2.indicator : null, (r34 & 256) != 0 ? r2.customDefaultStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r2.customSelectedStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r2.common : null, (r34 & 2048) != 0 ? r2.closeControlSettings : null, (r34 & 4096) != 0 ? r2.context : null, (r34 & 8192) != 0 ? r2.isStateChangeDisabled : null, (r34 & 16384) != 0 ? r2.image : null, (r34 & 32768) != 0 ? this.tagButton.round : null);
                    return copy$default(this, 0, copy, null, null, false, 29, null);
                }
                tagButtonDTO = defaultTagButton;
            }
            String text = this.tagButton.getText();
            IndicatorDTO indicator = this.tagButton.getIndicator();
            String text2 = indicator != null ? indicator.getText() : null;
            IndicatorDTO indicator2 = tagButtonDTO.getIndicator();
            copy2 = tagButtonDTO.copy((r34 & 1) != 0 ? tagButtonDTO.styleType : null, (r34 & 2) != 0 ? tagButtonDTO.size : null, (r34 & 4) != 0 ? tagButtonDTO.isSelected : Boolean.valueOf(isSelected), (r34 & 8) != 0 ? tagButtonDTO.isDisabled : null, (r34 & 16) != 0 ? tagButtonDTO.isClosable : null, (r34 & 32) != 0 ? tagButtonDTO.icon : null, (r34 & 64) != 0 ? tagButtonDTO.text : text, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? tagButtonDTO.indicator : indicator2 != null ? IndicatorDTO.copy$default(indicator2, text2, null, null, null, null, null, null, null, null, null, null, 2046, null) : null, (r34 & 256) != 0 ? tagButtonDTO.customDefaultStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? tagButtonDTO.customSelectedStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? tagButtonDTO.common : null, (r34 & 2048) != 0 ? tagButtonDTO.closeControlSettings : null, (r34 & 4096) != 0 ? tagButtonDTO.context : null, (r34 & 8192) != 0 ? tagButtonDTO.isStateChangeDisabled : null, (r34 & 16384) != 0 ? tagButtonDTO.image : null, (r34 & 32768) != 0 ? tagButtonDTO.round : null);
            return copy$default(this, 0, copy2, null, null, false, 29, null);
        }

        public /* synthetic */ StickyFiltersItem(int i11, TagButtonDTO tagButtonDTO, t tVar, AtomAction atomAction, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(i11, tagButtonDTO, tVar, atomAction, (i12 & 16) != 0 ? false : z11);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+R\u001f\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010,\u001a\u0004\b-\u0010.R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010/\u001a\u0004\b\u0012\u00100\"\u0004\b1\u00102¨\u00063"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/HotelsGalleryFiltersVI$FiltersItem;", "", "", "id", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "aspect", "", "image", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "", "isViewEventSent", "<init>", "(ILru/ozon/uni/atoms/data/aspect/AspectDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Z)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "getAspect", "()Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "Ljava/lang/String;", "getImage", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Z", "()Z", "setViewEventSent", "(Z)V", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FiltersItem {
        private final AtomAction action;

        @NotNull
        private final AspectDTO aspect;

        @NotNull
        private final BadgeDTO badge;
        private final int id;

        @NotNull
        private final String image;
        private boolean isViewEventSent;

        @NotNull
        private final TextDTO title;
        private final t tokenizedEvent;

        public FiltersItem(int i11, @NotNull AspectDTO aspect, @NotNull String image, @NotNull BadgeDTO badge, @NotNull TextDTO title, AtomAction atomAction, t tVar, boolean z11) {
            Intrinsics.checkNotNullParameter(aspect, "aspect");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(badge, "badge");
            Intrinsics.checkNotNullParameter(title, "title");
            this.id = i11;
            this.aspect = aspect;
            this.image = image;
            this.badge = badge;
            this.title = title;
            this.action = atomAction;
            this.tokenizedEvent = tVar;
            this.isViewEventSent = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FiltersItem)) {
                return false;
            }
            FiltersItem filtersItem = (FiltersItem) other;
            return this.id == filtersItem.id && Intrinsics.d(this.aspect, filtersItem.aspect) && Intrinsics.d(this.image, filtersItem.image) && Intrinsics.d(this.badge, filtersItem.badge) && Intrinsics.d(this.title, filtersItem.title) && Intrinsics.d(this.action, filtersItem.action) && Intrinsics.d(this.tokenizedEvent, filtersItem.tokenizedEvent) && this.isViewEventSent == filtersItem.isViewEventSent;
        }

        public final AtomAction getAction() {
            return this.action;
        }

        @NotNull
        public final AspectDTO getAspect() {
            return this.aspect;
        }

        @NotNull
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        public final int getId() {
            return this.id;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            int a11 = Ns.b.a(this.title, C3124a.c(this.badge, g.a((this.aspect.hashCode() + (Integer.hashCode(this.id) * 31)) * 31, 31, this.image), 31), 31);
            AtomAction atomAction = this.action;
            int hashCode = (a11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            t tVar = this.tokenizedEvent;
            return Boolean.hashCode(this.isViewEventSent) + ((hashCode + (tVar != null ? tVar.hashCode() : 0)) * 31);
        }

        /* renamed from: isViewEventSent, reason: from getter */
        public final boolean getIsViewEventSent() {
            return this.isViewEventSent;
        }

        public final void setViewEventSent(boolean z11) {
            this.isViewEventSent = z11;
        }

        @NotNull
        public String toString() {
            return "FiltersItem(id=" + this.id + ", aspect=" + this.aspect + ", image=" + this.image + ", badge=" + this.badge + ", title=" + this.title + ", action=" + this.action + ", tokenizedEvent=" + this.tokenizedEvent + ", isViewEventSent=" + this.isViewEventSent + ")";
        }

        public /* synthetic */ FiltersItem(int i11, AspectDTO aspectDTO, String str, BadgeDTO badgeDTO, TextDTO textDTO, AtomAction atomAction, t tVar, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(i11, aspectDTO, str, badgeDTO, textDTO, atomAction, tVar, (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? false : z11);
        }
    }
}
