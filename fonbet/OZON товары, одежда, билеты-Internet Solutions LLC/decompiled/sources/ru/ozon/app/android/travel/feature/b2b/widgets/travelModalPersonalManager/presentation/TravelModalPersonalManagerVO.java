package ru.ozon.app.android.travel.feature.b2b.widgets.travelModalPersonalManager.presentation;

import B90.C2619v;
import Bl.C2639a;
import D40.a;
import G.g;
import Kk.C3532b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001.BY\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\f¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010\u0015R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b(\u0010\u0015R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010 \u001a\u0004\b,\u0010\"R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010)\u001a\u0004\b-\u0010+¨\u0006/"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/travelModalPersonalManager/presentation/TravelModalPersonalManagerVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "logo", "", "hasBackground", "logoBackgroundColor", "", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelModalPersonalManager/presentation/TravelModalPersonalManagerVO$AdvantageVO;", "contentList", "notificationText", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "buttons", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Ljava/lang/String;", "getLogo", "Z", "getHasBackground", "()Z", "getLogoBackgroundColor", "Ljava/util/List;", "getContentList", "()Ljava/util/List;", "getNotificationText", "getButtons", "AdvantageVO", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class TravelModalPersonalManagerVO implements c {

    @NotNull
    private final List<ButtonV3Atom.LargeButton> buttons;

    @NotNull
    private final List<AdvantageVO> contentList;
    private final boolean hasBackground;
    private final long id;
    private final String logo;
    private final String logoBackgroundColor;
    private final TextAtom notificationText;

    @NotNull
    private final TextAtom title;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/travelModalPersonalManager/presentation/TravelModalPersonalManagerVO$AdvantageVO;", "", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "text", "<init>", "(ILru/ozon/uni/atoms/data/texts/TextAtom;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* data */ class AdvantageVO {
        public static final int $stable = TextAtom.$stable;
        private final int id;

        @NotNull
        private final TextAtom text;

        public AdvantageVO(int i11, @NotNull TextAtom text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.id = i11;
            this.text = text;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdvantageVO)) {
                return false;
            }
            AdvantageVO advantageVO = (AdvantageVO) other;
            return this.id == advantageVO.id && Intrinsics.d(this.text, advantageVO.text);
        }

        public final int getId() {
            return this.id;
        }

        @NotNull
        public final TextAtom getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode() + (Integer.hashCode(this.id) * 31);
        }

        @NotNull
        public String toString() {
            return "AdvantageVO(id=" + this.id + ", text=" + this.text + ")";
        }
    }

    public TravelModalPersonalManagerVO(long j11, @NotNull TextAtom title, String str, boolean z11, String str2, @NotNull List<AdvantageVO> contentList, TextAtom textAtom, @NotNull List<ButtonV3Atom.LargeButton> buttons) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(contentList, "contentList");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.id = j11;
        this.title = title;
        this.logo = str;
        this.hasBackground = z11;
        this.logoBackgroundColor = str2;
        this.contentList = contentList;
        this.notificationText = textAtom;
        this.buttons = buttons;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelModalPersonalManagerVO)) {
            return false;
        }
        TravelModalPersonalManagerVO travelModalPersonalManagerVO = (TravelModalPersonalManagerVO) other;
        return this.id == travelModalPersonalManagerVO.id && Intrinsics.d(this.title, travelModalPersonalManagerVO.title) && Intrinsics.d(this.logo, travelModalPersonalManagerVO.logo) && this.hasBackground == travelModalPersonalManagerVO.hasBackground && Intrinsics.d(this.logoBackgroundColor, travelModalPersonalManagerVO.logoBackgroundColor) && Intrinsics.d(this.contentList, travelModalPersonalManagerVO.contentList) && Intrinsics.d(this.notificationText, travelModalPersonalManagerVO.notificationText) && Intrinsics.d(this.buttons, travelModalPersonalManagerVO.buttons);
    }

    @NotNull
    public final List<ButtonV3Atom.LargeButton> getButtons() {
        return this.buttons;
    }

    @NotNull
    public final List<AdvantageVO> getContentList() {
        return this.contentList;
    }

    public final boolean getHasBackground() {
        return this.hasBackground;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final String getLogo() {
        return this.logo;
    }

    public final String getLogoBackgroundColor() {
        return this.logoBackgroundColor;
    }

    public final TextAtom getNotificationText() {
        return this.notificationText;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = C2619v.b(Long.hashCode(this.id) * 31, 31, this.title);
        String str = this.logo;
        int a11 = C3532b.a((b11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.hasBackground);
        String str2 = this.logoBackgroundColor;
        int b12 = g.b((a11 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.contentList);
        TextAtom textAtom = this.notificationText;
        return this.buttons.hashCode() + ((b12 + (textAtom != null ? textAtom.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.title;
        String str = this.logo;
        boolean z11 = this.hasBackground;
        String str2 = this.logoBackgroundColor;
        List<AdvantageVO> list = this.contentList;
        TextAtom textAtom2 = this.notificationText;
        List<ButtonV3Atom.LargeButton> list2 = this.buttons;
        StringBuilder c11 = C2639a.c("TravelModalPersonalManagerVO(id=", j11, ", title=", textAtom);
        a.g(", logo=", str, ", hasBackground=", c11, z11);
        Nh.a.g(", logoBackgroundColor=", str2, ", contentList=", c11, list);
        c11.append(", notificationText=");
        c11.append(textAtom2);
        c11.append(", buttons=");
        c11.append(list2);
        c11.append(")");
        return c11.toString();
    }
}
