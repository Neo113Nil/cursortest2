package com.vk.dto.stories.model;

import com.vk.api.generated.stories.dto.StoriesDecorationConfigDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.entities.StoryUserProfile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import xsna.fkq0;
import xsna.fsk;
import xsna.j5g;
import xsna.zcl;

/* compiled from: StoriesContainer.kt */
/* loaded from: classes18.dex */
public abstract class StoriesContainer extends Serializer.StreamParcelableAdapter {
    public StoryOwner b;
    public StoriesDecorationConfigDto c;
    public boolean d;
    public boolean e;
    public final String f;
    public CopyOnWriteArrayList<StoryEntry> g;
    public final HashMap<Integer, VKList<StoryUserProfile>> h;
    public final HashMap<Integer, Integer> i;
    public boolean j;
    public Integer k;
    public boolean l;
    public StoryEntryExtended m;
    public int n;

    public /* synthetic */ StoriesContainer(StoryOwner storyOwner, List list, String str, boolean z, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : storyOwner, list, (i & 4) != 0 ? null : str, (i & 8) != 0 ? false : z);
    }

    public UserId Ab() {
        UserId Fb;
        StoryOwner storyOwner = this.b;
        if (storyOwner != null && (Fb = storyOwner.Fb()) != null) {
            if (!fkq0.c(Fb)) {
                Fb = null;
            }
            if (Fb != null) {
                return Fb;
            }
        }
        StoryEntry Bb = Bb();
        UserId userId = Bb != null ? Bb.d : null;
        return userId == null ? UserId.d : userId;
    }

    public final StoryEntry Bb() {
        return (StoryEntry) j5g.b0(0, this.g);
    }

    public boolean Cb() {
        CopyOnWriteArrayList<StoryEntry> copyOnWriteArrayList = this.g;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator<T> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (!((StoryEntry) it.next()).h) {
                return true;
            }
        }
        return false;
    }

    public final boolean Db() {
        CopyOnWriteArrayList<StoryEntry> copyOnWriteArrayList = this.g;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        for (StoryEntry storyEntry : copyOnWriteArrayList) {
            if (storyEntry.w0 && !storyEntry.h) {
                return true;
            }
        }
        return false;
    }

    public boolean Eb() {
        return !this.g.isEmpty();
    }

    public final StoryEntry Fb() {
        StoryEntry storyEntry;
        CopyOnWriteArrayList<StoryEntry> copyOnWriteArrayList = this.g;
        ListIterator<StoryEntry> listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                storyEntry = null;
                break;
            }
            storyEntry = listIterator.previous();
            if (storyEntry.b) {
                break;
            }
        }
        return storyEntry;
    }

    public final ArrayList Gb() {
        CopyOnWriteArrayList<StoryEntry> copyOnWriteArrayList = this.g;
        ArrayList arrayList = new ArrayList();
        Iterator<StoryEntry> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            StoryEntry next = it.next();
            if (next.b) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public String Hb(int i) {
        String Ab;
        StoryOwner storyOwner = this.b;
        if (storyOwner != null && (Ab = storyOwner.Ab(i)) != null) {
            return Ab;
        }
        StoryOwner storyOwner2 = this.b;
        if (storyOwner2 != null) {
            return storyOwner2.Bb();
        }
        return null;
    }

    public String Ib() {
        return zb();
    }

    public final String Jb() {
        return this.f;
    }

    public int Kb() {
        Iterator<StoryEntry> it = this.g.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (!it.next().h) {
                break;
            }
            i++;
        }
        Integer valueOf = Integer.valueOf(i);
        if (valueOf.intValue() < 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    public final StoryEntry Lb() {
        return (StoryEntry) j5g.b0(Kb(), this.g);
    }

    public final CopyOnWriteArrayList<StoryEntry> Mb() {
        return this.g;
    }

    public final StoryOwner Nb() {
        return this.b;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.o0(this.g);
        serializer.j0(this.f);
        serializer.L(this.e ? (byte) 1 : (byte) 0);
        serializer.i0(this.m);
        serializer.e0(this.c);
    }

    public String Ob() {
        return fsk.N(Ab());
    }

    public final boolean Pb() {
        StoryOwner storyOwner = this.b;
        return storyOwner != null && storyOwner.Jb();
    }

    public final boolean Qb() {
        StoryOwner storyOwner = this.b;
        return storyOwner != null && storyOwner.Kb();
    }

    public final boolean Rb() {
        return Qb() || Pb();
    }

    public final void Sb(CopyOnWriteArrayList<StoryEntry> copyOnWriteArrayList) {
        this.g = copyOnWriteArrayList;
    }

    public final String zb() {
        StoryOwner storyOwner = this.b;
        if (storyOwner != null) {
            return storyOwner.Cb();
        }
        return null;
    }

    public StoriesContainer(StoryOwner storyOwner, List<? extends StoryEntry> list, String str, boolean z) {
        this.g = new CopyOnWriteArrayList<>();
        this.h = new HashMap<>();
        this.i = new HashMap<>();
        this.b = storyOwner;
        this.g = new CopyOnWriteArrayList<>(list);
        this.f = str;
        this.e = z;
    }

    public StoriesContainer(Serializer serializer) {
        this((StoryOwner) serializer.G(StoryOwner.class.getClassLoader()), serializer.j(StoryEntry.CREATOR), serializer.H(), serializer.m());
        this.m = (StoryEntryExtended) serializer.G(StoryEntryExtended.class.getClassLoader());
        this.c = (StoriesDecorationConfigDto) serializer.A(StoriesDecorationConfigDto.class.getClassLoader());
    }
}
