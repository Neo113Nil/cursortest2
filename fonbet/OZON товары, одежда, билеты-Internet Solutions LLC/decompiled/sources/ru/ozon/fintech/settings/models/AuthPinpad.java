package ru.ozon.fintech.settings.models;

import G.g;
import I0.C3173b;
import K1.G;
import Kk.C3532b;
import N3.C3660k;
import U7.d;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import c8.C5766e;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\r\b\u0087\b\u0018\u0000 B2\u00020\u0001:\u0003CDEB3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u0004*\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u0002*\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u0004*\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\rJ\u0013\u0010\u0011\u001a\u00020\u0004*\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\rJ\u0019\u0010\u0014\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0018¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0012\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010\"J\u0010\u0010%\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b%\u0010&JD\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b)\u0010\"J\u0010\u0010*\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b*\u0010\u001eJ\u001a\u0010-\u001a\u00020\u00022\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b-\u0010.R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010 R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010\"R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b3\u0010 R$\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u00101\u001a\u0004\b4\u0010\"\"\u0004\b5\u00106R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b8\u0010&R*\u0010:\u001a\u0004\u0018\u0001098\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b:\u0010;\u0012\u0004\b@\u0010A\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006F"}, d2 = {"Lru/ozon/fintech/settings/models/AuthPinpad;", "Landroid/os/Parcelable;", "", "showPinpad", "", "redirectTo", "logoHidden", "redirectToDeep", "Lru/ozon/fintech/settings/models/AuthPinpad$Data;", "data", "<init>", "(ZLjava/lang/String;ZLjava/lang/String;Lru/ozon/fintech/settings/models/AuthPinpad$Data;)V", "maskSensitive", "(Ljava/lang/String;)Ljava/lang/String;", "isPhone", "(Ljava/lang/String;)Z", "maskPhone", "maskName", "Lcom/squareup/moshi/Moshi;", "moshi", "toAnalyticsJson", "(Lru/ozon/fintech/settings/models/AuthPinpad;Lcom/squareup/moshi/Moshi;)Ljava/lang/String;", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Lru/ozon/fintech/settings/models/AuthPinpad$Data;", "copy", "(ZLjava/lang/String;ZLjava/lang/String;Lru/ozon/fintech/settings/models/AuthPinpad$Data;)Lru/ozon/fintech/settings/models/AuthPinpad;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShowPinpad", "Ljava/lang/String;", "getRedirectTo", "getLogoHidden", "getRedirectToDeep", "setRedirectToDeep", "(Ljava/lang/String;)V", "Lru/ozon/fintech/settings/models/AuthPinpad$Data;", "getData", "", "timestamp", "Ljava/lang/Long;", "getTimestamp", "()Ljava/lang/Long;", "setTimestamp", "(Ljava/lang/Long;)V", "getTimestamp$annotations", "()V", "Companion", "a", "Links", "Data", "fintech-settings_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AuthPinpad implements Parcelable {

    @NotNull
    private final Data data;

    @i(name = "logoHidden")
    private final boolean logoHidden;

    @i(name = "redirectTo")
    @NotNull
    private final String redirectTo;
    private String redirectToDeep;

    @i(name = "showPinpad")
    private final boolean showPinpad;
    private Long timestamp;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<AuthPinpad> CREATOR = new b();

    /* renamed from: NO, reason: collision with root package name */
    @NotNull
    private static final AuthPinpad f97037NO = new AuthPinpad(false, "", false, null, new Data(false, "", "", new Links("", "", "", "")), 4, null);

    @Keep
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\""}, d2 = {"Lru/ozon/fintech/settings/models/AuthPinpad$Data;", "Landroid/os/Parcelable;", "isAuthorized", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "type", "links", "Lru/ozon/fintech/settings/models/AuthPinpad$Links;", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Lru/ozon/fintech/settings/models/AuthPinpad$Links;)V", "()Z", "getTitle", "()Ljava/lang/String;", "getType", "getLinks", "()Lru/ozon/fintech/settings/models/AuthPinpad$Links;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "fintech-settings_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Data implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Data> CREATOR = new a();
        private final boolean isAuthorized;

        @NotNull
        private final Links links;

        @NotNull
        private final String title;

        @NotNull
        private final String type;

        public static final class a implements Parcelable.Creator<Data> {
            @Override // android.os.Parcelable.Creator
            public final Data createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Data(parcel.readInt() != 0, parcel.readString(), parcel.readString(), Links.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Data[] newArray(int i11) {
                return new Data[i11];
            }
        }

        public Data(boolean z11, @NotNull String title, @NotNull String type, @NotNull Links links) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(links, "links");
            this.isAuthorized = z11;
            this.title = title;
            this.type = type;
            this.links = links;
        }

        public static /* synthetic */ Data copy$default(Data data, boolean z11, String str, String str2, Links links, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = data.isAuthorized;
            }
            if ((i11 & 2) != 0) {
                str = data.title;
            }
            if ((i11 & 4) != 0) {
                str2 = data.type;
            }
            if ((i11 & 8) != 0) {
                links = data.links;
            }
            return data.copy(z11, str, str2, links);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsAuthorized() {
            return this.isAuthorized;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final Links getLinks() {
            return this.links;
        }

        @NotNull
        public final Data copy(boolean isAuthorized, @NotNull String title, @NotNull String type, @NotNull Links links) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(links, "links");
            return new Data(isAuthorized, title, type, links);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return this.isAuthorized == data.isAuthorized && Intrinsics.d(this.title, data.title) && Intrinsics.d(this.type, data.type) && Intrinsics.d(this.links, data.links);
        }

        @NotNull
        public final Links getLinks() {
            return this.links;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            return this.links.hashCode() + g.a(g.a(Boolean.hashCode(this.isAuthorized) * 31, 31, this.title), 31, this.type);
        }

        public final boolean isAuthorized() {
            return this.isAuthorized;
        }

        @NotNull
        public String toString() {
            boolean z11 = this.isAuthorized;
            String str = this.title;
            String str2 = this.type;
            Links links = this.links;
            StringBuilder d11 = G.d("Data(isAuthorized=", ", title=", str, ", type=", z11);
            d11.append(str2);
            d11.append(", links=");
            d11.append(links);
            d11.append(")");
            return d11.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.isAuthorized ? 1 : 0);
            dest.writeString(this.title);
            dest.writeString(this.type);
            this.links.writeToParcel(dest, flags);
        }
    }

    @Keep
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, d2 = {"Lru/ozon/fintech/settings/models/AuthPinpad$Links;", "Landroid/os/Parcelable;", "root", "", "dontRememberPass", "recovery", ClientData.KEY_CHALLENGE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRoot", "()Ljava/lang/String;", "getDontRememberPass", "getRecovery", "getChallenge", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "fintech-settings_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Links implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Links> CREATOR = new a();

        @NotNull
        private final String challenge;

        @NotNull
        private final String dontRememberPass;

        @NotNull
        private final String recovery;

        @NotNull
        private final String root;

        public static final class a implements Parcelable.Creator<Links> {
            @Override // android.os.Parcelable.Creator
            public final Links createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Links(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Links[] newArray(int i11) {
                return new Links[i11];
            }
        }

        public Links(@NotNull String root, @NotNull String dontRememberPass, @NotNull String recovery, @NotNull String challenge) {
            Intrinsics.checkNotNullParameter(root, "root");
            Intrinsics.checkNotNullParameter(dontRememberPass, "dontRememberPass");
            Intrinsics.checkNotNullParameter(recovery, "recovery");
            Intrinsics.checkNotNullParameter(challenge, "challenge");
            this.root = root;
            this.dontRememberPass = dontRememberPass;
            this.recovery = recovery;
            this.challenge = challenge;
        }

        public static /* synthetic */ Links copy$default(Links links, String str, String str2, String str3, String str4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = links.root;
            }
            if ((i11 & 2) != 0) {
                str2 = links.dontRememberPass;
            }
            if ((i11 & 4) != 0) {
                str3 = links.recovery;
            }
            if ((i11 & 8) != 0) {
                str4 = links.challenge;
            }
            return links.copy(str, str2, str3, str4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getRoot() {
            return this.root;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getDontRememberPass() {
            return this.dontRememberPass;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getRecovery() {
            return this.recovery;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getChallenge() {
            return this.challenge;
        }

        @NotNull
        public final Links copy(@NotNull String root, @NotNull String dontRememberPass, @NotNull String recovery, @NotNull String challenge) {
            Intrinsics.checkNotNullParameter(root, "root");
            Intrinsics.checkNotNullParameter(dontRememberPass, "dontRememberPass");
            Intrinsics.checkNotNullParameter(recovery, "recovery");
            Intrinsics.checkNotNullParameter(challenge, "challenge");
            return new Links(root, dontRememberPass, recovery, challenge);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Links)) {
                return false;
            }
            Links links = (Links) other;
            return Intrinsics.d(this.root, links.root) && Intrinsics.d(this.dontRememberPass, links.dontRememberPass) && Intrinsics.d(this.recovery, links.recovery) && Intrinsics.d(this.challenge, links.challenge);
        }

        @NotNull
        public final String getChallenge() {
            return this.challenge;
        }

        @NotNull
        public final String getDontRememberPass() {
            return this.dontRememberPass;
        }

        @NotNull
        public final String getRecovery() {
            return this.recovery;
        }

        @NotNull
        public final String getRoot() {
            return this.root;
        }

        public int hashCode() {
            return this.challenge.hashCode() + g.a(g.a(this.root.hashCode() * 31, 31, this.dontRememberPass), 31, this.recovery);
        }

        @NotNull
        public String toString() {
            String str = this.root;
            String str2 = this.dontRememberPass;
            return C3173b.c(C3660k.d("Links(root=", str, ", dontRememberPass=", str2, ", recovery="), this.recovery, ", challenge=", this.challenge, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.root);
            dest.writeString(this.dontRememberPass);
            dest.writeString(this.recovery);
            dest.writeString(this.challenge);
        }
    }

    /* renamed from: ru.ozon.fintech.settings.models.AuthPinpad$a, reason: from kotlin metadata */
    public static final class Companion {
    }

    public static final class b implements Parcelable.Creator<AuthPinpad> {
        @Override // android.os.Parcelable.Creator
        public final AuthPinpad createFromParcel(Parcel parcel) {
            boolean z11;
            boolean z12;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            boolean z13 = false;
            if (parcel.readInt() != 0) {
                z11 = false;
                z13 = true;
                z12 = true;
            } else {
                z11 = false;
                z12 = true;
            }
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                z12 = z11;
            }
            return new AuthPinpad(z13, readString, z12, parcel.readString(), Data.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AuthPinpad[] newArray(int i11) {
            return new AuthPinpad[i11];
        }
    }

    public AuthPinpad(boolean z11, @NotNull String redirectTo, boolean z12, String str, @NotNull Data data) {
        Intrinsics.checkNotNullParameter(redirectTo, "redirectTo");
        Intrinsics.checkNotNullParameter(data, "data");
        this.showPinpad = z11;
        this.redirectTo = redirectTo;
        this.logoHidden = z12;
        this.redirectToDeep = str;
        this.data = data;
    }

    public static /* synthetic */ AuthPinpad copy$default(AuthPinpad authPinpad, boolean z11, String str, boolean z12, String str2, Data data, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = authPinpad.showPinpad;
        }
        if ((i11 & 2) != 0) {
            str = authPinpad.redirectTo;
        }
        if ((i11 & 4) != 0) {
            z12 = authPinpad.logoHidden;
        }
        if ((i11 & 8) != 0) {
            str2 = authPinpad.redirectToDeep;
        }
        if ((i11 & 16) != 0) {
            data = authPinpad.data;
        }
        Data data2 = data;
        boolean z13 = z12;
        return authPinpad.copy(z11, str, z13, str2, data2);
    }

    public static /* synthetic */ void getTimestamp$annotations() {
    }

    private final boolean isPhone(String str) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (Character.isDigit(charAt)) {
                sb2.append(charAt);
            }
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3.length() >= 10;
    }

    private final String maskName(String str) {
        if (str.length() <= 2) {
            return h.W(str.length(), "*");
        }
        return (h.E(str) + h.W(str.length() - 2, "*")) + h.M(str);
    }

    private final String maskPhone(String str) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (Character.isDigit(charAt)) {
                sb2.append(charAt);
            }
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3.length() < 4 ? "***" : d.e(h.W(sb3.length() - 4, "*"), h.r0(4, sb3));
    }

    private final String maskSensitive(String str) {
        return isPhone(str) ? maskPhone(str) : maskName(str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowPinpad() {
        return this.showPinpad;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getRedirectTo() {
        return this.redirectTo;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getLogoHidden() {
        return this.logoHidden;
    }

    /* renamed from: component4, reason: from getter */
    public final String getRedirectToDeep() {
        return this.redirectToDeep;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final Data getData() {
        return this.data;
    }

    @NotNull
    public final AuthPinpad copy(boolean showPinpad, @NotNull String redirectTo, boolean logoHidden, String redirectToDeep, @NotNull Data data) {
        Intrinsics.checkNotNullParameter(redirectTo, "redirectTo");
        Intrinsics.checkNotNullParameter(data, "data");
        return new AuthPinpad(showPinpad, redirectTo, logoHidden, redirectToDeep, data);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthPinpad)) {
            return false;
        }
        AuthPinpad authPinpad = (AuthPinpad) other;
        return this.showPinpad == authPinpad.showPinpad && Intrinsics.d(this.redirectTo, authPinpad.redirectTo) && this.logoHidden == authPinpad.logoHidden && Intrinsics.d(this.redirectToDeep, authPinpad.redirectToDeep) && Intrinsics.d(this.data, authPinpad.data);
    }

    @NotNull
    public final Data getData() {
        return this.data;
    }

    public final boolean getLogoHidden() {
        return this.logoHidden;
    }

    @NotNull
    public final String getRedirectTo() {
        return this.redirectTo;
    }

    public final String getRedirectToDeep() {
        return this.redirectToDeep;
    }

    public final boolean getShowPinpad() {
        return this.showPinpad;
    }

    public final Long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int a11 = C3532b.a(g.a(Boolean.hashCode(this.showPinpad) * 31, 31, this.redirectTo), 31, this.logoHidden);
        String str = this.redirectToDeep;
        return this.data.hashCode() + ((a11 + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final void setRedirectToDeep(String str) {
        this.redirectToDeep = str;
    }

    public final void setTimestamp(Long l11) {
        this.timestamp = l11;
    }

    @NotNull
    public final String toAnalyticsJson(@NotNull AuthPinpad authPinpad, @NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(authPinpad, "<this>");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Data data = authPinpad.data;
        String json = moshi.c(AuthPinpad.class).toJson(copy$default(authPinpad, false, null, false, null, Data.copy$default(data, false, authPinpad.maskSensitive(data.getTitle()), null, null, 13, null), 15, null));
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return json;
    }

    @NotNull
    public String toString() {
        boolean z11 = this.showPinpad;
        String str = this.redirectTo;
        boolean z12 = this.logoHidden;
        String str2 = this.redirectToDeep;
        Data data = this.data;
        StringBuilder d11 = G.d("AuthPinpad(showPinpad=", ", redirectTo=", str, ", logoHidden=", z11);
        C5766e.a(", redirectToDeep=", str2, ", data=", d11, z12);
        d11.append(data);
        d11.append(")");
        return d11.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.showPinpad ? 1 : 0);
        dest.writeString(this.redirectTo);
        dest.writeInt(this.logoHidden ? 1 : 0);
        dest.writeString(this.redirectToDeep);
        this.data.writeToParcel(dest, flags);
    }

    public /* synthetic */ AuthPinpad(boolean z11, String str, boolean z12, String str2, Data data, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, str, (i11 & 4) != 0 ? false : z12, str2, data);
    }
}
