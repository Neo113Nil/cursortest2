package fh0;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: fh0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6567b {

    /* renamed from: a, reason: collision with root package name */
    private final int f63439a;

    /* renamed from: fh0.b$a */
    public static final class a extends AbstractC6567b {
        @Override // fh0.AbstractC6567b
        @NotNull
        public final PendingIntent a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            PendingIntent activities = PendingIntent.getActivities(context, b(), null, 67108864, null);
            Intrinsics.checkNotNullExpressionValue(activities, "getActivities(...)");
            return activities;
        }
    }

    /* renamed from: fh0.b$b, reason: collision with other inner class name */
    public static final class C1023b extends AbstractC6567b {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final Intent f63440b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1023b(int i11, Intent intent) {
            super(i11);
            Intrinsics.checkNotNullParameter(intent, "intent");
            this.f63440b = intent;
        }

        @Override // fh0.AbstractC6567b
        @NotNull
        public final PendingIntent a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            PendingIntent activity = PendingIntent.getActivity(context, b(), this.f63440b, 67108864, null);
            Intrinsics.checkNotNullExpressionValue(activity, "getActivity(...)");
            return activity;
        }

        @NotNull
        public final Intent c() {
            return this.f63440b;
        }
    }

    /* renamed from: fh0.b$c */
    public static final class c extends AbstractC6567b {
        @Override // fh0.AbstractC6567b
        @NotNull
        public final PendingIntent a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            PendingIntent broadcast = PendingIntent.getBroadcast(context, b(), null, 67108864);
            Intrinsics.checkNotNullExpressionValue(broadcast, "getBroadcast(...)");
            return broadcast;
        }
    }

    /* renamed from: fh0.b$d */
    public static final class d extends AbstractC6567b {
        @Override // fh0.AbstractC6567b
        @NotNull
        public final PendingIntent a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            PendingIntent foregroundService = PendingIntent.getForegroundService(context, b(), null, 67108864);
            Intrinsics.checkNotNullExpressionValue(foregroundService, "getForegroundService(...)");
            return foregroundService;
        }
    }

    /* renamed from: fh0.b$e */
    public static final class e extends AbstractC6567b {
        @Override // fh0.AbstractC6567b
        @NotNull
        public final PendingIntent a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            throw null;
        }

        @NotNull
        public final Intent c() {
            throw null;
        }
    }

    public AbstractC6567b(int i11) {
        this.f63439a = i11;
    }

    @NotNull
    public abstract PendingIntent a(@NotNull Context context);

    public final int b() {
        return this.f63439a;
    }
}
