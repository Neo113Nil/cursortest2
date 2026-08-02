package com.sports.insider.domain.service;

import android.app.PendingIntent;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import com.sports.insider.MyApp;
import com.sports.insider.ui.activities.MainActivity;
import eg.c0;
import eg.w;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import jg.d;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.e;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oe.j;
import qc.a;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sports/insider/domain/service/PreviewLastDayService;", "Landroid/app/job/JobService;", "<init>", "()V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPreviewLastDayService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreviewLastDayService.kt\ncom/sports/insider/domain/service/PreviewLastDayService\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 Color.kt\nandroidx/core/graphics/ColorKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,140:1\n47#2,4:141\n404#3:145\n1#4:146\n*S KotlinDebug\n*F\n+ 1 PreviewLastDayService.kt\ncom/sports/insider/domain/service/PreviewLastDayService\n*L\n61#1:141,4\n37#1:145\n*E\n"})
/* loaded from: classes.dex */
public final class PreviewLastDayService extends JobService {

    /* renamed from: a, reason: collision with root package name */
    public JobParameters f6877a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6878b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final a f6879c = new a(this);

    /* renamed from: d, reason: collision with root package name */
    public final ExecutorService f6880d;

    public PreviewLastDayService() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this.f6880d = newSingleThreadExecutor;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        d dVar = MyApp.f6830c;
        CancellationException cancellationException = new CancellationException("onDestroy");
        cancellationException.initCause(null);
        c0.g(dVar, cancellationException);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        this.f6877a = jobParameters;
        System.out.println((Object) "PreviewLastDayService onStartJob");
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 34 && jobParameters != null) {
            jd.a aVar = new jd.a();
            Intent intent = new Intent(getApplicationContext(), (Class<?>) MainActivity.class);
            intent.setAction("OPEN_MAIN_ACTIVITY");
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            PendingIntent b10 = jd.a.b(applicationContext, intent);
            Context applicationContext2 = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
            setNotification(jobParameters, this.f6878b, aVar.c("Push", "Notice", "General notice", b10, "Sports insider", "Downloading forecasts", applicationContext2, false, false, null, Integer.valueOf(Color.parseColor("#0f4583")), true), 1);
            System.out.println((Object) "PreviewLastDayService onStartJob setNotification");
        }
        if (i5 < 34) {
            jd.a aVar2 = new jd.a();
            Intent intent2 = new Intent(getApplicationContext(), (Class<?>) MainActivity.class);
            intent2.setAction("OPEN_MAIN_ACTIVITY");
            Context applicationContext3 = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext3, "getApplicationContext(...)");
            PendingIntent b11 = jd.a.b(applicationContext3, intent2);
            Context applicationContext4 = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext4, "getApplicationContext(...)");
            aVar2.d(this.f6878b, "Push", "Notice", "General notice", b11, "Sports insider", "Downloading forecasts", applicationContext4, false, false, null, 0, null);
            System.out.println((Object) "PreviewLastDayService onStartJob NotificationUseCase");
        }
        d dVar = MyApp.f6830c;
        w l6 = c0.l(this.f6880d);
        a aVar3 = this.f6879c;
        aVar3.getClass();
        c0.t(dVar, e.c(aVar3, l6), null, new j(this, jobParameters, (Continuation) null, 16), 2);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
