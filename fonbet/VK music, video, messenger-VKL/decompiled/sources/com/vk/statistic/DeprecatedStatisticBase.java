package com.vk.statistic;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.ImageSizeKey;
import com.vk.statistic.DeprecatedStatisticBase;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import xsna.asu0;
import xsna.qyk0;
import xsna.r0m;
import xsna.rzl;
import xsna.t0m;
import xsna.v0m;

/* loaded from: classes5.dex */
public abstract class DeprecatedStatisticBase extends Serializer.StreamParcelableAdapter {
    public final String b;
    public final String c;

    @Nullable
    public final UUID d;
    public volatile boolean e = false;

    public DeprecatedStatisticBase(String str, String str2, @Nullable UUID uuid) {
        this.b = str;
        this.c = str2;
        this.d = uuid;
    }

    public final void Ab(rzl rzlVar) {
        if (r0m.b == null || zb()) {
            asu0.a.getClass();
            asu0.q().submit(new t0m((DeprecatedStatisticUrl) this, rzlVar));
        }
    }

    public final void Bb(@NonNull final v0m v0mVar, final int i) {
        asu0.a.getClass();
        asu0.v().submit(new Runnable() { // from class: xsna.s0m
            @Override // java.lang.Runnable
            public final void run() {
                DeprecatedStatisticBase deprecatedStatisticBase = DeprecatedStatisticBase.this;
                v0m v0mVar2 = v0mVar;
                int i2 = i;
                if (r0m.b == null) {
                    r0m.a();
                }
                if (deprecatedStatisticBase.zb() && v0mVar2.a(deprecatedStatisticBase, i2)) {
                    deprecatedStatisticBase.Cb();
                }
            }
        });
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void Cb() {
        char c;
        String valueOf = String.valueOf(this.b);
        switch (valueOf.hashCode()) {
            case -2128282332:
                if (valueOf.equals("volume_on")) {
                    c = '+';
                    break;
                }
                c = 65535;
                break;
            case -2063700045:
                if (valueOf.equals("playback_resumed")) {
                    c = ImageSizeKey.SIZE_KEY_BASE;
                    break;
                }
                c = 65535;
                break;
            case -1788078848:
                if (valueOf.equals("share_post")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case -1619793808:
                if (valueOf.equals("clip_comment")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case -1603250394:
                if (valueOf.equals("clip_like")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case -1552242998:
                if (valueOf.equals("volume_off")) {
                    c = ',';
                    break;
                }
                c = 65535;
                break;
            case -1363845533:
                if (valueOf.equals("clip_author_click")) {
                    c = '\"';
                    break;
                }
                c = 65535;
                break;
            case -934592106:
                if (valueOf.equals("render")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -895436774:
                if (valueOf.equals("click_post_link_internal")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case -816631158:
                if (valueOf.equals("viewin")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -763465123:
                if (valueOf.equals("playback_started")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -654739665:
                if (valueOf.equals("video_fullscreen_off")) {
                    c = '(';
                    break;
                }
                c = 65535;
                break;
            case -481426855:
                if (valueOf.equals("playhead_reached_value")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -361173691:
                if (valueOf.equals("clip_bookmark")) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case -266598612:
                if (valueOf.equals("playhead_viewability_value")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -244104853:
                if (valueOf.equals("click_post_owner")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case -163723192:
                if (valueOf.equals("like_post")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -101549123:
                if (valueOf.equals("click_deeplink")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case -85004704:
                if (valueOf.equals("video_volume_on")) {
                    c = '%';
                    break;
                }
                c = 65535;
                break;
            case -37765007:
                if (valueOf.equals("video_resume")) {
                    c = '$';
                    break;
                }
                c = 65535;
                break;
            case -26542245:
                if (valueOf.equals("viewability_measurable")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 3202370:
                if (valueOf.equals("hide")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 3327206:
                if (valueOf.equals("load")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 94750088:
                if (valueOf.equals("click")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 96784904:
                if (valueOf.equals("error")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 120623625:
                if (valueOf.equals("impression")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 166172443:
                if (valueOf.equals("clip_subscribe")) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case 282375594:
                if (valueOf.equals("video_play_100")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 282375661:
                if (valueOf.equals("video_play_10s")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 488772320:
                if (valueOf.equals("closed_by_user")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 671616031:
                if (valueOf.equals("video_fullscreen_on")) {
                    c = '\'';
                    break;
                }
                c = 65535;
                break;
            case 712193090:
                if (valueOf.equals("ads/impression_pretty_card")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 769985503:
                if (valueOf.equals("audio_click")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 823306818:
                if (valueOf.equals("click_post_link")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 1382290738:
                if (valueOf.equals("video_pause")) {
                    c = '#';
                    break;
                }
                c = 65535;
                break;
            case 1385608094:
                if (valueOf.equals("video_start")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1396554706:
                if (valueOf.equals("playback_paused")) {
                    c = ')';
                    break;
                }
                c = 65535;
                break;
            case 1475289383:
                if (valueOf.equals("playback_completed")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 1533129578:
                if (valueOf.equals("video_play_25")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1533129666:
                if (valueOf.equals("video_play_50")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1533129671:
                if (valueOf.equals("video_play_3s")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1533129733:
                if (valueOf.equals("video_play_75")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1533129795:
                if (valueOf.equals("video_play_95")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1659821326:
                if (valueOf.equals("video_volume_off")) {
                    c = '&';
                    break;
                }
                c = 65535;
                break;
            case 1845271088:
                if (valueOf.equals("clip_share")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 11:
            case '\f':
            case '\r':
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                this.e = true;
                String str = this.c;
                ReentrantReadWriteLock reentrantReadWriteLock = r0m.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    if (qyk0.a().f(str) && r0m.b != null) {
                        r0m.b.add(str);
                    }
                    reentrantReadWriteLock.writeLock().unlock();
                    UUID uuid = this.d;
                    if (uuid != null) {
                        r0m.c.add(uuid);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    r0m.a.writeLock().unlock();
                    throw th;
                }
            default:
                return;
        }
    }

    public final boolean zb() {
        if (this.e) {
            return false;
        }
        String str = this.c;
        r0m.a();
        ReentrantReadWriteLock reentrantReadWriteLock = r0m.a;
        reentrantReadWriteLock.readLock().lock();
        try {
            boolean contains = r0m.b.contains(str);
            reentrantReadWriteLock.readLock().unlock();
            this.e = contains;
            if (contains) {
                return false;
            }
            UUID uuid = this.d;
            if (uuid == null) {
                return true;
            }
            boolean contains2 = r0m.c.contains(uuid);
            this.e = contains2;
            return !contains2;
        } catch (Throwable th) {
            r0m.a.readLock().unlock();
            throw th;
        }
    }
}
