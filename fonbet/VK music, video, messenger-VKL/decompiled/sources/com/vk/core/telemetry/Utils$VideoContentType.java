package com.vk.core.telemetry;

import com.ironsource.C4217a2;
import com.ironsource.Gc;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.air;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Utils.kt */
/* loaded from: classes17.dex */
public final class Utils$VideoContentType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Utils$VideoContentType[] $VALUES;
    public static final Utils$VideoContentType ASR_INPUT;
    public static final Utils$VideoContentType AUDFP;
    public static final Utils$VideoContentType AUDIO_MP4;
    public static final Utils$VideoContentType AUDIO_MPEG;
    public static final Utils$VideoContentType AUDIO_OGG;
    public static final Utils$VideoContentType AUTOTAGS_FEATURE;
    public static final a Companion;
    public static final Utils$VideoContentType DASH_ASSEMBLY;
    public static final Utils$VideoContentType DASH_AUDIO;
    public static final Utils$VideoContentType DASH_HEVC_VIDEO;
    public static final Utils$VideoContentType DASH_MANIFEST_ARCHIVE;
    public static final Utils$VideoContentType DASH_MPD;
    public static final Utils$VideoContentType DASH_PRECALC_INFO;
    public static final Utils$VideoContentType DASH_SEGMENT_ARCHIVE;
    public static final Utils$VideoContentType DASH_VIDEO;
    public static final Utils$VideoContentType DASH_WEBM_AUDIO;
    public static final Utils$VideoContentType DASH_WEBM_VIDEO;
    public static final Utils$VideoContentType DUMMY_IMAGE;
    public static final Utils$VideoContentType DUMMY_MEDIA_INFO;
    public static final Utils$VideoContentType HLS_DELTA;
    public static final Utils$VideoContentType HLS_INDEX;
    public static final Utils$VideoContentType HLS_MASTER_PLAYLIST;
    public static final Utils$VideoContentType HLS_PLAYLIST;
    public static final Utils$VideoContentType HLS_SEGMENT_ARCHIVE;
    public static final Utils$VideoContentType HLS_SEGMENT_ARCHIVE_MAIN;
    public static final Utils$VideoContentType KARAOKE_MP3;
    public static final Utils$VideoContentType KARAOKE_SUBTITLES;
    public static final Utils$VideoContentType ONDEMAND_DASH;
    public static final Utils$VideoContentType ONDEMAND_HLS;
    public static final Utils$VideoContentType ORIGINAL_MP4;
    public static final Utils$VideoContentType RTMP;
    public static final Utils$VideoContentType SUBTITLES_SRT;
    public static final Utils$VideoContentType TRAILER_MP4;
    public static final Utils$VideoContentType VIDEO_MP4;
    public static final Utils$VideoContentType VIDEO_MP4_DASH;
    public static final Utils$VideoContentType VIDEO_MP4_DASH_CTX;
    public static final Utils$VideoContentType WEBRTC;

    /* compiled from: Utils.kt */
    public static final class a {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        public static String a(String str) {
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != 1444) {
                    if (hashCode != 1629) {
                        if (hashCode != 1606) {
                            if (hashCode != 1607) {
                                switch (hashCode) {
                                    case 48:
                                        if (str.equals("0")) {
                                            return "VIDEO_MP4";
                                        }
                                        break;
                                    case 49:
                                        if (str.equals("1")) {
                                            return "AUDIO_MP4";
                                        }
                                        break;
                                    case 50:
                                        if (str.equals("2")) {
                                            return "AUDIO_MPEG";
                                        }
                                        break;
                                    case 51:
                                        if (str.equals("3")) {
                                            return "AUDIO_OGG";
                                        }
                                        break;
                                    case 52:
                                        if (str.equals("4")) {
                                            return "VIDEO_MP4_DASH";
                                        }
                                        break;
                                    case 53:
                                        if (str.equals(CampaignEx.CLICKMODE_ON)) {
                                            return "VIDEO_MP4_DASH_CTX";
                                        }
                                        break;
                                    case 54:
                                        if (str.equals("6")) {
                                            return "DASH_MPD";
                                        }
                                        break;
                                    case 55:
                                        if (str.equals(Gc.e)) {
                                            return "DASH_PRECALC_INFO";
                                        }
                                        break;
                                    case 56:
                                        if (str.equals("8")) {
                                            return "HLS_PLAYLIST";
                                        }
                                        break;
                                    case 57:
                                        if (str.equals("9")) {
                                            return "HLS_DELTA";
                                        }
                                        break;
                                    default:
                                        switch (hashCode) {
                                            case 1446:
                                                if (str.equals("-3")) {
                                                    return "DUMMY_MEDIA_INFO";
                                                }
                                                break;
                                            case 1447:
                                                if (str.equals("-4")) {
                                                    return "HLS_MASTER_PLAYLIST";
                                                }
                                                break;
                                            case 1448:
                                                if (str.equals("-5")) {
                                                    return "RTMP";
                                                }
                                                break;
                                            case 1449:
                                                if (str.equals("-6")) {
                                                    return "HLS_SEGMENT_ARCHIVE_MAIN";
                                                }
                                                break;
                                            case 1450:
                                                if (str.equals("-7")) {
                                                    return "WEBRTC";
                                                }
                                                break;
                                            default:
                                                switch (hashCode) {
                                                    case 1567:
                                                        if (str.equals("10")) {
                                                            return "HLS_INDEX";
                                                        }
                                                        break;
                                                    case 1568:
                                                        if (str.equals("11")) {
                                                            return "DASH_VIDEO";
                                                        }
                                                        break;
                                                    case 1569:
                                                        if (str.equals("12")) {
                                                            return "DASH_AUDIO";
                                                        }
                                                        break;
                                                    case 1570:
                                                        if (str.equals("13")) {
                                                            return "SUBTITLES_SRT";
                                                        }
                                                        break;
                                                    case 1571:
                                                        if (str.equals("14")) {
                                                            return "ORIGINAL_MP4";
                                                        }
                                                        break;
                                                    case 1572:
                                                        if (str.equals("15")) {
                                                            return "HLS_SEGMENT_ARCHIVE";
                                                        }
                                                        break;
                                                    case 1573:
                                                        if (str.equals("16")) {
                                                            return "KARAOKE_MP3";
                                                        }
                                                        break;
                                                    case 1574:
                                                        if (str.equals("17")) {
                                                            return "DASH_SEGMENT_ARCHIVE";
                                                        }
                                                        break;
                                                    case 1575:
                                                        if (str.equals("18")) {
                                                            return "DASH_MANIFEST_ARCHIVE";
                                                        }
                                                        break;
                                                    case 1576:
                                                        if (str.equals("19")) {
                                                            return "TRAILER_MP4";
                                                        }
                                                        break;
                                                    default:
                                                        switch (hashCode) {
                                                            case 1598:
                                                                if (str.equals("20")) {
                                                                    return "KARAOKE_SUBTITLES";
                                                                }
                                                                break;
                                                            case 1599:
                                                                if (str.equals("21")) {
                                                                    return "DASH_WEBM_VIDEO";
                                                                }
                                                                break;
                                                            case 1600:
                                                                if (str.equals("22")) {
                                                                    return "DASH_WEBM_AUDIO";
                                                                }
                                                                break;
                                                            case 1601:
                                                                if (str.equals("23")) {
                                                                    return "DASH_ASSEMBLY";
                                                                }
                                                                break;
                                                            case 1602:
                                                                if (str.equals("24")) {
                                                                    return "AUTOTAGS_FEATURE";
                                                                }
                                                                break;
                                                            case 1603:
                                                                if (str.equals("25")) {
                                                                    return "AUDFP";
                                                                }
                                                                break;
                                                            case 1604:
                                                                if (str.equals("26")) {
                                                                    return "DASH_HEVC_VIDEO";
                                                                }
                                                                break;
                                                        }
                                                }
                                        }
                                }
                            } else if (str.equals("29")) {
                                return "ONDEMAND_DASH";
                            }
                        } else if (str.equals("28")) {
                            return "ONDEMAND_HLS";
                        }
                    } else if (str.equals("30")) {
                        return "ASR_INPUT";
                    }
                } else if (str.equals(C4217a2.f)) {
                    return "DUMMY_IMAGE";
                }
            }
            return air.b(')', "UNKNOWN(", str);
        }
    }

    static {
        Utils$VideoContentType utils$VideoContentType = new Utils$VideoContentType("VIDEO_MP4", 0);
        VIDEO_MP4 = utils$VideoContentType;
        Utils$VideoContentType utils$VideoContentType2 = new Utils$VideoContentType("AUDIO_MP4", 1);
        AUDIO_MP4 = utils$VideoContentType2;
        Utils$VideoContentType utils$VideoContentType3 = new Utils$VideoContentType("AUDIO_MPEG", 2);
        AUDIO_MPEG = utils$VideoContentType3;
        Utils$VideoContentType utils$VideoContentType4 = new Utils$VideoContentType("AUDIO_OGG", 3);
        AUDIO_OGG = utils$VideoContentType4;
        Utils$VideoContentType utils$VideoContentType5 = new Utils$VideoContentType("VIDEO_MP4_DASH", 4);
        VIDEO_MP4_DASH = utils$VideoContentType5;
        Utils$VideoContentType utils$VideoContentType6 = new Utils$VideoContentType("VIDEO_MP4_DASH_CTX", 5);
        VIDEO_MP4_DASH_CTX = utils$VideoContentType6;
        Utils$VideoContentType utils$VideoContentType7 = new Utils$VideoContentType("DASH_MPD", 6);
        DASH_MPD = utils$VideoContentType7;
        Utils$VideoContentType utils$VideoContentType8 = new Utils$VideoContentType("DASH_PRECALC_INFO", 7);
        DASH_PRECALC_INFO = utils$VideoContentType8;
        Utils$VideoContentType utils$VideoContentType9 = new Utils$VideoContentType("HLS_PLAYLIST", 8);
        HLS_PLAYLIST = utils$VideoContentType9;
        Utils$VideoContentType utils$VideoContentType10 = new Utils$VideoContentType("HLS_DELTA", 9);
        HLS_DELTA = utils$VideoContentType10;
        Utils$VideoContentType utils$VideoContentType11 = new Utils$VideoContentType("HLS_INDEX", 10);
        HLS_INDEX = utils$VideoContentType11;
        Utils$VideoContentType utils$VideoContentType12 = new Utils$VideoContentType("DASH_VIDEO", 11);
        DASH_VIDEO = utils$VideoContentType12;
        Utils$VideoContentType utils$VideoContentType13 = new Utils$VideoContentType("DASH_AUDIO", 12);
        DASH_AUDIO = utils$VideoContentType13;
        Utils$VideoContentType utils$VideoContentType14 = new Utils$VideoContentType("SUBTITLES_SRT", 13);
        SUBTITLES_SRT = utils$VideoContentType14;
        Utils$VideoContentType utils$VideoContentType15 = new Utils$VideoContentType("ORIGINAL_MP4", 14);
        ORIGINAL_MP4 = utils$VideoContentType15;
        Utils$VideoContentType utils$VideoContentType16 = new Utils$VideoContentType("HLS_SEGMENT_ARCHIVE", 15);
        HLS_SEGMENT_ARCHIVE = utils$VideoContentType16;
        Utils$VideoContentType utils$VideoContentType17 = new Utils$VideoContentType("KARAOKE_MP3", 16);
        KARAOKE_MP3 = utils$VideoContentType17;
        Utils$VideoContentType utils$VideoContentType18 = new Utils$VideoContentType("DASH_SEGMENT_ARCHIVE", 17);
        DASH_SEGMENT_ARCHIVE = utils$VideoContentType18;
        Utils$VideoContentType utils$VideoContentType19 = new Utils$VideoContentType("DASH_MANIFEST_ARCHIVE", 18);
        DASH_MANIFEST_ARCHIVE = utils$VideoContentType19;
        Utils$VideoContentType utils$VideoContentType20 = new Utils$VideoContentType("TRAILER_MP4", 19);
        TRAILER_MP4 = utils$VideoContentType20;
        Utils$VideoContentType utils$VideoContentType21 = new Utils$VideoContentType("KARAOKE_SUBTITLES", 20);
        KARAOKE_SUBTITLES = utils$VideoContentType21;
        Utils$VideoContentType utils$VideoContentType22 = new Utils$VideoContentType("DASH_WEBM_VIDEO", 21);
        DASH_WEBM_VIDEO = utils$VideoContentType22;
        Utils$VideoContentType utils$VideoContentType23 = new Utils$VideoContentType("DASH_WEBM_AUDIO", 22);
        DASH_WEBM_AUDIO = utils$VideoContentType23;
        Utils$VideoContentType utils$VideoContentType24 = new Utils$VideoContentType("DASH_ASSEMBLY", 23);
        DASH_ASSEMBLY = utils$VideoContentType24;
        Utils$VideoContentType utils$VideoContentType25 = new Utils$VideoContentType("AUTOTAGS_FEATURE", 24);
        AUTOTAGS_FEATURE = utils$VideoContentType25;
        Utils$VideoContentType utils$VideoContentType26 = new Utils$VideoContentType("AUDFP", 25);
        AUDFP = utils$VideoContentType26;
        Utils$VideoContentType utils$VideoContentType27 = new Utils$VideoContentType("DASH_HEVC_VIDEO", 26);
        DASH_HEVC_VIDEO = utils$VideoContentType27;
        Utils$VideoContentType utils$VideoContentType28 = new Utils$VideoContentType("ONDEMAND_HLS", 27);
        ONDEMAND_HLS = utils$VideoContentType28;
        Utils$VideoContentType utils$VideoContentType29 = new Utils$VideoContentType("ONDEMAND_DASH", 28);
        ONDEMAND_DASH = utils$VideoContentType29;
        Utils$VideoContentType utils$VideoContentType30 = new Utils$VideoContentType("ASR_INPUT", 29);
        ASR_INPUT = utils$VideoContentType30;
        Utils$VideoContentType utils$VideoContentType31 = new Utils$VideoContentType("DUMMY_IMAGE", 30);
        DUMMY_IMAGE = utils$VideoContentType31;
        Utils$VideoContentType utils$VideoContentType32 = new Utils$VideoContentType("DUMMY_MEDIA_INFO", 31);
        DUMMY_MEDIA_INFO = utils$VideoContentType32;
        Utils$VideoContentType utils$VideoContentType33 = new Utils$VideoContentType("HLS_MASTER_PLAYLIST", 32);
        HLS_MASTER_PLAYLIST = utils$VideoContentType33;
        Utils$VideoContentType utils$VideoContentType34 = new Utils$VideoContentType("RTMP", 33);
        RTMP = utils$VideoContentType34;
        Utils$VideoContentType utils$VideoContentType35 = new Utils$VideoContentType("HLS_SEGMENT_ARCHIVE_MAIN", 34);
        HLS_SEGMENT_ARCHIVE_MAIN = utils$VideoContentType35;
        Utils$VideoContentType utils$VideoContentType36 = new Utils$VideoContentType("WEBRTC", 35);
        WEBRTC = utils$VideoContentType36;
        Utils$VideoContentType[] utils$VideoContentTypeArr = {utils$VideoContentType, utils$VideoContentType2, utils$VideoContentType3, utils$VideoContentType4, utils$VideoContentType5, utils$VideoContentType6, utils$VideoContentType7, utils$VideoContentType8, utils$VideoContentType9, utils$VideoContentType10, utils$VideoContentType11, utils$VideoContentType12, utils$VideoContentType13, utils$VideoContentType14, utils$VideoContentType15, utils$VideoContentType16, utils$VideoContentType17, utils$VideoContentType18, utils$VideoContentType19, utils$VideoContentType20, utils$VideoContentType21, utils$VideoContentType22, utils$VideoContentType23, utils$VideoContentType24, utils$VideoContentType25, utils$VideoContentType26, utils$VideoContentType27, utils$VideoContentType28, utils$VideoContentType29, utils$VideoContentType30, utils$VideoContentType31, utils$VideoContentType32, utils$VideoContentType33, utils$VideoContentType34, utils$VideoContentType35, utils$VideoContentType36};
        $VALUES = utils$VideoContentTypeArr;
        $ENTRIES = new asp(utils$VideoContentTypeArr);
        Companion = new a();
    }

    public Utils$VideoContentType() {
        throw null;
    }

    public static Utils$VideoContentType valueOf(String str) {
        return (Utils$VideoContentType) Enum.valueOf(Utils$VideoContentType.class, str);
    }

    public static Utils$VideoContentType[] values() {
        return (Utils$VideoContentType[]) $VALUES.clone();
    }
}
