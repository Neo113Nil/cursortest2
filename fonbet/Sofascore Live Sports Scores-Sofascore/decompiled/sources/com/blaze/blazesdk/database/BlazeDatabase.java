package com.blaze.blazesdk.database;

import android.app.Application;
import androidx.annotation.Keep;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.ironsource.C4227o2;
import defpackage.bsl;
import defpackage.f6g;
import defpackage.frl;
import defpackage.i9a;
import defpackage.i9m;
import defpackage.k6g;
import defpackage.lxm;
import defpackage.m4m;
import defpackage.njc;
import defpackage.psl;
import defpackage.s9m;
import defpackage.tlm;
import defpackage.trl;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u0000 (2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/blaze/blazesdk/database/BlazeDatabase;", "Lk6g;", "<init>", "()V", "Ltrl;", "getStoryPageDao", "()Ltrl;", "storyPageDao", "Lfrl;", "getMomentsLikedDao", "()Lfrl;", "momentsLikedDao", "Li9m;", "getMomentsViewedDao", "()Li9m;", "momentsViewedDao", "Llxm;", "getAnalyticsTrackDao", "()Llxm;", "analyticsTrackDao", "Ltlm;", "getInteractionStatusDao", "()Ltlm;", "interactionStatusDao", "Lm4m;", "getAnalyticsDoNotTrackDao", "()Lm4m;", "analyticsDoNotTrackDao", "Lbsl;", "getVideosLikedDao", "()Lbsl;", "videosLikedDao", "Ls9m;", "getVideosViewedDao", "()Ls9m;", "videosViewedDao", "Lpsl;", "getLoggerDao", "()Lpsl;", "loggerDao", "Companion", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class BlazeDatabase extends k6g {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String DB_NAME = "BlazeDB";

    @Nullable
    private static BlazeDatabase db;

    @NotNull
    public abstract m4m getAnalyticsDoNotTrackDao();

    @NotNull
    public abstract lxm getAnalyticsTrackDao();

    @NotNull
    public abstract tlm getInteractionStatusDao();

    @NotNull
    public abstract psl getLoggerDao();

    @NotNull
    public abstract frl getMomentsLikedDao();

    @NotNull
    public abstract i9m getMomentsViewedDao();

    @NotNull
    public abstract trl getStoryPageDao();

    @NotNull
    public abstract bsl getVideosLikedDao();

    @NotNull
    public abstract s9m getVideosViewedDao();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\f\u001a\u0004\u0018\u00010\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/blaze/blazesdk/database/BlazeDatabase$Companion;", "", "<init>", "()V", "DB_NAME", "", "db", "Lcom/blaze/blazesdk/database/BlazeDatabase;", "getDb", "()Lcom/blaze/blazesdk/database/BlazeDatabase;", "setDb", "(Lcom/blaze/blazesdk/database/BlazeDatabase;)V", C4227o2.p, "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final BlazeDatabase getDb() {
            return BlazeDatabase.db;
        }

        @Nullable
        public final BlazeDatabase instance() {
            BlazeDatabase db = getDb();
            if (db != null) {
                return db;
            }
            Application application$blazesdk_release = BlazeSDK.INSTANCE.getApplication$blazesdk_release();
            if (application$blazesdk_release != null) {
                f6g w = i9a.w(application$blazesdk_release, BlazeDatabase.class, BlazeDatabase.DB_NAME);
                njc[] allMigrations = BlazeDatabaseMigrations.INSTANCE.getAllMigrations();
                w.a((njc[]) Arrays.copyOf(allMigrations, allMigrations.length));
                int[] iArr = {1, 2, 3, 4};
                for (int i = 0; i < 4; i++) {
                    w.l.add(Integer.valueOf(iArr[i]));
                }
                setDb((BlazeDatabase) w.b());
            }
            return getDb();
        }

        public final void setDb(@Nullable BlazeDatabase blazeDatabase) {
            BlazeDatabase.db = blazeDatabase;
        }

        private Companion() {
        }
    }
}
