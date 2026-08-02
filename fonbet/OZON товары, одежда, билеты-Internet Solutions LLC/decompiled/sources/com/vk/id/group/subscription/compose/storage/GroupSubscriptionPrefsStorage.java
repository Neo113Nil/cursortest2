package com.vk.id.group.subscription.compose.storage;

import I0.C3173b;
import com.vk.id.storage.InternalVKIDPreferencesStorage;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.M;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/vk/id/group/subscription/compose/storage/GroupSubscriptionPrefsStorage;", "", "prefs", "Lcom/vk/id/storage/InternalVKIDPreferencesStorage;", "<init>", "(Lcom/vk/id/storage/InternalVKIDPreferencesStorage;)V", "saveDisplays", "", "userId", "", "displays", "", "Ljava/util/Date;", "getDisplays", "getKey", "", "Companion", "group-subscription-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class GroupSubscriptionPrefsStorage {

    @NotNull
    private final InternalVKIDPreferencesStorage prefs;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/vk/id/group/subscription/compose/storage/GroupSubscriptionPrefsStorage$Companion;", "", "<init>", "()V", "KEY_DISPLAYS_PREFIX", "", "group-subscription-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public GroupSubscriptionPrefsStorage(@NotNull InternalVKIDPreferencesStorage prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        this.prefs = prefs;
    }

    private final String getKey(long userId) {
        return C3173b.b(userId, "GROUP_SUBSCRIPTION_DISPLAYS_");
    }

    @NotNull
    public final Set<Date> getDisplays(long userId) {
        List m11;
        String string = this.prefs.getString(getKey(userId));
        if (string != null && (m11 = h.m(string, new String[]{","}, 0, 6)) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : m11) {
                if (!h.K((String) obj)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new Date(Long.parseLong((String) it.next())));
            }
            Set<Date> Y02 = C7714v.Y0(arrayList2);
            if (Y02 != null) {
                return Y02;
            }
        }
        return M.f71699a;
    }

    public final void saveDisplays(long userId, @NotNull Set<? extends Date> displays) {
        Intrinsics.checkNotNullParameter(displays, "displays");
        InternalVKIDPreferencesStorage internalVKIDPreferencesStorage = this.prefs;
        String key = getKey(userId);
        Set<? extends Date> set = displays;
        ArrayList arrayList = new ArrayList(C7714v.z(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((Date) it.next()).getTime()));
        }
        internalVKIDPreferencesStorage.set(key, C7714v.V(arrayList, ",", null, null, null, 62));
    }
}
