package com.huawei.hms.health;

import android.text.TextUtils;
import com.huawei.hms.hihealth.HiHealthActivities;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.Map;
import org.chromium.base.version_info.VersionConstants;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.fbj0;
import xsna.rjk0;

/* loaded from: classes13.dex */
public final class aacc {
    private static final Map<Integer, String> aab;
    private static final Map<String, Integer> aaba;

    static {
        HashMap hashMap = new HashMap();
        aab = hashMap;
        HashMap hashMap2 = new HashMap();
        aaba = hashMap2;
        hashMap.put(0, "unknown");
        hashMap.put(1, HiHealthActivities.AEROBICS);
        hashMap.put(2, HiHealthActivities.ARCHERY);
        hashMap.put(3, HiHealthActivities.BADMINTON);
        hashMap.put(4, HiHealthActivities.BASEBALL);
        hashMap.put(5, HiHealthActivities.BASKETBALL);
        hashMap.put(6, HiHealthActivities.BIATHLON);
        hashMap.put(7, HiHealthActivities.BOXING);
        hashMap.put(8, HiHealthActivities.CALISTHENICS);
        hashMap.put(9, HiHealthActivities.CIRCUIT_TRAINING);
        rjk0.a(10, hashMap, HiHealthActivities.CRICKET, 11, HiHealthActivities.CROSSFIT);
        rjk0.a(12, hashMap, HiHealthActivities.CURLING, 13, HiHealthActivities.CYCLING);
        rjk0.a(14, hashMap, HiHealthActivities.DANCING, 15, HiHealthActivities.DIVING);
        rjk0.a(16, hashMap, HiHealthActivities.ELEVATOR, 17, HiHealthActivities.ELLIPTICAL);
        rjk0.a(18, hashMap, HiHealthActivities.ERGOMETER, 19, HiHealthActivities.ESCALATOR);
        rjk0.a(20, hashMap, HiHealthActivities.FENCING, 21, HiHealthActivities.FOOTBALL_AMERICAN);
        rjk0.a(22, hashMap, HiHealthActivities.FOOTBALL_AUSTRALIAN, 23, HiHealthActivities.FOOTBALL_SOCCER);
        rjk0.a(24, hashMap, HiHealthActivities.FLYING_DISC, 25, HiHealthActivities.GARDENING);
        rjk0.a(26, hashMap, HiHealthActivities.GOLF, 27, HiHealthActivities.GYMNASTICS);
        rjk0.a(28, hashMap, HiHealthActivities.HANDBALL, 29, HiHealthActivities.HIIT);
        rjk0.a(30, hashMap, HiHealthActivities.HIKING, 31, HiHealthActivities.HOCKEY);
        rjk0.a(32, hashMap, HiHealthActivities.HORSE_RIDING, 33, HiHealthActivities.HOUSEWORK);
        rjk0.a(34, hashMap, HiHealthActivities.ICE_SKATING, 35, HiHealthActivities.IN_VEHICLE);
        rjk0.a(36, hashMap, HiHealthActivities.INTERVAL_TRAINING, 37, HiHealthActivities.JUMPING_ROPE);
        rjk0.a(38, hashMap, HiHealthActivities.KAYAKING, 39, HiHealthActivities.KETTLEBELL_TRAINING);
        rjk0.a(40, hashMap, HiHealthActivities.KICKBOXING, 41, HiHealthActivities.KITESURFING);
        rjk0.a(42, hashMap, HiHealthActivities.MARTIAL_ARTS, 44, HiHealthActivities.MEDITATION);
        rjk0.a(43, hashMap, HiHealthActivities.MIXED_MARTIAL_ARTS, 45, HiHealthActivities.ON_FOOT);
        rjk0.a(46, hashMap, "other", 47, HiHealthActivities.P90X);
        rjk0.a(48, hashMap, HiHealthActivities.PARAGLIDING, 49, HiHealthActivities.PILATES);
        rjk0.a(50, hashMap, HiHealthActivities.POLO, 51, HiHealthActivities.RACQUETBALL);
        rjk0.a(52, hashMap, HiHealthActivities.ROCK_CLIMBING, 53, HiHealthActivities.ROWING);
        rjk0.a(54, hashMap, HiHealthActivities.ROWING_MACHINE, 55, HiHealthActivities.RUGBY);
        rjk0.a(56, hashMap, HiHealthActivities.RUNNING, 57, HiHealthActivities.RUNNING_MACHINE);
        rjk0.a(58, hashMap, HiHealthActivities.SAILING, 59, HiHealthActivities.SCUBA_DIVING);
        rjk0.a(60, hashMap, HiHealthActivities.SCOOTER_RIDING, 61, HiHealthActivities.SKATEBOARDING);
        rjk0.a(62, hashMap, HiHealthActivities.SKATING, 63, HiHealthActivities.SKIING);
        rjk0.a(64, hashMap, HiHealthActivities.SLEDDING, 65, HiHealthActivities.SLEEP);
        rjk0.a(66, hashMap, HiHealthActivities.SLEEP_LIGHT, 67, HiHealthActivities.SLEEP_DEEP);
        rjk0.a(68, hashMap, HiHealthActivities.SLEEP_REM, 69, HiHealthActivities.SLEEP_AWAKE);
        rjk0.a(70, hashMap, HiHealthActivities.SNOWBOARDING, 71, HiHealthActivities.SNOWMOBILE);
        rjk0.a(72, hashMap, HiHealthActivities.SNOWSHOEING, 73, HiHealthActivities.SOFTBALL);
        rjk0.a(74, hashMap, HiHealthActivities.SQUASH, 75, HiHealthActivities.STAIR_CLIMBING);
        rjk0.a(76, hashMap, HiHealthActivities.STAIR_CLIMBING_MACHINE, 77, HiHealthActivities.STANDUP_PADDLEBOARDING);
        rjk0.a(78, hashMap, HiHealthActivities.STILL, 79, HiHealthActivities.STRENGTH_TRAINING);
        rjk0.a(80, hashMap, HiHealthActivities.SURFING, 81, HiHealthActivities.SWIMMING);
        rjk0.a(83, hashMap, HiHealthActivities.SWIMMING_POOL, 82, HiHealthActivities.SWIMMING_OPEN_WATER);
        rjk0.a(84, hashMap, HiHealthActivities.TABLE_TENNIS, 85, HiHealthActivities.TEAM_SPORTS);
        rjk0.a(86, hashMap, HiHealthActivities.TENNIS, 87, HiHealthActivities.TILTING);
        rjk0.a(88, hashMap, HiHealthActivities.VOLLEYBALL, 89, HiHealthActivities.WAKEBOARDING);
        rjk0.a(90, hashMap, HiHealthActivities.WALKING, 91, HiHealthActivities.WATER_POLO);
        rjk0.a(92, hashMap, HiHealthActivities.WEIGHTLIFTING, 93, HiHealthActivities.WHEELCHAIR);
        rjk0.a(94, hashMap, HiHealthActivities.WINDSURFING, 95, HiHealthActivities.YOGA);
        rjk0.a(96, hashMap, HiHealthActivities.ZUMBA, 97, HiHealthActivities.CYCLING_INDOOR);
        rjk0.a(98, hashMap, HiHealthActivities.DARTS, 99, HiHealthActivities.BILLIARDS);
        rjk0.a(100, hashMap, HiHealthActivities.SHUTTLECOCK, 101, HiHealthActivities.BOWLING);
        rjk0.a(102, hashMap, HiHealthActivities.GROUP_CALISTHENICS, 103, HiHealthActivities.TUG_OF_WAR);
        rjk0.a(104, hashMap, HiHealthActivities.BEACH_SOCCER, 105, HiHealthActivities.BEACH_VOLLEYBALL);
        rjk0.a(Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE, hashMap, HiHealthActivities.GATEBALL, ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED, HiHealthActivities.SEPAKTAKRAW);
        rjk0.a(108, hashMap, HiHealthActivities.DODGE_BALL, 109, HiHealthActivities.TREADMILL);
        rjk0.a(110, hashMap, HiHealthActivities.SPINNING, 111, HiHealthActivities.STROLL_MACHINE);
        rjk0.a(112, hashMap, HiHealthActivities.CROSS_FIT, 113, HiHealthActivities.FUNCTIONAL_TRAINING);
        rjk0.a(Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, hashMap, HiHealthActivities.PHYSICAL_TRAINING, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE, HiHealthActivities.BELLY_DANCE);
        rjk0.a(116, hashMap, HiHealthActivities.JAZZ, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, HiHealthActivities.LATIN);
        rjk0.a(Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, hashMap, HiHealthActivities.BALLET, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, HiHealthActivities.CORE_TRAINING);
        rjk0.a(120, hashMap, HiHealthActivities.HORIZONTAL_BAR, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, HiHealthActivities.PARALLEL_BARS);
        rjk0.a(Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, hashMap, HiHealthActivities.HIP_HOP, 123, HiHealthActivities.SQUARE_DANCE);
        rjk0.a(Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, hashMap, HiHealthActivities.HU_LA_HOOP, 125, HiHealthActivities.BMX);
        rjk0.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, hashMap, HiHealthActivities.ORIENTEERING, 127, HiHealthActivities.INDOOR_WALK);
        hashMap.put(128, HiHealthActivities.INDOOR_RUNNING);
        hashMap.put(129, HiHealthActivities.MOUNTAIN_CLIMBING);
        hashMap.put(130, HiHealthActivities.CROSS_COUNTRY_RACE);
        Integer valueOf = Integer.valueOf(Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE);
        hashMap.put(valueOf, HiHealthActivities.ROLLER_SKAING);
        rjk0.a(Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, hashMap, HiHealthActivities.HUNTING, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, HiHealthActivities.FLY_A_KITE);
        rjk0.a(134, hashMap, HiHealthActivities.SWING, 135, HiHealthActivities.OBSTACLE_RACE);
        rjk0.a(Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, hashMap, HiHealthActivities.BUNGEE_JUMPING, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, HiHealthActivities.PARKOUR);
        rjk0.a(138, hashMap, HiHealthActivities.PARACHUTE, 139, HiHealthActivities.RACING_CAR);
        rjk0.a(VersionConstants.PRODUCT_MAJOR_VERSION, hashMap, HiHealthActivities.TRIATHLONS, 141, HiHealthActivities.ICE_HOCKEY);
        rjk0.a(142, hashMap, HiHealthActivities.CROSSCOUNTRY_SKIING, 143, HiHealthActivities.SLED);
        rjk0.a(144, hashMap, HiHealthActivities.FISHING, 145, HiHealthActivities.DRIFTING);
        rjk0.a(146, hashMap, HiHealthActivities.DRAGON_BOAT, 147, HiHealthActivities.MOTORBOAT);
        rjk0.a(148, hashMap, HiHealthActivities.SUP, 149, HiHealthActivities.FREE_SPARRING);
        rjk0.a(150, hashMap, HiHealthActivities.KARATE, 151, HiHealthActivities.BODY_COMBAT);
        rjk0.a(152, hashMap, HiHealthActivities.KENDO, 153, HiHealthActivities.TAI_CHI);
        rjk0.a(154, hashMap, HiHealthActivities.FREE_DIVING, 155, HiHealthActivities.APNEA_TRAINING);
        rjk0.a(156, hashMap, HiHealthActivities.APNEA_TEST, 157, HiHealthActivities.GOLF_AREA);
        hashMap.put(158, HiHealthActivities.OUTDOOR_ADVENTURE);
        hashMap2.put("unknown", 0);
        hashMap2.put(HiHealthActivities.AEROBICS, 1);
        hashMap2.put(HiHealthActivities.ARCHERY, 2);
        hashMap2.put(HiHealthActivities.BADMINTON, 3);
        hashMap2.put(HiHealthActivities.BASEBALL, 4);
        hashMap2.put(HiHealthActivities.BASKETBALL, 5);
        hashMap2.put(HiHealthActivities.BIATHLON, 6);
        hashMap2.put(HiHealthActivities.BOXING, 7);
        hashMap2.put(HiHealthActivities.CALISTHENICS, 8);
        hashMap2.put(HiHealthActivities.CIRCUIT_TRAINING, 9);
        hashMap2.put(HiHealthActivities.CRICKET, 10);
        fbj0.a(11, hashMap2, HiHealthActivities.CROSSFIT, 12, HiHealthActivities.CURLING);
        fbj0.a(13, hashMap2, HiHealthActivities.CYCLING, 14, HiHealthActivities.DANCING);
        fbj0.a(15, hashMap2, HiHealthActivities.DIVING, 16, HiHealthActivities.ELEVATOR);
        fbj0.a(17, hashMap2, HiHealthActivities.ELLIPTICAL, 18, HiHealthActivities.ERGOMETER);
        fbj0.a(19, hashMap2, HiHealthActivities.ESCALATOR, 20, HiHealthActivities.FENCING);
        fbj0.a(21, hashMap2, HiHealthActivities.FOOTBALL_AMERICAN, 22, HiHealthActivities.FOOTBALL_AUSTRALIAN);
        fbj0.a(23, hashMap2, HiHealthActivities.FOOTBALL_SOCCER, 24, HiHealthActivities.FLYING_DISC);
        fbj0.a(25, hashMap2, HiHealthActivities.GARDENING, 26, HiHealthActivities.GOLF);
        fbj0.a(27, hashMap2, HiHealthActivities.GYMNASTICS, 28, HiHealthActivities.HANDBALL);
        fbj0.a(29, hashMap2, HiHealthActivities.HIIT, 30, HiHealthActivities.HIKING);
        fbj0.a(31, hashMap2, HiHealthActivities.HOCKEY, 32, HiHealthActivities.HORSE_RIDING);
        fbj0.a(33, hashMap2, HiHealthActivities.HOUSEWORK, 34, HiHealthActivities.ICE_SKATING);
        fbj0.a(35, hashMap2, HiHealthActivities.IN_VEHICLE, 36, HiHealthActivities.INTERVAL_TRAINING);
        fbj0.a(37, hashMap2, HiHealthActivities.JUMPING_ROPE, 38, HiHealthActivities.KAYAKING);
        fbj0.a(39, hashMap2, HiHealthActivities.KETTLEBELL_TRAINING, 40, HiHealthActivities.KICKBOXING);
        fbj0.a(41, hashMap2, HiHealthActivities.KITESURFING, 42, HiHealthActivities.MARTIAL_ARTS);
        fbj0.a(44, hashMap2, HiHealthActivities.MEDITATION, 43, HiHealthActivities.MIXED_MARTIAL_ARTS);
        fbj0.a(45, hashMap2, HiHealthActivities.ON_FOOT, 46, "other");
        fbj0.a(47, hashMap2, HiHealthActivities.P90X, 48, HiHealthActivities.PARAGLIDING);
        fbj0.a(49, hashMap2, HiHealthActivities.PILATES, 50, HiHealthActivities.POLO);
        fbj0.a(51, hashMap2, HiHealthActivities.RACQUETBALL, 52, HiHealthActivities.ROCK_CLIMBING);
        fbj0.a(53, hashMap2, HiHealthActivities.ROWING, 54, HiHealthActivities.ROWING_MACHINE);
        fbj0.a(55, hashMap2, HiHealthActivities.RUGBY, 56, HiHealthActivities.RUNNING);
        fbj0.a(57, hashMap2, HiHealthActivities.RUNNING_MACHINE, 58, HiHealthActivities.SAILING);
        fbj0.a(59, hashMap2, HiHealthActivities.SCUBA_DIVING, 60, HiHealthActivities.SCOOTER_RIDING);
        fbj0.a(61, hashMap2, HiHealthActivities.SKATEBOARDING, 62, HiHealthActivities.SKATING);
        fbj0.a(63, hashMap2, HiHealthActivities.SKIING, 64, HiHealthActivities.SLEDDING);
        fbj0.a(65, hashMap2, HiHealthActivities.SLEEP, 66, HiHealthActivities.SLEEP_LIGHT);
        fbj0.a(67, hashMap2, HiHealthActivities.SLEEP_DEEP, 68, HiHealthActivities.SLEEP_REM);
        fbj0.a(69, hashMap2, HiHealthActivities.SLEEP_AWAKE, 70, HiHealthActivities.SNOWBOARDING);
        fbj0.a(71, hashMap2, HiHealthActivities.SNOWMOBILE, 72, HiHealthActivities.SNOWSHOEING);
        fbj0.a(73, hashMap2, HiHealthActivities.SOFTBALL, 74, HiHealthActivities.SQUASH);
        fbj0.a(75, hashMap2, HiHealthActivities.STAIR_CLIMBING, 76, HiHealthActivities.STAIR_CLIMBING_MACHINE);
        fbj0.a(77, hashMap2, HiHealthActivities.STANDUP_PADDLEBOARDING, 78, HiHealthActivities.STILL);
        fbj0.a(79, hashMap2, HiHealthActivities.STRENGTH_TRAINING, 80, HiHealthActivities.SURFING);
        fbj0.a(81, hashMap2, HiHealthActivities.SWIMMING, 83, HiHealthActivities.SWIMMING_POOL);
        fbj0.a(82, hashMap2, HiHealthActivities.SWIMMING_OPEN_WATER, 84, HiHealthActivities.TABLE_TENNIS);
        fbj0.a(85, hashMap2, HiHealthActivities.TEAM_SPORTS, 86, HiHealthActivities.TENNIS);
        fbj0.a(87, hashMap2, HiHealthActivities.TILTING, 88, HiHealthActivities.VOLLEYBALL);
        fbj0.a(89, hashMap2, HiHealthActivities.WAKEBOARDING, 90, HiHealthActivities.WALKING);
        fbj0.a(91, hashMap2, HiHealthActivities.WATER_POLO, 92, HiHealthActivities.WEIGHTLIFTING);
        fbj0.a(93, hashMap2, HiHealthActivities.WHEELCHAIR, 94, HiHealthActivities.WINDSURFING);
        fbj0.a(95, hashMap2, HiHealthActivities.YOGA, 96, HiHealthActivities.ZUMBA);
        fbj0.a(97, hashMap2, HiHealthActivities.CYCLING_INDOOR, 98, HiHealthActivities.DARTS);
        fbj0.a(99, hashMap2, HiHealthActivities.BILLIARDS, 100, HiHealthActivities.SHUTTLECOCK);
        fbj0.a(101, hashMap2, HiHealthActivities.BOWLING, 102, HiHealthActivities.GROUP_CALISTHENICS);
        fbj0.a(103, hashMap2, HiHealthActivities.TUG_OF_WAR, 104, HiHealthActivities.BEACH_SOCCER);
        fbj0.a(105, hashMap2, HiHealthActivities.BEACH_VOLLEYBALL, Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE, HiHealthActivities.GATEBALL);
        fbj0.a(ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED, hashMap2, HiHealthActivities.SEPAKTAKRAW, 108, HiHealthActivities.DODGE_BALL);
        fbj0.a(109, hashMap2, HiHealthActivities.TREADMILL, 110, HiHealthActivities.SPINNING);
        fbj0.a(111, hashMap2, HiHealthActivities.STROLL_MACHINE, 112, HiHealthActivities.CROSS_FIT);
        fbj0.a(113, hashMap2, HiHealthActivities.FUNCTIONAL_TRAINING, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, HiHealthActivities.PHYSICAL_TRAINING);
        fbj0.a(Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE, hashMap2, HiHealthActivities.BELLY_DANCE, 116, HiHealthActivities.JAZZ);
        fbj0.a(Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, hashMap2, HiHealthActivities.LATIN, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, HiHealthActivities.BALLET);
        fbj0.a(Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, hashMap2, HiHealthActivities.CORE_TRAINING, 120, HiHealthActivities.HORIZONTAL_BAR);
        fbj0.a(Sdk.SDKError.Reason.TPAT_ERROR_VALUE, hashMap2, HiHealthActivities.PARALLEL_BARS, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, HiHealthActivities.HIP_HOP);
        fbj0.a(123, hashMap2, HiHealthActivities.SQUARE_DANCE, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, HiHealthActivities.HU_LA_HOOP);
        fbj0.a(125, hashMap2, HiHealthActivities.BMX, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, HiHealthActivities.ORIENTEERING);
        fbj0.a(127, hashMap2, HiHealthActivities.INDOOR_WALK, 128, HiHealthActivities.INDOOR_RUNNING);
        hashMap2.put(HiHealthActivities.MOUNTIN_CLIMBING, 129);
        hashMap2.put(HiHealthActivities.MOUNTAIN_CLIMBING, 129);
        hashMap2.put(HiHealthActivities.CROSS_COUNTRY_RACE, 130);
        hashMap2.put(HiHealthActivities.ROLLER_SKATING, valueOf);
        hashMap2.put(HiHealthActivities.ROLLER_SKAING, valueOf);
        hashMap2.put(HiHealthActivities.HUNTING, Integer.valueOf(Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE));
        fbj0.a(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, hashMap2, HiHealthActivities.FLY_A_KITE, 134, HiHealthActivities.SWING);
        fbj0.a(135, hashMap2, HiHealthActivities.OBSTACLE_RACE, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, HiHealthActivities.BUNGEE_JUMPING);
        fbj0.a(Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, hashMap2, HiHealthActivities.PARKOUR, 138, HiHealthActivities.PARACHUTE);
        fbj0.a(139, hashMap2, HiHealthActivities.RACING_CAR, VersionConstants.PRODUCT_MAJOR_VERSION, HiHealthActivities.TRIATHLONS);
        fbj0.a(141, hashMap2, HiHealthActivities.ICE_HOCKEY, 142, HiHealthActivities.CROSSCOUNTRY_SKIING);
        fbj0.a(143, hashMap2, HiHealthActivities.SLED, 144, HiHealthActivities.FISHING);
        fbj0.a(145, hashMap2, HiHealthActivities.DRIFTING, 146, HiHealthActivities.DRAGON_BOAT);
        fbj0.a(147, hashMap2, HiHealthActivities.MOTORBOAT, 148, HiHealthActivities.SUP);
        fbj0.a(149, hashMap2, HiHealthActivities.FREE_SPARRING, 150, HiHealthActivities.KARATE);
        fbj0.a(151, hashMap2, HiHealthActivities.BODY_COMBAT, 152, HiHealthActivities.KENDO);
        fbj0.a(153, hashMap2, HiHealthActivities.TAI_CHI, 154, HiHealthActivities.FREE_DIVING);
        fbj0.a(155, hashMap2, HiHealthActivities.APNEA_TRAINING, 156, HiHealthActivities.APNEA_TEST);
        fbj0.a(157, hashMap2, HiHealthActivities.GOLF_AREA, 158, HiHealthActivities.OUTDOOR_ADVENTURE);
    }

    public static int aab(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        Map<String, Integer> map = aaba;
        if (map.containsKey(str)) {
            return map.get(str).intValue();
        }
        return 0;
    }

    @Deprecated
    public static String aaba(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() != 0 ? HiHealthActivities.MIME_TYPE_PREFIX.concat(valueOf) : HiHealthActivities.MIME_TYPE_PREFIX;
    }

    public static String aab(int i) {
        Map<Integer, String> map = aab;
        return map.containsKey(Integer.valueOf(i)) ? map.get(Integer.valueOf(i)) : "unknown";
    }
}
