package com.vk.dto.common.data;

import android.content.Context;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import xsna.e43;
import xsna.epx;
import xsna.zcl;

/* compiled from: PrivacyRules.kt */
/* loaded from: classes18.dex */
public final class PrivacyRules {
    public static final PredefinedSet a = new PredefinedSet(R.string.privacy_all, R.string.privacy_all, "all");
    public static final PredefinedSet b = new PredefinedSet(R.string.privacy_only_me, R.string.privacy_only_me, "only_me");
    public static final PredefinedSet c = new PredefinedSet(R.string.privacy_nobody, R.string.privacy_nobody, "nobody");
    public static final PredefinedSet d = new PredefinedSet(R.string.privacy_member_of_community, R.string.privacy_member_of_community, "members");
    public static final PredefinedSet e = new PredefinedSet(R.string.privacy_has_link, R.string.privacy_has_link, "by_link");
    public static final PredefinedSet f = new PredefinedSet(R.string.privacy_donut_of_community, R.string.privacy_donut_of_community, "donut");
    public static final PredefinedSet g = new PredefinedSet(R.string.privacy_for_editors, R.string.privacy_for_editors, "editors");
    public static final PredefinedSet h = new PredefinedSet(R.string.privacy_friends, R.string.privacy_friends, "friends");
    public static final PredefinedSet i = new PredefinedSet(R.string.privacy_friends_forbidden, R.string.privacy_friends_forbidden, "-friends,all");
    public static final PredefinedSet j = new PredefinedSet(R.string.privacy_friends_of_friends, R.string.privacy_friends_of_friends, "friends_of_friends");
    public static final PredefinedSet k = new PredefinedSet(R.string.privacy_friends_of_friends_forbidden, R.string.privacy_friends_of_friends_forbidden, "-friends_of_friends,all");
    public static final PredefinedSet l = new PredefinedSet(R.string.privacy_friends_of_friends_only, R.string.privacy_friends_of_friends_only, "friends_of_friends_only");
    public static final PredefinedSet m = new PredefinedSet(R.string.privacy_edit_clip_best_friends, R.string.privacy_edit_clip_best_friends, "list28");
    public static final PredefinedSet n = new PredefinedSet(R.string.privacy_clip_best_friends, R.string.privacy_edit_clip_best_friends, "best_friends");
    public static final PredefinedSet o = new PredefinedSet(R.string.privacy_edit_clip_lists_friends, R.string.privacy_edit_clip_lists_friends, "");

    /* compiled from: PrivacyRules.kt */
    public static abstract class UserListPrivacyRule extends PrivacySetting.PrivacyRule {
        public final HashSet b = new HashSet();

        public abstract List<UserId> Cb();

        public abstract int Db();

        public abstract UserId Eb(int i);
    }

    public static PredefinedSet a() {
        return a;
    }

    public static PredefinedSet b() {
        return n;
    }

    public static PredefinedSet c() {
        return h;
    }

    public static PredefinedSet d() {
        return b;
    }

    /* compiled from: PrivacyRules.kt */
    public static final class Exclude extends UserListPrivacyRule {
        public static final Serializer.c<Exclude> CREATOR = new a();
        public final ArrayList<UserId> c;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Exclude> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Exclude a(Serializer serializer) {
                return new Exclude(serializer, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Exclude[i];
            }
        }

        public Exclude() {
            this.c = new ArrayList<>();
        }

        @Override // com.vk.dto.common.data.PrivacySetting.PrivacyRule
        public final String Ab() {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            return context.getString(R.string.privacy_exclude);
        }

        @Override // com.vk.dto.common.data.PrivacySetting.PrivacyRule
        public final String Bb() {
            return "";
        }

        @Override // com.vk.dto.common.data.PrivacyRules.UserListPrivacyRule
        public final List Cb() {
            return this.c;
        }

        @Override // com.vk.dto.common.data.PrivacyRules.UserListPrivacyRule
        public final int Db() {
            return this.c.size();
        }

        @Override // com.vk.dto.common.data.PrivacyRules.UserListPrivacyRule
        public final UserId Eb(int i) {
            return this.c.get(i);
        }

        public final void Fb(UserId userId) {
            if (userId.b < 2000000000) {
                this.b.add(userId);
            }
            this.c.add(userId);
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            ArrayList<UserId> arrayList = this.c;
            serializer.S(arrayList.size());
            Iterator<UserId> it = arrayList.iterator();
            while (it.hasNext()) {
                serializer.e0(it.next());
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !Exclude.class.equals(obj.getClass())) {
                return false;
            }
            return epx.f(this.c, ((Exclude) obj).c);
        }

        public final int hashCode() {
            return Objects.hash(this.c);
        }

        @Override // com.vk.dto.common.data.PrivacySetting.PrivacyRule
        public final List<String> zb() {
            ArrayList arrayList = new ArrayList();
            Iterator<UserId> it = this.c.iterator();
            while (it.hasNext()) {
                long j = it.next().b;
                if (j < 2000000000) {
                    arrayList.add("-" + j);
                } else {
                    arrayList.add("-list" + (j - 2000000000));
                }
            }
            return arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Exclude(Serializer serializer, zcl zclVar) {
            this();
            int u = serializer.u();
            for (int i = 0; i < u; i++) {
                this.c.add(serializer.A(UserId.class.getClassLoader()));
            }
        }
    }

    /* compiled from: PrivacyRules.kt */
    public static final class Include extends UserListPrivacyRule {
        public static final Serializer.c<Include> CREATOR = new a();
        public final ArrayList<UserId> c;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Include> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Include a(Serializer serializer) {
                return new Include(serializer, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Include[i];
            }
        }

        public Include() {
            this.c = new ArrayList<>();
        }

        @Override // com.vk.dto.common.data.PrivacySetting.PrivacyRule
        public final String Ab() {
            Iterator<UserId> it = this.c.iterator();
            boolean z = true;
            while (it.hasNext()) {
                if (it.next().b < 2000000000) {
                    z = false;
                }
            }
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            return context.getString(z ? R.string.privacy_some_lists : R.string.privacy_some);
        }

        @Override // com.vk.dto.common.data.PrivacySetting.PrivacyRule
        public final String Bb() {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            return context.getString(R.string.privacy_edit_some);
        }

        @Override // com.vk.dto.common.data.PrivacyRules.UserListPrivacyRule
        public final List Cb() {
            return this.c;
        }

        @Override // com.vk.dto.common.data.PrivacyRules.UserListPrivacyRule
        public final int Db() {
            return this.c.size();
        }

        @Override // com.vk.dto.common.data.PrivacyRules.UserListPrivacyRule
        public final UserId Eb(int i) {
            return this.c.get(i);
        }

        public final void Fb(UserId userId) {
            if (userId.b < 2000000000) {
                this.b.add(userId);
            }
            this.c.add(userId);
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            ArrayList<UserId> arrayList = this.c;
            serializer.S(arrayList.size());
            Iterator<UserId> it = arrayList.iterator();
            while (it.hasNext()) {
                serializer.e0(it.next());
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !Include.class.equals(obj.getClass())) {
                return false;
            }
            return epx.f(this.c, ((Include) obj).c);
        }

        public final int hashCode() {
            return Objects.hash(this.c);
        }

        @Override // com.vk.dto.common.data.PrivacySetting.PrivacyRule
        public final List<String> zb() {
            ArrayList arrayList = new ArrayList();
            Iterator<UserId> it = this.c.iterator();
            while (it.hasNext()) {
                UserId next = it.next();
                long j = next.b;
                if (j < 2000000000) {
                    arrayList.add(next + "");
                } else {
                    arrayList.add("list" + (j - 2000000000));
                }
            }
            return arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Include(Serializer serializer, zcl zclVar) {
            this();
            int u = serializer.u();
            for (int i = 0; i < u; i++) {
                this.c.add(serializer.A(UserId.class.getClassLoader()));
            }
        }
    }

    /* compiled from: PrivacyRules.kt */
    public static final class PredefinedSet extends PrivacySetting.PrivacyRule {
        public static final Serializer.c<PredefinedSet> CREATOR = new a();
        public final int b;
        public final int c;
        public final String d;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<PredefinedSet> {
            @Override // com.vk.core.serialize.Serializer.c
            public final PredefinedSet a(Serializer serializer) {
                return new PredefinedSet(serializer, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PredefinedSet[i];
            }
        }

        public PredefinedSet(int i, int i2, String str) {
            this.b = i;
            this.c = i2;
            this.d = str;
        }

        @Override // com.vk.dto.common.data.PrivacySetting.PrivacyRule
        public final String Ab() {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            return context.getString(this.b);
        }

        @Override // com.vk.dto.common.data.PrivacySetting.PrivacyRule
        public final String Bb() {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            return context.getString(this.c);
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.S(this.b);
            serializer.j0(this.d);
            serializer.S(this.c);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof PrivacySetting.PrivacyRule) {
                return new HashSet(Collections.singletonList(this.d)).equals(new HashSet(((PrivacySetting.PrivacyRule) obj).zb()));
            }
            return false;
        }

        @Override // com.vk.dto.common.data.PrivacySetting.PrivacyRule
        public final List<String> zb() {
            return Collections.singletonList(this.d);
        }

        public PredefinedSet(Serializer serializer, zcl zclVar) {
            this(serializer.u(), serializer.u(), serializer.H());
        }
    }
}
