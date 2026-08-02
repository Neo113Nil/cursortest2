package com.vk.movika.sdk.base.utils;

import com.vk.movika.sdk.player.base.model.PlayerItemVariant;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xsna.brm0;
import xsna.drm0;
import xsna.j5g;

/* loaded from: classes3.dex */
public final class f {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlayerItemVariant.Type.values().length];
            try {
                iArr[PlayerItemVariant.Type.HLS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlayerItemVariant.Type.MP4.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PlayerItemVariant.Type.DASH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PlayerItemVariant.Type.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final PlayerItemVariant a(List<PlayerItemVariant> list, PlayerItemVariant.Type type, List<String> list2, Boolean bool) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        String obj5;
        Iterator<T> it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            PlayerItemVariant playerItemVariant = (PlayerItemVariant) obj2;
            if (playerItemVariant.b == type && (bool == null || !bool.booleanValue() || (playerItemVariant.c == null && playerItemVariant.d == null))) {
                break;
            }
        }
        PlayerItemVariant playerItemVariant2 = (PlayerItemVariant) obj2;
        if (playerItemVariant2 != null) {
            return playerItemVariant2;
        }
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it2.next();
            if (((PlayerItemVariant) obj3).b == type) {
                break;
            }
        }
        PlayerItemVariant playerItemVariant3 = (PlayerItemVariant) obj3;
        if (playerItemVariant3 != null) {
            return playerItemVariant3;
        }
        Iterator<T> it3 = list.iterator();
        loop2: while (true) {
            if (!it3.hasNext()) {
                obj4 = null;
                break;
            }
            obj4 = it3.next();
            PlayerItemVariant playerItemVariant4 = (PlayerItemVariant) obj4;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (String str : list2) {
                    String str2 = playerItemVariant4.a;
                    if (str2 != null && (obj5 = drm0.p0(str2).toString()) != null && brm0.v(obj5, str, true)) {
                        break loop2;
                    }
                }
            }
        }
        PlayerItemVariant playerItemVariant5 = (PlayerItemVariant) obj4;
        if (playerItemVariant5 != null) {
            return playerItemVariant5;
        }
        Iterator<T> it4 = list.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            Object next = it4.next();
            if (((PlayerItemVariant) next).b != PlayerItemVariant.Type.CUSTOM) {
                obj = next;
                break;
            }
        }
        PlayerItemVariant playerItemVariant6 = (PlayerItemVariant) obj;
        return playerItemVariant6 == null ? (PlayerItemVariant) j5g.Y(list) : playerItemVariant6;
    }
}
