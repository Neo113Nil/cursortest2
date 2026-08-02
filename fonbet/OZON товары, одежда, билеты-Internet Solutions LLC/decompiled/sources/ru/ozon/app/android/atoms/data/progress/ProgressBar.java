package ru.ozon.app.android.atoms.data.progress;

import B0.C2454a;
import C.J;
import De.C2859b;
import Sc.InterfaceC3999a;
import T7.P;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.j;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.R$id;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.Type;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringParceler;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u001b\u001a\u00020\fH\u0016J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003JY\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010#\u001a\u00020\fJ\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\fHÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\u0016\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\fR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011¨\u0006/"}, d2 = {"Lru/ozon/app/android/atoms/data/progress/ProgressBar;", "Lru/ozon/uni/atoms/data/AtomDTO;", "context", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "percent", "", "progressBarColor", "<init>", "(Ljava/lang/String;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;Lru/ozon/uni/atoms/utils/OzonSpannableString;ILjava/lang/String;)V", "getContext", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getPercent", "()I", "getProgressBarColor", "getItemType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ProgressBar extends AtomDTO {

    @NotNull
    public static final Parcelable.Creator<ProgressBar> CREATOR = new Creator();
    private final String context;
    private final int percent;
    private final String progressBarColor;
    private final TestInfo testInfo;

    @NotNull
    private final OzonSpannableString text;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Creator implements Parcelable.Creator<ProgressBar> {
        @Override // android.os.Parcelable.Creator
        public final ProgressBar createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = C2859b.a(ProgressBar.class, parcel, linkedHashMap2, parcel.readString(), i11, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new ProgressBar(readString, linkedHashMap, (TestInfo) parcel.readParcelable(ProgressBar.class.getClassLoader()), OzonSpannableStringParceler.INSTANCE.create(parcel), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ProgressBar[] newArray(int i11) {
            return new ProgressBar[i11];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ProgressBar(String str, Map map, TestInfo testInfo, OzonSpannableString ozonSpannableString, int i11, String str2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, r5, r6, r7, r8);
        String str3;
        int i13;
        OzonSpannableString ozonSpannableString2;
        TestInfo testInfo2;
        str = (i12 & 1) != 0 ? null : str;
        map = (i12 & 2) != 0 ? null : map;
        if ((i12 & 4) != 0) {
            str3 = str2;
            i13 = i11;
            ozonSpannableString2 = ozonSpannableString;
            testInfo2 = null;
        } else {
            str3 = str2;
            i13 = i11;
            ozonSpannableString2 = ozonSpannableString;
            testInfo2 = testInfo;
        }
    }

    public static /* synthetic */ ProgressBar copy$default(ProgressBar progressBar, String str, Map map, TestInfo testInfo, OzonSpannableString ozonSpannableString, int i11, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = progressBar.context;
        }
        if ((i12 & 2) != 0) {
            map = progressBar.trackingInfo;
        }
        if ((i12 & 4) != 0) {
            testInfo = progressBar.testInfo;
        }
        if ((i12 & 8) != 0) {
            ozonSpannableString = progressBar.text;
        }
        if ((i12 & 16) != 0) {
            i11 = progressBar.percent;
        }
        if ((i12 & 32) != 0) {
            str2 = progressBar.progressBarColor;
        }
        int i13 = i11;
        String str3 = str2;
        return progressBar.copy(str, map, testInfo, ozonSpannableString, i13, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    public final Map<String, TokenizedTrackingInfo> component2() {
        return this.trackingInfo;
    }

    /* renamed from: component3, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final OzonSpannableString getText() {
        return this.text;
    }

    /* renamed from: component5, reason: from getter */
    public final int getPercent() {
        return this.percent;
    }

    /* renamed from: component6, reason: from getter */
    public final String getProgressBarColor() {
        return this.progressBarColor;
    }

    @NotNull
    public final ProgressBar copy(String context, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo, @NotNull OzonSpannableString text, int percent, String progressBarColor) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new ProgressBar(context, trackingInfo, testInfo, text, percent, progressBarColor);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProgressBar)) {
            return false;
        }
        ProgressBar progressBar = (ProgressBar) other;
        return Intrinsics.d(this.context, progressBar.context) && Intrinsics.d(this.trackingInfo, progressBar.trackingInfo) && Intrinsics.d(this.testInfo, progressBar.testInfo) && Intrinsics.d(this.text, progressBar.text) && this.percent == progressBar.percent && Intrinsics.d(this.progressBarColor, progressBar.progressBarColor);
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.atom_type_progress_bar;
    }

    public final int getPercent() {
        return this.percent;
    }

    public final String getProgressBarColor() {
        return this.progressBarColor;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final OzonSpannableString getText() {
        return this.text;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        String str = this.context;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        int a11 = C2454a.a(this.percent, P.c(this.text, (hashCode2 + (testInfo == null ? 0 : testInfo.hashCode())) * 31, 31), 31);
        String str2 = this.progressBarColor;
        return a11 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.context;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        TestInfo testInfo = this.testInfo;
        OzonSpannableString ozonSpannableString = this.text;
        return "ProgressBar(context=" + str + ", trackingInfo=" + map + ", testInfo=" + testInfo + ", text=" + ((Object) ozonSpannableString) + ", percent=" + this.percent + ", progressBarColor=" + this.progressBarColor + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.context);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        if (map == null) {
            dest.writeInt(0);
        } else {
            Iterator e11 = J.e(map, dest, 1);
            while (e11.hasNext()) {
                Map.Entry entry = (Map.Entry) e11.next();
                dest.writeString((String) entry.getKey());
                dest.writeParcelable((Parcelable) entry.getValue(), flags);
            }
        }
        dest.writeParcelable(this.testInfo, flags);
        OzonSpannableStringParceler.INSTANCE.write(this.text, dest, flags);
        dest.writeInt(this.percent);
        dest.writeString(this.progressBarColor);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressBar(String str, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo, @NotNull OzonSpannableString text, int i11, String str2) {
        super(Type.PROGRESS_BAR, str, map, testInfo);
        Intrinsics.checkNotNullParameter(text, "text");
        this.context = str;
        this.trackingInfo = map;
        this.testInfo = testInfo;
        this.text = text;
        this.percent = i11;
        this.progressBarColor = str2;
    }
}
