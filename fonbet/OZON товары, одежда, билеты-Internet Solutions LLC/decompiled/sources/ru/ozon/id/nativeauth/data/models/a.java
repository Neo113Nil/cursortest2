package ru.ozon.id.nativeauth.data.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountApiResponse;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0011\u0018\u00002\u00020\u0001:\u0001\u001dB7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016¨\u0006\u001e"}, d2 = {"Lru/ozon/id/nativeauth/data/models/a;", "Landroid/os/Parcelable;", "", "deeplink", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/id/nativeauth/data/models/a$a;", "type", "action", "trackClick", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/id/nativeauth/data/models/a$a;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Ljava/lang/String;", "getDeeplink", "()Ljava/lang/String;", "getTitle", "Lru/ozon/id/nativeauth/data/models/a$a;", "getType", "()Lru/ozon/id/nativeauth/data/models/a$a;", "getAction", "getTrackClick", "a", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public class a implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<a> CREATOR = new b();
    private final String action;
    private final String deeplink;

    @NotNull
    private final String title;
    private final String trackClick;
    private final EnumC2132a type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/id/nativeauth/data/models/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "RELOAD", "DEEPLINK", "ACTION", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = false)
    /* renamed from: ru.ozon.id.nativeauth.data.models.a$a, reason: collision with other inner class name */
    public static final class EnumC2132a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ EnumC2132a[] $VALUES;

        @i(name = DeleteAccountApiResponse.Error.TYPE_RELOAD)
        public static final EnumC2132a RELOAD = new EnumC2132a("RELOAD", 0);

        @i(name = "deeplink")
        public static final EnumC2132a DEEPLINK = new EnumC2132a("DEEPLINK", 1);

        @i(name = "action")
        public static final EnumC2132a ACTION = new EnumC2132a("ACTION", 2);

        private static final /* synthetic */ EnumC2132a[] $values() {
            return new EnumC2132a[]{RELOAD, DEEPLINK, ACTION};
        }

        static {
            EnumC2132a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private EnumC2132a(String str, int i11) {
        }

        @NotNull
        public static Xc.a<EnumC2132a> getEntries() {
            return $ENTRIES;
        }

        public static EnumC2132a valueOf(String str) {
            return (EnumC2132a) Enum.valueOf(EnumC2132a.class, str);
        }

        public static EnumC2132a[] values() {
            return (EnumC2132a[]) $VALUES.clone();
        }
    }

    public static final class b implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new a(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : EnumC2132a.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i11) {
            return new a[i11];
        }
    }

    public a(String str, @NotNull String title, EnumC2132a enumC2132a, String str2, String str3) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.deeplink = str;
        this.title = title;
        this.type = enumC2132a;
        this.action = str2;
        this.trackClick = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAction() {
        return this.action;
    }

    public String getDeeplink() {
        return this.deeplink;
    }

    @NotNull
    public String getTitle() {
        return this.title;
    }

    public String getTrackClick() {
        return this.trackClick;
    }

    public EnumC2132a getType() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.deeplink);
        dest.writeString(this.title);
        EnumC2132a enumC2132a = this.type;
        if (enumC2132a == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumC2132a.name());
        }
        dest.writeString(this.action);
        dest.writeString(this.trackClick);
    }
}
