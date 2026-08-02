package ru.ozon.id.nativeauth.data.models;

import An.C2439a;
import C.J;
import C.o0;
import D3.h;
import D40.c;
import G.g;
import I0.C3173b;
import N3.C3660k;
import T7.P;
import Ul.C4070a;
import V.e;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.id.common.disclaimer.DisclaimerDTO;
import ru.ozon.id.nativeauth.data.models.a;
import ru.ozon.uni.atoms.html.OzonHtmlParser;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b#\b\u0081\b\u0018\u00002\u00020\u0001:\u000bWXYZ[\\]^_`aB}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u001d¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0018\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0018\u0010,\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b,\u0010)J\u0012\u0010-\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b7\u00108J\u009c\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b;\u0010%J\u0010\u0010<\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b<\u0010#J\u001a\u0010@\u001a\u00020?2\b\u0010>\u001a\u0004\u0018\u00010=HÖ\u0003¢\u0006\u0004\b@\u0010AR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010B\u001a\u0004\bC\u0010%R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010D\u001a\u0004\bE\u0010'R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010F\u001a\u0004\bG\u0010)R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010H\u001a\u0004\bI\u0010+R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010F\u001a\u0004\bJ\u0010)R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010K\u001a\u0004\bL\u0010.R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010M\u001a\u0004\bN\u00100R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010O\u001a\u0004\bP\u00102R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010Q\u001a\u0004\bR\u00104R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010S\u001a\u0004\bT\u00106R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010U\u001a\u0004\bV\u00108¨\u0006b"}, d2 = {"Lru/ozon/id/nativeauth/data/models/EntryDTO;", "Landroid/os/Parcelable;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "subtitle", "", "Lru/ozon/id/nativeauth/data/models/EntryDTO$InputDTO;", "inputs", "Lru/ozon/id/nativeauth/data/models/EntryDTO$SubmitButtonDTO;", "submitButton", "Lru/ozon/id/nativeauth/data/models/EntryDTO$EntryButtonDTO;", "hintButtons", "Lru/ozon/id/nativeauth/data/models/EntryDTO$SocialLoginDTO;", "socialLogin", "Lru/ozon/id/nativeauth/data/models/EntryDTO$AlertEntry;", "alertEntry", "Lru/ozon/id/common/disclaimer/DisclaimerDTO;", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "Lru/ozon/id/nativeauth/data/models/EntryDTO$TermsOfUse;", "termsOfUseText", "Lru/ozon/id/nativeauth/data/models/EntryDTO$TranslationLexemes;", "translationLexemes", "Lru/ozon/id/nativeauth/data/models/EntryDTO$FeatureFlags;", "featureFlags", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/util/List;Lru/ozon/id/nativeauth/data/models/EntryDTO$SubmitButtonDTO;Ljava/util/List;Lru/ozon/id/nativeauth/data/models/EntryDTO$SocialLoginDTO;Lru/ozon/id/nativeauth/data/models/EntryDTO$AlertEntry;Lru/ozon/id/common/disclaimer/DisclaimerDTO;Lru/ozon/id/nativeauth/data/models/EntryDTO$TermsOfUse;Lru/ozon/id/nativeauth/data/models/EntryDTO$TranslationLexemes;Lru/ozon/id/nativeauth/data/models/EntryDTO$FeatureFlags;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "component3", "()Ljava/util/List;", "component4", "()Lru/ozon/id/nativeauth/data/models/EntryDTO$SubmitButtonDTO;", "component5", "component6", "()Lru/ozon/id/nativeauth/data/models/EntryDTO$SocialLoginDTO;", "component7", "()Lru/ozon/id/nativeauth/data/models/EntryDTO$AlertEntry;", "component8", "()Lru/ozon/id/common/disclaimer/DisclaimerDTO;", "component9", "()Lru/ozon/id/nativeauth/data/models/EntryDTO$TermsOfUse;", "component10", "()Lru/ozon/id/nativeauth/data/models/EntryDTO$TranslationLexemes;", "component11", "()Lru/ozon/id/nativeauth/data/models/EntryDTO$FeatureFlags;", "copy", "(Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/util/List;Lru/ozon/id/nativeauth/data/models/EntryDTO$SubmitButtonDTO;Ljava/util/List;Lru/ozon/id/nativeauth/data/models/EntryDTO$SocialLoginDTO;Lru/ozon/id/nativeauth/data/models/EntryDTO$AlertEntry;Lru/ozon/id/common/disclaimer/DisclaimerDTO;Lru/ozon/id/nativeauth/data/models/EntryDTO$TermsOfUse;Lru/ozon/id/nativeauth/data/models/EntryDTO$TranslationLexemes;Lru/ozon/id/nativeauth/data/models/EntryDTO$FeatureFlags;)Lru/ozon/id/nativeauth/data/models/EntryDTO;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getSubtitle", "Ljava/util/List;", "getInputs", "Lru/ozon/id/nativeauth/data/models/EntryDTO$SubmitButtonDTO;", "getSubmitButton", "getHintButtons", "Lru/ozon/id/nativeauth/data/models/EntryDTO$SocialLoginDTO;", "getSocialLogin", "Lru/ozon/id/nativeauth/data/models/EntryDTO$AlertEntry;", "getAlertEntry", "Lru/ozon/id/common/disclaimer/DisclaimerDTO;", "getDisclaimer", "Lru/ozon/id/nativeauth/data/models/EntryDTO$TermsOfUse;", "getTermsOfUseText", "Lru/ozon/id/nativeauth/data/models/EntryDTO$TranslationLexemes;", "getTranslationLexemes", "Lru/ozon/id/nativeauth/data/models/EntryDTO$FeatureFlags;", "getFeatureFlags", "InputDTO", "SubmitButtonDTO", "EntryButtonDTO", "SocialLoginDTO", "SocialButtonDTO", "b", "TermsOfUse", "AlertEntry", "Biometry", "TranslationLexemes", "FeatureFlags", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EntryDTO implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EntryDTO> CREATOR = new a();
    private final AlertEntry alertEntry;
    private final DisclaimerDTO disclaimer;
    private final FeatureFlags featureFlags;
    private final List<EntryButtonDTO> hintButtons;
    private final List<InputDTO> inputs;
    private final SocialLoginDTO socialLogin;
    private final SubmitButtonDTO submitButton;
    private final OzonSpannableString subtitle;
    private final TermsOfUse termsOfUseText;

    @NotNull
    private final String title;

    @NotNull
    private final TranslationLexemes translationLexemes;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lru/ozon/id/nativeauth/data/models/EntryDTO$AlertEntry;", "Landroid/os/Parcelable;", "biometry", "Lru/ozon/id/nativeauth/data/models/EntryDTO$Biometry;", "<init>", "(Lru/ozon/id/nativeauth/data/models/EntryDTO$Biometry;)V", "getBiometry", "()Lru/ozon/id/nativeauth/data/models/EntryDTO$Biometry;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AlertEntry implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<AlertEntry> CREATOR = new a();
        private final Biometry biometry;

        public static final class a implements Parcelable.Creator<AlertEntry> {
            @Override // android.os.Parcelable.Creator
            public final AlertEntry createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AlertEntry(parcel.readInt() == 0 ? null : Biometry.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final AlertEntry[] newArray(int i11) {
                return new AlertEntry[i11];
            }
        }

        public AlertEntry(Biometry biometry) {
            this.biometry = biometry;
        }

        public static /* synthetic */ AlertEntry copy$default(AlertEntry alertEntry, Biometry biometry, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                biometry = alertEntry.biometry;
            }
            return alertEntry.copy(biometry);
        }

        /* renamed from: component1, reason: from getter */
        public final Biometry getBiometry() {
            return this.biometry;
        }

        @NotNull
        public final AlertEntry copy(Biometry biometry) {
            return new AlertEntry(biometry);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AlertEntry) && Intrinsics.d(this.biometry, ((AlertEntry) other).biometry);
        }

        public final Biometry getBiometry() {
            return this.biometry;
        }

        public int hashCode() {
            Biometry biometry = this.biometry;
            if (biometry == null) {
                return 0;
            }
            return biometry.hashCode();
        }

        @NotNull
        public String toString() {
            return "AlertEntry(biometry=" + this.biometry + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Biometry biometry = this.biometry;
            if (biometry == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                biometry.writeToParcel(dest, flags);
            }
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lru/ozon/id/nativeauth/data/models/EntryDTO$Biometry;", "Landroid/os/Parcelable;", "action", "", ClientData.KEY_CHALLENGE, "buttonTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "getChallenge", "getButtonTitle", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Biometry implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Biometry> CREATOR = new a();

        @NotNull
        private final String action;

        @NotNull
        private final String buttonTitle;

        @NotNull
        private final String challenge;

        public static final class a implements Parcelable.Creator<Biometry> {
            @Override // android.os.Parcelable.Creator
            public final Biometry createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Biometry(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Biometry[] newArray(int i11) {
                return new Biometry[i11];
            }
        }

        public Biometry(@NotNull String action, @NotNull String challenge, @NotNull String buttonTitle) {
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(challenge, "challenge");
            Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
            this.action = action;
            this.challenge = challenge;
            this.buttonTitle = buttonTitle;
        }

        public static /* synthetic */ Biometry copy$default(Biometry biometry, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = biometry.action;
            }
            if ((i11 & 2) != 0) {
                str2 = biometry.challenge;
            }
            if ((i11 & 4) != 0) {
                str3 = biometry.buttonTitle;
            }
            return biometry.copy(str, str2, str3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getAction() {
            return this.action;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getChallenge() {
            return this.challenge;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getButtonTitle() {
            return this.buttonTitle;
        }

        @NotNull
        public final Biometry copy(@NotNull String action, @NotNull String challenge, @NotNull String buttonTitle) {
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(challenge, "challenge");
            Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
            return new Biometry(action, challenge, buttonTitle);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Biometry)) {
                return false;
            }
            Biometry biometry = (Biometry) other;
            return Intrinsics.d(this.action, biometry.action) && Intrinsics.d(this.challenge, biometry.challenge) && Intrinsics.d(this.buttonTitle, biometry.buttonTitle);
        }

        @NotNull
        public final String getAction() {
            return this.action;
        }

        @NotNull
        public final String getButtonTitle() {
            return this.buttonTitle;
        }

        @NotNull
        public final String getChallenge() {
            return this.challenge;
        }

        public int hashCode() {
            return this.buttonTitle.hashCode() + g.a(this.action.hashCode() * 31, 31, this.challenge);
        }

        @NotNull
        public String toString() {
            String str = this.action;
            String str2 = this.challenge;
            return o0.c(C3660k.d("Biometry(action=", str, ", challenge=", str2, ", buttonTitle="), this.buttonTitle, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.action);
            dest.writeString(this.challenge);
            dest.writeString(this.buttonTitle);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BK\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u001e\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J`\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b#\u0010\u0019J\u0010\u0010$\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b$\u0010\u0017J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b'\u0010(R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b+\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b.\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b/\u0010\u0019R%\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b1\u0010 ¨\u00062"}, d2 = {"Lru/ozon/id/nativeauth/data/models/EntryDTO$EntryButtonDTO;", "Lru/ozon/id/nativeauth/data/models/a;", "Landroid/os/Parcelable;", "", "deeplink", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/id/nativeauth/data/models/a$a;", "type", "action", "trackClick", "", "", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/id/nativeauth/data/models/a$a;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lru/ozon/id/nativeauth/data/models/a$a;", "component4", "component5", "component6", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/id/nativeauth/data/models/a$a;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lru/ozon/id/nativeauth/data/models/EntryDTO$EntryButtonDTO;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDeeplink", "getTitle", "Lru/ozon/id/nativeauth/data/models/a$a;", "getType", "getAction", "getTrackClick", "Ljava/util/Map;", "getData", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EntryButtonDTO extends ru.ozon.id.nativeauth.data.models.a implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<EntryButtonDTO> CREATOR = new a();
        private final String action;
        private final Map<String, Object> data;
        private final String deeplink;

        @NotNull
        private final String title;
        private final String trackClick;

        @NotNull
        private final a.EnumC2132a type;

        public static final class a implements Parcelable.Creator<EntryButtonDTO> {
            @Override // android.os.Parcelable.Creator
            public final EntryButtonDTO createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                a.EnumC2132a valueOf = a.EnumC2132a.valueOf(parcel.readString());
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                    for (int i11 = 0; i11 != readInt; i11++) {
                        linkedHashMap2.put(parcel.readString(), parcel.readValue(EntryButtonDTO.class.getClassLoader()));
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new EntryButtonDTO(readString, readString2, valueOf, readString3, readString4, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final EntryButtonDTO[] newArray(int i11) {
                return new EntryButtonDTO[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EntryButtonDTO(String str, @NotNull String title, @NotNull a.EnumC2132a type, String str2, String str3, Map<String, ? extends Object> map) {
            super(str, title, type, str2, str3);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(type, "type");
            this.deeplink = str;
            this.title = title;
            this.type = type;
            this.action = str2;
            this.trackClick = str3;
            this.data = map;
        }

        public static /* synthetic */ EntryButtonDTO copy$default(EntryButtonDTO entryButtonDTO, String str, String str2, a.EnumC2132a enumC2132a, String str3, String str4, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = entryButtonDTO.deeplink;
            }
            if ((i11 & 2) != 0) {
                str2 = entryButtonDTO.title;
            }
            if ((i11 & 4) != 0) {
                enumC2132a = entryButtonDTO.type;
            }
            if ((i11 & 8) != 0) {
                str3 = entryButtonDTO.action;
            }
            if ((i11 & 16) != 0) {
                str4 = entryButtonDTO.trackClick;
            }
            if ((i11 & 32) != 0) {
                map = entryButtonDTO.data;
            }
            String str5 = str4;
            Map map2 = map;
            return entryButtonDTO.copy(str, str2, enumC2132a, str3, str5, map2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final a.EnumC2132a getType() {
            return this.type;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAction() {
            return this.action;
        }

        /* renamed from: component5, reason: from getter */
        public final String getTrackClick() {
            return this.trackClick;
        }

        public final Map<String, Object> component6() {
            return this.data;
        }

        @NotNull
        public final EntryButtonDTO copy(String deeplink, @NotNull String title, @NotNull a.EnumC2132a type, String action, String trackClick, Map<String, ? extends Object> data) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(type, "type");
            return new EntryButtonDTO(deeplink, title, type, action, trackClick, data);
        }

        @Override // ru.ozon.id.nativeauth.data.models.a, android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EntryButtonDTO)) {
                return false;
            }
            EntryButtonDTO entryButtonDTO = (EntryButtonDTO) other;
            return Intrinsics.d(this.deeplink, entryButtonDTO.deeplink) && Intrinsics.d(this.title, entryButtonDTO.title) && this.type == entryButtonDTO.type && Intrinsics.d(this.action, entryButtonDTO.action) && Intrinsics.d(this.trackClick, entryButtonDTO.trackClick) && Intrinsics.d(this.data, entryButtonDTO.data);
        }

        @Override // ru.ozon.id.nativeauth.data.models.a
        public String getAction() {
            return this.action;
        }

        public final Map<String, Object> getData() {
            return this.data;
        }

        @Override // ru.ozon.id.nativeauth.data.models.a
        public String getDeeplink() {
            return this.deeplink;
        }

        @Override // ru.ozon.id.nativeauth.data.models.a
        @NotNull
        public String getTitle() {
            return this.title;
        }

        @Override // ru.ozon.id.nativeauth.data.models.a
        public String getTrackClick() {
            return this.trackClick;
        }

        @Override // ru.ozon.id.nativeauth.data.models.a
        @NotNull
        public a.EnumC2132a getType() {
            return this.type;
        }

        public int hashCode() {
            String str = this.deeplink;
            int hashCode = (this.type.hashCode() + g.a((str == null ? 0 : str.hashCode()) * 31, 31, this.title)) * 31;
            String str2 = this.action;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.trackClick;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Map<String, Object> map = this.data;
            return hashCode3 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.deeplink;
            String str2 = this.title;
            a.EnumC2132a enumC2132a = this.type;
            String str3 = this.action;
            String str4 = this.trackClick;
            Map<String, Object> map = this.data;
            StringBuilder d11 = C3660k.d("EntryButtonDTO(deeplink=", str, ", title=", str2, ", type=");
            d11.append(enumC2132a);
            d11.append(", action=");
            d11.append(str3);
            d11.append(", trackClick=");
            return C4070a.a(d11, str4, ", data=", map, ")");
        }

        @Override // ru.ozon.id.nativeauth.data.models.a, android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.deeplink);
            dest.writeString(this.title);
            dest.writeString(this.type.name());
            dest.writeString(this.action);
            dest.writeString(this.trackClick);
            Map<String, Object> map = this.data;
            if (map == null) {
                dest.writeInt(0);
                return;
            }
            Iterator e11 = J.e(map, dest, 1);
            while (e11.hasNext()) {
                Map.Entry entry = (Map.Entry) e11.next();
                dest.writeString((String) entry.getKey());
                dest.writeValue(entry.getValue());
            }
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJJ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001aR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0010\u0010\fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0011\u0010\fR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\b\u0010\f¨\u0006%"}, d2 = {"Lru/ozon/id/nativeauth/data/models/EntryDTO$FeatureFlags;", "Landroid/os/Parcelable;", "forceMobileIdOverCellular", "", "allowedWebViewDomains", "", "webViewForceCastHttpToHttps", "shouldLogSharedSessionError", "isCrossAppDisabled", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getForceMobileIdOverCellular", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAllowedWebViewDomains", "()Ljava/lang/String;", "getWebViewForceCastHttpToHttps", "getShouldLogSharedSessionError", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lru/ozon/id/nativeauth/data/models/EntryDTO$FeatureFlags;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FeatureFlags implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<FeatureFlags> CREATOR = new a();
        private final String allowedWebViewDomains;
        private final Boolean forceMobileIdOverCellular;
        private final Boolean isCrossAppDisabled;
        private final Boolean shouldLogSharedSessionError;
        private final Boolean webViewForceCastHttpToHttps;

        public static final class a implements Parcelable.Creator<FeatureFlags> {
            @Override // android.os.Parcelable.Creator
            public final FeatureFlags createFromParcel(Parcel parcel) {
                Boolean valueOf;
                Boolean valueOf2;
                Boolean valueOf3;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Boolean bool = null;
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                String readString = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() != 0) {
                    bool = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new FeatureFlags(valueOf, readString, valueOf2, valueOf3, bool);
            }

            @Override // android.os.Parcelable.Creator
            public final FeatureFlags[] newArray(int i11) {
                return new FeatureFlags[i11];
            }
        }

        public FeatureFlags(Boolean bool, String str, Boolean bool2, Boolean bool3, Boolean bool4) {
            this.forceMobileIdOverCellular = bool;
            this.allowedWebViewDomains = str;
            this.webViewForceCastHttpToHttps = bool2;
            this.shouldLogSharedSessionError = bool3;
            this.isCrossAppDisabled = bool4;
        }

        public static /* synthetic */ FeatureFlags copy$default(FeatureFlags featureFlags, Boolean bool, String str, Boolean bool2, Boolean bool3, Boolean bool4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bool = featureFlags.forceMobileIdOverCellular;
            }
            if ((i11 & 2) != 0) {
                str = featureFlags.allowedWebViewDomains;
            }
            if ((i11 & 4) != 0) {
                bool2 = featureFlags.webViewForceCastHttpToHttps;
            }
            if ((i11 & 8) != 0) {
                bool3 = featureFlags.shouldLogSharedSessionError;
            }
            if ((i11 & 16) != 0) {
                bool4 = featureFlags.isCrossAppDisabled;
            }
            Boolean bool5 = bool4;
            Boolean bool6 = bool2;
            return featureFlags.copy(bool, str, bool6, bool3, bool5);
        }

        /* renamed from: component1, reason: from getter */
        public final Boolean getForceMobileIdOverCellular() {
            return this.forceMobileIdOverCellular;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAllowedWebViewDomains() {
            return this.allowedWebViewDomains;
        }

        /* renamed from: component3, reason: from getter */
        public final Boolean getWebViewForceCastHttpToHttps() {
            return this.webViewForceCastHttpToHttps;
        }

        /* renamed from: component4, reason: from getter */
        public final Boolean getShouldLogSharedSessionError() {
            return this.shouldLogSharedSessionError;
        }

        /* renamed from: component5, reason: from getter */
        public final Boolean getIsCrossAppDisabled() {
            return this.isCrossAppDisabled;
        }

        @NotNull
        public final FeatureFlags copy(Boolean forceMobileIdOverCellular, String allowedWebViewDomains, Boolean webViewForceCastHttpToHttps, Boolean shouldLogSharedSessionError, Boolean isCrossAppDisabled) {
            return new FeatureFlags(forceMobileIdOverCellular, allowedWebViewDomains, webViewForceCastHttpToHttps, shouldLogSharedSessionError, isCrossAppDisabled);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FeatureFlags)) {
                return false;
            }
            FeatureFlags featureFlags = (FeatureFlags) other;
            return Intrinsics.d(this.forceMobileIdOverCellular, featureFlags.forceMobileIdOverCellular) && Intrinsics.d(this.allowedWebViewDomains, featureFlags.allowedWebViewDomains) && Intrinsics.d(this.webViewForceCastHttpToHttps, featureFlags.webViewForceCastHttpToHttps) && Intrinsics.d(this.shouldLogSharedSessionError, featureFlags.shouldLogSharedSessionError) && Intrinsics.d(this.isCrossAppDisabled, featureFlags.isCrossAppDisabled);
        }

        public final String getAllowedWebViewDomains() {
            return this.allowedWebViewDomains;
        }

        public final Boolean getForceMobileIdOverCellular() {
            return this.forceMobileIdOverCellular;
        }

        public final Boolean getShouldLogSharedSessionError() {
            return this.shouldLogSharedSessionError;
        }

        public final Boolean getWebViewForceCastHttpToHttps() {
            return this.webViewForceCastHttpToHttps;
        }

        public int hashCode() {
            Boolean bool = this.forceMobileIdOverCellular;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.allowedWebViewDomains;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool2 = this.webViewForceCastHttpToHttps;
            int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.shouldLogSharedSessionError;
            int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Boolean bool4 = this.isCrossAppDisabled;
            return hashCode4 + (bool4 != null ? bool4.hashCode() : 0);
        }

        public final Boolean isCrossAppDisabled() {
            return this.isCrossAppDisabled;
        }

        @NotNull
        public String toString() {
            Boolean bool = this.forceMobileIdOverCellular;
            String str = this.allowedWebViewDomains;
            Boolean bool2 = this.webViewForceCastHttpToHttps;
            Boolean bool3 = this.shouldLogSharedSessionError;
            Boolean bool4 = this.isCrossAppDisabled;
            StringBuilder e11 = D3.g.e("FeatureFlags(forceMobileIdOverCellular=", bool, ", allowedWebViewDomains=", str, ", webViewForceCastHttpToHttps=");
            h.h(e11, bool2, ", shouldLogSharedSessionError=", bool3, ", isCrossAppDisabled=");
            return D3.g.d(e11, bool4, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Boolean bool = this.forceMobileIdOverCellular;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                c.c(dest, 1, bool);
            }
            dest.writeString(this.allowedWebViewDomains);
            Boolean bool2 = this.webViewForceCastHttpToHttps;
            if (bool2 == null) {
                dest.writeInt(0);
            } else {
                c.c(dest, 1, bool2);
            }
            Boolean bool3 = this.shouldLogSharedSessionError;
            if (bool3 == null) {
                dest.writeInt(0);
            } else {
                c.c(dest, 1, bool3);
            }
            Boolean bool4 = this.isCrossAppDisabled;
            if (bool4 == null) {
                dest.writeInt(0);
            } else {
                c.c(dest, 1, bool4);
            }
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u0003:;<BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0012\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001aJj\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001aJ\u0010\u0010(\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b(\u0010\u0018J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b2\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b3\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b4\u0010\u001aR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u0010!R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b8\u0010#R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b9\u0010\u001a¨\u0006="}, d2 = {"Lru/ozon/id/nativeauth/data/models/EntryDTO$InputDTO;", "Landroid/os/Parcelable;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, HammersV3BodyDTO.PLACEHOLDER, "Lru/ozon/id/nativeauth/data/models/EntryDTO$InputDTO$b;", "type", AppMeasurementSdk.ConditionalUserProperty.VALUE, "error", "Lru/ozon/id/nativeauth/data/models/EntryDTO$InputDTO$CountrySelect;", "countrySelect", "Lru/ozon/id/nativeauth/data/models/EntryDTO$InputDTO$ErrorButton;", "errorButton", "focusTrackAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/id/nativeauth/data/models/EntryDTO$InputDTO$b;Ljava/lang/String;Ljava/lang/String;Lru/ozon/id/nativeauth/data/models/EntryDTO$InputDTO$CountrySelect;Lru/ozon/id/nativeauth/data/models/EntryDTO$InputDTO$ErrorButton;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lru/ozon/id/nativeauth/data/models/EntryDTO$InputDTO$b;", "component4", "component5", "component6", "()Lru/ozon/id/nativeauth/data/models/EntryDTO$InputDTO$CountrySelect;", "component7", "()Lru/ozon/id/nativeauth/data/models/EntryDTO$InputDTO$ErrorButton;", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/id/nativeauth/data/models/EntryDTO$InputDTO$b;Ljava/lang/String;Ljava/lang/String;Lru/ozon/id/nativeauth/data/models/EntryDTO$InputDTO$CountrySelect;Lru/ozon/id/nativeauth/data/models/EntryDTO$InputDTO$ErrorButton;Ljava/lang/String;)Lru/ozon/id/nativeauth/data/models/EntryDTO$InputDTO;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getPlaceholder", "Lru/ozon/id/nativeauth/data/models/EntryDTO$InputDTO$b;", "getType", "getValue", "getError", "Lru/ozon/id/nativeauth/data/models/EntryDTO$InputDTO$CountrySelect;", "getCountrySelect", "Lru/ozon/id/nativeauth/data/models/EntryDTO$InputDTO$ErrorButton;", "getErrorButton", "getFocusTrackAction", "b", "CountrySelect", "ErrorButton", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class InputDTO implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<InputDTO> CREATOR = new a();
        private final CountrySelect countrySelect;
        private final String error;
        private final ErrorButton errorButton;
        private final String focusTrackAction;

        @NotNull
        private final String name;

        @NotNull
        private final String placeholder;

        @NotNull
        private final b type;
        private final String value;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lru/ozon/id/nativeauth/data/models/EntryDTO$InputDTO$CountrySelect;", "Landroid/os/Parcelable;", "phoneCode", "", "phoneMask", "link", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPhoneCode", "()Ljava/lang/String;", "getPhoneMask", "getLink", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CountrySelect implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<CountrySelect> CREATOR = new a();

            @NotNull
            private final String link;

            @NotNull
            private final String phoneCode;

            @NotNull
            private final String phoneMask;

            public static final class a implements Parcelable.Creator<CountrySelect> {
                @Override // android.os.Parcelable.Creator
                public final CountrySelect createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new CountrySelect(parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final CountrySelect[] newArray(int i11) {
                    return new CountrySelect[i11];
                }
            }

            public CountrySelect(@NotNull String phoneCode, @NotNull String phoneMask, @NotNull String link) {
                Intrinsics.checkNotNullParameter(phoneCode, "phoneCode");
                Intrinsics.checkNotNullParameter(phoneMask, "phoneMask");
                Intrinsics.checkNotNullParameter(link, "link");
                this.phoneCode = phoneCode;
                this.phoneMask = phoneMask;
                this.link = link;
            }

            public static /* synthetic */ CountrySelect copy$default(CountrySelect countrySelect, String str, String str2, String str3, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = countrySelect.phoneCode;
                }
                if ((i11 & 2) != 0) {
                    str2 = countrySelect.phoneMask;
                }
                if ((i11 & 4) != 0) {
                    str3 = countrySelect.link;
                }
                return countrySelect.copy(str, str2, str3);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getPhoneCode() {
                return this.phoneCode;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getPhoneMask() {
                return this.phoneMask;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final String getLink() {
                return this.link;
            }

            @NotNull
            public final CountrySelect copy(@NotNull String phoneCode, @NotNull String phoneMask, @NotNull String link) {
                Intrinsics.checkNotNullParameter(phoneCode, "phoneCode");
                Intrinsics.checkNotNullParameter(phoneMask, "phoneMask");
                Intrinsics.checkNotNullParameter(link, "link");
                return new CountrySelect(phoneCode, phoneMask, link);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CountrySelect)) {
                    return false;
                }
                CountrySelect countrySelect = (CountrySelect) other;
                return Intrinsics.d(this.phoneCode, countrySelect.phoneCode) && Intrinsics.d(this.phoneMask, countrySelect.phoneMask) && Intrinsics.d(this.link, countrySelect.link);
            }

            @NotNull
            public final String getLink() {
                return this.link;
            }

            @NotNull
            public final String getPhoneCode() {
                return this.phoneCode;
            }

            @NotNull
            public final String getPhoneMask() {
                return this.phoneMask;
            }

            public int hashCode() {
                return this.link.hashCode() + g.a(this.phoneCode.hashCode() * 31, 31, this.phoneMask);
            }

            @NotNull
            public String toString() {
                String str = this.phoneCode;
                String str2 = this.phoneMask;
                return o0.c(C3660k.d("CountrySelect(phoneCode=", str, ", phoneMask=", str2, ", link="), this.link, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.phoneCode);
                dest.writeString(this.phoneMask);
                dest.writeString(this.link);
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lru/ozon/id/nativeauth/data/models/EntryDTO$InputDTO$ErrorButton;", "Landroid/os/Parcelable;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getAction", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ErrorButton implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<ErrorButton> CREATOR = new a();

            @NotNull
            private final String action;

            @NotNull
            private final String title;

            public static final class a implements Parcelable.Creator<ErrorButton> {
                @Override // android.os.Parcelable.Creator
                public final ErrorButton createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ErrorButton(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final ErrorButton[] newArray(int i11) {
                    return new ErrorButton[i11];
                }
            }

            public ErrorButton(@NotNull String title, @NotNull String action) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(action, "action");
                this.title = title;
                this.action = action;
            }

            public static /* synthetic */ ErrorButton copy$default(ErrorButton errorButton, String str, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = errorButton.title;
                }
                if ((i11 & 2) != 0) {
                    str2 = errorButton.action;
                }
                return errorButton.copy(str, str2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getAction() {
                return this.action;
            }

            @NotNull
            public final ErrorButton copy(@NotNull String title, @NotNull String action) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(action, "action");
                return new ErrorButton(title, action);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ErrorButton)) {
                    return false;
                }
                ErrorButton errorButton = (ErrorButton) other;
                return Intrinsics.d(this.title, errorButton.title) && Intrinsics.d(this.action, errorButton.action);
            }

            @NotNull
            public final String getAction() {
                return this.action;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.action.hashCode() + (this.title.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return e.a("ErrorButton(title=", this.title, ", action=", this.action, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.title);
                dest.writeString(this.action);
            }
        }

        public static final class a implements Parcelable.Creator<InputDTO> {
            @Override // android.os.Parcelable.Creator
            public final InputDTO createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InputDTO(parcel.readString(), parcel.readString(), b.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : CountrySelect.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ErrorButton.CREATOR.createFromParcel(parcel) : null, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final InputDTO[] newArray(int i11) {
                return new InputDTO[i11];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/id/nativeauth/data/models/EntryDTO$InputDTO$b;", "", "<init>", "(Ljava/lang/String;I)V", "PHONE", "EMAIL", "PASSWORD", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = false)
        public static final class b {
            private static final /* synthetic */ Xc.a $ENTRIES;
            private static final /* synthetic */ b[] $VALUES;

            @i(name = "phone")
            public static final b PHONE = new b("PHONE", 0);

            @i(name = Scopes.EMAIL)
            public static final b EMAIL = new b("EMAIL", 1);

            @i(name = "password")
            public static final b PASSWORD = new b("PASSWORD", 2);

            private static final /* synthetic */ b[] $values() {
                return new b[]{PHONE, EMAIL, PASSWORD};
            }

            static {
                b[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Xc.b.a($values);
            }

            private b(String str, int i11) {
            }

            @NotNull
            public static Xc.a<b> getEntries() {
                return $ENTRIES;
            }

            public static b valueOf(String str) {
                return (b) Enum.valueOf(b.class, str);
            }

            public static b[] values() {
                return (b[]) $VALUES.clone();
            }
        }

        public InputDTO(@NotNull String name, @NotNull String placeholder, @NotNull b type, String str, String str2, CountrySelect countrySelect, ErrorButton errorButton, String str3) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(type, "type");
            this.name = name;
            this.placeholder = placeholder;
            this.type = type;
            this.value = str;
            this.error = str2;
            this.countrySelect = countrySelect;
            this.errorButton = errorButton;
            this.focusTrackAction = str3;
        }

        public static /* synthetic */ InputDTO copy$default(InputDTO inputDTO, String str, String str2, b bVar, String str3, String str4, CountrySelect countrySelect, ErrorButton errorButton, String str5, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = inputDTO.name;
            }
            if ((i11 & 2) != 0) {
                str2 = inputDTO.placeholder;
            }
            if ((i11 & 4) != 0) {
                bVar = inputDTO.type;
            }
            if ((i11 & 8) != 0) {
                str3 = inputDTO.value;
            }
            if ((i11 & 16) != 0) {
                str4 = inputDTO.error;
            }
            if ((i11 & 32) != 0) {
                countrySelect = inputDTO.countrySelect;
            }
            if ((i11 & 64) != 0) {
                errorButton = inputDTO.errorButton;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                str5 = inputDTO.focusTrackAction;
            }
            ErrorButton errorButton2 = errorButton;
            String str6 = str5;
            String str7 = str4;
            CountrySelect countrySelect2 = countrySelect;
            return inputDTO.copy(str, str2, bVar, str3, str7, countrySelect2, errorButton2, str6);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final b getType() {
            return this.type;
        }

        /* renamed from: component4, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* renamed from: component5, reason: from getter */
        public final String getError() {
            return this.error;
        }

        /* renamed from: component6, reason: from getter */
        public final CountrySelect getCountrySelect() {
            return this.countrySelect;
        }

        /* renamed from: component7, reason: from getter */
        public final ErrorButton getErrorButton() {
            return this.errorButton;
        }

        /* renamed from: component8, reason: from getter */
        public final String getFocusTrackAction() {
            return this.focusTrackAction;
        }

        @NotNull
        public final InputDTO copy(@NotNull String name, @NotNull String placeholder, @NotNull b type, String value, String error, CountrySelect countrySelect, ErrorButton errorButton, String focusTrackAction) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(type, "type");
            return new InputDTO(name, placeholder, type, value, error, countrySelect, errorButton, focusTrackAction);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InputDTO)) {
                return false;
            }
            InputDTO inputDTO = (InputDTO) other;
            return Intrinsics.d(this.name, inputDTO.name) && Intrinsics.d(this.placeholder, inputDTO.placeholder) && this.type == inputDTO.type && Intrinsics.d(this.value, inputDTO.value) && Intrinsics.d(this.error, inputDTO.error) && Intrinsics.d(this.countrySelect, inputDTO.countrySelect) && Intrinsics.d(this.errorButton, inputDTO.errorButton) && Intrinsics.d(this.focusTrackAction, inputDTO.focusTrackAction);
        }

        public final CountrySelect getCountrySelect() {
            return this.countrySelect;
        }

        public final String getError() {
            return this.error;
        }

        public final ErrorButton getErrorButton() {
            return this.errorButton;
        }

        public final String getFocusTrackAction() {
            return this.focusTrackAction;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final String getPlaceholder() {
            return this.placeholder;
        }

        @NotNull
        public final b getType() {
            return this.type;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            int hashCode = (this.type.hashCode() + g.a(this.name.hashCode() * 31, 31, this.placeholder)) * 31;
            String str = this.value;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.error;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            CountrySelect countrySelect = this.countrySelect;
            int hashCode4 = (hashCode3 + (countrySelect == null ? 0 : countrySelect.hashCode())) * 31;
            ErrorButton errorButton = this.errorButton;
            int hashCode5 = (hashCode4 + (errorButton == null ? 0 : errorButton.hashCode())) * 31;
            String str3 = this.focusTrackAction;
            return hashCode5 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.name;
            String str2 = this.placeholder;
            b bVar = this.type;
            String str3 = this.value;
            String str4 = this.error;
            CountrySelect countrySelect = this.countrySelect;
            ErrorButton errorButton = this.errorButton;
            String str5 = this.focusTrackAction;
            StringBuilder d11 = C3660k.d("InputDTO(name=", str, ", placeholder=", str2, ", type=");
            d11.append(bVar);
            d11.append(", value=");
            d11.append(str3);
            d11.append(", error=");
            d11.append(str4);
            d11.append(", countrySelect=");
            d11.append(countrySelect);
            d11.append(", errorButton=");
            d11.append(errorButton);
            d11.append(", focusTrackAction=");
            d11.append(str5);
            d11.append(")");
            return d11.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.name);
            dest.writeString(this.placeholder);
            dest.writeString(this.type.name());
            dest.writeString(this.value);
            dest.writeString(this.error);
            CountrySelect countrySelect = this.countrySelect;
            if (countrySelect == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                countrySelect.writeToParcel(dest, flags);
            }
            ErrorButton errorButton = this.errorButton;
            if (errorButton == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                errorButton.writeToParcel(dest, flags);
            }
            dest.writeString(this.focusTrackAction);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J>\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0012J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b&\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b'\u0010\u0016¨\u0006("}, d2 = {"Lru/ozon/id/nativeauth/data/models/EntryDTO$SocialButtonDTO;", "Landroid/os/Parcelable;", "Lru/ozon/id/nativeauth/data/models/EntryDTO$b;", "type", "", "authUriAction", "redirectUriAction", "logo", "<init>", "(Lru/ozon/id/nativeauth/data/models/EntryDTO$b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lru/ozon/id/nativeauth/data/models/EntryDTO$b;", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(Lru/ozon/id/nativeauth/data/models/EntryDTO$b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/id/nativeauth/data/models/EntryDTO$SocialButtonDTO;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/id/nativeauth/data/models/EntryDTO$b;", "getType", "Ljava/lang/String;", "getAuthUriAction", "getRedirectUriAction", "getLogo", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SocialButtonDTO implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SocialButtonDTO> CREATOR = new a();
        private final String authUriAction;

        @NotNull
        private final String logo;
        private final String redirectUriAction;

        @EnumNullFallback
        private final b type;

        public static final class a implements Parcelable.Creator<SocialButtonDTO> {
            @Override // android.os.Parcelable.Creator
            public final SocialButtonDTO createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SocialButtonDTO(parcel.readInt() == 0 ? null : b.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SocialButtonDTO[] newArray(int i11) {
                return new SocialButtonDTO[i11];
            }
        }

        public SocialButtonDTO(b bVar, String str, String str2, @NotNull String logo) {
            Intrinsics.checkNotNullParameter(logo, "logo");
            this.type = bVar;
            this.authUriAction = str;
            this.redirectUriAction = str2;
            this.logo = logo;
        }

        public static /* synthetic */ SocialButtonDTO copy$default(SocialButtonDTO socialButtonDTO, b bVar, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bVar = socialButtonDTO.type;
            }
            if ((i11 & 2) != 0) {
                str = socialButtonDTO.authUriAction;
            }
            if ((i11 & 4) != 0) {
                str2 = socialButtonDTO.redirectUriAction;
            }
            if ((i11 & 8) != 0) {
                str3 = socialButtonDTO.logo;
            }
            return socialButtonDTO.copy(bVar, str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final b getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAuthUriAction() {
            return this.authUriAction;
        }

        /* renamed from: component3, reason: from getter */
        public final String getRedirectUriAction() {
            return this.redirectUriAction;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getLogo() {
            return this.logo;
        }

        @NotNull
        public final SocialButtonDTO copy(b type, String authUriAction, String redirectUriAction, @NotNull String logo) {
            Intrinsics.checkNotNullParameter(logo, "logo");
            return new SocialButtonDTO(type, authUriAction, redirectUriAction, logo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SocialButtonDTO)) {
                return false;
            }
            SocialButtonDTO socialButtonDTO = (SocialButtonDTO) other;
            return this.type == socialButtonDTO.type && Intrinsics.d(this.authUriAction, socialButtonDTO.authUriAction) && Intrinsics.d(this.redirectUriAction, socialButtonDTO.redirectUriAction) && Intrinsics.d(this.logo, socialButtonDTO.logo);
        }

        public final String getAuthUriAction() {
            return this.authUriAction;
        }

        @NotNull
        public final String getLogo() {
            return this.logo;
        }

        public final String getRedirectUriAction() {
            return this.redirectUriAction;
        }

        public final b getType() {
            return this.type;
        }

        public int hashCode() {
            b bVar = this.type;
            int hashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
            String str = this.authUriAction;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.redirectUriAction;
            return this.logo.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            b bVar = this.type;
            String str = this.authUriAction;
            String str2 = this.redirectUriAction;
            String str3 = this.logo;
            StringBuilder sb2 = new StringBuilder("SocialButtonDTO(type=");
            sb2.append(bVar);
            sb2.append(", authUriAction=");
            sb2.append(str);
            sb2.append(", redirectUriAction=");
            return C3173b.c(sb2, str2, ", logo=", str3, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            b bVar = this.type;
            if (bVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(bVar.name());
            }
            dest.writeString(this.authUriAction);
            dest.writeString(this.redirectUriAction);
            dest.writeString(this.logo);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, d2 = {"Lru/ozon/id/nativeauth/data/models/EntryDTO$SocialLoginDTO;", "Landroid/os/Parcelable;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "buttons", "", "Lru/ozon/id/nativeauth/data/models/EntryDTO$SocialButtonDTO;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getButtons", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SocialLoginDTO implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SocialLoginDTO> CREATOR = new a();

        @NotNull
        private final List<SocialButtonDTO> buttons;
        private final String title;

        public static final class a implements Parcelable.Creator<SocialLoginDTO> {
            @Override // android.os.Parcelable.Creator
            public final SocialLoginDTO createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = Ak.b.b(SocialButtonDTO.CREATOR, parcel, arrayList, i11, 1);
                }
                return new SocialLoginDTO(readString, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final SocialLoginDTO[] newArray(int i11) {
                return new SocialLoginDTO[i11];
            }
        }

        public SocialLoginDTO(String str, @NotNull List<SocialButtonDTO> buttons) {
            Intrinsics.checkNotNullParameter(buttons, "buttons");
            this.title = str;
            this.buttons = buttons;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SocialLoginDTO copy$default(SocialLoginDTO socialLoginDTO, String str, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = socialLoginDTO.title;
            }
            if ((i11 & 2) != 0) {
                list = socialLoginDTO.buttons;
            }
            return socialLoginDTO.copy(str, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final List<SocialButtonDTO> component2() {
            return this.buttons;
        }

        @NotNull
        public final SocialLoginDTO copy(String title, @NotNull List<SocialButtonDTO> buttons) {
            Intrinsics.checkNotNullParameter(buttons, "buttons");
            return new SocialLoginDTO(title, buttons);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SocialLoginDTO)) {
                return false;
            }
            SocialLoginDTO socialLoginDTO = (SocialLoginDTO) other;
            return Intrinsics.d(this.title, socialLoginDTO.title) && Intrinsics.d(this.buttons, socialLoginDTO.buttons);
        }

        @NotNull
        public final List<SocialButtonDTO> getButtons() {
            return this.buttons;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            return this.buttons.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return C2439a.a("SocialLoginDTO(title=", this.title, ", buttons=", ")", this.buttons);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.title);
            Iterator c11 = Bi.a.c(this.buttons, dest);
            while (c11.hasNext()) {
                ((SocialButtonDTO) c11.next()).writeToParcel(dest, flags);
            }
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u001e\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J<\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J\u0010\u0010\u001b\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0012J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u0014R%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0017¨\u0006%"}, d2 = {"Lru/ozon/id/nativeauth/data/models/EntryDTO$SubmitButtonDTO;", "Landroid/os/Parcelable;", "", "action", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lru/ozon/id/nativeauth/data/models/EntryDTO$SubmitButtonDTO;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAction", "getTitle", "Ljava/util/Map;", "getData", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SubmitButtonDTO implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SubmitButtonDTO> CREATOR = new a();

        @NotNull
        private final String action;
        private final Map<String, Object> data;

        @NotNull
        private final String title;

        public static final class a implements Parcelable.Creator<SubmitButtonDTO> {
            @Override // android.os.Parcelable.Creator
            public final SubmitButtonDTO createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                    for (int i11 = 0; i11 != readInt; i11++) {
                        linkedHashMap2.put(parcel.readString(), parcel.readValue(SubmitButtonDTO.class.getClassLoader()));
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new SubmitButtonDTO(readString, readString2, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final SubmitButtonDTO[] newArray(int i11) {
                return new SubmitButtonDTO[i11];
            }
        }

        public SubmitButtonDTO(@NotNull String action, @NotNull String title, Map<String, ? extends Object> map) {
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(title, "title");
            this.action = action;
            this.title = title;
            this.data = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SubmitButtonDTO copy$default(SubmitButtonDTO submitButtonDTO, String str, String str2, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = submitButtonDTO.action;
            }
            if ((i11 & 2) != 0) {
                str2 = submitButtonDTO.title;
            }
            if ((i11 & 4) != 0) {
                map = submitButtonDTO.data;
            }
            return submitButtonDTO.copy(str, str2, map);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getAction() {
            return this.action;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final Map<String, Object> component3() {
            return this.data;
        }

        @NotNull
        public final SubmitButtonDTO copy(@NotNull String action, @NotNull String title, Map<String, ? extends Object> data) {
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(title, "title");
            return new SubmitButtonDTO(action, title, data);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SubmitButtonDTO)) {
                return false;
            }
            SubmitButtonDTO submitButtonDTO = (SubmitButtonDTO) other;
            return Intrinsics.d(this.action, submitButtonDTO.action) && Intrinsics.d(this.title, submitButtonDTO.title) && Intrinsics.d(this.data, submitButtonDTO.data);
        }

        @NotNull
        public final String getAction() {
            return this.action;
        }

        public final Map<String, Object> getData() {
            return this.data;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int a11 = g.a(this.action.hashCode() * 31, 31, this.title);
            Map<String, Object> map = this.data;
            return a11 + (map == null ? 0 : map.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.action;
            String str2 = this.title;
            return P.f(C3660k.d("SubmitButtonDTO(action=", str, ", title=", str2, ", data="), this.data, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.action);
            dest.writeString(this.title);
            Map<String, Object> map = this.data;
            if (map == null) {
                dest.writeInt(0);
                return;
            }
            Iterator e11 = J.e(map, dest, 1);
            while (e11.hasNext()) {
                Map.Entry entry = (Map.Entry) e11.next();
                dest.writeString((String) entry.getKey());
                dest.writeValue(entry.getValue());
            }
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lru/ozon/id/nativeauth/data/models/EntryDTO$TermsOfUse;", "Landroid/os/Parcelable;", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;)V", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TermsOfUse implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<TermsOfUse> CREATOR = new a();

        @NotNull
        private final OzonSpannableString text;

        public static final class a implements Parcelable.Creator<TermsOfUse> {
            @Override // android.os.Parcelable.Creator
            public final TermsOfUse createFromParcel(Parcel parcel) {
                OzonSpannableString ozonSpannableString;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (parcel.readInt() == 0) {
                    ozonSpannableString = null;
                } else {
                    String readString = parcel.readString();
                    if (readString == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(kotlin.text.h.A0(OzonHtmlParser.INSTANCE.parseHtml(readString, 63), '\n'));
                }
                return new TermsOfUse(ozonSpannableString);
            }

            @Override // android.os.Parcelable.Creator
            public final TermsOfUse[] newArray(int i11) {
                return new TermsOfUse[i11];
            }
        }

        public TermsOfUse(@NotNull OzonSpannableString text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
        }

        public static /* synthetic */ TermsOfUse copy$default(TermsOfUse termsOfUse, OzonSpannableString ozonSpannableString, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                ozonSpannableString = termsOfUse.text;
            }
            return termsOfUse.copy(ozonSpannableString);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final OzonSpannableString getText() {
            return this.text;
        }

        @NotNull
        public final TermsOfUse copy(@NotNull OzonSpannableString text) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new TermsOfUse(text);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TermsOfUse) && Intrinsics.d(this.text, ((TermsOfUse) other).text);
        }

        @NotNull
        public final OzonSpannableString getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        @NotNull
        public String toString() {
            return "TermsOfUse(text=" + ((Object) this.text) + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            OzonSpannableString ozonSpannableString = this.text;
            Intrinsics.checkNotNullParameter(dest, "parcel");
            if (ozonSpannableString == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(Html.toHtml(ozonSpannableString, 1));
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, d2 = {"Lru/ozon/id/nativeauth/data/models/EntryDTO$TranslationLexemes;", "Landroid/os/Parcelable;", "validationLexemes", "Lru/ozon/id/nativeauth/data/models/EntryDTO$TranslationLexemes$ValidationLexemes;", "<init>", "(Lru/ozon/id/nativeauth/data/models/EntryDTO$TranslationLexemes$ValidationLexemes;)V", "getValidationLexemes", "()Lru/ozon/id/nativeauth/data/models/EntryDTO$TranslationLexemes$ValidationLexemes;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ValidationLexemes", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class TranslationLexemes implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<TranslationLexemes> CREATOR = new a();

        @NotNull
        private final ValidationLexemes validationLexemes;

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\t\u001a\u00020\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0018"}, d2 = {"Lru/ozon/id/nativeauth/data/models/EntryDTO$TranslationLexemes$ValidationLexemes;", "Landroid/os/Parcelable;", "isInvalid", "Lru/ozon/id/nativeauth/data/models/EntryDTO$TranslationLexemes$ValidationLexemes$IsInvalid;", "<init>", "(Lru/ozon/id/nativeauth/data/models/EntryDTO$TranslationLexemes$ValidationLexemes$IsInvalid;)V", "()Lru/ozon/id/nativeauth/data/models/EntryDTO$TranslationLexemes$ValidationLexemes$IsInvalid;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "IsInvalid", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class ValidationLexemes implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<ValidationLexemes> CREATOR = new a();

            @NotNull
            private final IsInvalid isInvalid;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lru/ozon/id/nativeauth/data/models/EntryDTO$TranslationLexemes$ValidationLexemes$IsInvalid;", "Landroid/os/Parcelable;", Scopes.EMAIL, "", "phone", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getPhone", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class IsInvalid implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<IsInvalid> CREATOR = new a();

                @NotNull
                private final String email;

                @NotNull
                private final String phone;

                public static final class a implements Parcelable.Creator<IsInvalid> {
                    @Override // android.os.Parcelable.Creator
                    public final IsInvalid createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new IsInvalid(parcel.readString(), parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final IsInvalid[] newArray(int i11) {
                        return new IsInvalid[i11];
                    }
                }

                public IsInvalid(@NotNull String email, @NotNull String phone) {
                    Intrinsics.checkNotNullParameter(email, "email");
                    Intrinsics.checkNotNullParameter(phone, "phone");
                    this.email = email;
                    this.phone = phone;
                }

                public static /* synthetic */ IsInvalid copy$default(IsInvalid isInvalid, String str, String str2, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = isInvalid.email;
                    }
                    if ((i11 & 2) != 0) {
                        str2 = isInvalid.phone;
                    }
                    return isInvalid.copy(str, str2);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final String getEmail() {
                    return this.email;
                }

                @NotNull
                /* renamed from: component2, reason: from getter */
                public final String getPhone() {
                    return this.phone;
                }

                @NotNull
                public final IsInvalid copy(@NotNull String email, @NotNull String phone) {
                    Intrinsics.checkNotNullParameter(email, "email");
                    Intrinsics.checkNotNullParameter(phone, "phone");
                    return new IsInvalid(email, phone);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof IsInvalid)) {
                        return false;
                    }
                    IsInvalid isInvalid = (IsInvalid) other;
                    return Intrinsics.d(this.email, isInvalid.email) && Intrinsics.d(this.phone, isInvalid.phone);
                }

                @NotNull
                public final String getEmail() {
                    return this.email;
                }

                @NotNull
                public final String getPhone() {
                    return this.phone;
                }

                public int hashCode() {
                    return this.phone.hashCode() + (this.email.hashCode() * 31);
                }

                @NotNull
                public String toString() {
                    return e.a("IsInvalid(email=", this.email, ", phone=", this.phone, ")");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@NotNull Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.email);
                    dest.writeString(this.phone);
                }
            }

            public static final class a implements Parcelable.Creator<ValidationLexemes> {
                @Override // android.os.Parcelable.Creator
                public final ValidationLexemes createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ValidationLexemes(IsInvalid.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final ValidationLexemes[] newArray(int i11) {
                    return new ValidationLexemes[i11];
                }
            }

            public ValidationLexemes(@NotNull IsInvalid isInvalid) {
                Intrinsics.checkNotNullParameter(isInvalid, "isInvalid");
                this.isInvalid = isInvalid;
            }

            public static /* synthetic */ ValidationLexemes copy$default(ValidationLexemes validationLexemes, IsInvalid isInvalid, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    isInvalid = validationLexemes.isInvalid;
                }
                return validationLexemes.copy(isInvalid);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final IsInvalid getIsInvalid() {
                return this.isInvalid;
            }

            @NotNull
            public final ValidationLexemes copy(@NotNull IsInvalid isInvalid) {
                Intrinsics.checkNotNullParameter(isInvalid, "isInvalid");
                return new ValidationLexemes(isInvalid);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ValidationLexemes) && Intrinsics.d(this.isInvalid, ((ValidationLexemes) other).isInvalid);
            }

            public int hashCode() {
                return this.isInvalid.hashCode();
            }

            @NotNull
            public final IsInvalid isInvalid() {
                return this.isInvalid;
            }

            @NotNull
            public String toString() {
                return "ValidationLexemes(isInvalid=" + this.isInvalid + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.isInvalid.writeToParcel(dest, flags);
            }
        }

        public static final class a implements Parcelable.Creator<TranslationLexemes> {
            @Override // android.os.Parcelable.Creator
            public final TranslationLexemes createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TranslationLexemes(ValidationLexemes.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final TranslationLexemes[] newArray(int i11) {
                return new TranslationLexemes[i11];
            }
        }

        public TranslationLexemes(@NotNull ValidationLexemes validationLexemes) {
            Intrinsics.checkNotNullParameter(validationLexemes, "validationLexemes");
            this.validationLexemes = validationLexemes;
        }

        public static /* synthetic */ TranslationLexemes copy$default(TranslationLexemes translationLexemes, ValidationLexemes validationLexemes, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                validationLexemes = translationLexemes.validationLexemes;
            }
            return translationLexemes.copy(validationLexemes);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ValidationLexemes getValidationLexemes() {
            return this.validationLexemes;
        }

        @NotNull
        public final TranslationLexemes copy(@NotNull ValidationLexemes validationLexemes) {
            Intrinsics.checkNotNullParameter(validationLexemes, "validationLexemes");
            return new TranslationLexemes(validationLexemes);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TranslationLexemes) && Intrinsics.d(this.validationLexemes, ((TranslationLexemes) other).validationLexemes);
        }

        @NotNull
        public final ValidationLexemes getValidationLexemes() {
            return this.validationLexemes;
        }

        public int hashCode() {
            return this.validationLexemes.hashCode();
        }

        @NotNull
        public String toString() {
            return "TranslationLexemes(validationLexemes=" + this.validationLexemes + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.validationLexemes.writeToParcel(dest, flags);
        }
    }

    public static final class a implements Parcelable.Creator<EntryDTO> {
        @Override // android.os.Parcelable.Creator
        public final EntryDTO createFromParcel(Parcel parcel) {
            OzonSpannableString ozonSpannableString;
            ArrayList arrayList;
            ArrayList arrayList2;
            int i11 = 0;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                ozonSpannableString = null;
            } else {
                String readString2 = parcel.readString();
                if (readString2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(kotlin.text.h.A0(OzonHtmlParser.INSTANCE.parseHtml(readString2, 63), '\n'));
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i12 = 0;
                while (i12 != readInt) {
                    i12 = Ak.b.b(InputDTO.CREATOR, parcel, arrayList, i12, 1);
                }
            }
            SubmitButtonDTO createFromParcel = parcel.readInt() == 0 ? null : SubmitButtonDTO.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (i11 != readInt2) {
                    i11 = Ak.b.b(EntryButtonDTO.CREATOR, parcel, arrayList2, i11, 1);
                }
            }
            return new EntryDTO(readString, ozonSpannableString, arrayList, createFromParcel, arrayList2, parcel.readInt() == 0 ? null : SocialLoginDTO.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AlertEntry.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DisclaimerDTO.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : TermsOfUse.CREATOR.createFromParcel(parcel), TranslationLexemes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? FeatureFlags.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final EntryDTO[] newArray(int i11) {
            return new EntryDTO[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/id/nativeauth/data/models/EntryDTO$b;", "", "<init>", "(Ljava/lang/String;I)V", "VKID", "VKID_ONE_TAP", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = false)
    public static final class b {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;

        @i(name = "vkId")
        public static final b VKID = new b("VKID", 0);

        @i(name = "vkIdOneTap")
        public static final b VKID_ONE_TAP = new b("VKID_ONE_TAP", 1);

        private static final /* synthetic */ b[] $values() {
            return new b[]{VKID, VKID_ONE_TAP};
        }

        static {
            b[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private b(String str, int i11) {
        }

        @NotNull
        public static Xc.a<b> getEntries() {
            return $ENTRIES;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    public EntryDTO(@NotNull String title, OzonSpannableString ozonSpannableString, List<InputDTO> list, SubmitButtonDTO submitButtonDTO, List<EntryButtonDTO> list2, SocialLoginDTO socialLoginDTO, AlertEntry alertEntry, DisclaimerDTO disclaimerDTO, TermsOfUse termsOfUse, @NotNull TranslationLexemes translationLexemes, FeatureFlags featureFlags) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(translationLexemes, "translationLexemes");
        this.title = title;
        this.subtitle = ozonSpannableString;
        this.inputs = list;
        this.submitButton = submitButtonDTO;
        this.hintButtons = list2;
        this.socialLogin = socialLoginDTO;
        this.alertEntry = alertEntry;
        this.disclaimer = disclaimerDTO;
        this.termsOfUseText = termsOfUse;
        this.translationLexemes = translationLexemes;
        this.featureFlags = featureFlags;
    }

    public static /* synthetic */ EntryDTO copy$default(EntryDTO entryDTO, String str, OzonSpannableString ozonSpannableString, List list, SubmitButtonDTO submitButtonDTO, List list2, SocialLoginDTO socialLoginDTO, AlertEntry alertEntry, DisclaimerDTO disclaimerDTO, TermsOfUse termsOfUse, TranslationLexemes translationLexemes, FeatureFlags featureFlags, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = entryDTO.title;
        }
        if ((i11 & 2) != 0) {
            ozonSpannableString = entryDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            list = entryDTO.inputs;
        }
        if ((i11 & 8) != 0) {
            submitButtonDTO = entryDTO.submitButton;
        }
        if ((i11 & 16) != 0) {
            list2 = entryDTO.hintButtons;
        }
        if ((i11 & 32) != 0) {
            socialLoginDTO = entryDTO.socialLogin;
        }
        if ((i11 & 64) != 0) {
            alertEntry = entryDTO.alertEntry;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            disclaimerDTO = entryDTO.disclaimer;
        }
        if ((i11 & 256) != 0) {
            termsOfUse = entryDTO.termsOfUseText;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            translationLexemes = entryDTO.translationLexemes;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            featureFlags = entryDTO.featureFlags;
        }
        TranslationLexemes translationLexemes2 = translationLexemes;
        FeatureFlags featureFlags2 = featureFlags;
        DisclaimerDTO disclaimerDTO2 = disclaimerDTO;
        TermsOfUse termsOfUse2 = termsOfUse;
        SocialLoginDTO socialLoginDTO2 = socialLoginDTO;
        AlertEntry alertEntry2 = alertEntry;
        List list3 = list2;
        List list4 = list;
        return entryDTO.copy(str, ozonSpannableString, list4, submitButtonDTO, list3, socialLoginDTO2, alertEntry2, disclaimerDTO2, termsOfUse2, translationLexemes2, featureFlags2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final TranslationLexemes getTranslationLexemes() {
        return this.translationLexemes;
    }

    /* renamed from: component11, reason: from getter */
    public final FeatureFlags getFeatureFlags() {
        return this.featureFlags;
    }

    /* renamed from: component2, reason: from getter */
    public final OzonSpannableString getSubtitle() {
        return this.subtitle;
    }

    public final List<InputDTO> component3() {
        return this.inputs;
    }

    /* renamed from: component4, reason: from getter */
    public final SubmitButtonDTO getSubmitButton() {
        return this.submitButton;
    }

    public final List<EntryButtonDTO> component5() {
        return this.hintButtons;
    }

    /* renamed from: component6, reason: from getter */
    public final SocialLoginDTO getSocialLogin() {
        return this.socialLogin;
    }

    /* renamed from: component7, reason: from getter */
    public final AlertEntry getAlertEntry() {
        return this.alertEntry;
    }

    /* renamed from: component8, reason: from getter */
    public final DisclaimerDTO getDisclaimer() {
        return this.disclaimer;
    }

    /* renamed from: component9, reason: from getter */
    public final TermsOfUse getTermsOfUseText() {
        return this.termsOfUseText;
    }

    @NotNull
    public final EntryDTO copy(@NotNull String title, OzonSpannableString subtitle, List<InputDTO> inputs, SubmitButtonDTO submitButton, List<EntryButtonDTO> hintButtons, SocialLoginDTO socialLogin, AlertEntry alertEntry, DisclaimerDTO disclaimer, TermsOfUse termsOfUseText, @NotNull TranslationLexemes translationLexemes, FeatureFlags featureFlags) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(translationLexemes, "translationLexemes");
        return new EntryDTO(title, subtitle, inputs, submitButton, hintButtons, socialLogin, alertEntry, disclaimer, termsOfUseText, translationLexemes, featureFlags);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EntryDTO)) {
            return false;
        }
        EntryDTO entryDTO = (EntryDTO) other;
        return Intrinsics.d(this.title, entryDTO.title) && Intrinsics.d(this.subtitle, entryDTO.subtitle) && Intrinsics.d(this.inputs, entryDTO.inputs) && Intrinsics.d(this.submitButton, entryDTO.submitButton) && Intrinsics.d(this.hintButtons, entryDTO.hintButtons) && Intrinsics.d(this.socialLogin, entryDTO.socialLogin) && Intrinsics.d(this.alertEntry, entryDTO.alertEntry) && Intrinsics.d(this.disclaimer, entryDTO.disclaimer) && Intrinsics.d(this.termsOfUseText, entryDTO.termsOfUseText) && Intrinsics.d(this.translationLexemes, entryDTO.translationLexemes) && Intrinsics.d(this.featureFlags, entryDTO.featureFlags);
    }

    public final AlertEntry getAlertEntry() {
        return this.alertEntry;
    }

    public final DisclaimerDTO getDisclaimer() {
        return this.disclaimer;
    }

    public final FeatureFlags getFeatureFlags() {
        return this.featureFlags;
    }

    public final List<EntryButtonDTO> getHintButtons() {
        return this.hintButtons;
    }

    public final List<InputDTO> getInputs() {
        return this.inputs;
    }

    public final SocialLoginDTO getSocialLogin() {
        return this.socialLogin;
    }

    public final SubmitButtonDTO getSubmitButton() {
        return this.submitButton;
    }

    public final OzonSpannableString getSubtitle() {
        return this.subtitle;
    }

    public final TermsOfUse getTermsOfUseText() {
        return this.termsOfUseText;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final TranslationLexemes getTranslationLexemes() {
        return this.translationLexemes;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        OzonSpannableString ozonSpannableString = this.subtitle;
        int hashCode2 = (hashCode + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31;
        List<InputDTO> list = this.inputs;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        SubmitButtonDTO submitButtonDTO = this.submitButton;
        int hashCode4 = (hashCode3 + (submitButtonDTO == null ? 0 : submitButtonDTO.hashCode())) * 31;
        List<EntryButtonDTO> list2 = this.hintButtons;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        SocialLoginDTO socialLoginDTO = this.socialLogin;
        int hashCode6 = (hashCode5 + (socialLoginDTO == null ? 0 : socialLoginDTO.hashCode())) * 31;
        AlertEntry alertEntry = this.alertEntry;
        int hashCode7 = (hashCode6 + (alertEntry == null ? 0 : alertEntry.hashCode())) * 31;
        DisclaimerDTO disclaimerDTO = this.disclaimer;
        int hashCode8 = (hashCode7 + (disclaimerDTO == null ? 0 : disclaimerDTO.hashCode())) * 31;
        TermsOfUse termsOfUse = this.termsOfUseText;
        int hashCode9 = (this.translationLexemes.hashCode() + ((hashCode8 + (termsOfUse == null ? 0 : termsOfUse.hashCode())) * 31)) * 31;
        FeatureFlags featureFlags = this.featureFlags;
        return hashCode9 + (featureFlags != null ? featureFlags.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        OzonSpannableString ozonSpannableString = this.subtitle;
        return "EntryDTO(title=" + str + ", subtitle=" + ((Object) ozonSpannableString) + ", inputs=" + this.inputs + ", submitButton=" + this.submitButton + ", hintButtons=" + this.hintButtons + ", socialLogin=" + this.socialLogin + ", alertEntry=" + this.alertEntry + ", disclaimer=" + this.disclaimer + ", termsOfUseText=" + this.termsOfUseText + ", translationLexemes=" + this.translationLexemes + ", featureFlags=" + this.featureFlags + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.title);
        OzonSpannableString ozonSpannableString = this.subtitle;
        Intrinsics.checkNotNullParameter(dest, "parcel");
        if (ozonSpannableString == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(Html.toHtml(ozonSpannableString, 1));
        }
        List<InputDTO> list = this.inputs;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator c11 = J.c(dest, 1, list);
            while (c11.hasNext()) {
                ((InputDTO) c11.next()).writeToParcel(dest, flags);
            }
        }
        SubmitButtonDTO submitButtonDTO = this.submitButton;
        if (submitButtonDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            submitButtonDTO.writeToParcel(dest, flags);
        }
        List<EntryButtonDTO> list2 = this.hintButtons;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            Iterator c12 = J.c(dest, 1, list2);
            while (c12.hasNext()) {
                ((EntryButtonDTO) c12.next()).writeToParcel(dest, flags);
            }
        }
        SocialLoginDTO socialLoginDTO = this.socialLogin;
        if (socialLoginDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            socialLoginDTO.writeToParcel(dest, flags);
        }
        AlertEntry alertEntry = this.alertEntry;
        if (alertEntry == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            alertEntry.writeToParcel(dest, flags);
        }
        DisclaimerDTO disclaimerDTO = this.disclaimer;
        if (disclaimerDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            disclaimerDTO.writeToParcel(dest, flags);
        }
        TermsOfUse termsOfUse = this.termsOfUseText;
        if (termsOfUse == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            termsOfUse.writeToParcel(dest, flags);
        }
        this.translationLexemes.writeToParcel(dest, flags);
        FeatureFlags featureFlags = this.featureFlags;
        if (featureFlags == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            featureFlags.writeToParcel(dest, flags);
        }
    }
}
