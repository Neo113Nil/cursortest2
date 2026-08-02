package ru.ozon.app.android.pdp.widgets.galleryV4.presentation;

import Am.C2438a;
import B0.C2454a;
import B90.C2618u;
import Co.a;
import G.g;
import Kk.C3532b;
import Ns.b;
import Ve.C4598rp;
import WZ.t;
import android.util.Size;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import g.C6594f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.ugc.GalleryV4UgcVo;
import ru.ozon.app.android.pdpvideomolecule.data.VideoMolecule;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u00073456789B[\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014Jr\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010\u0018R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010#\u001a\u0004\b+\u0010%R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b,\u0010\u0018R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00100\u001a\u0004\b1\u00102¨\u0006:"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$Item;", "items", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4PreCreationConfig;", "preCreationConfig", "", "galleryId", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$Button;", "buttons", "backgroundColor", "LWZ/t;", "event", "", "position", "<init>", "(JLjava/util/List;Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4PreCreationConfig;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;LWZ/t;Ljava/lang/Integer;)V", "copy", "(JLjava/util/List;Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4PreCreationConfig;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;LWZ/t;Ljava/lang/Integer;)Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4PreCreationConfig;", "getPreCreationConfig", "()Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4PreCreationConfig;", "Ljava/lang/String;", "getGalleryId", "getButtons", "getBackgroundColor", "LWZ/t;", "getEvent", "()LWZ/t;", "Ljava/lang/Integer;", "getPosition", "()Ljava/lang/Integer;", "Item", "VideoEvents", "Button", "GalleryIcon", "ItemViewType", "ButtonViewType", "ContainerConfig", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class GalleryV4VO implements c {

    @NotNull
    private final String backgroundColor;
    private final List<Button> buttons;
    private final t event;

    @NotNull
    private final String galleryId;
    private final long id;

    @NotNull
    private final List<Item> items;
    private final Integer position;

    @NotNull
    private final GalleryV4PreCreationConfig preCreationConfig;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001:\u0001*BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010\u0012R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$Button;", "", "", "id", "viewType", "Lru/ozon/uni/atoms/data/button/Icon;", "icon", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$Button$OnBoarding;", "onBoarding", "", "backgroundColor", "LWZ/t;", "event", "<init>", "(IILru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$Button$OnBoarding;Ljava/lang/String;LWZ/t;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "getViewType", "Lru/ozon/uni/atoms/data/button/Icon;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$Button$OnBoarding;", "getOnBoarding", "()Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$Button$OnBoarding;", "Ljava/lang/String;", "getBackgroundColor", "LWZ/t;", "getEvent", "()LWZ/t;", "OnBoarding", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Button {

        @NotNull
        private final AtomAction action;
        private final String backgroundColor;
        private final t event;

        @NotNull
        private final Icon icon;
        private final int id;
        private final OnBoarding onBoarding;
        private final int viewType;

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001b\u0010\u0010R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$Button$OnBoarding;", "", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "", "daysToShowAgain", "textWidth", "", "notHidableOnboarding", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;IIZ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "I", "getDaysToShowAgain", "getTextWidth", "Z", "getNotHidableOnboarding", "()Z", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OnBoarding {
            private final int daysToShowAgain;

            @NotNull
            private final String id;
            private final boolean notHidableOnboarding;

            @NotNull
            private final TextDTO text;
            private final int textWidth;

            public OnBoarding(@NotNull String id2, @NotNull TextDTO text, int i11, int i12, boolean z11) {
                Intrinsics.checkNotNullParameter(id2, "id");
                Intrinsics.checkNotNullParameter(text, "text");
                this.id = id2;
                this.text = text;
                this.daysToShowAgain = i11;
                this.textWidth = i12;
                this.notHidableOnboarding = z11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OnBoarding)) {
                    return false;
                }
                OnBoarding onBoarding = (OnBoarding) other;
                return Intrinsics.d(this.id, onBoarding.id) && Intrinsics.d(this.text, onBoarding.text) && this.daysToShowAgain == onBoarding.daysToShowAgain && this.textWidth == onBoarding.textWidth && this.notHidableOnboarding == onBoarding.notHidableOnboarding;
            }

            public final int getDaysToShowAgain() {
                return this.daysToShowAgain;
            }

            @NotNull
            public final String getId() {
                return this.id;
            }

            public final boolean getNotHidableOnboarding() {
                return this.notHidableOnboarding;
            }

            @NotNull
            public final TextDTO getText() {
                return this.text;
            }

            public final int getTextWidth() {
                return this.textWidth;
            }

            public int hashCode() {
                return Boolean.hashCode(this.notHidableOnboarding) + C2454a.a(this.textWidth, C2454a.a(this.daysToShowAgain, b.a(this.text, this.id.hashCode() * 31, 31), 31), 31);
            }

            @NotNull
            public String toString() {
                String str = this.id;
                TextDTO textDTO = this.text;
                int i11 = this.daysToShowAgain;
                int i12 = this.textWidth;
                boolean z11 = this.notHidableOnboarding;
                StringBuilder b11 = a.b("OnBoarding(id=", textDTO, str, ", text=", ", daysToShowAgain=");
                Ek.a.f(i11, i12, ", textWidth=", ", notHidableOnboarding=", b11);
                return Pk0.a.a(")", b11, z11);
            }
        }

        public Button(int i11, int i12, @NotNull Icon icon, @NotNull AtomAction action, OnBoarding onBoarding, String str, t tVar) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(action, "action");
            this.id = i11;
            this.viewType = i12;
            this.icon = icon;
            this.action = action;
            this.onBoarding = onBoarding;
            this.backgroundColor = str;
            this.event = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Button)) {
                return false;
            }
            Button button = (Button) other;
            return this.id == button.id && this.viewType == button.viewType && Intrinsics.d(this.icon, button.icon) && Intrinsics.d(this.action, button.action) && Intrinsics.d(this.onBoarding, button.onBoarding) && Intrinsics.d(this.backgroundColor, button.backgroundColor) && Intrinsics.d(this.event, button.event);
        }

        @NotNull
        public final AtomAction getAction() {
            return this.action;
        }

        public final t getEvent() {
            return this.event;
        }

        @NotNull
        public final Icon getIcon() {
            return this.icon;
        }

        public int getId() {
            return this.id;
        }

        public final OnBoarding getOnBoarding() {
            return this.onBoarding;
        }

        public int getViewType() {
            return this.viewType;
        }

        public int hashCode() {
            int a11 = C4598rp.a(this.action, Lc.a.a(this.icon, C2454a.a(this.viewType, Integer.hashCode(this.id) * 31, 31), 31), 31);
            OnBoarding onBoarding = this.onBoarding;
            int hashCode = (a11 + (onBoarding == null ? 0 : onBoarding.hashCode())) * 31;
            String str = this.backgroundColor;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            t tVar = this.event;
            return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            int i11 = this.id;
            int i12 = this.viewType;
            Icon icon = this.icon;
            AtomAction atomAction = this.action;
            OnBoarding onBoarding = this.onBoarding;
            String str = this.backgroundColor;
            t tVar = this.event;
            StringBuilder a11 = C2438a.a("Button(id=", i11, ", viewType=", ", icon=", i12);
            a11.append(icon);
            a11.append(", action=");
            a11.append(atomAction);
            a11.append(", onBoarding=");
            a11.append(onBoarding);
            a11.append(", backgroundColor=");
            a11.append(str);
            a11.append(", event=");
            return Tl.b.d(a11, tVar, ")");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$ButtonViewType;", "", "<init>", "(Ljava/lang/String;I)V", "SINGLE", "ON_BOARDING", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ButtonViewType {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ ButtonViewType[] $VALUES;
        public static final ButtonViewType SINGLE = new ButtonViewType("SINGLE", 0);
        public static final ButtonViewType ON_BOARDING = new ButtonViewType("ON_BOARDING", 1);

        private static final /* synthetic */ ButtonViewType[] $values() {
            return new ButtonViewType[]{SINGLE, ON_BOARDING};
        }

        static {
            ButtonViewType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private ButtonViewType(String str, int i11) {
        }

        public static ButtonViewType valueOf(String str) {
            return (ButtonViewType) Enum.valueOf(ButtonViewType.class, str);
        }

        public static ButtonViewType[] values() {
            return (ButtonViewType[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$ContainerConfig;", "", "", "containerHeight", "containerWidth", "<init>", "(ILjava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getContainerHeight", "Ljava/lang/Integer;", "getContainerWidth", "()Ljava/lang/Integer;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ContainerConfig {
        private final int containerHeight;
        private final Integer containerWidth;

        public ContainerConfig(int i11, Integer num) {
            this.containerHeight = i11;
            this.containerWidth = num;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContainerConfig)) {
                return false;
            }
            ContainerConfig containerConfig = (ContainerConfig) other;
            return this.containerHeight == containerConfig.containerHeight && Intrinsics.d(this.containerWidth, containerConfig.containerWidth);
        }

        public final int getContainerHeight() {
            return this.containerHeight;
        }

        public final Integer getContainerWidth() {
            return this.containerWidth;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.containerHeight) * 31;
            Integer num = this.containerWidth;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        @NotNull
        public String toString() {
            return "ContainerConfig(containerHeight=" + this.containerHeight + ", containerWidth=" + this.containerWidth + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$GalleryIcon;", "", "", "image", "", "tintColor", "<init>", "(Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImage", "I", "getTintColor", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GalleryIcon {

        @NotNull
        private final String image;
        private final int tintColor;

        public GalleryIcon(@NotNull String image, int i11) {
            Intrinsics.checkNotNullParameter(image, "image");
            this.image = image;
            this.tintColor = i11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GalleryIcon)) {
                return false;
            }
            GalleryIcon galleryIcon = (GalleryIcon) other;
            return Intrinsics.d(this.image, galleryIcon.image) && this.tintColor == galleryIcon.tintColor;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        public final int getTintColor() {
            return this.tintColor;
        }

        public int hashCode() {
            return Integer.hashCode(this.tintColor) + (this.image.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return C2618u.f(this.tintColor, "GalleryIcon(image=", this.image, ", tintColor=", ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\u0082\u0001\u0004\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$Item;", "", "<init>", "()V", "", "getId", "()I", "id", "getViewType", "viewType", "Image", "Video", "Ugc", "Info", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$Item$Image;", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$Item$Info;", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$Item$Ugc;", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$Item$Video;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Item {

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001f\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b*\u0010\u0012¨\u0006+"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$Item$Image;", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$Item;", "", "id", "", "parentId", "viewType", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$ContainerConfig;", "containerConfig", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "event", "", ImagesContract.URL, "<init>", "(IJILru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$ContainerConfig;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "J", "getParentId", "()J", "getViewType", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$ContainerConfig;", "getContainerConfig", "()Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$ContainerConfig;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getEvent", "()LWZ/t;", "Ljava/lang/String;", "getUrl", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Image extends Item {
            private final AtomAction action;

            @NotNull
            private final ContainerConfig containerConfig;
            private final t event;
            private final int id;
            private final long parentId;

            @NotNull
            private final String url;
            private final int viewType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Image(int i11, long j11, int i12, @NotNull ContainerConfig containerConfig, AtomAction atomAction, t tVar, @NotNull String url) {
                super(null);
                Intrinsics.checkNotNullParameter(containerConfig, "containerConfig");
                Intrinsics.checkNotNullParameter(url, "url");
                this.id = i11;
                this.parentId = j11;
                this.viewType = i12;
                this.containerConfig = containerConfig;
                this.action = atomAction;
                this.event = tVar;
                this.url = url;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Image)) {
                    return false;
                }
                Image image = (Image) other;
                return this.id == image.id && this.parentId == image.parentId && this.viewType == image.viewType && Intrinsics.d(this.containerConfig, image.containerConfig) && Intrinsics.d(this.action, image.action) && Intrinsics.d(this.event, image.event) && Intrinsics.d(this.url, image.url);
            }

            public AtomAction getAction() {
                return this.action;
            }

            @NotNull
            public ContainerConfig getContainerConfig() {
                return this.containerConfig;
            }

            public t getEvent() {
                return this.event;
            }

            @Override // ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GalleryV4VO.Item
            public int getId() {
                return this.id;
            }

            public long getParentId() {
                return this.parentId;
            }

            @NotNull
            public final String getUrl() {
                return this.url;
            }

            @Override // ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GalleryV4VO.Item
            public int getViewType() {
                return this.viewType;
            }

            public int hashCode() {
                int hashCode = (this.containerConfig.hashCode() + C2454a.a(this.viewType, Pk0.c.a(Integer.hashCode(this.id) * 31, 31, this.parentId), 31)) * 31;
                AtomAction atomAction = this.action;
                int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
                t tVar = this.event;
                return this.url.hashCode() + ((hashCode2 + (tVar != null ? tVar.hashCode() : 0)) * 31);
            }

            @NotNull
            public String toString() {
                int i11 = this.id;
                long j11 = this.parentId;
                int i12 = this.viewType;
                ContainerConfig containerConfig = this.containerConfig;
                AtomAction atomAction = this.action;
                t tVar = this.event;
                String str = this.url;
                StringBuilder sb2 = new StringBuilder("Image(id=");
                sb2.append(i11);
                sb2.append(", parentId=");
                sb2.append(j11);
                sb2.append(", viewType=");
                sb2.append(i12);
                sb2.append(", containerConfig=");
                sb2.append(containerConfig);
                Fj.c.e(tVar, ", action=", ", event=", sb2, atomAction);
                return C6594f.a(", url=", str, ")", sb2);
            }
        }

        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016Jx\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b&\u0010\u001cR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00103\u001a\u0004\b4\u0010\u001aR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00105\u001a\u0004\b\u0012\u00106R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00107\u001a\u0004\b8\u00109¨\u0006:"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$Item$Video;", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$Item;", "", "id", "", "parentId", "viewType", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$ContainerConfig;", "containerConfig", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "event", "Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;", "video", "", "previewUrl", "", "isAutoPlay", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$VideoEvents;", "videoEvents", "<init>", "(IJILru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$ContainerConfig;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;Ljava/lang/String;ZLru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$VideoEvents;)V", "copy", "(IJILru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$ContainerConfig;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;Ljava/lang/String;ZLru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$VideoEvents;)Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$Item$Video;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "J", "getParentId", "()J", "getViewType", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$ContainerConfig;", "getContainerConfig", "()Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$ContainerConfig;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getEvent", "()LWZ/t;", "Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;", "getVideo", "()Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;", "Ljava/lang/String;", "getPreviewUrl", "Z", "()Z", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$VideoEvents;", "getVideoEvents", "()Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$VideoEvents;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Video extends Item {
            private final AtomAction action;

            @NotNull
            private final ContainerConfig containerConfig;
            private final t event;
            private final int id;
            private final boolean isAutoPlay;
            private final long parentId;

            @NotNull
            private final String previewUrl;

            @NotNull
            private final VideoMolecule video;

            @NotNull
            private final VideoEvents videoEvents;
            private final int viewType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Video(int i11, long j11, int i12, @NotNull ContainerConfig containerConfig, AtomAction atomAction, t tVar, @NotNull VideoMolecule video, @NotNull String previewUrl, boolean z11, @NotNull VideoEvents videoEvents) {
                super(null);
                Intrinsics.checkNotNullParameter(containerConfig, "containerConfig");
                Intrinsics.checkNotNullParameter(video, "video");
                Intrinsics.checkNotNullParameter(previewUrl, "previewUrl");
                Intrinsics.checkNotNullParameter(videoEvents, "videoEvents");
                this.id = i11;
                this.parentId = j11;
                this.viewType = i12;
                this.containerConfig = containerConfig;
                this.action = atomAction;
                this.event = tVar;
                this.video = video;
                this.previewUrl = previewUrl;
                this.isAutoPlay = z11;
                this.videoEvents = videoEvents;
            }

            public static /* synthetic */ Video copy$default(Video video, int i11, long j11, int i12, ContainerConfig containerConfig, AtomAction atomAction, t tVar, VideoMolecule videoMolecule, String str, boolean z11, VideoEvents videoEvents, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    i11 = video.id;
                }
                if ((i13 & 2) != 0) {
                    j11 = video.parentId;
                }
                if ((i13 & 4) != 0) {
                    i12 = video.viewType;
                }
                if ((i13 & 8) != 0) {
                    containerConfig = video.containerConfig;
                }
                if ((i13 & 16) != 0) {
                    atomAction = video.action;
                }
                if ((i13 & 32) != 0) {
                    tVar = video.event;
                }
                if ((i13 & 64) != 0) {
                    videoMolecule = video.video;
                }
                if ((i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    str = video.previewUrl;
                }
                if ((i13 & 256) != 0) {
                    z11 = video.isAutoPlay;
                }
                if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                    videoEvents = video.videoEvents;
                }
                boolean z12 = z11;
                VideoEvents videoEvents2 = videoEvents;
                VideoMolecule videoMolecule2 = videoMolecule;
                String str2 = str;
                return video.copy(i11, j11, i12, containerConfig, atomAction, tVar, videoMolecule2, str2, z12, videoEvents2);
            }

            @NotNull
            public final Video copy(int id2, long parentId, int viewType, @NotNull ContainerConfig containerConfig, AtomAction action, t event, @NotNull VideoMolecule video, @NotNull String previewUrl, boolean isAutoPlay, @NotNull VideoEvents videoEvents) {
                Intrinsics.checkNotNullParameter(containerConfig, "containerConfig");
                Intrinsics.checkNotNullParameter(video, "video");
                Intrinsics.checkNotNullParameter(previewUrl, "previewUrl");
                Intrinsics.checkNotNullParameter(videoEvents, "videoEvents");
                return new Video(id2, parentId, viewType, containerConfig, action, event, video, previewUrl, isAutoPlay, videoEvents);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Video)) {
                    return false;
                }
                Video video = (Video) other;
                return this.id == video.id && this.parentId == video.parentId && this.viewType == video.viewType && Intrinsics.d(this.containerConfig, video.containerConfig) && Intrinsics.d(this.action, video.action) && Intrinsics.d(this.event, video.event) && Intrinsics.d(this.video, video.video) && Intrinsics.d(this.previewUrl, video.previewUrl) && this.isAutoPlay == video.isAutoPlay && Intrinsics.d(this.videoEvents, video.videoEvents);
            }

            public AtomAction getAction() {
                return this.action;
            }

            @NotNull
            public ContainerConfig getContainerConfig() {
                return this.containerConfig;
            }

            public t getEvent() {
                return this.event;
            }

            @Override // ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GalleryV4VO.Item
            public int getId() {
                return this.id;
            }

            @NotNull
            public final String getPreviewUrl() {
                return this.previewUrl;
            }

            @NotNull
            public final VideoMolecule getVideo() {
                return this.video;
            }

            @NotNull
            public final VideoEvents getVideoEvents() {
                return this.videoEvents;
            }

            @Override // ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GalleryV4VO.Item
            public int getViewType() {
                return this.viewType;
            }

            public int hashCode() {
                int hashCode = (this.containerConfig.hashCode() + C2454a.a(this.viewType, Pk0.c.a(Integer.hashCode(this.id) * 31, 31, this.parentId), 31)) * 31;
                AtomAction atomAction = this.action;
                int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
                t tVar = this.event;
                return this.videoEvents.hashCode() + C3532b.a(g.a((this.video.hashCode() + ((hashCode2 + (tVar != null ? tVar.hashCode() : 0)) * 31)) * 31, 31, this.previewUrl), 31, this.isAutoPlay);
            }

            @NotNull
            public String toString() {
                int i11 = this.id;
                long j11 = this.parentId;
                int i12 = this.viewType;
                ContainerConfig containerConfig = this.containerConfig;
                AtomAction atomAction = this.action;
                t tVar = this.event;
                VideoMolecule videoMolecule = this.video;
                String str = this.previewUrl;
                boolean z11 = this.isAutoPlay;
                VideoEvents videoEvents = this.videoEvents;
                StringBuilder sb2 = new StringBuilder("Video(id=");
                sb2.append(i11);
                sb2.append(", parentId=");
                sb2.append(j11);
                sb2.append(", viewType=");
                sb2.append(i12);
                sb2.append(", containerConfig=");
                sb2.append(containerConfig);
                Fj.c.e(tVar, ", action=", ", event=", sb2, atomAction);
                sb2.append(", video=");
                sb2.append(videoMolecule);
                sb2.append(", previewUrl=");
                sb2.append(str);
                sb2.append(", isAutoPlay=");
                sb2.append(z11);
                sb2.append(", videoEvents=");
                sb2.append(videoEvents);
                sb2.append(")");
                return sb2.toString();
            }
        }

        public /* synthetic */ Item(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract int getId();

        public abstract int getViewType();

        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b$\u0010\u001aR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00104\u001a\u0004\b5\u0010\u0018R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00106\u001a\u0004\b\u0014\u00107¨\u00068"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$Item$Info;", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$Item;", "", "id", "", "parentId", "viewType", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$ContainerConfig;", "containerConfig", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "event", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/button/Icon;", "icon", "", "backgroundColor", "", "isBigState", "<init>", "(IJILru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$ContainerConfig;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/button/Icon;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "J", "getParentId", "()J", "getViewType", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$ContainerConfig;", "getContainerConfig", "()Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$ContainerConfig;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/button/Icon;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "Ljava/lang/String;", "getBackgroundColor", "Z", "()Z", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Info extends Item {
            private final AtomAction action;

            @NotNull
            private final String backgroundColor;

            @NotNull
            private final ContainerConfig containerConfig;
            private final t event;
            private final Icon icon;
            private final int id;
            private final boolean isBigState;
            private final long parentId;

            @NotNull
            private final TextDTO title;
            private final int viewType;

            public /* synthetic */ Info(int i11, long j11, int i12, ContainerConfig containerConfig, AtomAction atomAction, t tVar, TextDTO textDTO, Icon icon, String str, boolean z11, int i13, DefaultConstructorMarker defaultConstructorMarker) {
                this(i11, j11, (i13 & 4) != 0 ? ItemViewType.INFO.ordinal() : i12, containerConfig, atomAction, tVar, textDTO, icon, str, z11);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Info)) {
                    return false;
                }
                Info info = (Info) other;
                return this.id == info.id && this.parentId == info.parentId && this.viewType == info.viewType && Intrinsics.d(this.containerConfig, info.containerConfig) && Intrinsics.d(this.action, info.action) && Intrinsics.d(this.event, info.event) && Intrinsics.d(this.title, info.title) && Intrinsics.d(this.icon, info.icon) && Intrinsics.d(this.backgroundColor, info.backgroundColor) && this.isBigState == info.isBigState;
            }

            public AtomAction getAction() {
                return this.action;
            }

            @NotNull
            public ContainerConfig getContainerConfig() {
                return this.containerConfig;
            }

            public t getEvent() {
                return this.event;
            }

            public final Icon getIcon() {
                return this.icon;
            }

            @Override // ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GalleryV4VO.Item
            public int getId() {
                return this.id;
            }

            @NotNull
            public final TextDTO getTitle() {
                return this.title;
            }

            @Override // ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GalleryV4VO.Item
            public int getViewType() {
                return this.viewType;
            }

            public int hashCode() {
                int hashCode = (this.containerConfig.hashCode() + C2454a.a(this.viewType, Pk0.c.a(Integer.hashCode(this.id) * 31, 31, this.parentId), 31)) * 31;
                AtomAction atomAction = this.action;
                int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
                t tVar = this.event;
                int a11 = b.a(this.title, (hashCode2 + (tVar == null ? 0 : tVar.hashCode())) * 31, 31);
                Icon icon = this.icon;
                return Boolean.hashCode(this.isBigState) + g.a((a11 + (icon != null ? icon.hashCode() : 0)) * 31, 31, this.backgroundColor);
            }

            /* renamed from: isBigState, reason: from getter */
            public final boolean getIsBigState() {
                return this.isBigState;
            }

            @NotNull
            public String toString() {
                int i11 = this.id;
                long j11 = this.parentId;
                int i12 = this.viewType;
                ContainerConfig containerConfig = this.containerConfig;
                AtomAction atomAction = this.action;
                t tVar = this.event;
                TextDTO textDTO = this.title;
                Icon icon = this.icon;
                String str = this.backgroundColor;
                boolean z11 = this.isBigState;
                StringBuilder sb2 = new StringBuilder("Info(id=");
                sb2.append(i11);
                sb2.append(", parentId=");
                sb2.append(j11);
                sb2.append(", viewType=");
                sb2.append(i12);
                sb2.append(", containerConfig=");
                sb2.append(containerConfig);
                Fj.c.e(tVar, ", action=", ", event=", sb2, atomAction);
                sb2.append(", title=");
                sb2.append(textDTO);
                sb2.append(", icon=");
                sb2.append(icon);
                D40.a.g(", backgroundColor=", str, ", isBigState=", sb2, z11);
                sb2.append(")");
                return sb2.toString();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Info(int i11, long j11, int i12, @NotNull ContainerConfig containerConfig, AtomAction atomAction, t tVar, @NotNull TextDTO title, Icon icon, @NotNull String backgroundColor, boolean z11) {
                super(null);
                Intrinsics.checkNotNullParameter(containerConfig, "containerConfig");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                this.id = i11;
                this.parentId = j11;
                this.viewType = i12;
                this.containerConfig = containerConfig;
                this.action = atomAction;
                this.event = tVar;
                this.title = title;
                this.icon = icon;
                this.backgroundColor = backgroundColor;
                this.isBigState = z11;
            }
        }

        @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u007f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u000e¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00162\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010 R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\u0007\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b*\u0010 R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b2\u00103R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u00104\u001a\u0004\b5\u0010\u001eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u00106\u001a\u0004\b7\u00108R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\u0014\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u00106\u001a\u0004\b<\u00108R\u001a\u0010\u0015\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u00109\u001a\u0004\b=\u0010;R\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010>\u001a\u0004\b\u0017\u0010?R\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u001a\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001a\u00104\u001a\u0004\bC\u0010\u001e¨\u0006D"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$Item$Ugc;", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$Item;", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/gallery/ugc/GalleryV4UgcVo;", "", "id", "", "parentId", "viewType", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$ContainerConfig;", "containerConfig", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "event", "", "previewUrl", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$GalleryIcon;", "previewIcon", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "titleIcon", "subtitle", "", "isVerticalState", "Landroid/util/Size;", "size", "backgroundColor", "<init>", "(IJILru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$ContainerConfig;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Ljava/lang/String;Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$GalleryIcon;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$GalleryIcon;Lru/ozon/uni/atoms/data/text/TextDTO;ZLandroid/util/Size;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "J", "getParentId", "()J", "getViewType", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$ContainerConfig;", "getContainerConfig", "()Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$ContainerConfig;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getEvent", "()LWZ/t;", "Ljava/lang/String;", "getPreviewUrl", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$GalleryIcon;", "getPreviewIcon", "()Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$GalleryIcon;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitleIcon", "getSubtitle", "Z", "()Z", "Landroid/util/Size;", "getSize", "()Landroid/util/Size;", "getBackgroundColor", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Ugc extends Item implements GalleryV4UgcVo {
            private final AtomAction action;

            @NotNull
            private final String backgroundColor;

            @NotNull
            private final ContainerConfig containerConfig;
            private final t event;
            private final int id;
            private final boolean isVerticalState;
            private final long parentId;
            private final GalleryIcon previewIcon;

            @NotNull
            private final String previewUrl;

            @NotNull
            private final Size size;

            @NotNull
            private final TextDTO subtitle;

            @NotNull
            private final TextDTO title;

            @NotNull
            private final GalleryIcon titleIcon;
            private final int viewType;

            public /* synthetic */ Ugc(int i11, long j11, int i12, ContainerConfig containerConfig, AtomAction atomAction, t tVar, String str, GalleryIcon galleryIcon, TextDTO textDTO, GalleryIcon galleryIcon2, TextDTO textDTO2, boolean z11, Size size, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
                this(i11, j11, (i13 & 4) != 0 ? ItemViewType.UGC.ordinal() : i12, containerConfig, atomAction, tVar, str, galleryIcon, textDTO, galleryIcon2, textDTO2, z11, size, str2);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Ugc)) {
                    return false;
                }
                Ugc ugc = (Ugc) other;
                return this.id == ugc.id && this.parentId == ugc.parentId && this.viewType == ugc.viewType && Intrinsics.d(this.containerConfig, ugc.containerConfig) && Intrinsics.d(this.action, ugc.action) && Intrinsics.d(this.event, ugc.event) && Intrinsics.d(this.previewUrl, ugc.previewUrl) && Intrinsics.d(this.previewIcon, ugc.previewIcon) && Intrinsics.d(this.title, ugc.title) && Intrinsics.d(this.titleIcon, ugc.titleIcon) && Intrinsics.d(this.subtitle, ugc.subtitle) && this.isVerticalState == ugc.isVerticalState && Intrinsics.d(this.size, ugc.size) && Intrinsics.d(this.backgroundColor, ugc.backgroundColor);
            }

            public AtomAction getAction() {
                return this.action;
            }

            public t getEvent() {
                return this.event;
            }

            @Override // ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GalleryV4VO.Item
            public int getId() {
                return this.id;
            }

            @Override // ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.ugc.GalleryV4UgcVo
            public GalleryIcon getPreviewIcon() {
                return this.previewIcon;
            }

            @Override // ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.ugc.GalleryV4UgcVo
            @NotNull
            public String getPreviewUrl() {
                return this.previewUrl;
            }

            @Override // ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.ugc.GalleryV4UgcVo
            @NotNull
            public Size getSize() {
                return this.size;
            }

            @Override // ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.ugc.GalleryV4UgcVo
            @NotNull
            public TextDTO getSubtitle() {
                return this.subtitle;
            }

            @Override // ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.ugc.GalleryV4UgcVo
            @NotNull
            public TextDTO getTitle() {
                return this.title;
            }

            @Override // ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.ugc.GalleryV4UgcVo
            @NotNull
            public GalleryIcon getTitleIcon() {
                return this.titleIcon;
            }

            @Override // ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GalleryV4VO.Item
            public int getViewType() {
                return this.viewType;
            }

            public int hashCode() {
                int hashCode = (this.containerConfig.hashCode() + C2454a.a(this.viewType, Pk0.c.a(Integer.hashCode(this.id) * 31, 31, this.parentId), 31)) * 31;
                AtomAction atomAction = this.action;
                int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
                t tVar = this.event;
                int a11 = g.a((hashCode2 + (tVar == null ? 0 : tVar.hashCode())) * 31, 31, this.previewUrl);
                GalleryIcon galleryIcon = this.previewIcon;
                return this.backgroundColor.hashCode() + ((this.size.hashCode() + C3532b.a(b.a(this.subtitle, (this.titleIcon.hashCode() + b.a(this.title, (a11 + (galleryIcon != null ? galleryIcon.hashCode() : 0)) * 31, 31)) * 31, 31), 31, this.isVerticalState)) * 31);
            }

            @Override // ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.ugc.GalleryV4UgcVo
            /* renamed from: isVerticalState, reason: from getter */
            public boolean getIsVerticalState() {
                return this.isVerticalState;
            }

            @NotNull
            public String toString() {
                int i11 = this.id;
                long j11 = this.parentId;
                int i12 = this.viewType;
                ContainerConfig containerConfig = this.containerConfig;
                AtomAction atomAction = this.action;
                t tVar = this.event;
                String str = this.previewUrl;
                GalleryIcon galleryIcon = this.previewIcon;
                TextDTO textDTO = this.title;
                GalleryIcon galleryIcon2 = this.titleIcon;
                TextDTO textDTO2 = this.subtitle;
                boolean z11 = this.isVerticalState;
                Size size = this.size;
                String str2 = this.backgroundColor;
                StringBuilder sb2 = new StringBuilder("Ugc(id=");
                sb2.append(i11);
                sb2.append(", parentId=");
                sb2.append(j11);
                sb2.append(", viewType=");
                sb2.append(i12);
                sb2.append(", containerConfig=");
                sb2.append(containerConfig);
                Fj.c.e(tVar, ", action=", ", event=", sb2, atomAction);
                sb2.append(", previewUrl=");
                sb2.append(str);
                sb2.append(", previewIcon=");
                sb2.append(galleryIcon);
                sb2.append(", title=");
                sb2.append(textDTO);
                sb2.append(", titleIcon=");
                sb2.append(galleryIcon2);
                sb2.append(", subtitle=");
                sb2.append(textDTO2);
                sb2.append(", isVerticalState=");
                sb2.append(z11);
                sb2.append(", size=");
                sb2.append(size);
                sb2.append(", backgroundColor=");
                sb2.append(str2);
                sb2.append(")");
                return sb2.toString();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Ugc(int i11, long j11, int i12, @NotNull ContainerConfig containerConfig, AtomAction atomAction, t tVar, @NotNull String previewUrl, GalleryIcon galleryIcon, @NotNull TextDTO title, @NotNull GalleryIcon titleIcon, @NotNull TextDTO subtitle, boolean z11, @NotNull Size size, @NotNull String backgroundColor) {
                super(null);
                Intrinsics.checkNotNullParameter(containerConfig, "containerConfig");
                Intrinsics.checkNotNullParameter(previewUrl, "previewUrl");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(titleIcon, "titleIcon");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                Intrinsics.checkNotNullParameter(size, "size");
                Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                this.id = i11;
                this.parentId = j11;
                this.viewType = i12;
                this.containerConfig = containerConfig;
                this.action = atomAction;
                this.event = tVar;
                this.previewUrl = previewUrl;
                this.previewIcon = galleryIcon;
                this.title = title;
                this.titleIcon = titleIcon;
                this.subtitle = subtitle;
                this.isVerticalState = z11;
                this.size = size;
                this.backgroundColor = backgroundColor;
            }
        }

        private Item() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$ItemViewType;", "", "<init>", "(Ljava/lang/String;I)V", "IMAGE", "VIDEO", "UGC", "INFO", "WAVE_IMAGE", "WAVE_VIDEO", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ItemViewType {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ ItemViewType[] $VALUES;
        public static final ItemViewType IMAGE = new ItemViewType("IMAGE", 0);
        public static final ItemViewType VIDEO = new ItemViewType("VIDEO", 1);
        public static final ItemViewType UGC = new ItemViewType("UGC", 2);
        public static final ItemViewType INFO = new ItemViewType("INFO", 3);
        public static final ItemViewType WAVE_IMAGE = new ItemViewType("WAVE_IMAGE", 4);
        public static final ItemViewType WAVE_VIDEO = new ItemViewType("WAVE_VIDEO", 5);

        private static final /* synthetic */ ItemViewType[] $values() {
            return new ItemViewType[]{IMAGE, VIDEO, UGC, INFO, WAVE_IMAGE, WAVE_VIDEO};
        }

        static {
            ItemViewType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private ItemViewType(String str, int i11) {
        }

        public static ItemViewType valueOf(String str) {
            return (ItemViewType) Enum.valueOf(ItemViewType.class, str);
        }

        public static ItemViewType[] values() {
            return (ItemViewType[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$VideoEvents;", "", "LWZ/t;", "startVideo", "endVideo", "<init>", "(LWZ/t;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LWZ/t;", "getStartVideo", "()LWZ/t;", "getEndVideo", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class VideoEvents {
        private final t endVideo;
        private final t startVideo;

        public VideoEvents(t tVar, t tVar2) {
            this.startVideo = tVar;
            this.endVideo = tVar2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VideoEvents)) {
                return false;
            }
            VideoEvents videoEvents = (VideoEvents) other;
            return Intrinsics.d(this.startVideo, videoEvents.startVideo) && Intrinsics.d(this.endVideo, videoEvents.endVideo);
        }

        public final t getEndVideo() {
            return this.endVideo;
        }

        public final t getStartVideo() {
            return this.startVideo;
        }

        public int hashCode() {
            t tVar = this.startVideo;
            int hashCode = (tVar == null ? 0 : tVar.hashCode()) * 31;
            t tVar2 = this.endVideo;
            return hashCode + (tVar2 != null ? tVar2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "VideoEvents(startVideo=" + this.startVideo + ", endVideo=" + this.endVideo + ")";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GalleryV4VO(long j11, @NotNull List<? extends Item> items, @NotNull GalleryV4PreCreationConfig preCreationConfig, @NotNull String galleryId, List<Button> list, @NotNull String backgroundColor, t tVar, Integer num) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(preCreationConfig, "preCreationConfig");
        Intrinsics.checkNotNullParameter(galleryId, "galleryId");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.id = j11;
        this.items = items;
        this.preCreationConfig = preCreationConfig;
        this.galleryId = galleryId;
        this.buttons = list;
        this.backgroundColor = backgroundColor;
        this.event = tVar;
        this.position = num;
    }

    public static /* synthetic */ GalleryV4VO copy$default(GalleryV4VO galleryV4VO, long j11, List list, GalleryV4PreCreationConfig galleryV4PreCreationConfig, String str, List list2, String str2, t tVar, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = galleryV4VO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            list = galleryV4VO.items;
        }
        List list3 = list;
        if ((i11 & 4) != 0) {
            galleryV4PreCreationConfig = galleryV4VO.preCreationConfig;
        }
        GalleryV4PreCreationConfig galleryV4PreCreationConfig2 = galleryV4PreCreationConfig;
        if ((i11 & 8) != 0) {
            str = galleryV4VO.galleryId;
        }
        return galleryV4VO.copy(j12, list3, galleryV4PreCreationConfig2, str, (i11 & 16) != 0 ? galleryV4VO.buttons : list2, (i11 & 32) != 0 ? galleryV4VO.backgroundColor : str2, (i11 & 64) != 0 ? galleryV4VO.event : tVar, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? galleryV4VO.position : num);
    }

    @NotNull
    public final GalleryV4VO copy(long id2, @NotNull List<? extends Item> items, @NotNull GalleryV4PreCreationConfig preCreationConfig, @NotNull String galleryId, List<Button> buttons, @NotNull String backgroundColor, t event, Integer position) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(preCreationConfig, "preCreationConfig");
        Intrinsics.checkNotNullParameter(galleryId, "galleryId");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        return new GalleryV4VO(id2, items, preCreationConfig, galleryId, buttons, backgroundColor, event, position);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GalleryV4VO)) {
            return false;
        }
        GalleryV4VO galleryV4VO = (GalleryV4VO) other;
        return this.id == galleryV4VO.id && Intrinsics.d(this.items, galleryV4VO.items) && Intrinsics.d(this.preCreationConfig, galleryV4VO.preCreationConfig) && Intrinsics.d(this.galleryId, galleryV4VO.galleryId) && Intrinsics.d(this.buttons, galleryV4VO.buttons) && Intrinsics.d(this.backgroundColor, galleryV4VO.backgroundColor) && Intrinsics.d(this.event, galleryV4VO.event) && Intrinsics.d(this.position, galleryV4VO.position);
    }

    public final List<Button> getButtons() {
        return this.buttons;
    }

    public final t getEvent() {
        return this.event;
    }

    @NotNull
    public final String getGalleryId() {
        return this.galleryId;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<Item> getItems() {
        return this.items;
    }

    public final Integer getPosition() {
        return this.position;
    }

    @NotNull
    public final GalleryV4PreCreationConfig getPreCreationConfig() {
        return this.preCreationConfig;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = g.a((this.preCreationConfig.hashCode() + g.b(Long.hashCode(this.id) * 31, 31, this.items)) * 31, 31, this.galleryId);
        List<Button> list = this.buttons;
        int a12 = g.a((a11 + (list == null ? 0 : list.hashCode())) * 31, 31, this.backgroundColor);
        t tVar = this.event;
        int hashCode = (a12 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        Integer num = this.position;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<Item> list = this.items;
        GalleryV4PreCreationConfig galleryV4PreCreationConfig = this.preCreationConfig;
        String str = this.galleryId;
        List<Button> list2 = this.buttons;
        String str2 = this.backgroundColor;
        t tVar = this.event;
        Integer num = this.position;
        StringBuilder b11 = Lh.b.b(j11, "GalleryV4VO(id=", ", items=", list);
        b11.append(", preCreationConfig=");
        b11.append(galleryV4PreCreationConfig);
        b11.append(", galleryId=");
        b11.append(str);
        b11.append(", buttons=");
        b11.append(list2);
        b11.append(", backgroundColor=");
        b11.append(str2);
        b11.append(", event=");
        b11.append(tVar);
        b11.append(", position=");
        b11.append(num);
        b11.append(")");
        return b11.toString();
    }

    public /* synthetic */ GalleryV4VO(long j11, List list, GalleryV4PreCreationConfig galleryV4PreCreationConfig, String str, List list2, String str2, t tVar, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, list, galleryV4PreCreationConfig, str, list2, str2, tVar, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : num);
    }
}
