package ru.ozon.fintech.features.tabber.presentation.preferences;

import O30.b;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.os.d;
import androidx.fragment.app.Q;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/ozon/fintech/features/tabber/presentation/preferences/FintechPreferencesActivity;", "LE30/a;", "<init>", "()V", "a", "tabber_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FintechPreferencesActivity extends E30.a {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f96339j = 0;

    public static final class a {
        @NotNull
        public static Intent a(@NotNull Context context, @NotNull b type) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(type, "type");
            Intent intent = new Intent(context, (Class<?>) FintechPreferencesActivity.class);
            Intrinsics.checkNotNullParameter(intent, "<this>");
            Intrinsics.checkNotNullParameter(type, "type");
            intent.putExtra("FINTECH_ACTIVITY_LIB_TYPE_KEY", type.ordinal());
            return intent;
        }
    }

    @Override // androidx.fragment.app.r, androidx.activity.ActivityC5043j, androidx.core.app.g, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        b fintechLibType;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null) {
            Intrinsics.checkNotNullParameter(intent, "<this>");
            try {
                b[] values = b.values();
                Bundle extras = intent.getExtras();
                fintechLibType = values[extras != null ? extras.getInt("FINTECH_ACTIVITY_LIB_TYPE_KEY") : 0];
            } catch (Exception unused) {
                fintechLibType = b.FINANCE;
            }
        } else {
            fintechLibType = null;
        }
        Intrinsics.f(fintechLibType);
        setContentView(R.layout.fintech_preferences_activity);
        Intrinsics.checkNotNullParameter(fintechLibType, "fintechLibType");
        FintechPreferencesFragment fintechPreferencesFragment = new FintechPreferencesFragment();
        Intrinsics.checkNotNullParameter(fintechLibType, "fintechLibType");
        fintechPreferencesFragment.setArguments(d.b(new Pair("FINTECH_ACTIVITY_LIB_TYPE_KEY", fintechLibType.name())));
        Q p11 = getSupportFragmentManager().p();
        p11.c(fintechPreferencesFragment, R.id.fragment_container);
        p11.l();
    }
}
