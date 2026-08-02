package io.intercom.android.sdk.m5.navigation.transitions;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransitionStyle.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÇ\u0001J\b\u0010\u0017\u001a\u00020\u0018H\u0007J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH×\u0003J\t\u0010\u001d\u001a\u00020\u0018H×\u0001J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0018H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006#"}, d2 = {"Lio/intercom/android/sdk/m5/navigation/transitions/TransitionArgs;", "Landroid/os/Parcelable;", "enter", "Lio/intercom/android/sdk/m5/navigation/transitions/EnterTransitionStyle;", "exit", "Lio/intercom/android/sdk/m5/navigation/transitions/ExitTransitionStyle;", "popEnter", "popExit", "<init>", "(Lio/intercom/android/sdk/m5/navigation/transitions/EnterTransitionStyle;Lio/intercom/android/sdk/m5/navigation/transitions/ExitTransitionStyle;Lio/intercom/android/sdk/m5/navigation/transitions/EnterTransitionStyle;Lio/intercom/android/sdk/m5/navigation/transitions/ExitTransitionStyle;)V", "getEnter", "()Lio/intercom/android/sdk/m5/navigation/transitions/EnterTransitionStyle;", "getExit", "()Lio/intercom/android/sdk/m5/navigation/transitions/ExitTransitionStyle;", "getPopEnter", "getPopExit", InAppPurchaseConstants.METHOD_TO_STRING, "", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TransitionArgs implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<TransitionArgs> CREATOR = new Creator();
    private final EnterTransitionStyle enter;
    private final ExitTransitionStyle exit;
    private final EnterTransitionStyle popEnter;
    private final ExitTransitionStyle popExit;

    /* compiled from: TransitionStyle.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TransitionArgs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransitionArgs createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransitionArgs(EnterTransitionStyle.valueOf(parcel.readString()), ExitTransitionStyle.valueOf(parcel.readString()), EnterTransitionStyle.valueOf(parcel.readString()), ExitTransitionStyle.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransitionArgs[] newArray(int i) {
            return new TransitionArgs[i];
        }
    }

    public TransitionArgs() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ TransitionArgs copy$default(TransitionArgs transitionArgs, EnterTransitionStyle enterTransitionStyle, ExitTransitionStyle exitTransitionStyle, EnterTransitionStyle enterTransitionStyle2, ExitTransitionStyle exitTransitionStyle2, int i, Object obj) {
        if ((i & 1) != 0) {
            enterTransitionStyle = transitionArgs.enter;
        }
        if ((i & 2) != 0) {
            exitTransitionStyle = transitionArgs.exit;
        }
        if ((i & 4) != 0) {
            enterTransitionStyle2 = transitionArgs.popEnter;
        }
        if ((i & 8) != 0) {
            exitTransitionStyle2 = transitionArgs.popExit;
        }
        return transitionArgs.copy(enterTransitionStyle, exitTransitionStyle, enterTransitionStyle2, exitTransitionStyle2);
    }

    /* renamed from: component1, reason: from getter */
    public final EnterTransitionStyle getEnter() {
        return this.enter;
    }

    /* renamed from: component2, reason: from getter */
    public final ExitTransitionStyle getExit() {
        return this.exit;
    }

    /* renamed from: component3, reason: from getter */
    public final EnterTransitionStyle getPopEnter() {
        return this.popEnter;
    }

    /* renamed from: component4, reason: from getter */
    public final ExitTransitionStyle getPopExit() {
        return this.popExit;
    }

    public final TransitionArgs copy(EnterTransitionStyle enter, ExitTransitionStyle exit, EnterTransitionStyle popEnter, ExitTransitionStyle popExit) {
        Intrinsics.checkNotNullParameter(enter, "enter");
        Intrinsics.checkNotNullParameter(exit, "exit");
        Intrinsics.checkNotNullParameter(popEnter, "popEnter");
        Intrinsics.checkNotNullParameter(popExit, "popExit");
        return new TransitionArgs(enter, exit, popEnter, popExit);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransitionArgs)) {
            return false;
        }
        TransitionArgs transitionArgs = (TransitionArgs) other;
        return this.enter == transitionArgs.enter && this.exit == transitionArgs.exit && this.popEnter == transitionArgs.popEnter && this.popExit == transitionArgs.popExit;
    }

    public int hashCode() {
        return (((((this.enter.hashCode() * 31) + this.exit.hashCode()) * 31) + this.popEnter.hashCode()) * 31) + this.popExit.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.enter.name());
        dest.writeString(this.exit.name());
        dest.writeString(this.popEnter.name());
        dest.writeString(this.popExit.name());
    }

    public TransitionArgs(EnterTransitionStyle enter, ExitTransitionStyle exit, EnterTransitionStyle popEnter, ExitTransitionStyle popExit) {
        Intrinsics.checkNotNullParameter(enter, "enter");
        Intrinsics.checkNotNullParameter(exit, "exit");
        Intrinsics.checkNotNullParameter(popEnter, "popEnter");
        Intrinsics.checkNotNullParameter(popExit, "popExit");
        this.enter = enter;
        this.exit = exit;
        this.popEnter = popEnter;
        this.popExit = popExit;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ TransitionArgs(EnterTransitionStyle enterTransitionStyle, ExitTransitionStyle exitTransitionStyle, EnterTransitionStyle enterTransitionStyle2, ExitTransitionStyle exitTransitionStyle2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(enterTransitionStyle, exitTransitionStyle, (i & 4) != 0 ? enterTransitionStyle : enterTransitionStyle2, (i & 8) != 0 ? exitTransitionStyle : exitTransitionStyle2);
        enterTransitionStyle = (i & 1) != 0 ? EnterTransitionStyle.NULL : enterTransitionStyle;
        exitTransitionStyle = (i & 2) != 0 ? ExitTransitionStyle.NULL : exitTransitionStyle;
    }

    public final EnterTransitionStyle getEnter() {
        return this.enter;
    }

    public final ExitTransitionStyle getExit() {
        return this.exit;
    }

    public final EnterTransitionStyle getPopEnter() {
        return this.popEnter;
    }

    public final ExitTransitionStyle getPopExit() {
        return this.popExit;
    }

    public String toString() {
        String encode = Uri.encode(new Gson().toJson(this));
        Intrinsics.checkNotNullExpressionValue(encode, "encode(...)");
        return encode;
    }
}
