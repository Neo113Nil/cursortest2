package com.vk.libdelayedjobs.impl;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import com.vk.log.L;
import java.lang.reflect.Constructor;
import org.json.JSONObject;
import xsna.fyx;
import xsna.tsl;

/* compiled from: JobWorker.kt */
/* loaded from: classes.dex */
public final class JobWorker extends Worker {
    public final Context b;

    public JobWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.b = context;
    }

    @Override // androidx.work.Worker
    public final b.a doWork() {
        String d = getInputData().d("job_class_name");
        fyx fyxVar = new fyx(new JSONObject(getInputData().d("job_args")));
        try {
            Constructor<?> declaredConstructor = Class.forName(d).getDeclaredConstructor(fyx.class);
            declaredConstructor.setAccessible(true);
            ((tsl) declaredConstructor.newInstance(fyxVar)).a(this.b);
        } catch (Exception e) {
            L.i(e);
        }
        return new b.a.c();
    }
}
