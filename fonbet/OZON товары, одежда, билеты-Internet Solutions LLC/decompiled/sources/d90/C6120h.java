package d90;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: d90.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6120h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final SharedPreferences f61386a;

    public C6120h(@NotNull SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.f61386a = sharedPreferences;
    }

    public final String a() {
        return this.f61386a.getString("fintech_session_duration", null);
    }

    public final void b(@NotNull String seconds) {
        Intrinsics.checkNotNullParameter(seconds, "seconds");
        SharedPreferences.Editor edit = this.f61386a.edit();
        Intrinsics.checkNotNullParameter(seconds, "<this>");
        if (kotlin.text.h.K(seconds)) {
            seconds = "";
        } else if (!kotlin.text.h.A(seconds, "s", false)) {
            seconds = seconds.concat("s");
        }
        edit.putString("fintech_session_duration", seconds);
        edit.commit();
    }
}
