package ru.ozon.app.android.travel.molecules.input.v2;

import B0.C2454a;
import B4.V;
import C.C2702w;
import C.o0;
import Cm.e;
import D3.h;
import Ds.C2880a;
import Ef0.c;
import G.g;
import Kk.C3532b;
import Ns.b;
import P4.f;
import Pk0.a;
import Q1.C3853w;
import WZ.t;
import c8.C5766e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.uni.android.ds.compose.component.input.DsInputStatus;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\u0082\u0001\u0004\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO;", "", "<init>", "()V", "", "getName", "()Ljava/lang/String;", AppMeasurementSdk.ConditionalUserProperty.NAME, "getValue", AppMeasurementSdk.ConditionalUserProperty.VALUE, "TextInputV2", "DateInputV2", "SelectorV2", "CheckboxV2", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$CheckboxV2;", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$DateInputV2;", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$SelectorV2;", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class CommonInputV2VO {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010Jn\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b\u0007\u0010 R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b!\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\"\u0010\u0014R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b\n\u0010 R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b\u000b\u0010 R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b&\u0010 R\u0014\u0010(\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0014¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$CheckboxV2;", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO;", "", "id", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "isErrorVisible", "error", "text", "isSelected", "isEnabled", "Lru/ozon/uni/atoms/af/AtomAction;", "onChange", "defaultIsSelected", "<init>", "(ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZLru/ozon/uni/atoms/af/AtomAction;Z)V", "copy", "(ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZLru/ozon/uni/atoms/af/AtomAction;Z)Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$CheckboxV2;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getName", "Z", "()Z", "getError", "getText", "Lru/ozon/uni/atoms/af/AtomAction;", "getOnChange", "()Lru/ozon/uni/atoms/af/AtomAction;", "getDefaultIsSelected", "getValue", AppMeasurementSdk.ConditionalUserProperty.VALUE, "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CheckboxV2 extends CommonInputV2VO {
        public static final int $stable = AtomAction.$stable;
        private final boolean defaultIsSelected;
        private final String error;
        private final int id;
        private final boolean isEnabled;
        private final boolean isErrorVisible;
        private final boolean isSelected;

        @NotNull
        private final String name;
        private final AtomAction onChange;

        @NotNull
        private final String text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CheckboxV2(int i11, @NotNull String name, boolean z11, String str, @NotNull String text, boolean z12, boolean z13, AtomAction atomAction, boolean z14) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(text, "text");
            this.id = i11;
            this.name = name;
            this.isErrorVisible = z11;
            this.error = str;
            this.text = text;
            this.isSelected = z12;
            this.isEnabled = z13;
            this.onChange = atomAction;
            this.defaultIsSelected = z14;
        }

        public static /* synthetic */ CheckboxV2 copy$default(CheckboxV2 checkboxV2, int i11, String str, boolean z11, String str2, String str3, boolean z12, boolean z13, AtomAction atomAction, boolean z14, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = checkboxV2.id;
            }
            if ((i12 & 2) != 0) {
                str = checkboxV2.name;
            }
            if ((i12 & 4) != 0) {
                z11 = checkboxV2.isErrorVisible;
            }
            if ((i12 & 8) != 0) {
                str2 = checkboxV2.error;
            }
            if ((i12 & 16) != 0) {
                str3 = checkboxV2.text;
            }
            if ((i12 & 32) != 0) {
                z12 = checkboxV2.isSelected;
            }
            if ((i12 & 64) != 0) {
                z13 = checkboxV2.isEnabled;
            }
            if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                atomAction = checkboxV2.onChange;
            }
            if ((i12 & 256) != 0) {
                z14 = checkboxV2.defaultIsSelected;
            }
            AtomAction atomAction2 = atomAction;
            boolean z15 = z14;
            boolean z16 = z12;
            boolean z17 = z13;
            String str4 = str3;
            boolean z18 = z11;
            return checkboxV2.copy(i11, str, z18, str2, str4, z16, z17, atomAction2, z15);
        }

        @NotNull
        public final CheckboxV2 copy(int id2, @NotNull String name, boolean isErrorVisible, String error, @NotNull String text, boolean isSelected, boolean isEnabled, AtomAction onChange, boolean defaultIsSelected) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(text, "text");
            return new CheckboxV2(id2, name, isErrorVisible, error, text, isSelected, isEnabled, onChange, defaultIsSelected);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CheckboxV2)) {
                return false;
            }
            CheckboxV2 checkboxV2 = (CheckboxV2) other;
            return this.id == checkboxV2.id && Intrinsics.d(this.name, checkboxV2.name) && this.isErrorVisible == checkboxV2.isErrorVisible && Intrinsics.d(this.error, checkboxV2.error) && Intrinsics.d(this.text, checkboxV2.text) && this.isSelected == checkboxV2.isSelected && this.isEnabled == checkboxV2.isEnabled && Intrinsics.d(this.onChange, checkboxV2.onChange) && this.defaultIsSelected == checkboxV2.defaultIsSelected;
        }

        public String getError() {
            return this.error;
        }

        public int getId() {
            return this.id;
        }

        @Override // ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO
        @NotNull
        public String getName() {
            return this.name;
        }

        public final AtomAction getOnChange() {
            return this.onChange;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        @Override // ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO
        @NotNull
        public String getValue() {
            return String.valueOf(this.isSelected);
        }

        public int hashCode() {
            int a11 = C3532b.a(g.a(Integer.hashCode(this.id) * 31, 31, this.name), 31, this.isErrorVisible);
            String str = this.error;
            int a12 = C3532b.a(C3532b.a(g.a((a11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.text), 31, this.isSelected), 31, this.isEnabled);
            AtomAction atomAction = this.onChange;
            return Boolean.hashCode(this.defaultIsSelected) + ((a12 + (atomAction != null ? atomAction.hashCode() : 0)) * 31);
        }

        /* renamed from: isEnabled, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        /* renamed from: isErrorVisible, reason: from getter */
        public boolean getIsErrorVisible() {
            return this.isErrorVisible;
        }

        /* renamed from: isSelected, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            int i11 = this.id;
            String str = this.name;
            boolean z11 = this.isErrorVisible;
            String str2 = this.error;
            String str3 = this.text;
            boolean z12 = this.isSelected;
            boolean z13 = this.isEnabled;
            AtomAction atomAction = this.onChange;
            boolean z14 = this.defaultIsSelected;
            StringBuilder g10 = e.g(i11, "CheckboxV2(id=", ", name=", str, ", isErrorVisible=");
            C5766e.a(", error=", str2, ", text=", g10, z11);
            C2880a.c(str3, ", isSelected=", ", isEnabled=", g10, z12);
            g10.append(z13);
            g10.append(", onChange=");
            g10.append(atomAction);
            g10.append(", defaultIsSelected=");
            return a.a(")", g10, z14);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001:\u00018B\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u009e\u0001\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b$\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b\b\u0010&R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b'\u0010\u0019R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b\u000b\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\"\u001a\u0004\b/\u0010\u0019R$\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u00100\u001a\u0004\b5\u00102\"\u0004\b6\u00104R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\"\u001a\u0004\b7\u0010\u0019¨\u00069"}, d2 = {"Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$DateInputV2;", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO;", "", "id", "", AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "isErrorVisible", "error", HammersV3BodyDTO.PLACEHOLDER, "isEnabled", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$DateInputV2$DateRangeV2;", "dateRange", "Lru/ozon/uni/atoms/af/AtomAction;", "onChange", "defaultValue", "rightIcon", "leftIcon", "label", "<init>", "(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$DateInputV2$DateRangeV2;Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "copy", "(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$DateInputV2$DateRangeV2;Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$DateInputV2;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getName", "getValue", "Z", "()Z", "getError", "getPlaceholder", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$DateInputV2$DateRangeV2;", "getDateRange", "()Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$DateInputV2$DateRangeV2;", "Lru/ozon/uni/atoms/af/AtomAction;", "getOnChange", "()Lru/ozon/uni/atoms/af/AtomAction;", "getDefaultValue", "Ljava/lang/Integer;", "getRightIcon", "()Ljava/lang/Integer;", "setRightIcon", "(Ljava/lang/Integer;)V", "getLeftIcon", "setLeftIcon", "getLabel", "DateRangeV2", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DateInputV2 extends CommonInputV2VO {
        private final DateRangeV2 dateRange;

        @NotNull
        private final String defaultValue;
        private final String error;
        private final int id;
        private final boolean isEnabled;
        private final boolean isErrorVisible;
        private final String label;
        private Integer leftIcon;

        @NotNull
        private final String name;
        private final AtomAction onChange;

        @NotNull
        private final String placeholder;
        private Integer rightIcon;

        @NotNull
        private final String value;

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$DateInputV2$DateRangeV2;", "", "", "dateStart", "dateEnd", "<init>", "(JJ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getDateStart", "()J", "getDateEnd", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class DateRangeV2 {
            private final long dateEnd;
            private final long dateStart;

            public DateRangeV2(long j11, long j12) {
                this.dateStart = j11;
                this.dateEnd = j12;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DateRangeV2)) {
                    return false;
                }
                DateRangeV2 dateRangeV2 = (DateRangeV2) other;
                return this.dateStart == dateRangeV2.dateStart && this.dateEnd == dateRangeV2.dateEnd;
            }

            public final long getDateEnd() {
                return this.dateEnd;
            }

            public final long getDateStart() {
                return this.dateStart;
            }

            public int hashCode() {
                return Long.hashCode(this.dateEnd) + (Long.hashCode(this.dateStart) * 31);
            }

            @NotNull
            public String toString() {
                return f.a(this.dateEnd, ")", C2702w.d(this.dateStart, "DateRangeV2(dateStart=", ", dateEnd="));
            }
        }

        public /* synthetic */ DateInputV2(int i11, String str, String str2, boolean z11, String str3, String str4, boolean z12, DateRangeV2 dateRangeV2, AtomAction atomAction, String str5, Integer num, Integer num2, String str6, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(i11, str, str2, z11, str3, str4, z12, dateRangeV2, atomAction, str5, (i12 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : num, (i12 & 2048) != 0 ? null : num2, str6);
        }

        public static /* synthetic */ DateInputV2 copy$default(DateInputV2 dateInputV2, int i11, String str, String str2, boolean z11, String str3, String str4, boolean z12, DateRangeV2 dateRangeV2, AtomAction atomAction, String str5, Integer num, Integer num2, String str6, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = dateInputV2.id;
            }
            return dateInputV2.copy(i11, (i12 & 2) != 0 ? dateInputV2.name : str, (i12 & 4) != 0 ? dateInputV2.value : str2, (i12 & 8) != 0 ? dateInputV2.isErrorVisible : z11, (i12 & 16) != 0 ? dateInputV2.error : str3, (i12 & 32) != 0 ? dateInputV2.placeholder : str4, (i12 & 64) != 0 ? dateInputV2.isEnabled : z12, (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? dateInputV2.dateRange : dateRangeV2, (i12 & 256) != 0 ? dateInputV2.onChange : atomAction, (i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? dateInputV2.defaultValue : str5, (i12 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? dateInputV2.rightIcon : num, (i12 & 2048) != 0 ? dateInputV2.leftIcon : num2, (i12 & 4096) != 0 ? dateInputV2.label : str6);
        }

        @NotNull
        public final DateInputV2 copy(int id2, @NotNull String name, @NotNull String value, boolean isErrorVisible, String error, @NotNull String placeholder, boolean isEnabled, DateRangeV2 dateRange, AtomAction onChange, @NotNull String defaultValue, Integer rightIcon, Integer leftIcon, String label) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
            return new DateInputV2(id2, name, value, isErrorVisible, error, placeholder, isEnabled, dateRange, onChange, defaultValue, rightIcon, leftIcon, label);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DateInputV2)) {
                return false;
            }
            DateInputV2 dateInputV2 = (DateInputV2) other;
            return this.id == dateInputV2.id && Intrinsics.d(this.name, dateInputV2.name) && Intrinsics.d(this.value, dateInputV2.value) && this.isErrorVisible == dateInputV2.isErrorVisible && Intrinsics.d(this.error, dateInputV2.error) && Intrinsics.d(this.placeholder, dateInputV2.placeholder) && this.isEnabled == dateInputV2.isEnabled && Intrinsics.d(this.dateRange, dateInputV2.dateRange) && Intrinsics.d(this.onChange, dateInputV2.onChange) && Intrinsics.d(this.defaultValue, dateInputV2.defaultValue) && Intrinsics.d(this.rightIcon, dateInputV2.rightIcon) && Intrinsics.d(this.leftIcon, dateInputV2.leftIcon) && Intrinsics.d(this.label, dateInputV2.label);
        }

        public final DateRangeV2 getDateRange() {
            return this.dateRange;
        }

        public String getError() {
            return this.error;
        }

        public int getId() {
            return this.id;
        }

        public final Integer getLeftIcon() {
            return this.leftIcon;
        }

        @Override // ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO
        @NotNull
        public String getName() {
            return this.name;
        }

        public final AtomAction getOnChange() {
            return this.onChange;
        }

        @NotNull
        public final String getPlaceholder() {
            return this.placeholder;
        }

        public final Integer getRightIcon() {
            return this.rightIcon;
        }

        @Override // ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO
        @NotNull
        public String getValue() {
            return this.value;
        }

        public int hashCode() {
            int a11 = C3532b.a(g.a(g.a(Integer.hashCode(this.id) * 31, 31, this.name), 31, this.value), 31, this.isErrorVisible);
            String str = this.error;
            int a12 = C3532b.a(g.a((a11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.placeholder), 31, this.isEnabled);
            DateRangeV2 dateRangeV2 = this.dateRange;
            int hashCode = (a12 + (dateRangeV2 == null ? 0 : dateRangeV2.hashCode())) * 31;
            AtomAction atomAction = this.onChange;
            int a13 = g.a((hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31, 31, this.defaultValue);
            Integer num = this.rightIcon;
            int hashCode2 = (a13 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.leftIcon;
            int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str2 = this.label;
            return hashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        /* renamed from: isEnabled, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        /* renamed from: isErrorVisible, reason: from getter */
        public boolean getIsErrorVisible() {
            return this.isErrorVisible;
        }

        @NotNull
        public String toString() {
            int i11 = this.id;
            String str = this.name;
            String str2 = this.value;
            boolean z11 = this.isErrorVisible;
            String str3 = this.error;
            String str4 = this.placeholder;
            boolean z12 = this.isEnabled;
            DateRangeV2 dateRangeV2 = this.dateRange;
            AtomAction atomAction = this.onChange;
            String str5 = this.defaultValue;
            Integer num = this.rightIcon;
            Integer num2 = this.leftIcon;
            String str6 = this.label;
            StringBuilder g10 = e.g(i11, "DateInputV2(id=", ", name=", str, ", value=");
            C2880a.c(str2, ", isErrorVisible=", ", error=", g10, z11);
            Nh.a.h(g10, str3, ", placeholder=", str4, ", isEnabled=");
            g10.append(z12);
            g10.append(", dateRange=");
            g10.append(dateRangeV2);
            g10.append(", onChange=");
            g10.append(atomAction);
            g10.append(", defaultValue=");
            g10.append(str5);
            g10.append(", rightIcon=");
            c.e(g10, num, ", leftIcon=", num2, ", label=");
            return o0.c(g10, str6, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DateInputV2(int i11, @NotNull String name, @NotNull String value, boolean z11, String str, @NotNull String placeholder, boolean z12, DateRangeV2 dateRangeV2, AtomAction atomAction, @NotNull String defaultValue, Integer num, Integer num2, String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
            this.id = i11;
            this.name = name;
            this.value = value;
            this.isErrorVisible = z11;
            this.error = str;
            this.placeholder = placeholder;
            this.isEnabled = z12;
            this.dateRange = dateRangeV2;
            this.onChange = atomAction;
            this.defaultValue = defaultValue;
            this.rightIcon = num;
            this.leftIcon = num2;
            this.label = str2;
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001:\u0001EB§\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001a\u0010\u001bJÌ\u0001\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00072\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00102\u0010\b\u0002\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u00152\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010!R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b*\u0010\u001fR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b\b\u0010,R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b-\u0010\u001fR\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b.\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b/\u0010\u001fR\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b\f\u0010,R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0012\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0013\u00103\u001a\u0004\b9\u00105R\u001f\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010:\u001a\u0004\b;\u0010<R$\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010=\u001a\u0004\bB\u0010?\"\u0004\bC\u0010AR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010(\u001a\u0004\bD\u0010\u001f¨\u0006F"}, d2 = {"Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$SelectorV2;", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO;", "", "id", "", AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "isErrorVisible", "error", "text", HammersV3BodyDTO.PLACEHOLDER, "isEnabled", "", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$SelectorV2$OptionV2;", "options", "Lru/ozon/uni/atoms/af/AtomAction;", "onChange", "defaultOption", "onClick", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "clickEvent", "rightIcon", "leftIcon", "label", "<init>", "(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$SelectorV2$OptionV2;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "copy", "(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$SelectorV2$OptionV2;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$SelectorV2;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getName", "getValue", "Z", "()Z", "getError", "getText", "getPlaceholder", "Ljava/util/List;", "getOptions", "()Ljava/util/List;", "Lru/ozon/uni/atoms/af/AtomAction;", "getOnChange", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$SelectorV2$OptionV2;", "getDefaultOption", "()Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$SelectorV2$OptionV2;", "getOnClick", "LWZ/t;", "getClickEvent", "()LWZ/t;", "Ljava/lang/Integer;", "getRightIcon", "()Ljava/lang/Integer;", "setRightIcon", "(Ljava/lang/Integer;)V", "getLeftIcon", "setLeftIcon", "getLabel", "OptionV2", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SelectorV2 extends CommonInputV2VO {
        public static final int $stable = 8;
        private final t clickEvent;
        private final OptionV2 defaultOption;
        private final String error;
        private final int id;
        private final boolean isEnabled;
        private final boolean isErrorVisible;
        private final String label;
        private Integer leftIcon;

        @NotNull
        private final String name;
        private final AtomAction onChange;
        private final AtomAction onClick;

        @NotNull
        private final List<OptionV2> options;

        @NotNull
        private final String placeholder;
        private Integer rightIcon;

        @NotNull
        private final String text;

        @NotNull
        private final String value;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$SelectorV2$OptionV2;", "", "", "code", AppMeasurementSdk.ConditionalUserProperty.VALUE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCode", "getValue", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OptionV2 {

            @NotNull
            private final String code;

            @NotNull
            private final String value;

            public OptionV2(@NotNull String code, @NotNull String value) {
                Intrinsics.checkNotNullParameter(code, "code");
                Intrinsics.checkNotNullParameter(value, "value");
                this.code = code;
                this.value = value;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OptionV2)) {
                    return false;
                }
                OptionV2 optionV2 = (OptionV2) other;
                return Intrinsics.d(this.code, optionV2.code) && Intrinsics.d(this.value, optionV2.value);
            }

            @NotNull
            public final String getCode() {
                return this.code;
            }

            @NotNull
            public final String getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode() + (this.code.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return V.e.a("OptionV2(code=", this.code, ", value=", this.value, ")");
            }
        }

        public /* synthetic */ SelectorV2(int i11, String str, String str2, boolean z11, String str3, String str4, String str5, boolean z12, List list, AtomAction atomAction, OptionV2 optionV2, AtomAction atomAction2, t tVar, Integer num, Integer num2, String str6, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(i11, str, str2, z11, str3, str4, str5, z12, list, atomAction, optionV2, atomAction2, tVar, (i12 & 8192) != 0 ? null : num, (i12 & 16384) != 0 ? null : num2, str6);
        }

        @NotNull
        public final SelectorV2 copy(int id2, @NotNull String name, @NotNull String value, boolean isErrorVisible, String error, @NotNull String text, @NotNull String placeholder, boolean isEnabled, @NotNull List<OptionV2> options, AtomAction onChange, OptionV2 defaultOption, AtomAction onClick, t clickEvent, Integer rightIcon, Integer leftIcon, String label) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(options, "options");
            return new SelectorV2(id2, name, value, isErrorVisible, error, text, placeholder, isEnabled, options, onChange, defaultOption, onClick, clickEvent, rightIcon, leftIcon, label);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelectorV2)) {
                return false;
            }
            SelectorV2 selectorV2 = (SelectorV2) other;
            return this.id == selectorV2.id && Intrinsics.d(this.name, selectorV2.name) && Intrinsics.d(this.value, selectorV2.value) && this.isErrorVisible == selectorV2.isErrorVisible && Intrinsics.d(this.error, selectorV2.error) && Intrinsics.d(this.text, selectorV2.text) && Intrinsics.d(this.placeholder, selectorV2.placeholder) && this.isEnabled == selectorV2.isEnabled && Intrinsics.d(this.options, selectorV2.options) && Intrinsics.d(this.onChange, selectorV2.onChange) && Intrinsics.d(this.defaultOption, selectorV2.defaultOption) && Intrinsics.d(this.onClick, selectorV2.onClick) && Intrinsics.d(this.clickEvent, selectorV2.clickEvent) && Intrinsics.d(this.rightIcon, selectorV2.rightIcon) && Intrinsics.d(this.leftIcon, selectorV2.leftIcon) && Intrinsics.d(this.label, selectorV2.label);
        }

        public final t getClickEvent() {
            return this.clickEvent;
        }

        public String getError() {
            return this.error;
        }

        public int getId() {
            return this.id;
        }

        public final String getLabel() {
            return this.label;
        }

        public final Integer getLeftIcon() {
            return this.leftIcon;
        }

        @Override // ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO
        @NotNull
        public String getName() {
            return this.name;
        }

        public final AtomAction getOnChange() {
            return this.onChange;
        }

        public final AtomAction getOnClick() {
            return this.onClick;
        }

        @NotNull
        public final List<OptionV2> getOptions() {
            return this.options;
        }

        @NotNull
        public final String getPlaceholder() {
            return this.placeholder;
        }

        public final Integer getRightIcon() {
            return this.rightIcon;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        @Override // ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO
        @NotNull
        public String getValue() {
            return this.value;
        }

        public int hashCode() {
            int a11 = C3532b.a(g.a(g.a(Integer.hashCode(this.id) * 31, 31, this.name), 31, this.value), 31, this.isErrorVisible);
            String str = this.error;
            int b11 = g.b(C3532b.a(g.a(g.a((a11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.text), 31, this.placeholder), 31, this.isEnabled), 31, this.options);
            AtomAction atomAction = this.onChange;
            int hashCode = (b11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            OptionV2 optionV2 = this.defaultOption;
            int hashCode2 = (hashCode + (optionV2 == null ? 0 : optionV2.hashCode())) * 31;
            AtomAction atomAction2 = this.onClick;
            int hashCode3 = (hashCode2 + (atomAction2 == null ? 0 : atomAction2.hashCode())) * 31;
            t tVar = this.clickEvent;
            int hashCode4 = (hashCode3 + (tVar == null ? 0 : tVar.hashCode())) * 31;
            Integer num = this.rightIcon;
            int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.leftIcon;
            int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str2 = this.label;
            return hashCode6 + (str2 != null ? str2.hashCode() : 0);
        }

        /* renamed from: isEnabled, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        /* renamed from: isErrorVisible, reason: from getter */
        public boolean getIsErrorVisible() {
            return this.isErrorVisible;
        }

        public final void setRightIcon(Integer num) {
            this.rightIcon = num;
        }

        @NotNull
        public String toString() {
            int i11 = this.id;
            String str = this.name;
            String str2 = this.value;
            boolean z11 = this.isErrorVisible;
            String str3 = this.error;
            String str4 = this.text;
            String str5 = this.placeholder;
            boolean z12 = this.isEnabled;
            List<OptionV2> list = this.options;
            AtomAction atomAction = this.onChange;
            OptionV2 optionV2 = this.defaultOption;
            AtomAction atomAction2 = this.onClick;
            t tVar = this.clickEvent;
            Integer num = this.rightIcon;
            Integer num2 = this.leftIcon;
            String str6 = this.label;
            StringBuilder g10 = e.g(i11, "SelectorV2(id=", ", name=", str, ", value=");
            C2880a.c(str2, ", isErrorVisible=", ", error=", g10, z11);
            Nh.a.h(g10, str3, ", text=", str4, ", placeholder=");
            C2880a.c(str5, ", isEnabled=", ", options=", g10, z12);
            g10.append(list);
            g10.append(", onChange=");
            g10.append(atomAction);
            g10.append(", defaultOption=");
            g10.append(optionV2);
            g10.append(", onClick=");
            g10.append(atomAction2);
            g10.append(", clickEvent=");
            g10.append(tVar);
            g10.append(", rightIcon=");
            g10.append(num);
            g10.append(", leftIcon=");
            g10.append(num2);
            g10.append(", label=");
            g10.append(str6);
            g10.append(")");
            return g10.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectorV2(int i11, @NotNull String name, @NotNull String value, boolean z11, String str, @NotNull String text, @NotNull String placeholder, boolean z12, @NotNull List<OptionV2> options, AtomAction atomAction, OptionV2 optionV2, AtomAction atomAction2, t tVar, Integer num, Integer num2, String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(options, "options");
            this.id = i11;
            this.name = name;
            this.value = value;
            this.isErrorVisible = z11;
            this.error = str;
            this.text = text;
            this.placeholder = placeholder;
            this.isEnabled = z12;
            this.options = options;
            this.onChange = atomAction;
            this.defaultOption = optionV2;
            this.onClick = atomAction2;
            this.clickEvent = tVar;
            this.rightIcon = num;
            this.leftIcon = num2;
            this.label = str2;
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b-\b\u0087\b\u0018\u00002\u00020\u0001B£\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u000e\u0010\u0019\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u0018\u0012\u000e\u0010\u001a\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u0018\u0012\u000e\u0010\u001b\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u0018\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0004\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'JÚ\u0002\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00022\u0010\b\u0002\u0010\u0019\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u00182\u0010\b\u0002\u0010\u001a\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u00182\u0010\b\u0002\u0010\u001b\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u00182\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00042\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010%\u001a\u00020$HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u00020\u00072\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b1\u00102R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010.R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010,R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b7\u0010,R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b\b\u00109R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b:\u0010,R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b;\u0010.R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b<\u0010.R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b=\u0010,R\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u00108\u001a\u0004\b\u000e\u00109R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u00105\u001a\u0004\b>\u0010,R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u00105\u001a\u0004\b?\u0010,R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010@\u001a\u0004\bA\u0010BR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010@\u001a\u0004\bC\u0010BR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0014\u0010@\u001a\u0004\bD\u0010BR\u0017\u0010\u0015\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u00108\u001a\u0004\b\u0015\u00109R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u00103\u001a\u0004\bE\u0010.R\u001f\u0010\u0019\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010F\u001a\u0004\bG\u0010HR\u001f\u0010\u001a\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u00188\u0006¢\u0006\f\n\u0004\b\u001a\u0010F\u001a\u0004\bI\u0010HR\u001f\u0010\u001b\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u00188\u0006¢\u0006\f\n\u0004\b\u001b\u0010F\u001a\u0004\bJ\u0010HR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010K\u001a\u0004\bL\u0010MR\u0017\u0010\u001d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u00105\u001a\u0004\bN\u0010,R$\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010K\u001a\u0004\bO\u0010M\"\u0004\bP\u0010QR$\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010K\u001a\u0004\bR\u0010M\"\u0004\bS\u0010QR\u0019\u0010 \u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u00105\u001a\u0004\bT\u0010,R\u0019\u0010!\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b!\u0010U\u001a\u0004\bV\u0010WR\u0019\u0010\"\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010U\u001a\u0004\b\"\u0010WR\u0019\u0010#\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b#\u00105\u001a\u0004\bX\u0010,R\u0017\u0010%\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010Y\u001a\u0004\bZ\u0010[¨\u0006\\"}, d2 = {"Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO;", "", "id", "", AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "isErrorVisible", "error", "inputType", "LQ1/w;", "keyboardType", HammersV3BodyDTO.PLACEHOLDER, "isEnabled", FormPageDTO.Field.FIELD_TYPE_MASK, "maskPattern", "Lru/ozon/uni/atoms/af/AtomAction;", "onChange", "onFocusLost", "onClick", "isMultiline", "imeOptions", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "clickEvent", "textChangeEvent", "focusLostTrackingInfo", "maxLength", "defaultValue", "rightIcon", "leftIcon", "label", "showMaxLengthCounter", "isReadOnly", "icon", "Lru/ozon/uni/android/ds/compose/component/input/DsInputStatus;", "status", "<init>", "(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;IILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/af/AtomAction;ZILWZ/t;LWZ/t;LWZ/t;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/uni/android/ds/compose/component/input/DsInputStatus;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-jp_8I2s", "(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;IILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/af/AtomAction;ZILWZ/t;LWZ/t;LWZ/t;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/uni/android/ds/compose/component/input/DsInputStatus;)Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;", "copy", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getName", "getValue", "Z", "()Z", "getError", "getInputType", "getKeyboardType-PjHm6EE", "getPlaceholder", "getMask", "getMaskPattern", "Lru/ozon/uni/atoms/af/AtomAction;", "getOnChange", "()Lru/ozon/uni/atoms/af/AtomAction;", "getOnFocusLost", "getOnClick", "getImeOptions", "LWZ/t;", "getClickEvent", "()LWZ/t;", "getTextChangeEvent", "getFocusLostTrackingInfo", "Ljava/lang/Integer;", "getMaxLength", "()Ljava/lang/Integer;", "getDefaultValue", "getRightIcon", "setRightIcon", "(Ljava/lang/Integer;)V", "getLeftIcon", "setLeftIcon", "getLabel", "Ljava/lang/Boolean;", "getShowMaxLengthCounter", "()Ljava/lang/Boolean;", "getIcon", "Lru/ozon/uni/android/ds/compose/component/input/DsInputStatus;", "getStatus", "()Lru/ozon/uni/android/ds/compose/component/input/DsInputStatus;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TextInputV2 extends CommonInputV2VO {
        public static final int $stable = 8;
        private final t clickEvent;

        @NotNull
        private final String defaultValue;
        private final String error;
        private final t focusLostTrackingInfo;
        private final String icon;
        private final int id;
        private final int imeOptions;
        private final int inputType;
        private final boolean isEnabled;
        private final boolean isErrorVisible;
        private final boolean isMultiline;
        private final Boolean isReadOnly;
        private final int keyboardType;
        private final String label;
        private Integer leftIcon;
        private final String mask;
        private final String maskPattern;
        private final Integer maxLength;

        @NotNull
        private final String name;
        private final AtomAction onChange;
        private final AtomAction onClick;
        private final AtomAction onFocusLost;

        @NotNull
        private final String placeholder;
        private Integer rightIcon;
        private final Boolean showMaxLengthCounter;

        @NotNull
        private final DsInputStatus status;
        private final t textChangeEvent;

        @NotNull
        private final String value;

        public /* synthetic */ TextInputV2(int i11, String str, String str2, boolean z11, String str3, int i12, int i13, String str4, boolean z12, String str5, String str6, AtomAction atomAction, AtomAction atomAction2, AtomAction atomAction3, boolean z13, int i14, t tVar, t tVar2, t tVar3, Integer num, String str7, Integer num2, Integer num3, String str8, Boolean bool, Boolean bool2, String str9, DsInputStatus dsInputStatus, DefaultConstructorMarker defaultConstructorMarker) {
            this(i11, str, str2, z11, str3, i12, i13, str4, z12, str5, str6, atomAction, atomAction2, atomAction3, z13, i14, tVar, tVar2, tVar3, num, str7, num2, num3, str8, bool, bool2, str9, dsInputStatus);
        }

        /* renamed from: copy-jp_8I2s$default, reason: not valid java name */
        public static /* synthetic */ TextInputV2 m1443copyjp_8I2s$default(TextInputV2 textInputV2, int i11, String str, String str2, boolean z11, String str3, int i12, int i13, String str4, boolean z12, String str5, String str6, AtomAction atomAction, AtomAction atomAction2, AtomAction atomAction3, boolean z13, int i14, t tVar, t tVar2, t tVar3, Integer num, String str7, Integer num2, Integer num3, String str8, Boolean bool, Boolean bool2, String str9, DsInputStatus dsInputStatus, int i15, Object obj) {
            DsInputStatus dsInputStatus2;
            String str10;
            int i16 = (i15 & 1) != 0 ? textInputV2.id : i11;
            String str11 = (i15 & 2) != 0 ? textInputV2.name : str;
            String str12 = (i15 & 4) != 0 ? textInputV2.value : str2;
            boolean z14 = (i15 & 8) != 0 ? textInputV2.isErrorVisible : z11;
            String str13 = (i15 & 16) != 0 ? textInputV2.error : str3;
            int i17 = (i15 & 32) != 0 ? textInputV2.inputType : i12;
            int i18 = (i15 & 64) != 0 ? textInputV2.keyboardType : i13;
            String str14 = (i15 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? textInputV2.placeholder : str4;
            boolean z15 = (i15 & 256) != 0 ? textInputV2.isEnabled : z12;
            String str15 = (i15 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? textInputV2.mask : str5;
            String str16 = (i15 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? textInputV2.maskPattern : str6;
            AtomAction atomAction4 = (i15 & 2048) != 0 ? textInputV2.onChange : atomAction;
            AtomAction atomAction5 = (i15 & 4096) != 0 ? textInputV2.onFocusLost : atomAction2;
            AtomAction atomAction6 = (i15 & 8192) != 0 ? textInputV2.onClick : atomAction3;
            int i19 = i16;
            boolean z16 = (i15 & 16384) != 0 ? textInputV2.isMultiline : z13;
            int i21 = (i15 & 32768) != 0 ? textInputV2.imeOptions : i14;
            t tVar4 = (i15 & 65536) != 0 ? textInputV2.clickEvent : tVar;
            t tVar5 = (i15 & 131072) != 0 ? textInputV2.textChangeEvent : tVar2;
            t tVar6 = (i15 & 262144) != 0 ? textInputV2.focusLostTrackingInfo : tVar3;
            Integer num4 = (i15 & 524288) != 0 ? textInputV2.maxLength : num;
            String str17 = (i15 & 1048576) != 0 ? textInputV2.defaultValue : str7;
            Integer num5 = (i15 & 2097152) != 0 ? textInputV2.rightIcon : num2;
            Integer num6 = (i15 & 4194304) != 0 ? textInputV2.leftIcon : num3;
            String str18 = (i15 & 8388608) != 0 ? textInputV2.label : str8;
            Boolean bool3 = (i15 & 16777216) != 0 ? textInputV2.showMaxLengthCounter : bool;
            Boolean bool4 = (i15 & 33554432) != 0 ? textInputV2.isReadOnly : bool2;
            String str19 = (i15 & 67108864) != 0 ? textInputV2.icon : str9;
            if ((i15 & 134217728) != 0) {
                str10 = str19;
                dsInputStatus2 = textInputV2.status;
            } else {
                dsInputStatus2 = dsInputStatus;
                str10 = str19;
            }
            return textInputV2.m1444copyjp_8I2s(i19, str11, str12, z14, str13, i17, i18, str14, z15, str15, str16, atomAction4, atomAction5, atomAction6, z16, i21, tVar4, tVar5, tVar6, num4, str17, num5, num6, str18, bool3, bool4, str10, dsInputStatus2);
        }

        @NotNull
        /* renamed from: copy-jp_8I2s, reason: not valid java name */
        public final TextInputV2 m1444copyjp_8I2s(int id2, @NotNull String name, @NotNull String value, boolean isErrorVisible, String error, int inputType, int keyboardType, @NotNull String placeholder, boolean isEnabled, String mask, String maskPattern, AtomAction onChange, AtomAction onFocusLost, AtomAction onClick, boolean isMultiline, int imeOptions, t clickEvent, t textChangeEvent, t focusLostTrackingInfo, Integer maxLength, @NotNull String defaultValue, Integer rightIcon, Integer leftIcon, String label, Boolean showMaxLengthCounter, Boolean isReadOnly, String icon, @NotNull DsInputStatus status) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
            Intrinsics.checkNotNullParameter(status, "status");
            return new TextInputV2(id2, name, value, isErrorVisible, error, inputType, keyboardType, placeholder, isEnabled, mask, maskPattern, onChange, onFocusLost, onClick, isMultiline, imeOptions, clickEvent, textChangeEvent, focusLostTrackingInfo, maxLength, defaultValue, rightIcon, leftIcon, label, showMaxLengthCounter, isReadOnly, icon, status, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextInputV2)) {
                return false;
            }
            TextInputV2 textInputV2 = (TextInputV2) other;
            return this.id == textInputV2.id && Intrinsics.d(this.name, textInputV2.name) && Intrinsics.d(this.value, textInputV2.value) && this.isErrorVisible == textInputV2.isErrorVisible && Intrinsics.d(this.error, textInputV2.error) && this.inputType == textInputV2.inputType && this.keyboardType == textInputV2.keyboardType && Intrinsics.d(this.placeholder, textInputV2.placeholder) && this.isEnabled == textInputV2.isEnabled && Intrinsics.d(this.mask, textInputV2.mask) && Intrinsics.d(this.maskPattern, textInputV2.maskPattern) && Intrinsics.d(this.onChange, textInputV2.onChange) && Intrinsics.d(this.onFocusLost, textInputV2.onFocusLost) && Intrinsics.d(this.onClick, textInputV2.onClick) && this.isMultiline == textInputV2.isMultiline && this.imeOptions == textInputV2.imeOptions && Intrinsics.d(this.clickEvent, textInputV2.clickEvent) && Intrinsics.d(this.textChangeEvent, textInputV2.textChangeEvent) && Intrinsics.d(this.focusLostTrackingInfo, textInputV2.focusLostTrackingInfo) && Intrinsics.d(this.maxLength, textInputV2.maxLength) && Intrinsics.d(this.defaultValue, textInputV2.defaultValue) && Intrinsics.d(this.rightIcon, textInputV2.rightIcon) && Intrinsics.d(this.leftIcon, textInputV2.leftIcon) && Intrinsics.d(this.label, textInputV2.label) && Intrinsics.d(this.showMaxLengthCounter, textInputV2.showMaxLengthCounter) && Intrinsics.d(this.isReadOnly, textInputV2.isReadOnly) && Intrinsics.d(this.icon, textInputV2.icon) && this.status == textInputV2.status;
        }

        public final t getClickEvent() {
            return this.clickEvent;
        }

        public String getError() {
            return this.error;
        }

        public final t getFocusLostTrackingInfo() {
            return this.focusLostTrackingInfo;
        }

        public final String getIcon() {
            return this.icon;
        }

        public int getId() {
            return this.id;
        }

        public final int getImeOptions() {
            return this.imeOptions;
        }

        public final int getInputType() {
            return this.inputType;
        }

        /* renamed from: getKeyboardType-PjHm6EE, reason: not valid java name and from getter */
        public final int getKeyboardType() {
            return this.keyboardType;
        }

        public final String getLabel() {
            return this.label;
        }

        public final Integer getLeftIcon() {
            return this.leftIcon;
        }

        public final String getMask() {
            return this.mask;
        }

        public final String getMaskPattern() {
            return this.maskPattern;
        }

        public final Integer getMaxLength() {
            return this.maxLength;
        }

        @Override // ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO
        @NotNull
        public String getName() {
            return this.name;
        }

        public final AtomAction getOnChange() {
            return this.onChange;
        }

        public final AtomAction getOnClick() {
            return this.onClick;
        }

        public final AtomAction getOnFocusLost() {
            return this.onFocusLost;
        }

        @NotNull
        public final String getPlaceholder() {
            return this.placeholder;
        }

        public final Integer getRightIcon() {
            return this.rightIcon;
        }

        public final Boolean getShowMaxLengthCounter() {
            return this.showMaxLengthCounter;
        }

        @NotNull
        public final DsInputStatus getStatus() {
            return this.status;
        }

        public final t getTextChangeEvent() {
            return this.textChangeEvent;
        }

        @Override // ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO
        @NotNull
        public String getValue() {
            return this.value;
        }

        public int hashCode() {
            int a11 = C3532b.a(g.a(g.a(Integer.hashCode(this.id) * 31, 31, this.name), 31, this.value), 31, this.isErrorVisible);
            String str = this.error;
            int a12 = C3532b.a(g.a(C2454a.a(this.keyboardType, C2454a.a(this.inputType, (a11 + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31, this.placeholder), 31, this.isEnabled);
            String str2 = this.mask;
            int hashCode = (a12 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.maskPattern;
            int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
            AtomAction atomAction = this.onChange;
            int hashCode3 = (hashCode2 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            AtomAction atomAction2 = this.onFocusLost;
            int hashCode4 = (hashCode3 + (atomAction2 == null ? 0 : atomAction2.hashCode())) * 31;
            AtomAction atomAction3 = this.onClick;
            int a13 = C2454a.a(this.imeOptions, C3532b.a((hashCode4 + (atomAction3 == null ? 0 : atomAction3.hashCode())) * 31, 31, this.isMultiline), 31);
            t tVar = this.clickEvent;
            int hashCode5 = (a13 + (tVar == null ? 0 : tVar.hashCode())) * 31;
            t tVar2 = this.textChangeEvent;
            int hashCode6 = (hashCode5 + (tVar2 == null ? 0 : tVar2.hashCode())) * 31;
            t tVar3 = this.focusLostTrackingInfo;
            int hashCode7 = (hashCode6 + (tVar3 == null ? 0 : tVar3.hashCode())) * 31;
            Integer num = this.maxLength;
            int a14 = g.a((hashCode7 + (num == null ? 0 : num.hashCode())) * 31, 31, this.defaultValue);
            Integer num2 = this.rightIcon;
            int hashCode8 = (a14 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.leftIcon;
            int hashCode9 = (hashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
            String str4 = this.label;
            int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Boolean bool = this.showMaxLengthCounter;
            int hashCode11 = (hashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.isReadOnly;
            int hashCode12 = (hashCode11 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str5 = this.icon;
            return this.status.hashCode() + ((hashCode12 + (str5 != null ? str5.hashCode() : 0)) * 31);
        }

        /* renamed from: isEnabled, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        /* renamed from: isErrorVisible, reason: from getter */
        public boolean getIsErrorVisible() {
            return this.isErrorVisible;
        }

        /* renamed from: isMultiline, reason: from getter */
        public final boolean getIsMultiline() {
            return this.isMultiline;
        }

        @NotNull
        public String toString() {
            int i11 = this.id;
            String str = this.name;
            String str2 = this.value;
            boolean z11 = this.isErrorVisible;
            String str3 = this.error;
            int i12 = this.inputType;
            String b11 = C3853w.b(this.keyboardType);
            String str4 = this.placeholder;
            boolean z12 = this.isEnabled;
            String str5 = this.mask;
            String str6 = this.maskPattern;
            AtomAction atomAction = this.onChange;
            AtomAction atomAction2 = this.onFocusLost;
            AtomAction atomAction3 = this.onClick;
            boolean z13 = this.isMultiline;
            int i13 = this.imeOptions;
            t tVar = this.clickEvent;
            t tVar2 = this.textChangeEvent;
            t tVar3 = this.focusLostTrackingInfo;
            Integer num = this.maxLength;
            String str7 = this.defaultValue;
            Integer num2 = this.rightIcon;
            Integer num3 = this.leftIcon;
            String str8 = this.label;
            Boolean bool = this.showMaxLengthCounter;
            Boolean bool2 = this.isReadOnly;
            String str9 = this.icon;
            DsInputStatus dsInputStatus = this.status;
            StringBuilder g10 = e.g(i11, "TextInputV2(id=", ", name=", str, ", value=");
            C2880a.c(str2, ", isErrorVisible=", ", error=", g10, z11);
            Pk0.g.d(i12, str3, ", inputType=", ", keyboardType=", g10);
            Nh.a.h(g10, b11, ", placeholder=", str4, ", isEnabled=");
            C5766e.a(", mask=", str5, ", maskPattern=", g10, z12);
            b.d(str6, ", onChange=", ", onFocusLost=", g10, atomAction);
            g10.append(atomAction2);
            g10.append(", onClick=");
            g10.append(atomAction3);
            g10.append(", isMultiline=");
            g10.append(z13);
            g10.append(", imeOptions=");
            g10.append(i13);
            g10.append(", clickEvent=");
            g10.append(tVar);
            g10.append(", textChangeEvent=");
            g10.append(tVar2);
            g10.append(", focusLostTrackingInfo=");
            g10.append(tVar3);
            g10.append(", maxLength=");
            g10.append(num);
            g10.append(", defaultValue=");
            C2454a.f(num2, str7, ", rightIcon=", ", leftIcon=", g10);
            V.f(num3, ", label=", str8, ", showMaxLengthCounter=", g10);
            h.h(g10, bool, ", isReadOnly=", bool2, ", icon=");
            g10.append(str9);
            g10.append(", status=");
            g10.append(dsInputStatus);
            g10.append(")");
            return g10.toString();
        }

        public /* synthetic */ TextInputV2(int i11, String str, String str2, boolean z11, String str3, int i12, int i13, String str4, boolean z12, String str5, String str6, AtomAction atomAction, AtomAction atomAction2, AtomAction atomAction3, boolean z13, int i14, t tVar, t tVar2, t tVar3, Integer num, String str7, Integer num2, Integer num3, String str8, Boolean bool, Boolean bool2, String str9, DsInputStatus dsInputStatus, int i15, DefaultConstructorMarker defaultConstructorMarker) {
            this(i11, str, str2, z11, str3, i12, i13, str4, z12, str5, str6, atomAction, atomAction2, atomAction3, z13, i14, tVar, tVar2, tVar3, num, str7, (i15 & 2097152) != 0 ? null : num2, (i15 & 4194304) != 0 ? null : num3, str8, bool, (i15 & 33554432) != 0 ? null : bool2, (i15 & 67108864) != 0 ? null : str9, (i15 & 134217728) != 0 ? DsInputStatus.NEUTRAL : dsInputStatus, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private TextInputV2(int i11, String name, String value, boolean z11, String str, int i12, int i13, String placeholder, boolean z12, String str2, String str3, AtomAction atomAction, AtomAction atomAction2, AtomAction atomAction3, boolean z13, int i14, t tVar, t tVar2, t tVar3, Integer num, String defaultValue, Integer num2, Integer num3, String str4, Boolean bool, Boolean bool2, String str5, DsInputStatus status) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
            Intrinsics.checkNotNullParameter(status, "status");
            this.id = i11;
            this.name = name;
            this.value = value;
            this.isErrorVisible = z11;
            this.error = str;
            this.inputType = i12;
            this.keyboardType = i13;
            this.placeholder = placeholder;
            this.isEnabled = z12;
            this.mask = str2;
            this.maskPattern = str3;
            this.onChange = atomAction;
            this.onFocusLost = atomAction2;
            this.onClick = atomAction3;
            this.isMultiline = z13;
            this.imeOptions = i14;
            this.clickEvent = tVar;
            this.textChangeEvent = tVar2;
            this.focusLostTrackingInfo = tVar3;
            this.maxLength = num;
            this.defaultValue = defaultValue;
            this.rightIcon = num2;
            this.leftIcon = num3;
            this.label = str4;
            this.showMaxLengthCounter = bool;
            this.isReadOnly = bool2;
            this.icon = str5;
            this.status = status;
        }
    }

    public /* synthetic */ CommonInputV2VO(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract String getName();

    @NotNull
    public abstract String getValue();

    private CommonInputV2VO() {
    }
}
