package ru.ozon.app.android.travel.molecules.input.v1;

import Ak.C2436a;
import B0.C2454a;
import B3.p;
import Bi.b;
import C.C2702w;
import D40.a;
import G.g;
import Kk.C3532b;
import P4.f;
import V.e;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0013\u0014\u0015\u0016\u0017B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0014\u0010\u000f\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\n\u0082\u0001\u0005\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO;", "", "<init>", "()V", "", "getId", "()J", "id", "", "getName", "()Ljava/lang/String;", AppMeasurementSdk.ConditionalUserProperty.NAME, "getValue", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "isErrorVisible", "()Z", "getError", "error", "TextCommonInputVO", "DateCommonInputVO", "Selector", "Checkbox", "BirthCertificateCommonInputVO", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$BirthCertificateCommonInputVO;", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$Checkbox;", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$DateCommonInputVO;", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$Selector;", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$TextCommonInputVO;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class CommonInputVO {

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013Jb\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b$\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b\b\u0010&R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b'\u0010\u0017R\u001a\u0010\n\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b(\u0010&R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$BirthCertificateCommonInputVO;", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO;", "", "id", "", AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "isErrorVisible", "error", "scrollOnMount", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$Selector;", "seriesSelector", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$TextCommonInputVO;", "seriesTextInput", "<init>", "(JLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$Selector;Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$TextCommonInputVO;)V", "", "asInputsList", "()Ljava/util/List;", "copy", "(JLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$Selector;Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$TextCommonInputVO;)Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$BirthCertificateCommonInputVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getName", "getValue", "Z", "()Z", "getError", "getScrollOnMount", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$Selector;", "getSeriesSelector", "()Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$Selector;", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$TextCommonInputVO;", "getSeriesTextInput", "()Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$TextCommonInputVO;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BirthCertificateCommonInputVO extends CommonInputVO {
        private final String error;
        private final long id;
        private final boolean isErrorVisible;

        @NotNull
        private final String name;
        private final boolean scrollOnMount;

        @NotNull
        private final Selector seriesSelector;

        @NotNull
        private final TextCommonInputVO seriesTextInput;

        @NotNull
        private final String value;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ BirthCertificateCommonInputVO(long j11, String str, String str2, boolean z11, String str3, boolean z12, Selector selector, TextCommonInputVO textCommonInputVO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(j11, str, str2, z11, str3, r9, r10, r11);
            TextCommonInputVO textCommonInputVO2;
            Selector selector2;
            boolean z13;
            str = (i11 & 2) != 0 ? "" : str;
            str2 = (i11 & 4) != 0 ? "" : str2;
            z11 = (i11 & 8) != 0 ? false : z11;
            str3 = (i11 & 16) != 0 ? null : str3;
            if ((i11 & 32) != 0) {
                textCommonInputVO2 = textCommonInputVO;
                selector2 = selector;
                z13 = false;
            } else {
                textCommonInputVO2 = textCommonInputVO;
                selector2 = selector;
                z13 = z12;
            }
        }

        public static /* synthetic */ BirthCertificateCommonInputVO copy$default(BirthCertificateCommonInputVO birthCertificateCommonInputVO, long j11, String str, String str2, boolean z11, String str3, boolean z12, Selector selector, TextCommonInputVO textCommonInputVO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j11 = birthCertificateCommonInputVO.id;
            }
            long j12 = j11;
            if ((i11 & 2) != 0) {
                str = birthCertificateCommonInputVO.name;
            }
            String str4 = str;
            if ((i11 & 4) != 0) {
                str2 = birthCertificateCommonInputVO.value;
            }
            String str5 = str2;
            if ((i11 & 8) != 0) {
                z11 = birthCertificateCommonInputVO.isErrorVisible;
            }
            return birthCertificateCommonInputVO.copy(j12, str4, str5, z11, (i11 & 16) != 0 ? birthCertificateCommonInputVO.error : str3, (i11 & 32) != 0 ? birthCertificateCommonInputVO.scrollOnMount : z12, (i11 & 64) != 0 ? birthCertificateCommonInputVO.seriesSelector : selector, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? birthCertificateCommonInputVO.seriesTextInput : textCommonInputVO);
        }

        @NotNull
        public final List<CommonInputVO> asInputsList() {
            return C7714v.b0(this.seriesSelector, this.seriesTextInput);
        }

        @NotNull
        public final BirthCertificateCommonInputVO copy(long id2, @NotNull String name, @NotNull String value, boolean isErrorVisible, String error, boolean scrollOnMount, @NotNull Selector seriesSelector, @NotNull TextCommonInputVO seriesTextInput) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(seriesSelector, "seriesSelector");
            Intrinsics.checkNotNullParameter(seriesTextInput, "seriesTextInput");
            return new BirthCertificateCommonInputVO(id2, name, value, isErrorVisible, error, scrollOnMount, seriesSelector, seriesTextInput);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BirthCertificateCommonInputVO)) {
                return false;
            }
            BirthCertificateCommonInputVO birthCertificateCommonInputVO = (BirthCertificateCommonInputVO) other;
            return this.id == birthCertificateCommonInputVO.id && Intrinsics.d(this.name, birthCertificateCommonInputVO.name) && Intrinsics.d(this.value, birthCertificateCommonInputVO.value) && this.isErrorVisible == birthCertificateCommonInputVO.isErrorVisible && Intrinsics.d(this.error, birthCertificateCommonInputVO.error) && this.scrollOnMount == birthCertificateCommonInputVO.scrollOnMount && Intrinsics.d(this.seriesSelector, birthCertificateCommonInputVO.seriesSelector) && Intrinsics.d(this.seriesTextInput, birthCertificateCommonInputVO.seriesTextInput);
        }

        @Override // ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO
        public String getError() {
            return this.error;
        }

        @Override // ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO
        public long getId() {
            return this.id;
        }

        @Override // ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO
        @NotNull
        public String getName() {
            return this.name;
        }

        @NotNull
        public final Selector getSeriesSelector() {
            return this.seriesSelector;
        }

        @NotNull
        public final TextCommonInputVO getSeriesTextInput() {
            return this.seriesTextInput;
        }

        @Override // ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO
        @NotNull
        public String getValue() {
            return this.value;
        }

        public int hashCode() {
            int a11 = C3532b.a(g.a(g.a(Long.hashCode(this.id) * 31, 31, this.name), 31, this.value), 31, this.isErrorVisible);
            String str = this.error;
            return this.seriesTextInput.hashCode() + ((this.seriesSelector.hashCode() + C3532b.a((a11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.scrollOnMount)) * 31);
        }

        @Override // ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO
        /* renamed from: isErrorVisible, reason: from getter */
        public boolean getIsErrorVisible() {
            return this.isErrorVisible;
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            String str = this.name;
            String str2 = this.value;
            boolean z11 = this.isErrorVisible;
            String str3 = this.error;
            boolean z12 = this.scrollOnMount;
            Selector selector = this.seriesSelector;
            TextCommonInputVO textCommonInputVO = this.seriesTextInput;
            StringBuilder c11 = C2436a.c(j11, "BirthCertificateCommonInputVO(id=", ", name=", str);
            a.g(", value=", str2, ", isErrorVisible=", c11, z11);
            a.g(", error=", str3, ", scrollOnMount=", c11, z12);
            c11.append(", seriesSelector=");
            c11.append(selector);
            c11.append(", seriesTextInput=");
            c11.append(textCommonInputVO);
            c11.append(")");
            return c11.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BirthCertificateCommonInputVO(long j11, @NotNull String name, @NotNull String value, boolean z11, String str, boolean z12, @NotNull Selector seriesSelector, @NotNull TextCommonInputVO seriesTextInput) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(seriesSelector, "seriesSelector");
            Intrinsics.checkNotNullParameter(seriesTextInput, "seriesTextInput");
            this.id = j11;
            this.name = name;
            this.value = value;
            this.isErrorVisible = z11;
            this.error = str;
            this.scrollOnMount = z12;
            this.seriesSelector = seriesSelector;
            this.seriesTextInput = seriesTextInput;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011Jx\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b\u0007\u0010#R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b$\u0010\u0015R\u001a\u0010\t\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b%\u0010#R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b&\u0010\u0015R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b\u000b\u0010#R\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b\f\u0010#R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u000f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b*\u0010#R\u0014\u0010,\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0015¨\u0006-"}, d2 = {"Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$Checkbox;", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO;", "", "id", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "isErrorVisible", "error", "scrollOnMount", "text", "isSelected", "isEnabled", "Lru/ozon/uni/atoms/af/AtomAction;", "onSelectAction", "defaultIsSelected", "<init>", "(JLjava/lang/String;ZLjava/lang/String;ZLjava/lang/String;ZZLru/ozon/uni/atoms/af/AtomAction;Z)V", "copy", "(JLjava/lang/String;ZLjava/lang/String;ZLjava/lang/String;ZZLru/ozon/uni/atoms/af/AtomAction;Z)Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$Checkbox;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getName", "Z", "()Z", "getError", "getScrollOnMount", "getText", "Lru/ozon/uni/atoms/af/AtomAction;", "getOnSelectAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "getDefaultIsSelected", "getValue", AppMeasurementSdk.ConditionalUserProperty.VALUE, "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Checkbox extends CommonInputVO {
        public static final int $stable = AtomAction.$stable;
        private final boolean defaultIsSelected;
        private final String error;
        private final long id;
        private final boolean isEnabled;
        private final boolean isErrorVisible;
        private final boolean isSelected;

        @NotNull
        private final String name;
        private final AtomAction onSelectAction;
        private final boolean scrollOnMount;

        @NotNull
        private final String text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Checkbox(long j11, @NotNull String name, boolean z11, String str, boolean z12, @NotNull String text, boolean z13, boolean z14, AtomAction atomAction, boolean z15) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(text, "text");
            this.id = j11;
            this.name = name;
            this.isErrorVisible = z11;
            this.error = str;
            this.scrollOnMount = z12;
            this.text = text;
            this.isSelected = z13;
            this.isEnabled = z14;
            this.onSelectAction = atomAction;
            this.defaultIsSelected = z15;
        }

        public static /* synthetic */ Checkbox copy$default(Checkbox checkbox, long j11, String str, boolean z11, String str2, boolean z12, String str3, boolean z13, boolean z14, AtomAction atomAction, boolean z15, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j11 = checkbox.id;
            }
            long j12 = j11;
            if ((i11 & 2) != 0) {
                str = checkbox.name;
            }
            return checkbox.copy(j12, str, (i11 & 4) != 0 ? checkbox.isErrorVisible : z11, (i11 & 8) != 0 ? checkbox.error : str2, (i11 & 16) != 0 ? checkbox.scrollOnMount : z12, (i11 & 32) != 0 ? checkbox.text : str3, (i11 & 64) != 0 ? checkbox.isSelected : z13, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? checkbox.isEnabled : z14, (i11 & 256) != 0 ? checkbox.onSelectAction : atomAction, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? checkbox.defaultIsSelected : z15);
        }

        @NotNull
        public final Checkbox copy(long id2, @NotNull String name, boolean isErrorVisible, String error, boolean scrollOnMount, @NotNull String text, boolean isSelected, boolean isEnabled, AtomAction onSelectAction, boolean defaultIsSelected) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(text, "text");
            return new Checkbox(id2, name, isErrorVisible, error, scrollOnMount, text, isSelected, isEnabled, onSelectAction, defaultIsSelected);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Checkbox)) {
                return false;
            }
            Checkbox checkbox = (Checkbox) other;
            return this.id == checkbox.id && Intrinsics.d(this.name, checkbox.name) && this.isErrorVisible == checkbox.isErrorVisible && Intrinsics.d(this.error, checkbox.error) && this.scrollOnMount == checkbox.scrollOnMount && Intrinsics.d(this.text, checkbox.text) && this.isSelected == checkbox.isSelected && this.isEnabled == checkbox.isEnabled && Intrinsics.d(this.onSelectAction, checkbox.onSelectAction) && this.defaultIsSelected == checkbox.defaultIsSelected;
        }

        @Override // ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO
        public String getError() {
            return this.error;
        }

        @Override // ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO
        public long getId() {
            return this.id;
        }

        @Override // ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO
        @NotNull
        public String getName() {
            return this.name;
        }

        public final AtomAction getOnSelectAction() {
            return this.onSelectAction;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        @Override // ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO
        @NotNull
        public String getValue() {
            return this.isSelected ? "checked" : "";
        }

        public int hashCode() {
            int a11 = C3532b.a(g.a(Long.hashCode(this.id) * 31, 31, this.name), 31, this.isErrorVisible);
            String str = this.error;
            int a12 = C3532b.a(C3532b.a(g.a(C3532b.a((a11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.scrollOnMount), 31, this.text), 31, this.isSelected), 31, this.isEnabled);
            AtomAction atomAction = this.onSelectAction;
            return Boolean.hashCode(this.defaultIsSelected) + ((a12 + (atomAction != null ? atomAction.hashCode() : 0)) * 31);
        }

        /* renamed from: isEnabled, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        @Override // ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO
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
            long j11 = this.id;
            String str = this.name;
            boolean z11 = this.isErrorVisible;
            String str2 = this.error;
            boolean z12 = this.scrollOnMount;
            String str3 = this.text;
            boolean z13 = this.isSelected;
            boolean z14 = this.isEnabled;
            AtomAction atomAction = this.onSelectAction;
            boolean z15 = this.defaultIsSelected;
            StringBuilder c11 = C2436a.c(j11, "Checkbox(id=", ", name=", str);
            c11.append(", isErrorVisible=");
            c11.append(z11);
            c11.append(", error=");
            c11.append(str2);
            c11.append(", scrollOnMount=");
            c11.append(z12);
            c11.append(", text=");
            c11.append(str3);
            C2436a.e(", isSelected=", ", isEnabled=", c11, z13, z14);
            c11.append(", onSelectAction=");
            c11.append(atomAction);
            c11.append(", defaultIsSelected=");
            c11.append(z15);
            c11.append(")");
            return c11.toString();
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001:\u0001:B}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u009c\u0001\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00042\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b&\u0010\u001aR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b\b\u0010(R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b)\u0010\u001aR\u001a\u0010\n\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b*\u0010(R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b+\u0010\u001aR\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b\f\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010$\u001a\u0004\b2\u0010\u001aR$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u00103\u001a\u0004\b8\u00105\"\u0004\b9\u00107¨\u0006;"}, d2 = {"Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$DateCommonInputVO;", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO;", "", "id", "", AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "isErrorVisible", "error", "scrollOnMount", HammersV3BodyDTO.PLACEHOLDER, "isEnabled", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$DateCommonInputVO$DateRange;", "dateRange", "Lru/ozon/uni/atoms/af/AtomAction;", "onSelectAction", "defaultValue", "", "rightIcon", "leftIcon", "<init>", "(JLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;ZLru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$DateCommonInputVO$DateRange;Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "copy", "(JLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;ZLru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$DateCommonInputVO$DateRange;Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$DateCommonInputVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getName", "getValue", "Z", "()Z", "getError", "getScrollOnMount", "getPlaceholder", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$DateCommonInputVO$DateRange;", "getDateRange", "()Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$DateCommonInputVO$DateRange;", "Lru/ozon/uni/atoms/af/AtomAction;", "getOnSelectAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "getDefaultValue", "Ljava/lang/Integer;", "getRightIcon", "()Ljava/lang/Integer;", "setRightIcon", "(Ljava/lang/Integer;)V", "getLeftIcon", "setLeftIcon", "DateRange", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DateCommonInputVO extends CommonInputVO {
        private final DateRange dateRange;

        @NotNull
        private final String defaultValue;
        private final String error;
        private final long id;
        private final boolean isEnabled;
        private final boolean isErrorVisible;
        private Integer leftIcon;

        @NotNull
        private final String name;
        private final AtomAction onSelectAction;

        @NotNull
        private final String placeholder;
        private Integer rightIcon;
        private final boolean scrollOnMount;

        @NotNull
        private final String value;

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$DateCommonInputVO$DateRange;", "", "", "dateStart", "dateEnd", "<init>", "(JJ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getDateStart", "()J", "getDateEnd", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class DateRange {
            private final long dateEnd;
            private final long dateStart;

            public DateRange(long j11, long j12) {
                this.dateStart = j11;
                this.dateEnd = j12;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DateRange)) {
                    return false;
                }
                DateRange dateRange = (DateRange) other;
                return this.dateStart == dateRange.dateStart && this.dateEnd == dateRange.dateEnd;
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
                return f.a(this.dateEnd, ")", C2702w.d(this.dateStart, "DateRange(dateStart=", ", dateEnd="));
            }
        }

        public /* synthetic */ DateCommonInputVO(long j11, String str, String str2, boolean z11, String str3, boolean z12, String str4, boolean z13, DateRange dateRange, AtomAction atomAction, String str5, Integer num, Integer num2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(j11, str, str2, z11, str3, z12, str4, z13, dateRange, atomAction, str5, (i11 & 2048) != 0 ? null : num, (i11 & 4096) != 0 ? null : num2);
        }

        @NotNull
        public final DateCommonInputVO copy(long id2, @NotNull String name, @NotNull String value, boolean isErrorVisible, String error, boolean scrollOnMount, @NotNull String placeholder, boolean isEnabled, DateRange dateRange, AtomAction onSelectAction, @NotNull String defaultValue, Integer rightIcon, Integer leftIcon) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
            return new DateCommonInputVO(id2, name, value, isErrorVisible, error, scrollOnMount, placeholder, isEnabled, dateRange, onSelectAction, defaultValue, rightIcon, leftIcon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DateCommonInputVO)) {
                return false;
            }
            DateCommonInputVO dateCommonInputVO = (DateCommonInputVO) other;
            return this.id == dateCommonInputVO.id && Intrinsics.d(this.name, dateCommonInputVO.name) && Intrinsics.d(this.value, dateCommonInputVO.value) && this.isErrorVisible == dateCommonInputVO.isErrorVisible && Intrinsics.d(this.error, dateCommonInputVO.error) && this.scrollOnMount == dateCommonInputVO.scrollOnMount && Intrinsics.d(this.placeholder, dateCommonInputVO.placeholder) && this.isEnabled == dateCommonInputVO.isEnabled && Intrinsics.d(this.dateRange, dateCommonInputVO.dateRange) && Intrinsics.d(this.onSelectAction, dateCommonInputVO.onSelectAction) && Intrinsics.d(this.defaultValue, dateCommonInputVO.defaultValue) && Intrinsics.d(this.rightIcon, dateCommonInputVO.rightIcon) && Intrinsics.d(this.leftIcon, dateCommonInputVO.leftIcon);
        }

        public final DateRange getDateRange() {
            return this.dateRange;
        }

        @Override // ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO
        public String getError() {
            return this.error;
        }

        @Override // ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO
        public long getId() {
            return this.id;
        }

        public final Integer getLeftIcon() {
            return this.leftIcon;
        }

        @Override // ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO
        @NotNull
        public String getName() {
            return this.name;
        }

        public final AtomAction getOnSelectAction() {
            return this.onSelectAction;
        }

        @NotNull
        public final String getPlaceholder() {
            return this.placeholder;
        }

        public final Integer getRightIcon() {
            return this.rightIcon;
        }

        @Override // ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO
        @NotNull
        public String getValue() {
            return this.value;
        }

        public int hashCode() {
            int a11 = C3532b.a(g.a(g.a(Long.hashCode(this.id) * 31, 31, this.name), 31, this.value), 31, this.isErrorVisible);
            String str = this.error;
            int a12 = C3532b.a(g.a(C3532b.a((a11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.scrollOnMount), 31, this.placeholder), 31, this.isEnabled);
            DateRange dateRange = this.dateRange;
            int hashCode = (a12 + (dateRange == null ? 0 : dateRange.hashCode())) * 31;
            AtomAction atomAction = this.onSelectAction;
            int a13 = g.a((hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31, 31, this.defaultValue);
            Integer num = this.rightIcon;
            int hashCode2 = (a13 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.leftIcon;
            return hashCode2 + (num2 != null ? num2.hashCode() : 0);
        }

        /* renamed from: isEnabled, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        @Override // ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO
        /* renamed from: isErrorVisible, reason: from getter */
        public boolean getIsErrorVisible() {
            return this.isErrorVisible;
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            String str = this.name;
            String str2 = this.value;
            boolean z11 = this.isErrorVisible;
            String str3 = this.error;
            boolean z12 = this.scrollOnMount;
            String str4 = this.placeholder;
            boolean z13 = this.isEnabled;
            DateRange dateRange = this.dateRange;
            AtomAction atomAction = this.onSelectAction;
            String str5 = this.defaultValue;
            Integer num = this.rightIcon;
            Integer num2 = this.leftIcon;
            StringBuilder c11 = C2436a.c(j11, "DateCommonInputVO(id=", ", name=", str);
            a.g(", value=", str2, ", isErrorVisible=", c11, z11);
            a.g(", error=", str3, ", scrollOnMount=", c11, z12);
            a.g(", placeholder=", str4, ", isEnabled=", c11, z13);
            c11.append(", dateRange=");
            c11.append(dateRange);
            c11.append(", onSelectAction=");
            c11.append(atomAction);
            c11.append(", defaultValue=");
            c11.append(str5);
            c11.append(", rightIcon=");
            c11.append(num);
            c11.append(", leftIcon=");
            c11.append(num2);
            c11.append(")");
            return c11.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DateCommonInputVO(long j11, @NotNull String name, @NotNull String value, boolean z11, String str, boolean z12, @NotNull String placeholder, boolean z13, DateRange dateRange, AtomAction atomAction, @NotNull String defaultValue, Integer num, Integer num2) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
            this.id = j11;
            this.name = name;
            this.value = value;
            this.isErrorVisible = z11;
            this.error = str;
            this.scrollOnMount = z12;
            this.placeholder = placeholder;
            this.isEnabled = z13;
            this.dateRange = dateRange;
            this.onSelectAction = atomAction;
            this.defaultValue = defaultValue;
            this.rightIcon = num;
            this.leftIcon = num2;
        }
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u0001:\u0001GB«\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015\u0012\u000e\u0010\u0017\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001b\u0010\u001cJÐ\u0001\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00072\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u00152\u0010\b\u0002\u0010\u0017\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u00152\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u0018HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010 R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b,\u0010 R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b\b\u0010.R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b/\u0010 R\u001a\u0010\n\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b0\u0010.R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b1\u0010 R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b2\u0010 R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b\r\u0010.R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0013\u00109\u001a\u0004\b:\u0010;R\u001f\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010<\u001a\u0004\b=\u0010>R\u001f\u0010\u0017\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010<\u001a\u0004\b?\u0010>R$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010@\u001a\u0004\bE\u0010B\"\u0004\bF\u0010D¨\u0006H"}, d2 = {"Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$Selector;", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO;", "", "id", "", AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "isErrorVisible", "error", "scrollOnMount", "text", HammersV3BodyDTO.PLACEHOLDER, "isEnabled", "", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$Selector$Option;", "options", "Lru/ozon/uni/atoms/af/AtomAction;", "onSelectAction", "defaultOption", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "clickEvent", "selectEvent", "", "rightIcon", "leftIcon", "<init>", "(JLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/util/List;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$Selector$Option;LWZ/t;LWZ/t;Ljava/lang/Integer;Ljava/lang/Integer;)V", "copy", "(JLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/util/List;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$Selector$Option;LWZ/t;LWZ/t;Ljava/lang/Integer;Ljava/lang/Integer;)Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$Selector;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getName", "getValue", "Z", "()Z", "getError", "getScrollOnMount", "getText", "getPlaceholder", "Ljava/util/List;", "getOptions", "()Ljava/util/List;", "Lru/ozon/uni/atoms/af/AtomAction;", "getOnSelectAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$Selector$Option;", "getDefaultOption", "()Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$Selector$Option;", "LWZ/t;", "getClickEvent", "()LWZ/t;", "getSelectEvent", "Ljava/lang/Integer;", "getRightIcon", "()Ljava/lang/Integer;", "setRightIcon", "(Ljava/lang/Integer;)V", "getLeftIcon", "setLeftIcon", "Option", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Selector extends CommonInputVO {
        private final t clickEvent;
        private final Option defaultOption;
        private final String error;
        private final long id;
        private final boolean isEnabled;
        private final boolean isErrorVisible;
        private Integer leftIcon;

        @NotNull
        private final String name;
        private final AtomAction onSelectAction;

        @NotNull
        private final List<Option> options;

        @NotNull
        private final String placeholder;
        private Integer rightIcon;
        private final boolean scrollOnMount;
        private final t selectEvent;

        @NotNull
        private final String text;

        @NotNull
        private final String value;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$Selector$Option;", "", "", "code", AppMeasurementSdk.ConditionalUserProperty.VALUE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCode", "getValue", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Option {

            @NotNull
            private final String code;

            @NotNull
            private final String value;

            public Option(@NotNull String code, @NotNull String value) {
                Intrinsics.checkNotNullParameter(code, "code");
                Intrinsics.checkNotNullParameter(value, "value");
                this.code = code;
                this.value = value;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Option)) {
                    return false;
                }
                Option option = (Option) other;
                return Intrinsics.d(this.code, option.code) && Intrinsics.d(this.value, option.value);
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
                return e.a("Option(code=", this.code, ", value=", this.value, ")");
            }
        }

        public /* synthetic */ Selector(long j11, String str, String str2, boolean z11, String str3, boolean z12, String str4, String str5, boolean z13, List list, AtomAction atomAction, Option option, t tVar, t tVar2, Integer num, Integer num2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(j11, str, str2, z11, str3, z12, str4, str5, z13, list, atomAction, option, tVar, tVar2, (i11 & 16384) != 0 ? null : num, (i11 & 32768) != 0 ? null : num2);
        }

        @NotNull
        public final Selector copy(long id2, @NotNull String name, @NotNull String value, boolean isErrorVisible, String error, boolean scrollOnMount, @NotNull String text, @NotNull String placeholder, boolean isEnabled, @NotNull List<Option> options, AtomAction onSelectAction, Option defaultOption, t clickEvent, t selectEvent, Integer rightIcon, Integer leftIcon) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(options, "options");
            return new Selector(id2, name, value, isErrorVisible, error, scrollOnMount, text, placeholder, isEnabled, options, onSelectAction, defaultOption, clickEvent, selectEvent, rightIcon, leftIcon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Selector)) {
                return false;
            }
            Selector selector = (Selector) other;
            return this.id == selector.id && Intrinsics.d(this.name, selector.name) && Intrinsics.d(this.value, selector.value) && this.isErrorVisible == selector.isErrorVisible && Intrinsics.d(this.error, selector.error) && this.scrollOnMount == selector.scrollOnMount && Intrinsics.d(this.text, selector.text) && Intrinsics.d(this.placeholder, selector.placeholder) && this.isEnabled == selector.isEnabled && Intrinsics.d(this.options, selector.options) && Intrinsics.d(this.onSelectAction, selector.onSelectAction) && Intrinsics.d(this.defaultOption, selector.defaultOption) && Intrinsics.d(this.clickEvent, selector.clickEvent) && Intrinsics.d(this.selectEvent, selector.selectEvent) && Intrinsics.d(this.rightIcon, selector.rightIcon) && Intrinsics.d(this.leftIcon, selector.leftIcon);
        }

        public final t getClickEvent() {
            return this.clickEvent;
        }

        public final Option getDefaultOption() {
            return this.defaultOption;
        }

        @Override // ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO
        public String getError() {
            return this.error;
        }

        @Override // ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO
        public long getId() {
            return this.id;
        }

        public final Integer getLeftIcon() {
            return this.leftIcon;
        }

        @Override // ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO
        @NotNull
        public String getName() {
            return this.name;
        }

        public final AtomAction getOnSelectAction() {
            return this.onSelectAction;
        }

        @NotNull
        public final List<Option> getOptions() {
            return this.options;
        }

        @NotNull
        public final String getPlaceholder() {
            return this.placeholder;
        }

        public final Integer getRightIcon() {
            return this.rightIcon;
        }

        public final t getSelectEvent() {
            return this.selectEvent;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        @Override // ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO
        @NotNull
        public String getValue() {
            return this.value;
        }

        public int hashCode() {
            int a11 = C3532b.a(g.a(g.a(Long.hashCode(this.id) * 31, 31, this.name), 31, this.value), 31, this.isErrorVisible);
            String str = this.error;
            int b11 = g.b(C3532b.a(g.a(g.a(C3532b.a((a11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.scrollOnMount), 31, this.text), 31, this.placeholder), 31, this.isEnabled), 31, this.options);
            AtomAction atomAction = this.onSelectAction;
            int hashCode = (b11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            Option option = this.defaultOption;
            int hashCode2 = (hashCode + (option == null ? 0 : option.hashCode())) * 31;
            t tVar = this.clickEvent;
            int hashCode3 = (hashCode2 + (tVar == null ? 0 : tVar.hashCode())) * 31;
            t tVar2 = this.selectEvent;
            int hashCode4 = (hashCode3 + (tVar2 == null ? 0 : tVar2.hashCode())) * 31;
            Integer num = this.rightIcon;
            int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.leftIcon;
            return hashCode5 + (num2 != null ? num2.hashCode() : 0);
        }

        /* renamed from: isEnabled, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        @Override // ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO
        /* renamed from: isErrorVisible, reason: from getter */
        public boolean getIsErrorVisible() {
            return this.isErrorVisible;
        }

        public final void setRightIcon(Integer num) {
            this.rightIcon = num;
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            String str = this.name;
            String str2 = this.value;
            boolean z11 = this.isErrorVisible;
            String str3 = this.error;
            boolean z12 = this.scrollOnMount;
            String str4 = this.text;
            String str5 = this.placeholder;
            boolean z13 = this.isEnabled;
            List<Option> list = this.options;
            AtomAction atomAction = this.onSelectAction;
            Option option = this.defaultOption;
            t tVar = this.clickEvent;
            t tVar2 = this.selectEvent;
            Integer num = this.rightIcon;
            Integer num2 = this.leftIcon;
            StringBuilder c11 = C2436a.c(j11, "Selector(id=", ", name=", str);
            a.g(", value=", str2, ", isErrorVisible=", c11, z11);
            a.g(", error=", str3, ", scrollOnMount=", c11, z12);
            Nh.a.h(c11, ", text=", str4, ", placeholder=", str5);
            c11.append(", isEnabled=");
            c11.append(z13);
            c11.append(", options=");
            c11.append(list);
            c11.append(", onSelectAction=");
            c11.append(atomAction);
            c11.append(", defaultOption=");
            c11.append(option);
            p.d(c11, ", clickEvent=", tVar, ", selectEvent=", tVar2);
            c11.append(", rightIcon=");
            c11.append(num);
            c11.append(", leftIcon=");
            c11.append(num2);
            c11.append(")");
            return c11.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Selector(long j11, @NotNull String name, @NotNull String value, boolean z11, String str, boolean z12, @NotNull String text, @NotNull String placeholder, boolean z13, @NotNull List<Option> options, AtomAction atomAction, Option option, t tVar, t tVar2, Integer num, Integer num2) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(options, "options");
            this.id = j11;
            this.name = name;
            this.value = value;
            this.isErrorVisible = z11;
            this.error = str;
            this.scrollOnMount = z12;
            this.text = text;
            this.placeholder = placeholder;
            this.isEnabled = z13;
            this.options = options;
            this.onSelectAction = atomAction;
            this.defaultOption = option;
            this.clickEvent = tVar;
            this.selectEvent = tVar2;
            this.rightIcon = num;
            this.leftIcon = num2;
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b'\b\u0087\b\u0018\u00002\u00020\u0001BÑ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u000e\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015\u0012\u000e\u0010\u0017\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0007\u0012\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u001d\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001fJþ\u0001\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\u0010\b\u0002\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u00152\u0010\b\u0002\u0010\u0017\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00072\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020\u00072\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010#R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b/\u0010#R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b\b\u00101R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b2\u0010#R\u001a\u0010\n\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b3\u00101R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b5\u0010%R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b6\u0010#R\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u00100\u001a\u0004\b\u000e\u00101R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b7\u0010#R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u0012\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u00100\u001a\u0004\b\u0012\u00101R\u0017\u0010\u0013\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0013\u00104\u001a\u0004\b;\u0010%R\u001f\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010<\u001a\u0004\b=\u0010>R\u001f\u0010\u0017\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010<\u001a\u0004\b?\u0010>R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010-\u001a\u0004\bC\u0010#R\u0017\u0010\u001a\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u00100\u001a\u0004\bD\u00101R$\u0010\u001b\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010@\u001a\u0004\bE\u0010B\"\u0004\bF\u0010GR$\u0010\u001c\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010@\u001a\u0004\bH\u0010B\"\u0004\bI\u0010GR\"\u0010\u001d\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u00100\u001a\u0004\bJ\u00101\"\u0004\bK\u0010L¨\u0006M"}, d2 = {"Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$TextCommonInputVO;", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO;", "", "id", "", AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "isErrorVisible", "error", "scrollOnMount", "", "inputType", HammersV3BodyDTO.PLACEHOLDER, "isEnabled", FormPageDTO.Field.FIELD_TYPE_MASK, "Lru/ozon/uni/atoms/af/AtomAction;", "onChange", "isMultiline", "imeOptions", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "clickEvent", "focusLostEvent", "maxLength", "defaultValue", "shouldUpdateValue", "rightIcon", "leftIcon", "focusOnMount", "<init>", "(JLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZILjava/lang/String;ZLjava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;ZILWZ/t;LWZ/t;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;Z)V", "copy", "(JLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZILjava/lang/String;ZLjava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;ZILWZ/t;LWZ/t;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;Z)Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$TextCommonInputVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getName", "getValue", "Z", "()Z", "getError", "getScrollOnMount", "I", "getInputType", "getPlaceholder", "getMask", "Lru/ozon/uni/atoms/af/AtomAction;", "getOnChange", "()Lru/ozon/uni/atoms/af/AtomAction;", "getImeOptions", "LWZ/t;", "getClickEvent", "()LWZ/t;", "getFocusLostEvent", "Ljava/lang/Integer;", "getMaxLength", "()Ljava/lang/Integer;", "getDefaultValue", "getShouldUpdateValue", "getRightIcon", "setRightIcon", "(Ljava/lang/Integer;)V", "getLeftIcon", "setLeftIcon", "getFocusOnMount", "setFocusOnMount", "(Z)V", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TextCommonInputVO extends CommonInputVO {
        private final t clickEvent;

        @NotNull
        private final String defaultValue;
        private final String error;
        private final t focusLostEvent;
        private boolean focusOnMount;
        private final long id;
        private final int imeOptions;
        private final int inputType;
        private final boolean isEnabled;
        private final boolean isErrorVisible;
        private final boolean isMultiline;
        private Integer leftIcon;
        private final String mask;
        private final Integer maxLength;

        @NotNull
        private final String name;
        private final AtomAction onChange;

        @NotNull
        private final String placeholder;
        private Integer rightIcon;
        private final boolean scrollOnMount;
        private final boolean shouldUpdateValue;

        @NotNull
        private final String value;

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ TextCommonInputVO(long r25, java.lang.String r27, java.lang.String r28, boolean r29, java.lang.String r30, boolean r31, int r32, java.lang.String r33, boolean r34, java.lang.String r35, ru.ozon.uni.atoms.af.AtomAction r36, boolean r37, int r38, WZ.t r39, WZ.t r40, java.lang.Integer r41, java.lang.String r42, boolean r43, java.lang.Integer r44, java.lang.Integer r45, boolean r46, int r47, kotlin.jvm.internal.DefaultConstructorMarker r48) {
            /*
                r24 = this;
                r0 = 131072(0x20000, float:1.83671E-40)
                r0 = r47 & r0
                if (r0 == 0) goto La
                r0 = 1
                r20 = r0
                goto Lc
            La:
                r20 = r43
            Lc:
                r0 = 262144(0x40000, float:3.67342E-40)
                r0 = r47 & r0
                r1 = 0
                if (r0 == 0) goto L16
                r21 = r1
                goto L18
            L16:
                r21 = r44
            L18:
                r0 = 524288(0x80000, float:7.34684E-40)
                r0 = r47 & r0
                if (r0 == 0) goto L47
                r22 = r1
                r2 = r25
                r4 = r27
                r5 = r28
                r6 = r29
                r7 = r30
                r8 = r31
                r9 = r32
                r10 = r33
                r11 = r34
                r12 = r35
                r13 = r36
                r14 = r37
                r15 = r38
                r16 = r39
                r17 = r40
                r18 = r41
                r19 = r42
                r23 = r46
                r1 = r24
                goto L6f
            L47:
                r22 = r45
                r1 = r24
                r2 = r25
                r4 = r27
                r5 = r28
                r6 = r29
                r7 = r30
                r8 = r31
                r9 = r32
                r10 = r33
                r11 = r34
                r12 = r35
                r13 = r36
                r14 = r37
                r15 = r38
                r16 = r39
                r17 = r40
                r18 = r41
                r19 = r42
                r23 = r46
            L6f:
                r1.<init>(r2, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO.TextCommonInputVO.<init>(long, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, int, java.lang.String, boolean, java.lang.String, ru.ozon.uni.atoms.af.AtomAction, boolean, int, WZ.t, WZ.t, java.lang.Integer, java.lang.String, boolean, java.lang.Integer, java.lang.Integer, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public static /* synthetic */ TextCommonInputVO copy$default(TextCommonInputVO textCommonInputVO, long j11, String str, String str2, boolean z11, String str3, boolean z12, int i11, String str4, boolean z13, String str5, AtomAction atomAction, boolean z14, int i12, t tVar, t tVar2, Integer num, String str6, boolean z15, Integer num2, Integer num3, boolean z16, int i13, Object obj) {
            boolean z17;
            Integer num4;
            long j12 = (i13 & 1) != 0 ? textCommonInputVO.id : j11;
            String str7 = (i13 & 2) != 0 ? textCommonInputVO.name : str;
            String str8 = (i13 & 4) != 0 ? textCommonInputVO.value : str2;
            boolean z18 = (i13 & 8) != 0 ? textCommonInputVO.isErrorVisible : z11;
            String str9 = (i13 & 16) != 0 ? textCommonInputVO.error : str3;
            boolean z19 = (i13 & 32) != 0 ? textCommonInputVO.scrollOnMount : z12;
            int i14 = (i13 & 64) != 0 ? textCommonInputVO.inputType : i11;
            String str10 = (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? textCommonInputVO.placeholder : str4;
            boolean z21 = (i13 & 256) != 0 ? textCommonInputVO.isEnabled : z13;
            String str11 = (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? textCommonInputVO.mask : str5;
            AtomAction atomAction2 = (i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? textCommonInputVO.onChange : atomAction;
            boolean z22 = (i13 & 2048) != 0 ? textCommonInputVO.isMultiline : z14;
            int i15 = (i13 & 4096) != 0 ? textCommonInputVO.imeOptions : i12;
            long j13 = j12;
            t tVar3 = (i13 & 8192) != 0 ? textCommonInputVO.clickEvent : tVar;
            t tVar4 = (i13 & 16384) != 0 ? textCommonInputVO.focusLostEvent : tVar2;
            Integer num5 = (i13 & 32768) != 0 ? textCommonInputVO.maxLength : num;
            String str12 = (i13 & 65536) != 0 ? textCommonInputVO.defaultValue : str6;
            boolean z23 = (i13 & 131072) != 0 ? textCommonInputVO.shouldUpdateValue : z15;
            Integer num6 = (i13 & 262144) != 0 ? textCommonInputVO.rightIcon : num2;
            Integer num7 = (i13 & 524288) != 0 ? textCommonInputVO.leftIcon : num3;
            if ((i13 & 1048576) != 0) {
                num4 = num7;
                z17 = textCommonInputVO.focusOnMount;
            } else {
                z17 = z16;
                num4 = num7;
            }
            return textCommonInputVO.copy(j13, str7, str8, z18, str9, z19, i14, str10, z21, str11, atomAction2, z22, i15, tVar3, tVar4, num5, str12, z23, num6, num4, z17);
        }

        @NotNull
        public final TextCommonInputVO copy(long id2, @NotNull String name, @NotNull String value, boolean isErrorVisible, String error, boolean scrollOnMount, int inputType, @NotNull String placeholder, boolean isEnabled, String mask, AtomAction onChange, boolean isMultiline, int imeOptions, t clickEvent, t focusLostEvent, Integer maxLength, @NotNull String defaultValue, boolean shouldUpdateValue, Integer rightIcon, Integer leftIcon, boolean focusOnMount) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
            return new TextCommonInputVO(id2, name, value, isErrorVisible, error, scrollOnMount, inputType, placeholder, isEnabled, mask, onChange, isMultiline, imeOptions, clickEvent, focusLostEvent, maxLength, defaultValue, shouldUpdateValue, rightIcon, leftIcon, focusOnMount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextCommonInputVO)) {
                return false;
            }
            TextCommonInputVO textCommonInputVO = (TextCommonInputVO) other;
            return this.id == textCommonInputVO.id && Intrinsics.d(this.name, textCommonInputVO.name) && Intrinsics.d(this.value, textCommonInputVO.value) && this.isErrorVisible == textCommonInputVO.isErrorVisible && Intrinsics.d(this.error, textCommonInputVO.error) && this.scrollOnMount == textCommonInputVO.scrollOnMount && this.inputType == textCommonInputVO.inputType && Intrinsics.d(this.placeholder, textCommonInputVO.placeholder) && this.isEnabled == textCommonInputVO.isEnabled && Intrinsics.d(this.mask, textCommonInputVO.mask) && Intrinsics.d(this.onChange, textCommonInputVO.onChange) && this.isMultiline == textCommonInputVO.isMultiline && this.imeOptions == textCommonInputVO.imeOptions && Intrinsics.d(this.clickEvent, textCommonInputVO.clickEvent) && Intrinsics.d(this.focusLostEvent, textCommonInputVO.focusLostEvent) && Intrinsics.d(this.maxLength, textCommonInputVO.maxLength) && Intrinsics.d(this.defaultValue, textCommonInputVO.defaultValue) && this.shouldUpdateValue == textCommonInputVO.shouldUpdateValue && Intrinsics.d(this.rightIcon, textCommonInputVO.rightIcon) && Intrinsics.d(this.leftIcon, textCommonInputVO.leftIcon) && this.focusOnMount == textCommonInputVO.focusOnMount;
        }

        public final t getClickEvent() {
            return this.clickEvent;
        }

        @NotNull
        public final String getDefaultValue() {
            return this.defaultValue;
        }

        @Override // ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO
        public String getError() {
            return this.error;
        }

        public final t getFocusLostEvent() {
            return this.focusLostEvent;
        }

        public final boolean getFocusOnMount() {
            return this.focusOnMount;
        }

        @Override // ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO
        public long getId() {
            return this.id;
        }

        public final int getImeOptions() {
            return this.imeOptions;
        }

        public final int getInputType() {
            return this.inputType;
        }

        public final Integer getLeftIcon() {
            return this.leftIcon;
        }

        public final String getMask() {
            return this.mask;
        }

        public final Integer getMaxLength() {
            return this.maxLength;
        }

        @Override // ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO
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

        public final boolean getShouldUpdateValue() {
            return this.shouldUpdateValue;
        }

        @Override // ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO
        @NotNull
        public String getValue() {
            return this.value;
        }

        public int hashCode() {
            int a11 = C3532b.a(g.a(g.a(Long.hashCode(this.id) * 31, 31, this.name), 31, this.value), 31, this.isErrorVisible);
            String str = this.error;
            int a12 = C3532b.a(g.a(C2454a.a(this.inputType, C3532b.a((a11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.scrollOnMount), 31), 31, this.placeholder), 31, this.isEnabled);
            String str2 = this.mask;
            int hashCode = (a12 + (str2 == null ? 0 : str2.hashCode())) * 31;
            AtomAction atomAction = this.onChange;
            int a13 = C2454a.a(this.imeOptions, C3532b.a((hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31, 31, this.isMultiline), 31);
            t tVar = this.clickEvent;
            int hashCode2 = (a13 + (tVar == null ? 0 : tVar.hashCode())) * 31;
            t tVar2 = this.focusLostEvent;
            int hashCode3 = (hashCode2 + (tVar2 == null ? 0 : tVar2.hashCode())) * 31;
            Integer num = this.maxLength;
            int a14 = C3532b.a(g.a((hashCode3 + (num == null ? 0 : num.hashCode())) * 31, 31, this.defaultValue), 31, this.shouldUpdateValue);
            Integer num2 = this.rightIcon;
            int hashCode4 = (a14 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.leftIcon;
            return Boolean.hashCode(this.focusOnMount) + ((hashCode4 + (num3 != null ? num3.hashCode() : 0)) * 31);
        }

        /* renamed from: isEnabled, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        @Override // ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO
        /* renamed from: isErrorVisible, reason: from getter */
        public boolean getIsErrorVisible() {
            return this.isErrorVisible;
        }

        /* renamed from: isMultiline, reason: from getter */
        public final boolean getIsMultiline() {
            return this.isMultiline;
        }

        public final void setFocusOnMount(boolean z11) {
            this.focusOnMount = z11;
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            String str = this.name;
            String str2 = this.value;
            boolean z11 = this.isErrorVisible;
            String str3 = this.error;
            boolean z12 = this.scrollOnMount;
            int i11 = this.inputType;
            String str4 = this.placeholder;
            boolean z13 = this.isEnabled;
            String str5 = this.mask;
            AtomAction atomAction = this.onChange;
            boolean z14 = this.isMultiline;
            int i12 = this.imeOptions;
            t tVar = this.clickEvent;
            t tVar2 = this.focusLostEvent;
            Integer num = this.maxLength;
            String str6 = this.defaultValue;
            boolean z15 = this.shouldUpdateValue;
            Integer num2 = this.rightIcon;
            Integer num3 = this.leftIcon;
            boolean z16 = this.focusOnMount;
            StringBuilder c11 = C2436a.c(j11, "TextCommonInputVO(id=", ", name=", str);
            a.g(", value=", str2, ", isErrorVisible=", c11, z11);
            a.g(", error=", str3, ", scrollOnMount=", c11, z12);
            c11.append(", inputType=");
            c11.append(i11);
            c11.append(", placeholder=");
            c11.append(str4);
            c11.append(", isEnabled=");
            c11.append(z13);
            c11.append(", mask=");
            c11.append(str5);
            c11.append(", onChange=");
            c11.append(atomAction);
            c11.append(", isMultiline=");
            c11.append(z14);
            c11.append(", imeOptions=");
            c11.append(i12);
            c11.append(", clickEvent=");
            c11.append(tVar);
            c11.append(", focusLostEvent=");
            c11.append(tVar2);
            c11.append(", maxLength=");
            c11.append(num);
            a.g(", defaultValue=", str6, ", shouldUpdateValue=", c11, z15);
            c11.append(", rightIcon=");
            c11.append(num2);
            c11.append(", leftIcon=");
            c11.append(num3);
            return b.f(c11, ", focusOnMount=", z16, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TextCommonInputVO(long j11, @NotNull String name, @NotNull String value, boolean z11, String str, boolean z12, int i11, @NotNull String placeholder, boolean z13, String str2, AtomAction atomAction, boolean z14, int i12, t tVar, t tVar2, Integer num, @NotNull String defaultValue, boolean z15, Integer num2, Integer num3, boolean z16) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
            this.id = j11;
            this.name = name;
            this.value = value;
            this.isErrorVisible = z11;
            this.error = str;
            this.scrollOnMount = z12;
            this.inputType = i11;
            this.placeholder = placeholder;
            this.isEnabled = z13;
            this.mask = str2;
            this.onChange = atomAction;
            this.isMultiline = z14;
            this.imeOptions = i12;
            this.clickEvent = tVar;
            this.focusLostEvent = tVar2;
            this.maxLength = num;
            this.defaultValue = defaultValue;
            this.shouldUpdateValue = z15;
            this.rightIcon = num2;
            this.leftIcon = num3;
            this.focusOnMount = z16;
        }
    }

    public /* synthetic */ CommonInputVO(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getError();

    public abstract long getId();

    @NotNull
    public abstract String getName();

    @NotNull
    public abstract String getValue();

    /* renamed from: isErrorVisible */
    public abstract boolean getIsErrorVisible();

    private CommonInputVO() {
    }
}
