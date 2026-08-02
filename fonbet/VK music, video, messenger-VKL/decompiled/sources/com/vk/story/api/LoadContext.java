package com.vk.story.api;

import com.vk.core.serialize.Serializer;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Regex;
import xsna.drm0;
import xsna.zcl;

/* compiled from: LoadContext.kt */
/* loaded from: classes6.dex */
public abstract class LoadContext extends Serializer.StreamParcelableAdapter {

    /* compiled from: LoadContext.kt */
    public static final class All extends LoadContext {
        public static final All b = new All(null);
        public static final Serializer.c<All> CREATOR = new a();

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<All> {
            @Override // com.vk.core.serialize.Serializer.c
            public final All a(Serializer serializer) {
                return All.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new All[i];
            }
        }
    }

    /* compiled from: LoadContext.kt */
    public static final class AllBySingleStory extends LoadContext {
        public static final AllBySingleStory b = new AllBySingleStory(null);
        public static final Serializer.c<AllBySingleStory> CREATOR = new a();

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<AllBySingleStory> {
            @Override // com.vk.core.serialize.Serializer.c
            public final AllBySingleStory a(Serializer serializer) {
                return AllBySingleStory.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AllBySingleStory[i];
            }
        }
    }

    /* compiled from: LoadContext.kt */
    public static final class New extends LoadContext {
        public static final New b = new New(null);
        public static final Serializer.c<New> CREATOR = new a();

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<New> {
            @Override // com.vk.core.serialize.Serializer.c
            public final New a(Serializer serializer) {
                return New.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new New[i];
            }
        }
    }

    /* compiled from: LoadContext.kt */
    public static final class Owner extends LoadContext {
        public static final Owner b = new Owner(null);
        public static final Serializer.c<Owner> CREATOR = new a();

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Owner> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Owner a(Serializer serializer) {
                return Owner.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Owner[i];
            }
        }
    }

    /* compiled from: LoadContext.kt */
    public static final class Story extends LoadContext {
        public static final Story b = new Story(null);
        public static final Serializer.c<Story> CREATOR = new a();

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Story> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Story a(Serializer serializer) {
                return Story.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Story[i];
            }
        }
    }

    /* compiled from: LoadContext.kt */
    public static final class StoryList extends LoadContext {
        public static final Serializer.c<StoryList> CREATOR = new a();
        public final String b;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<StoryList> {
            @Override // com.vk.core.serialize.Serializer.c
            public final StoryList a(Serializer serializer) {
                return new StoryList(serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StoryList[i];
            }
        }

        public StoryList(String str) {
            super(null);
            this.b = str;
        }

        @Override // com.vk.story.api.LoadContext, com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
        }
    }

    /* compiled from: LoadContext.kt */
    public static final class a {
        public static LoadContext a(String str) {
            if (str != null) {
                List c0 = drm0.c0(str, new String[]{StringUtils.COMMA}, 0, 6);
                if (!c0.isEmpty()) {
                    Regex regex = new Regex("[-0-9]+_[0-9]+");
                    List list = c0;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (!regex.f((String) it.next())) {
                            }
                        }
                    }
                    return new StoryList(str);
                }
            }
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != 96673) {
                    if (hashCode != 108960) {
                        if (hashCode == 106164915 && str.equals("owner")) {
                            return Owner.b;
                        }
                    } else if (str.equals("new")) {
                        return New.b;
                    }
                } else if (str.equals("all")) {
                    return All.b;
                }
            }
            return Story.b;
        }
    }

    public /* synthetic */ LoadContext(zcl zclVar) {
        this();
    }

    public LoadContext() {
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public void O7(Serializer serializer) {
    }
}
