package net.danlew.android.joda;

import R4.a;
import Ue.b;
import Ue.c;
import android.content.Context;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.joda.time.DateTimeZone;

/* loaded from: classes.dex */
public class JodaTimeInitializer implements a<Object> {
    @Override // R4.a
    @NonNull
    public final List<Class<? extends a<?>>> a() {
        return Collections.EMPTY_LIST;
    }

    @Override // R4.a
    @NonNull
    public final Object create(@NonNull Context context) {
        try {
            DateTimeZone.E(new b(context));
            context.getApplicationContext().registerReceiver(new c(), new IntentFilter("android.intent.action.TIMEZONE_CHANGED"));
            return new Object();
        } catch (IOException e11) {
            throw new RuntimeException("Could not read ZoneInfoMap. You are probably using Proguard wrong.", e11);
        }
    }
}
