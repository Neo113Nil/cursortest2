package ru.ozon.fintech.features.tabber.presentation.preferences;

import O30.b;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import kotlin.jvm.internal.Intrinsics;
import l80.f;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.tabber.presentation.preferences.FintechPreferencesActivity;

/* loaded from: classes3.dex */
public final class a {
    public static final void a(@NotNull final b fintechLibType, final S80.b bVar, @NotNull final f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(fintechLibType, "fintechLibType");
        Toast.makeText(fVar.getApplicationContext(), "Сейчас запустим preferences!!", 0).show();
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: o80.a
            @Override // java.lang.Runnable
            public final void run() {
                Activity c11 = bVar.c();
                if (c11 != null) {
                    int i11 = FintechPreferencesActivity.f96339j;
                    c11.startActivity(FintechPreferencesActivity.a.a(fVar, fintechLibType));
                }
            }
        }, 2000L);
    }
}
