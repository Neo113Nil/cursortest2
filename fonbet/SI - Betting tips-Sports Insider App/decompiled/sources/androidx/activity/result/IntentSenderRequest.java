package androidx.activity.result;

import a3.a;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/activity/result/IntentSenderRequest;", "Landroid/os/Parcelable;", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class IntentSenderRequest implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new a(29);

    /* renamed from: a, reason: collision with root package name */
    public final IntentSender f196a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f197b;

    /* renamed from: c, reason: collision with root package name */
    public final int f198c;

    /* renamed from: d, reason: collision with root package name */
    public final int f199d;

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i5, int i10) {
        Intrinsics.checkNotNullParameter(intentSender, "intentSender");
        this.f196a = intentSender;
        this.f197b = intent;
        this.f198c = i5;
        this.f199d = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i5) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f196a, i5);
        dest.writeParcelable(this.f197b, i5);
        dest.writeInt(this.f198c);
        dest.writeInt(this.f199d);
    }
}
