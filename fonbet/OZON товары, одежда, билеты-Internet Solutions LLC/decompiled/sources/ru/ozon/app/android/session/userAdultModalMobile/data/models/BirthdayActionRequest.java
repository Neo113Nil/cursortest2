package ru.ozon.app.android.session.userAdultModalMobile.data.models;

import G.g;
import N3.C3660k;
import T7.P;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\nR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/session/userAdultModalMobile/data/models/BirthdayActionRequest;", "", "", "actionName", "birthday", "", "additionalParams", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getActionName", "getBirthday", "Ljava/util/Map;", "getAdditionalParams", "()Ljava/util/Map;", "Companion", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BirthdayActionRequest {

    @NotNull
    private final String actionName;

    @NotNull
    private final Map<String, String> additionalParams;

    @NotNull
    private final String birthday;
    public static final int $stable = 8;

    public BirthdayActionRequest(@NotNull String actionName, @NotNull String birthday, @NotNull Map<String, String> additionalParams) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        Intrinsics.checkNotNullParameter(birthday, "birthday");
        Intrinsics.checkNotNullParameter(additionalParams, "additionalParams");
        this.actionName = actionName;
        this.birthday = birthday;
        this.additionalParams = additionalParams;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BirthdayActionRequest)) {
            return false;
        }
        BirthdayActionRequest birthdayActionRequest = (BirthdayActionRequest) other;
        return Intrinsics.d(this.actionName, birthdayActionRequest.actionName) && Intrinsics.d(this.birthday, birthdayActionRequest.birthday) && Intrinsics.d(this.additionalParams, birthdayActionRequest.additionalParams);
    }

    @NotNull
    public final String getActionName() {
        return this.actionName;
    }

    @NotNull
    public final Map<String, String> getAdditionalParams() {
        return this.additionalParams;
    }

    @NotNull
    public final String getBirthday() {
        return this.birthday;
    }

    public int hashCode() {
        return this.additionalParams.hashCode() + g.a(this.actionName.hashCode() * 31, 31, this.birthday);
    }

    @NotNull
    public String toString() {
        String str = this.actionName;
        String str2 = this.birthday;
        return P.f(C3660k.d("BirthdayActionRequest(actionName=", str, ", birthday=", str2, ", additionalParams="), this.additionalParams, ")");
    }
}
