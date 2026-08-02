package com.google.android.gms.internal.fitness;

import com.huawei.hms.hihealth.HiHealthActivities;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class zzgo {
    private static final String[] zza = {HiHealthActivities.IN_VEHICLE, "biking", HiHealthActivities.ON_FOOT, HiHealthActivities.STILL, "unknown", HiHealthActivities.TILTING, "exiting_vehicle", HiHealthActivities.WALKING, HiHealthActivities.RUNNING, HiHealthActivities.AEROBICS, HiHealthActivities.BADMINTON, HiHealthActivities.BASEBALL, HiHealthActivities.BASKETBALL, HiHealthActivities.BIATHLON, "biking.hand", "biking.mountain", "biking.road", "biking.spinning", "biking.stationary", "biking.utility", HiHealthActivities.BOXING, HiHealthActivities.CALISTHENICS, HiHealthActivities.CIRCUIT_TRAINING, HiHealthActivities.CRICKET, HiHealthActivities.DANCING, HiHealthActivities.ELLIPTICAL, HiHealthActivities.FENCING, HiHealthActivities.FOOTBALL_AMERICAN, HiHealthActivities.FOOTBALL_AUSTRALIAN, HiHealthActivities.FOOTBALL_SOCCER, "frisbee_disc", HiHealthActivities.GARDENING, "golf", HiHealthActivities.GYMNASTICS, HiHealthActivities.HANDBALL, HiHealthActivities.HIKING, HiHealthActivities.HOCKEY, "horseback_riding", HiHealthActivities.HOUSEWORK, "jump_rope", HiHealthActivities.KAYAKING, HiHealthActivities.KETTLEBELL_TRAINING, HiHealthActivities.KICKBOXING, HiHealthActivities.KITESURFING, HiHealthActivities.MARTIAL_ARTS, HiHealthActivities.MEDITATION, HiHealthActivities.MIXED_MARTIAL_ARTS, HiHealthActivities.P90X, HiHealthActivities.PARAGLIDING, HiHealthActivities.PILATES, HiHealthActivities.POLO, HiHealthActivities.RACQUETBALL, HiHealthActivities.ROCK_CLIMBING, HiHealthActivities.ROWING, HiHealthActivities.ROWING_MACHINE, HiHealthActivities.RUGBY, "running.jogging", "running.sand", "running.treadmill", HiHealthActivities.SAILING, HiHealthActivities.SCUBA_DIVING, HiHealthActivities.SKATEBOARDING, HiHealthActivities.SKATING, "skating.cross", "skating.inline", HiHealthActivities.SKIING, "skiing.back_country", "skiing.cross_country", "skiing.downhill", "skiing.kite", "skiing.roller", HiHealthActivities.SLEDDING, HiHealthActivities.SLEEP, HiHealthActivities.SNOWBOARDING, HiHealthActivities.SNOWMOBILE, HiHealthActivities.SNOWSHOEING, HiHealthActivities.SQUASH, HiHealthActivities.STAIR_CLIMBING, HiHealthActivities.STAIR_CLIMBING_MACHINE, HiHealthActivities.STANDUP_PADDLEBOARDING, HiHealthActivities.STRENGTH_TRAINING, HiHealthActivities.SURFING, HiHealthActivities.SWIMMING, HiHealthActivities.SWIMMING_POOL, HiHealthActivities.SWIMMING_OPEN_WATER, HiHealthActivities.TABLE_TENNIS, HiHealthActivities.TEAM_SPORTS, HiHealthActivities.TENNIS, HiHealthActivities.TREADMILL, HiHealthActivities.VOLLEYBALL, "volleyball.beach", "volleyball.indoor", HiHealthActivities.WAKEBOARDING, "walking.fitness", "walking.nordic", "walking.treadmill", HiHealthActivities.WATER_POLO, HiHealthActivities.WEIGHTLIFTING, HiHealthActivities.WHEELCHAIR, HiHealthActivities.WINDSURFING, HiHealthActivities.YOGA, HiHealthActivities.ZUMBA, HiHealthActivities.DIVING, HiHealthActivities.ERGOMETER, HiHealthActivities.ICE_SKATING, "skating.indoor", HiHealthActivities.CURLING, "kick_scooter", "other", HiHealthActivities.SLEEP_LIGHT, HiHealthActivities.SLEEP_DEEP, HiHealthActivities.SLEEP_REM, HiHealthActivities.SLEEP_AWAKE, HiHealthActivities.CROSSFIT, HiHealthActivities.HIIT, HiHealthActivities.INTERVAL_TRAINING, "walking.stroller", HiHealthActivities.ELEVATOR, HiHealthActivities.ESCALATOR, HiHealthActivities.ARCHERY, HiHealthActivities.SOFTBALL, "flossing", "guided_breathing", "walking.paced"};

    public static int zza(String str) {
        for (int i = 0; i < 124; i++) {
            if (zza[i].equals(str)) {
                return i;
            }
        }
        return 4;
    }

    public static String zzb(int i) {
        String str;
        return (i < 0 || i >= 124 || (str = zza[i]) == null) ? "unknown" : str;
    }
}
