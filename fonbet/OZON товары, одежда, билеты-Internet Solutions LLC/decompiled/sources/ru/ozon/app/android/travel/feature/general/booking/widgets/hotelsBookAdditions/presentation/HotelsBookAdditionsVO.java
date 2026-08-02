package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.presentation;

import G.g;
import J0.C3349u1;
import Kk.C3532b;
import TY.a;
import Tl.b;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u00014BU\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u000e\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011¢\u0006\u0004\b\u0013\u0010\u0014Jn\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b'\u0010&R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b+\u0010*R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b\f\u0010-R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b/\u00100R\u001f\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00101\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/HotelsBookAdditionsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "collapsedIconButton", "expandedIconButton", "", "isOpen", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/HotelsBookAdditionsVO$FieldVO;", "fields", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;ZLjava/util/List;LWZ/t;)V", "copy", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;ZLjava/util/List;LWZ/t;)Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/HotelsBookAdditionsVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getCollapsedIconButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getExpandedIconButton", "Z", "()Z", "Ljava/util/List;", "getFields", "()Ljava/util/List;", "LWZ/t;", "getViewEvent", "()LWZ/t;", "FieldVO", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HotelsBookAdditionsVO implements c {

    @NotNull
    private final ButtonV3Atom.SmallIconButton collapsedIconButton;

    @NotNull
    private final ButtonV3Atom.SmallIconButton expandedIconButton;

    @NotNull
    private final List<FieldVO> fields;
    private final long id;
    private final boolean isOpen;

    @NotNull
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;
    private final t viewEvent;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/HotelsBookAdditionsVO$FieldVO;", "", "", "id", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO;", "input", "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "<init>", "(ILru/ozon/app/android/travel/molecules/input/v1/CommonInputVO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "copy", "(ILru/ozon/app/android/travel/molecules/input/v1/CommonInputVO;Lru/ozon/uni/atoms/data/text/TextDTO;)Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/HotelsBookAdditionsVO$FieldVO;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO;", "getInput", "()Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FieldVO {
        private final int id;

        @NotNull
        private final CommonInputVO input;
        private final TextDTO subtitle;

        public FieldVO(int i11, @NotNull CommonInputVO input, TextDTO textDTO) {
            Intrinsics.checkNotNullParameter(input, "input");
            this.id = i11;
            this.input = input;
            this.subtitle = textDTO;
        }

        public static /* synthetic */ FieldVO copy$default(FieldVO fieldVO, int i11, CommonInputVO commonInputVO, TextDTO textDTO, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = fieldVO.id;
            }
            if ((i12 & 2) != 0) {
                commonInputVO = fieldVO.input;
            }
            if ((i12 & 4) != 0) {
                textDTO = fieldVO.subtitle;
            }
            return fieldVO.copy(i11, commonInputVO, textDTO);
        }

        @NotNull
        public final FieldVO copy(int id2, @NotNull CommonInputVO input, TextDTO subtitle) {
            Intrinsics.checkNotNullParameter(input, "input");
            return new FieldVO(id2, input, subtitle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FieldVO)) {
                return false;
            }
            FieldVO fieldVO = (FieldVO) other;
            return this.id == fieldVO.id && Intrinsics.d(this.input, fieldVO.input) && Intrinsics.d(this.subtitle, fieldVO.subtitle);
        }

        public final int getId() {
            return this.id;
        }

        @NotNull
        public final CommonInputVO getInput() {
            return this.input;
        }

        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        public int hashCode() {
            int hashCode = (this.input.hashCode() + (Integer.hashCode(this.id) * 31)) * 31;
            TextDTO textDTO = this.subtitle;
            return hashCode + (textDTO == null ? 0 : textDTO.hashCode());
        }

        @NotNull
        public String toString() {
            int i11 = this.id;
            CommonInputVO commonInputVO = this.input;
            TextDTO textDTO = this.subtitle;
            StringBuilder sb2 = new StringBuilder("FieldVO(id=");
            sb2.append(i11);
            sb2.append(", input=");
            sb2.append(commonInputVO);
            sb2.append(", subtitle=");
            return b.e(sb2, textDTO, ")");
        }
    }

    public HotelsBookAdditionsVO(long j11, @NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull ButtonV3Atom.SmallIconButton collapsedIconButton, @NotNull ButtonV3Atom.SmallIconButton expandedIconButton, boolean z11, @NotNull List<FieldVO> fields, t tVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(collapsedIconButton, "collapsedIconButton");
        Intrinsics.checkNotNullParameter(expandedIconButton, "expandedIconButton");
        Intrinsics.checkNotNullParameter(fields, "fields");
        this.id = j11;
        this.title = title;
        this.subtitle = subtitle;
        this.collapsedIconButton = collapsedIconButton;
        this.expandedIconButton = expandedIconButton;
        this.isOpen = z11;
        this.fields = fields;
        this.viewEvent = tVar;
    }

    public static /* synthetic */ HotelsBookAdditionsVO copy$default(HotelsBookAdditionsVO hotelsBookAdditionsVO, long j11, TextDTO textDTO, TextDTO textDTO2, ButtonV3Atom.SmallIconButton smallIconButton, ButtonV3Atom.SmallIconButton smallIconButton2, boolean z11, List list, t tVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = hotelsBookAdditionsVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            textDTO = hotelsBookAdditionsVO.title;
        }
        TextDTO textDTO3 = textDTO;
        if ((i11 & 4) != 0) {
            textDTO2 = hotelsBookAdditionsVO.subtitle;
        }
        TextDTO textDTO4 = textDTO2;
        if ((i11 & 8) != 0) {
            smallIconButton = hotelsBookAdditionsVO.collapsedIconButton;
        }
        return hotelsBookAdditionsVO.copy(j12, textDTO3, textDTO4, smallIconButton, (i11 & 16) != 0 ? hotelsBookAdditionsVO.expandedIconButton : smallIconButton2, (i11 & 32) != 0 ? hotelsBookAdditionsVO.isOpen : z11, (i11 & 64) != 0 ? hotelsBookAdditionsVO.fields : list, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? hotelsBookAdditionsVO.viewEvent : tVar);
    }

    @NotNull
    public final HotelsBookAdditionsVO copy(long id2, @NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull ButtonV3Atom.SmallIconButton collapsedIconButton, @NotNull ButtonV3Atom.SmallIconButton expandedIconButton, boolean isOpen, @NotNull List<FieldVO> fields, t viewEvent) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(collapsedIconButton, "collapsedIconButton");
        Intrinsics.checkNotNullParameter(expandedIconButton, "expandedIconButton");
        Intrinsics.checkNotNullParameter(fields, "fields");
        return new HotelsBookAdditionsVO(id2, title, subtitle, collapsedIconButton, expandedIconButton, isOpen, fields, viewEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsBookAdditionsVO)) {
            return false;
        }
        HotelsBookAdditionsVO hotelsBookAdditionsVO = (HotelsBookAdditionsVO) other;
        return this.id == hotelsBookAdditionsVO.id && Intrinsics.d(this.title, hotelsBookAdditionsVO.title) && Intrinsics.d(this.subtitle, hotelsBookAdditionsVO.subtitle) && Intrinsics.d(this.collapsedIconButton, hotelsBookAdditionsVO.collapsedIconButton) && Intrinsics.d(this.expandedIconButton, hotelsBookAdditionsVO.expandedIconButton) && this.isOpen == hotelsBookAdditionsVO.isOpen && Intrinsics.d(this.fields, hotelsBookAdditionsVO.fields) && Intrinsics.d(this.viewEvent, hotelsBookAdditionsVO.viewEvent);
    }

    @NotNull
    public final ButtonV3Atom.SmallIconButton getCollapsedIconButton() {
        return this.collapsedIconButton;
    }

    @NotNull
    public final ButtonV3Atom.SmallIconButton getExpandedIconButton() {
        return this.expandedIconButton;
    }

    @NotNull
    public final List<FieldVO> getFields() {
        return this.fields;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final t getViewEvent() {
        return this.viewEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b(C3532b.a(C3349u1.d(this.expandedIconButton, C3349u1.d(this.collapsedIconButton, Ns.b.a(this.subtitle, Ns.b.a(this.title, Long.hashCode(this.id) * 31, 31), 31), 31), 31), 31, this.isOpen), 31, this.fields);
        t tVar = this.viewEvent;
        return b11 + (tVar == null ? 0 : tVar.hashCode());
    }

    /* renamed from: isOpen, reason: from getter */
    public final boolean getIsOpen() {
        return this.isOpen;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        ButtonV3Atom.SmallIconButton smallIconButton = this.collapsedIconButton;
        ButtonV3Atom.SmallIconButton smallIconButton2 = this.expandedIconButton;
        boolean z11 = this.isOpen;
        List<FieldVO> list = this.fields;
        t tVar = this.viewEvent;
        StringBuilder b11 = a.b("HotelsBookAdditionsVO(id=", j11, ", title=", textDTO);
        b11.append(", subtitle=");
        b11.append(textDTO2);
        b11.append(", collapsedIconButton=");
        b11.append(smallIconButton);
        b11.append(", expandedIconButton=");
        b11.append(smallIconButton2);
        b11.append(", isOpen=");
        b11.append(z11);
        Ak.b.h(b11, ", fields=", list, ", viewEvent=", tVar);
        b11.append(")");
        return b11.toString();
    }
}
