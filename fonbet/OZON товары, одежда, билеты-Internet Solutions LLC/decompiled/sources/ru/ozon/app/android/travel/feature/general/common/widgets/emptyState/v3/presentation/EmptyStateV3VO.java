package ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v3.presentation;

import D3.g;
import Kk.C3532b;
import WZ.t;
import Xc.a;
import Xc.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u00019B]\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b*\u0010)R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00101\u001a\u0004\b\u0010\u00102R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00106\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/presentation/EmptyStateV3VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "message", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttons", "LWZ/t;", "viewEvent", "", "isFullAppearance", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/presentation/EmptyStateV3VO$LayoutType;", "layoutType", "Lru/ozon/uni/atoms/af/AtomAction;", "onBackPressedAction", "<init>", "(JLru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;LWZ/t;ZLru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/presentation/EmptyStateV3VO$LayoutType;Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getMessage", "Ljava/util/List;", "getButtons", "()Ljava/util/List;", "LWZ/t;", "getViewEvent", "()LWZ/t;", "Z", "()Z", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/presentation/EmptyStateV3VO$LayoutType;", "getLayoutType", "()Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/presentation/EmptyStateV3VO$LayoutType;", "Lru/ozon/uni/atoms/af/AtomAction;", "getOnBackPressedAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LayoutType", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EmptyStateV3VO implements c {
    private final List<ButtonV3DTO> buttons;
    private final long id;

    @NotNull
    private final ImageDTO image;
    private final boolean isFullAppearance;

    @NotNull
    private final LayoutType layoutType;
    private final TextDTO message;
    private final AtomAction onBackPressedAction;

    @NotNull
    private final TextDTO title;
    private final t viewEvent;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/presentation/EmptyStateV3VO$LayoutType;", "", "<init>", "(Ljava/lang/String;I)V", "CENTER_IF_SPACE", "FIXED_BOTTOM_BUTTONS", "FIXED_BOTTOM_PLACEHOLDER_AND_BUTTONS", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LayoutType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ LayoutType[] $VALUES;
        public static final LayoutType CENTER_IF_SPACE = new LayoutType("CENTER_IF_SPACE", 0);
        public static final LayoutType FIXED_BOTTOM_BUTTONS = new LayoutType("FIXED_BOTTOM_BUTTONS", 1);
        public static final LayoutType FIXED_BOTTOM_PLACEHOLDER_AND_BUTTONS = new LayoutType("FIXED_BOTTOM_PLACEHOLDER_AND_BUTTONS", 2);

        private static final /* synthetic */ LayoutType[] $values() {
            return new LayoutType[]{CENTER_IF_SPACE, FIXED_BOTTOM_BUTTONS, FIXED_BOTTOM_PLACEHOLDER_AND_BUTTONS};
        }

        static {
            LayoutType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private LayoutType(String str, int i11) {
        }

        public static LayoutType valueOf(String str) {
            return (LayoutType) Enum.valueOf(LayoutType.class, str);
        }

        public static LayoutType[] values() {
            return (LayoutType[]) $VALUES.clone();
        }
    }

    public EmptyStateV3VO(long j11, @NotNull ImageDTO image, @NotNull TextDTO title, TextDTO textDTO, List<ButtonV3DTO> list, t tVar, boolean z11, @NotNull LayoutType layoutType, AtomAction atomAction) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(layoutType, "layoutType");
        this.id = j11;
        this.image = image;
        this.title = title;
        this.message = textDTO;
        this.buttons = list;
        this.viewEvent = tVar;
        this.isFullAppearance = z11;
        this.layoutType = layoutType;
        this.onBackPressedAction = atomAction;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmptyStateV3VO)) {
            return false;
        }
        EmptyStateV3VO emptyStateV3VO = (EmptyStateV3VO) other;
        return this.id == emptyStateV3VO.id && Intrinsics.d(this.image, emptyStateV3VO.image) && Intrinsics.d(this.title, emptyStateV3VO.title) && Intrinsics.d(this.message, emptyStateV3VO.message) && Intrinsics.d(this.buttons, emptyStateV3VO.buttons) && Intrinsics.d(this.viewEvent, emptyStateV3VO.viewEvent) && this.isFullAppearance == emptyStateV3VO.isFullAppearance && this.layoutType == emptyStateV3VO.layoutType && Intrinsics.d(this.onBackPressedAction, emptyStateV3VO.onBackPressedAction);
    }

    public final List<ButtonV3DTO> getButtons() {
        return this.buttons;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final ImageDTO getImage() {
        return this.image;
    }

    @NotNull
    public final LayoutType getLayoutType() {
        return this.layoutType;
    }

    public final TextDTO getMessage() {
        return this.message;
    }

    public final AtomAction getOnBackPressedAction() {
        return this.onBackPressedAction;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = Ns.b.a(this.title, Nh.a.b(this.image, Long.hashCode(this.id) * 31, 31), 31);
        TextDTO textDTO = this.message;
        int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        List<ButtonV3DTO> list = this.buttons;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        t tVar = this.viewEvent;
        int hashCode3 = (this.layoutType.hashCode() + C3532b.a((hashCode2 + (tVar == null ? 0 : tVar.hashCode())) * 31, 31, this.isFullAppearance)) * 31;
        AtomAction atomAction = this.onBackPressedAction;
        return hashCode3 + (atomAction != null ? atomAction.hashCode() : 0);
    }

    /* renamed from: isFullAppearance, reason: from getter */
    public final boolean getIsFullAppearance() {
        return this.isFullAppearance;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ImageDTO imageDTO = this.image;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.message;
        List<ButtonV3DTO> list = this.buttons;
        t tVar = this.viewEvent;
        boolean z11 = this.isFullAppearance;
        LayoutType layoutType = this.layoutType;
        AtomAction atomAction = this.onBackPressedAction;
        StringBuilder c11 = Nh.b.c("EmptyStateV3VO(id=", j11, ", image=", imageDTO);
        g.i(", title=", ", message=", c11, textDTO, textDTO2);
        Ak.b.h(c11, ", buttons=", list, ", viewEvent=", tVar);
        c11.append(", isFullAppearance=");
        c11.append(z11);
        c11.append(", layoutType=");
        c11.append(layoutType);
        c11.append(", onBackPressedAction=");
        c11.append(atomAction);
        c11.append(")");
        return c11.toString();
    }
}
