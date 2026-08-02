package com.google.android.gms.internal.fitness;

import com.huawei.hms.hihealth.HiHealthActivities;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import ru.ok.android.api.core.ApiInvocationException;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public enum zzgp {
    AEROBICS(9, HiHealthActivities.AEROBICS),
    ARCHERY(Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, HiHealthActivities.ARCHERY),
    BADMINTON(10, HiHealthActivities.BADMINTON),
    BASEBALL(11, HiHealthActivities.BASEBALL),
    BASKETBALL(12, HiHealthActivities.BASKETBALL),
    BIATHLON(13, HiHealthActivities.BIATHLON),
    BIKING(1, "biking"),
    BIKING_HAND(14, "biking.hand"),
    BIKING_MOUNTAIN(15, "biking.mountain"),
    BIKING_ROAD(16, "biking.road"),
    BIKING_SPINNING(17, "biking.spinning"),
    BIKING_STATIONARY(18, "biking.stationary"),
    BIKING_UTILITY(19, "biking.utility"),
    BOXING(20, HiHealthActivities.BOXING),
    CALISTHENICS(21, HiHealthActivities.CALISTHENICS),
    CIRCUIT_TRAINING(22, HiHealthActivities.CIRCUIT_TRAINING),
    CRICKET(23, HiHealthActivities.CRICKET),
    CROSSFIT(113, HiHealthActivities.CROSSFIT),
    CURLING(Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE, HiHealthActivities.CURLING),
    DANCING(24, HiHealthActivities.DANCING),
    DIVING(102, HiHealthActivities.DIVING),
    ELEVATOR(Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, HiHealthActivities.ELEVATOR),
    ELLIPTICAL(25, HiHealthActivities.ELLIPTICAL),
    ERGOMETER(103, HiHealthActivities.ERGOMETER),
    ESCALATOR(Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, HiHealthActivities.ESCALATOR),
    EXITING_VEHICLE(6, "exiting_vehicle"),
    FENCING(26, HiHealthActivities.FENCING),
    FLOSSING(Sdk.SDKError.Reason.TPAT_ERROR_VALUE, "flossing"),
    FOOTBALL_AMERICAN(27, HiHealthActivities.FOOTBALL_AMERICAN),
    FOOTBALL_AUSTRALIAN(28, HiHealthActivities.FOOTBALL_AUSTRALIAN),
    FOOTBALL_SOCCER(29, HiHealthActivities.FOOTBALL_SOCCER),
    FRISBEE_DISC(30, "frisbee_disc"),
    GARDENING(31, HiHealthActivities.GARDENING),
    GOLF(32, "golf"),
    GUIDED_BREATHING(Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, "guided_breathing"),
    GYMNASTICS(33, HiHealthActivities.GYMNASTICS),
    HANDBALL(34, HiHealthActivities.HANDBALL),
    HIGH_INTENSITY_INTERVAL_TRAINING(Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, HiHealthActivities.HIIT),
    HIKING(35, HiHealthActivities.HIKING),
    HOCKEY(36, HiHealthActivities.HOCKEY),
    HORSEBACK_RIDING(37, "horseback_riding"),
    HOUSEWORK(38, HiHealthActivities.HOUSEWORK),
    ICE_SKATING(104, HiHealthActivities.ICE_SKATING),
    INTERVAL_TRAINING(Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE, HiHealthActivities.INTERVAL_TRAINING),
    IN_VEHICLE(0, HiHealthActivities.IN_VEHICLE),
    JUMP_ROPE(39, "jump_rope"),
    KAYAKING(40, HiHealthActivities.KAYAKING),
    KETTLEBELL_TRAINING(41, HiHealthActivities.KETTLEBELL_TRAINING),
    KICKBOXING(42, HiHealthActivities.KICKBOXING),
    KICK_SCOOTER(ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED, "kick_scooter"),
    KITESURFING(43, HiHealthActivities.KITESURFING),
    MARTIAL_ARTS(44, HiHealthActivities.MARTIAL_ARTS),
    MEDITATION(45, HiHealthActivities.MEDITATION),
    MIXED_MARTIAL_ARTS(46, HiHealthActivities.MIXED_MARTIAL_ARTS),
    ON_FOOT(2, HiHealthActivities.ON_FOOT),
    OTHER(108, "other"),
    P90X(47, HiHealthActivities.P90X),
    PARAGLIDING(48, HiHealthActivities.PARAGLIDING),
    PILATES(49, HiHealthActivities.PILATES),
    POLO(50, HiHealthActivities.POLO),
    RACQUETBALL(51, HiHealthActivities.RACQUETBALL),
    ROCK_CLIMBING(52, HiHealthActivities.ROCK_CLIMBING),
    ROWING(53, HiHealthActivities.ROWING),
    ROWING_MACHINE(54, HiHealthActivities.ROWING_MACHINE),
    RUGBY(55, HiHealthActivities.RUGBY),
    RUNNING(8, HiHealthActivities.RUNNING),
    RUNNING_JOGGING(56, "running.jogging"),
    RUNNING_SAND(57, "running.sand"),
    RUNNING_TREADMILL(58, "running.treadmill"),
    SAILING(59, HiHealthActivities.SAILING),
    SCUBA_DIVING(60, HiHealthActivities.SCUBA_DIVING),
    SKATEBOARDING(61, HiHealthActivities.SKATEBOARDING),
    SKATING(62, HiHealthActivities.SKATING),
    SKATING_CROSS(63, "skating.cross"),
    SKATING_INDOOR(105, "skating.indoor"),
    SKATING_INLINE(64, "skating.inline"),
    SKIING(65, HiHealthActivities.SKIING),
    SKIING_BACK_COUNTRY(66, "skiing.back_country"),
    SKIING_CROSS_COUNTRY(67, "skiing.cross_country"),
    SKIING_DOWNHILL(68, "skiing.downhill"),
    SKIING_KITE(69, "skiing.kite"),
    SKIING_ROLLER(70, "skiing.roller"),
    SLEDDING(71, HiHealthActivities.SLEDDING),
    SLEEP(72, HiHealthActivities.SLEEP),
    SLEEP_AWAKE(112, HiHealthActivities.SLEEP_AWAKE),
    SLEEP_DEEP(110, HiHealthActivities.SLEEP_DEEP),
    SLEEP_LIGHT(109, HiHealthActivities.SLEEP_LIGHT),
    SLEEP_REM(111, HiHealthActivities.SLEEP_REM),
    SNOWBOARDING(73, HiHealthActivities.SNOWBOARDING),
    SNOWMOBILE(74, HiHealthActivities.SNOWMOBILE),
    SNOWSHOEING(75, HiHealthActivities.SNOWSHOEING),
    SOFTBALL(120, HiHealthActivities.SOFTBALL),
    SQUASH(76, HiHealthActivities.SQUASH),
    STAIR_CLIMBING(77, HiHealthActivities.STAIR_CLIMBING),
    STAIR_CLIMBING_MACHINE(78, HiHealthActivities.STAIR_CLIMBING_MACHINE),
    STANDUP_PADDLEBOARDING(79, HiHealthActivities.STANDUP_PADDLEBOARDING),
    STILL(3, HiHealthActivities.STILL),
    STRENGTH_TRAINING(80, HiHealthActivities.STRENGTH_TRAINING),
    SURFING(81, HiHealthActivities.SURFING),
    SWIMMING(82, HiHealthActivities.SWIMMING),
    SWIMMING_OPEN_WATER(84, HiHealthActivities.SWIMMING_OPEN_WATER),
    SWIMMING_POOL(83, HiHealthActivities.SWIMMING_POOL),
    TABLE_TENNIS(85, HiHealthActivities.TABLE_TENNIS),
    TEAM_SPORTS(86, HiHealthActivities.TEAM_SPORTS),
    TENNIS(87, HiHealthActivities.TENNIS),
    TILTING(5, HiHealthActivities.TILTING),
    TREADMILL(88, HiHealthActivities.TREADMILL),
    UNKNOWN(4, "unknown"),
    VOLLEYBALL(89, HiHealthActivities.VOLLEYBALL),
    VOLLEYBALL_BEACH(90, "volleyball.beach"),
    VOLLEYBALL_INDOOR(91, "volleyball.indoor"),
    WAKEBOARDING(92, HiHealthActivities.WAKEBOARDING),
    WALKING(7, HiHealthActivities.WALKING),
    WALKING_FITNESS(93, "walking.fitness"),
    WALKING_NORDIC(94, "walking.nordic"),
    WALKING_PACED(123, "walking.paced"),
    WALKING_STROLLER(116, "walking.stroller"),
    WALKING_TREADMILL(95, "walking.treadmill"),
    WATER_POLO(96, HiHealthActivities.WATER_POLO),
    WEIGHTLIFTING(97, HiHealthActivities.WEIGHTLIFTING),
    WHEELCHAIR(98, HiHealthActivities.WHEELCHAIR),
    WINDSURFING(99, HiHealthActivities.WINDSURFING),
    YOGA(100, HiHealthActivities.YOGA),
    ZUMBA(101, HiHealthActivities.ZUMBA);

    private static final zzfw zzbu;
    private static final zzga zzbv;
    private final int zzbx;
    private final String zzby;

    static {
        EnumSet allOf = EnumSet.allOf(zzgp.class);
        ArrayList arrayList = new ArrayList(Collections.nCopies(allOf.size(), null));
        Iterator it = allOf.iterator();
        while (it.hasNext()) {
            zzgp zzgpVar = (zzgp) it.next();
            arrayList.set(zzgpVar.zzbx, zzgpVar);
        }
        zzbu = zzfw.zzh(arrayList);
        zzbv = zzga.zzi(Integer.valueOf(SLEEP.zzbx), Integer.valueOf(SLEEP_AWAKE.zzbx), Integer.valueOf(SLEEP_DEEP.zzbx), Integer.valueOf(SLEEP_LIGHT.zzbx), Integer.valueOf(SLEEP_REM.zzbx));
    }

    zzgp(int i, String str) {
        this.zzbx = i;
        this.zzby = str;
    }

    public static zzgp zza(int i, zzgp zzgpVar) {
        if (i >= 0) {
            zzfw zzfwVar = zzbu;
            if (i < zzfwVar.size()) {
                return (zzgp) zzfwVar.get(i);
            }
        }
        return zzgpVar;
    }

    public final boolean zzb() {
        return zzbv.contains(Integer.valueOf(this.zzbx));
    }
}
