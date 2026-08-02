package ru.ozon.app.android.pdp.widgets.deliveryV6.presentation;

import Ak.C2436a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import m10.InterfaceC8039a;
import m10.m;
import m10.o;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.pdp.ui.configurators.pdp.tab.TabEmbeddedViewObject;
import ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.sections.adapter.DeliveryV6SectionItem;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u00032\u00060\u0004j\u0002`\u00052\u00060\u0006j\u0002`\u00072\u00060\bj\u0002`\t:\u0004\r\u000e\u000f\u0010R\u0016\u0010\f\u001a\u0004\u0018\u00018\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0004\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/DeliveryV6VO;", "", "T", "Lru/ozon/app/android/pdp/ui/configurators/pdp/tab/TabEmbeddedViewObject;", "Lm10/a;", "Lru/ozon/app/android/composer/view/AppendBottom;", "Lm10/m;", "Lru/ozon/app/android/composer/view/KeepTop;", "Lm10/o;", "Lru/ozon/app/android/composer/view/WidgetComponent;", "getViewDTO", "()Ljava/lang/Object;", "viewDTO", "Placeholder", "Header", "Sections", "Footer", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/DeliveryV6VO$Footer;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/DeliveryV6VO$Header;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/DeliveryV6VO$Placeholder;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/DeliveryV6VO$Sections;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface DeliveryV6VO<T> extends TabEmbeddedViewObject, InterfaceC8039a, m, o {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static <T> Integer getScrollWidgetKey(@NotNull DeliveryV6VO<T> deliveryV6VO) {
            return TabEmbeddedViewObject.DefaultImpls.getScrollWidgetKey(deliveryV6VO);
        }

        public static <T> int getViewItemKey(@NotNull DeliveryV6VO<T> deliveryV6VO) {
            return TabEmbeddedViewObject.DefaultImpls.getViewItemKey(deliveryV6VO);
        }

        @NotNull
        public static <T> String getWidgetName(@NotNull DeliveryV6VO<T> deliveryV6VO) {
            return "pdp_delivery";
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/DeliveryV6VO$Footer;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/DeliveryV6VO;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "", "id", "", "tabGroupId", "viewDTO", "<init>", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTabGroupId", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "getViewDTO", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Footer implements DeliveryV6VO<ButtonV3Atom.SmallBorderlessButton> {
        public static final int $stable = ButtonV3Atom.SmallBorderlessButton.$stable;
        private final long id;
        private final String tabGroupId;
        private final ButtonV3Atom.SmallBorderlessButton viewDTO;

        public Footer(long j11, String str, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton) {
            this.id = j11;
            this.tabGroupId = str;
            this.viewDTO = smallBorderlessButton;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Footer)) {
                return false;
            }
            Footer footer = (Footer) other;
            return this.id == footer.id && Intrinsics.d(this.tabGroupId, footer.tabGroupId) && Intrinsics.d(this.viewDTO, footer.viewDTO);
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        @Override // l20.c
        @NotNull
        public Integer getScrollWidgetKey() {
            return DefaultImpls.getScrollWidgetKey(this);
        }

        @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.tab.TabEmbeddedViewObject
        public String getTabGroupId() {
            return this.tabGroupId;
        }

        @Override // l20.c
        public int getViewItemKey() {
            return DefaultImpls.getViewItemKey(this);
        }

        @Override // m10.o
        @NotNull
        public String getWidgetName() {
            return DefaultImpls.getWidgetName(this);
        }

        public int hashCode() {
            int hashCode = Long.hashCode(this.id) * 31;
            String str = this.tabGroupId;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.viewDTO;
            return hashCode2 + (smallBorderlessButton != null ? smallBorderlessButton.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            String str = this.tabGroupId;
            ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.viewDTO;
            StringBuilder c11 = C2436a.c(j11, "Footer(id=", ", tabGroupId=", str);
            c11.append(", viewDTO=");
            c11.append(smallBorderlessButton);
            c11.append(")");
            return c11.toString();
        }

        @Override // ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.DeliveryV6VO
        public ButtonV3Atom.SmallBorderlessButton getViewDTO() {
            return this.viewDTO;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\n\b\u0001\u0010\u0001*\u0004\u0018\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/DeliveryV6VO$Header;", "T", "", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/DeliveryV6VO;", "Title", "Button", "Annotation", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Header<T> extends DeliveryV6VO<T> {

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/DeliveryV6VO$Header$Annotation;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/DeliveryV6VO$Header;", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "", "id", "", "tabGroupId", "viewDTO", "<init>", "(JLjava/lang/String;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTabGroupId", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getViewDTO", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Annotation implements Header<DisclaimerAtom> {
            private final long id;
            private final String tabGroupId;
            private final DisclaimerAtom viewDTO;

            public Annotation(long j11, String str, DisclaimerAtom disclaimerAtom) {
                this.id = j11;
                this.tabGroupId = str;
                this.viewDTO = disclaimerAtom;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Annotation)) {
                    return false;
                }
                Annotation annotation = (Annotation) other;
                return this.id == annotation.id && Intrinsics.d(this.tabGroupId, annotation.tabGroupId) && Intrinsics.d(this.viewDTO, annotation.viewDTO);
            }

            @Override // l20.c
            public long getId() {
                return this.id;
            }

            @Override // l20.c
            @NotNull
            public Integer getScrollWidgetKey() {
                return DefaultImpls.getScrollWidgetKey(this);
            }

            @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.tab.TabEmbeddedViewObject
            public String getTabGroupId() {
                return this.tabGroupId;
            }

            @Override // l20.c
            public int getViewItemKey() {
                return DefaultImpls.getViewItemKey(this);
            }

            @Override // m10.o
            @NotNull
            public String getWidgetName() {
                return DefaultImpls.getWidgetName(this);
            }

            public int hashCode() {
                int hashCode = Long.hashCode(this.id) * 31;
                String str = this.tabGroupId;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                DisclaimerAtom disclaimerAtom = this.viewDTO;
                return hashCode2 + (disclaimerAtom != null ? disclaimerAtom.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                long j11 = this.id;
                String str = this.tabGroupId;
                DisclaimerAtom disclaimerAtom = this.viewDTO;
                StringBuilder c11 = C2436a.c(j11, "Annotation(id=", ", tabGroupId=", str);
                c11.append(", viewDTO=");
                c11.append(disclaimerAtom);
                c11.append(")");
                return c11.toString();
            }

            @Override // ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.DeliveryV6VO
            public DisclaimerAtom getViewDTO() {
                return this.viewDTO;
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/DeliveryV6VO$Header$Button;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/DeliveryV6VO$Header;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "", "id", "", "tabGroupId", "viewDTO", "<init>", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTabGroupId", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "getViewDTO", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Button implements Header<ButtonV3Atom.SmallBorderlessButton> {
            public static final int $stable = ButtonV3Atom.SmallBorderlessButton.$stable;
            private final long id;
            private final String tabGroupId;
            private final ButtonV3Atom.SmallBorderlessButton viewDTO;

            public Button(long j11, String str, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton) {
                this.id = j11;
                this.tabGroupId = str;
                this.viewDTO = smallBorderlessButton;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Button)) {
                    return false;
                }
                Button button = (Button) other;
                return this.id == button.id && Intrinsics.d(this.tabGroupId, button.tabGroupId) && Intrinsics.d(this.viewDTO, button.viewDTO);
            }

            @Override // l20.c
            public long getId() {
                return this.id;
            }

            @Override // l20.c
            @NotNull
            public Integer getScrollWidgetKey() {
                return DefaultImpls.getScrollWidgetKey(this);
            }

            @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.tab.TabEmbeddedViewObject
            public String getTabGroupId() {
                return this.tabGroupId;
            }

            @Override // l20.c
            public int getViewItemKey() {
                return DefaultImpls.getViewItemKey(this);
            }

            @Override // m10.o
            @NotNull
            public String getWidgetName() {
                return DefaultImpls.getWidgetName(this);
            }

            public int hashCode() {
                int hashCode = Long.hashCode(this.id) * 31;
                String str = this.tabGroupId;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.viewDTO;
                return hashCode2 + (smallBorderlessButton != null ? smallBorderlessButton.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                long j11 = this.id;
                String str = this.tabGroupId;
                ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.viewDTO;
                StringBuilder c11 = C2436a.c(j11, "Button(id=", ", tabGroupId=", str);
                c11.append(", viewDTO=");
                c11.append(smallBorderlessButton);
                c11.append(")");
                return c11.toString();
            }

            @Override // ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.DeliveryV6VO
            public ButtonV3Atom.SmallBorderlessButton getViewDTO() {
                return this.viewDTO;
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class DefaultImpls {
            @NotNull
            public static <T> Integer getScrollWidgetKey(@NotNull Header<T> header) {
                return DefaultImpls.getScrollWidgetKey(header);
            }

            public static <T> int getViewItemKey(@NotNull Header<T> header) {
                return DefaultImpls.getViewItemKey(header);
            }

            @NotNull
            public static <T> String getWidgetName(@NotNull Header<T> header) {
                return DefaultImpls.getWidgetName(header);
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/DeliveryV6VO$Header$Title;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/DeliveryV6VO$Header;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "", "id", "", "tabGroupId", "viewDTO", "<init>", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTabGroupId", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getViewDTO", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Title implements Header<TextDTO> {
            private final long id;
            private final String tabGroupId;
            private final TextDTO viewDTO;

            public Title(long j11, String str, TextDTO textDTO) {
                this.id = j11;
                this.tabGroupId = str;
                this.viewDTO = textDTO;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Title)) {
                    return false;
                }
                Title title = (Title) other;
                return this.id == title.id && Intrinsics.d(this.tabGroupId, title.tabGroupId) && Intrinsics.d(this.viewDTO, title.viewDTO);
            }

            @Override // l20.c
            public long getId() {
                return this.id;
            }

            @Override // l20.c
            @NotNull
            public Integer getScrollWidgetKey() {
                return DefaultImpls.getScrollWidgetKey(this);
            }

            @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.tab.TabEmbeddedViewObject
            public String getTabGroupId() {
                return this.tabGroupId;
            }

            @Override // l20.c
            public int getViewItemKey() {
                return DefaultImpls.getViewItemKey(this);
            }

            @Override // m10.o
            @NotNull
            public String getWidgetName() {
                return DefaultImpls.getWidgetName(this);
            }

            public int hashCode() {
                int hashCode = Long.hashCode(this.id) * 31;
                String str = this.tabGroupId;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                TextDTO textDTO = this.viewDTO;
                return hashCode2 + (textDTO != null ? textDTO.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                long j11 = this.id;
                String str = this.tabGroupId;
                TextDTO textDTO = this.viewDTO;
                StringBuilder c11 = C2436a.c(j11, "Title(id=", ", tabGroupId=", str);
                c11.append(", viewDTO=");
                c11.append(textDTO);
                c11.append(")");
                return c11.toString();
            }

            @Override // ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.DeliveryV6VO
            public TextDTO getViewDTO() {
                return this.viewDTO;
            }
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/DeliveryV6VO$Placeholder;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/DeliveryV6VO;", "", "", "id", "", "tabGroupId", "viewDTO", "<init>", "(JLjava/lang/String;Ljava/lang/Boolean;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTabGroupId", "Ljava/lang/Boolean;", "getViewDTO", "()Ljava/lang/Boolean;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Placeholder implements DeliveryV6VO<Boolean> {
        private final long id;
        private final String tabGroupId;
        private final Boolean viewDTO;

        public Placeholder(long j11, String str, Boolean bool) {
            this.id = j11;
            this.tabGroupId = str;
            this.viewDTO = bool;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Placeholder)) {
                return false;
            }
            Placeholder placeholder = (Placeholder) other;
            return this.id == placeholder.id && Intrinsics.d(this.tabGroupId, placeholder.tabGroupId) && Intrinsics.d(this.viewDTO, placeholder.viewDTO);
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        @Override // l20.c
        @NotNull
        public Integer getScrollWidgetKey() {
            return DefaultImpls.getScrollWidgetKey(this);
        }

        @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.tab.TabEmbeddedViewObject
        public String getTabGroupId() {
            return this.tabGroupId;
        }

        @Override // l20.c
        public int getViewItemKey() {
            return DefaultImpls.getViewItemKey(this);
        }

        @Override // m10.o
        @NotNull
        public String getWidgetName() {
            return DefaultImpls.getWidgetName(this);
        }

        public int hashCode() {
            int hashCode = Long.hashCode(this.id) * 31;
            String str = this.tabGroupId;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.viewDTO;
            return hashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            String str = this.tabGroupId;
            Boolean bool = this.viewDTO;
            StringBuilder c11 = C2436a.c(j11, "Placeholder(id=", ", tabGroupId=", str);
            c11.append(", viewDTO=");
            c11.append(bool);
            c11.append(")");
            return c11.toString();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.DeliveryV6VO
        public Boolean getViewDTO() {
            return this.viewDTO;
        }

        public /* synthetic */ Placeholder(long j11, String str, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(j11, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? Boolean.TRUE : bool);
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B?\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u000fR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/DeliveryV6VO$Sections;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/DeliveryV6VO;", "", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/DeliveryV6SectionItem;", "", "id", "", "tabGroupId", "viewDTO", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(JLjava/lang/String;Ljava/util/List;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTabGroupId", "Ljava/util/List;", "getViewDTO", "()Ljava/util/List;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Sections implements DeliveryV6VO<List<? extends DeliveryV6SectionItem>> {
        private final long id;
        private final String tabGroupId;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final List<DeliveryV6SectionItem> viewDTO;

        /* JADX WARN: Multi-variable type inference failed */
        public Sections(long j11, String str, List<? extends DeliveryV6SectionItem> list, Map<String, TokenizedTrackingInfo> map) {
            this.id = j11;
            this.tabGroupId = str;
            this.viewDTO = list;
            this.trackingInfo = map;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Sections)) {
                return false;
            }
            Sections sections = (Sections) other;
            return this.id == sections.id && Intrinsics.d(this.tabGroupId, sections.tabGroupId) && Intrinsics.d(this.viewDTO, sections.viewDTO) && Intrinsics.d(this.trackingInfo, sections.trackingInfo);
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        @Override // l20.c
        @NotNull
        public Integer getScrollWidgetKey() {
            return DefaultImpls.getScrollWidgetKey(this);
        }

        @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.tab.TabEmbeddedViewObject
        public String getTabGroupId() {
            return this.tabGroupId;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        @Override // l20.c
        public int getViewItemKey() {
            return DefaultImpls.getViewItemKey(this);
        }

        @Override // m10.o
        @NotNull
        public String getWidgetName() {
            return DefaultImpls.getWidgetName(this);
        }

        public int hashCode() {
            int hashCode = Long.hashCode(this.id) * 31;
            String str = this.tabGroupId;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            List<DeliveryV6SectionItem> list = this.viewDTO;
            int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode3 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            String str = this.tabGroupId;
            List<DeliveryV6SectionItem> list = this.viewDTO;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder c11 = C2436a.c(j11, "Sections(id=", ", tabGroupId=", str);
            c11.append(", viewDTO=");
            c11.append(list);
            c11.append(", trackingInfo=");
            c11.append(map);
            c11.append(")");
            return c11.toString();
        }

        @Override // ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.DeliveryV6VO
        public List<? extends DeliveryV6SectionItem> getViewDTO() {
            return this.viewDTO;
        }
    }

    T getViewDTO();
}
