package ru.ozon.app.android.session.mySettingsHeader.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/session/mySettingsHeader/data/MySettingsHeaderDTO;", "", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;)V", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MySettingsHeaderDTO {
    public static final int $stable = OzonSpannableString.$stable;

    @NotNull
    private final OzonSpannableString text;

    public MySettingsHeaderDTO(@NotNull OzonSpannableString text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
    }

    public static /* synthetic */ MySettingsHeaderDTO copy$default(MySettingsHeaderDTO mySettingsHeaderDTO, OzonSpannableString ozonSpannableString, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            ozonSpannableString = mySettingsHeaderDTO.text;
        }
        return mySettingsHeaderDTO.copy(ozonSpannableString);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final OzonSpannableString getText() {
        return this.text;
    }

    @NotNull
    public final MySettingsHeaderDTO copy(@NotNull OzonSpannableString text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new MySettingsHeaderDTO(text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MySettingsHeaderDTO) && Intrinsics.d(this.text, ((MySettingsHeaderDTO) other).text);
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
        return "MySettingsHeaderDTO(text=" + ((Object) this.text) + ")";
    }
}
