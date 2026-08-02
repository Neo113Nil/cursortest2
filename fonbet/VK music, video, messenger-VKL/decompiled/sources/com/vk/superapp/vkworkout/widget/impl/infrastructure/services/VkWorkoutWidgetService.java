package com.vk.superapp.vkworkout.widget.impl.infrastructure.services;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.RemoteViews;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.superapp.vkworkout.widget.api.VkWorkoutSmallWidgetUiState;
import com.vk.superapp.vkworkout.widget.impl.WorkoutMiniAppIds;
import com.vk.superapp.vkworkout.widget.impl.infrastructure.receivers.VkWorkoutWidgetSmallProvider;
import com.vkontakte.android.R;
import java.util.Arrays;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.a0a;
import xsna.b6l;
import xsna.d3w0;
import xsna.e3w0;
import xsna.hpj;
import xsna.hqu0;
import xsna.i3w0;
import xsna.myc0;
import xsna.s3q0;
import xsna.spj;
import xsna.t2i0;
import xsna.whn0;
import xsna.wzs;
import xsna.xgx0;
import xsna.yvj;
import xsna.zvj;

/* compiled from: VkWorkoutWidgetService.kt */
/* loaded from: classes6.dex */
public final class VkWorkoutWidgetService extends JobService {
    public static final /* synthetic */ int d = 0;
    public final i3w0 b = new i3w0();
    public final hpj c = zvj.a(d.a.a(whn0.a(), hqu0.a()));

    /* compiled from: VkWorkoutWidgetService.kt */
    public static final class a {
        public static void a(Context context) {
            ((JobScheduler) context.getSystemService("jobscheduler")).schedule(new JobInfo.Builder(2364, new ComponentName(context, (Class<?>) VkWorkoutWidgetService.class)).setRequiredNetworkType(1).build());
        }
    }

    /* compiled from: VkWorkoutWidgetService.kt */
    @b6l(c = "com.vk.superapp.vkworkout.widget.impl.infrastructure.services.VkWorkoutWidgetService$onStartJob$1", f = "VkWorkoutWidgetService.kt", l = {32}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ int[] $appWidgetIds;
        final /* synthetic */ AppWidgetManager $appWidgetManager;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int[] iArr, AppWidgetManager appWidgetManager, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$appWidgetIds = iArr;
            this.$appWidgetManager = appWidgetManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return VkWorkoutWidgetService.this.new b(this.$appWidgetIds, this.$appWidgetManager, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object k;
            d3w0 d3w0Var;
            int i;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            int i3 = 1;
            if (i2 == 0) {
                kotlin.a.a(obj);
                d3w0 d3w0Var2 = new d3w0();
                i3w0 i3w0Var = VkWorkoutWidgetService.this.b;
                this.L$0 = d3w0Var2;
                this.label = 1;
                i3w0Var.getClass();
                k = myc0.k(hqu0.b(), new e3w0(i3w0Var, null), this);
                if (k == coroutineSingletons) {
                    return coroutineSingletons;
                }
                d3w0Var = d3w0Var2;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d3w0Var = (d3w0) this.L$0;
                kotlin.a.a(obj);
                k = obj;
            }
            VkWorkoutSmallWidgetUiState vkWorkoutSmallWidgetUiState = (VkWorkoutSmallWidgetUiState) k;
            int[] iArr = this.$appWidgetIds;
            VkWorkoutWidgetService vkWorkoutWidgetService = VkWorkoutWidgetService.this;
            AppWidgetManager appWidgetManager = this.$appWidgetManager;
            int length = iArr.length;
            int i4 = 0;
            while (i4 < length) {
                int i5 = iArr[i4];
                Context applicationContext = vkWorkoutWidgetService.getApplicationContext();
                d3w0Var.getClass();
                RemoteViews remoteViews = new RemoteViews(applicationContext.getPackageName(), R.layout.vk_workout_widget_small);
                remoteViews.setImageViewResource(R.id.ivAppWidgetBackground, R.drawable.vk_workout_widget_bg);
                remoteViews.setTextColor(R.id.tvTitle, applicationContext.getColor(R.color.vkworkout_widget_title_color));
                remoteViews.setTextColor(R.id.tvTrainingsCount, applicationContext.getColor(R.color.vkworkout_widget_subtitle_color));
                remoteViews.setTextColor(R.id.tvError, applicationContext.getColor(R.color.vkworkout_widget_error_text_color));
                remoteViews.setImageViewResource(R.id.ivError, R.drawable.vk_workout_widget_info);
                remoteViews.setImageViewResource(R.id.ivErrorBg, R.drawable.vk_workout_widget_info_bg);
                int i6 = d3w0.a.$EnumSwitchMapping$0[vkWorkoutSmallWidgetUiState.d.ordinal()];
                if (i6 == i3) {
                    i = i3;
                } else if (i6 != 2) {
                    if (i6 == 3) {
                        i = 1;
                        remoteViews.setViewVisibility(R.id.vgError, 8);
                        remoteViews.setViewVisibility(R.id.vgCounter, 0);
                        remoteViews.setTextViewText(R.id.tvTrainingsCount, applicationContext.getString(R.string.vk_workout_widget_small_no_workouts));
                        remoteViews.setTextViewText(R.id.tvTrainingDistanceAmount, applicationContext.getString(R.string.vk_workout_widget_small_unknown_distance_kilometers));
                        remoteViews.setInt(R.id.vgTrainingDistance, "setBackgroundResource", R.drawable.vk_workout_widget_distance_unknown_bg);
                    } else {
                        if (i6 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        int i7 = vkWorkoutSmallWidgetUiState.c;
                        int i8 = vkWorkoutSmallWidgetUiState.b;
                        remoteViews.setViewVisibility(R.id.vgError, 8);
                        remoteViews.setViewVisibility(R.id.vgCounter, 0);
                        remoteViews.setTextViewText(R.id.tvTrainingsCount, applicationContext.getResources().getQuantityString(R.plurals.vk_workout_widget_small_workouts, i8, Integer.valueOf(i8)));
                        double d = i7 / 1000.0d;
                        Locale forLanguageTag = Locale.forLanguageTag("ru-RU");
                        Object[] objArr = {Double.valueOf(d)};
                        i = 1;
                        remoteViews.setTextViewText(R.id.tvTrainingDistanceAmount, String.format(forLanguageTag, "%.2f", Arrays.copyOf(objArr, 1)));
                    }
                    Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("https://" + a0a.d + "/app" + WorkoutMiniAppIds.APP_ID_WORKOUT.h()));
                    intent.setPackage(applicationContext.getPackageName());
                    intent.setFlags(268435456);
                    remoteViews.setOnClickPendingIntent(R.id.vgRoot, t2i0.a(applicationContext, 0, intent, 33554432));
                    appWidgetManager.updateAppWidget(i5, remoteViews);
                    i4++;
                    i3 = i;
                } else {
                    i = 1;
                }
                remoteViews.setViewVisibility(R.id.vgError, 0);
                remoteViews.setViewVisibility(R.id.vgCounter, 8);
                Intent intent2 = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("https://" + a0a.d + "/app" + WorkoutMiniAppIds.APP_ID_WORKOUT.h()));
                intent2.setPackage(applicationContext.getPackageName());
                intent2.setFlags(268435456);
                remoteViews.setOnClickPendingIntent(R.id.vgRoot, t2i0.a(applicationContext, 0, intent2, 33554432));
                appWidgetManager.updateAppWidget(i5, remoteViews);
                i4++;
                i3 = i;
            }
            return s3q0.a;
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(getApplicationContext());
        int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new ComponentName(getApplicationContext(), (Class<?>) VkWorkoutWidgetSmallProvider.class));
        xgx0 xgx0Var = xgx0.a;
        String concat = "VkWorkoutWidgetService.onStartJob() ->\nappWidgetIds = ".concat(Arrays.toString(appWidgetIds));
        xgx0Var.getClass();
        xgx0.a(concat);
        if (appWidgetIds.length == 0) {
            jobFinished(jobParameters, false);
            return true;
        }
        myc0.h(this.c, null, null, new b(appWidgetIds, appWidgetManager, null), 3);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        xgx0.a.getClass();
        xgx0.a("VkWorkoutWidgetService.onStopJob()");
        return true;
    }
}
