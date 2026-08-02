package com.vk.voip.ui.groupcalls.list.primary.tab;

import java.util.List;

/* compiled from: PrimaryParticipantTabs.kt */
/* loaded from: classes7.dex */
public interface a {

    /* compiled from: PrimaryParticipantTabs.kt */
    /* renamed from: com.vk.voip.ui.groupcalls.list.primary.tab.a$a, reason: collision with other inner class name */
    public static final class C2055a {
        public final int a;
        public final int b;

        public C2055a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    /* compiled from: PrimaryParticipantTabs.kt */
    public interface b {
    }

    void a(float f, int i);

    void setItems(List<C2055a> list);

    void setListener(b bVar);

    void setSelectedPageIndex(int i);

    void setTabsVisible(boolean z);
}
