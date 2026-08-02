package com.vk.libvideo.repositories;

import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.internal.operators.observable.l1;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.asp;
import xsna.epx;
import xsna.fns0;
import xsna.tn;
import xsna.zrp;

/* compiled from: VideoApiHelperRepository.kt */
/* loaded from: classes.dex */
public interface VideoApiHelperRepository {

    /* compiled from: VideoApiHelperRepository.kt */
    /* loaded from: classes3.dex */
    public static final class SearchVideosParams {
        public final String a;
        public final Integer b;
        public final Integer c;
        public final Boolean d;
        public final Length e;
        public final Boolean f;
        public final Sort g;
        public final Boolean h;
        public final Boolean i;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: VideoApiHelperRepository.kt */
        public static final class Length {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Length[] $VALUES;
            public static final Length LONG;
            public static final Length SHORT;

            static {
                Length length = new Length("SHORT", 0);
                SHORT = length;
                Length length2 = new Length("LONG", 1);
                LONG = length2;
                Length[] lengthArr = {length, length2};
                $VALUES = lengthArr;
                $ENTRIES = new asp(lengthArr);
            }

            public Length() {
                throw null;
            }

            public static Length valueOf(String str) {
                return (Length) Enum.valueOf(Length.class, str);
            }

            public static Length[] values() {
                return (Length[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: VideoApiHelperRepository.kt */
        public static final class Sort {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Sort[] $VALUES;
            public static final Sort DATE_ADDED;
            public static final Sort DURATION;
            public static final Sort RELEVANCE;

            static {
                Sort sort = new Sort("RELEVANCE", 0);
                RELEVANCE = sort;
                Sort sort2 = new Sort("DATE_ADDED", 1);
                DATE_ADDED = sort2;
                Sort sort3 = new Sort("DURATION", 2);
                DURATION = sort3;
                Sort[] sortArr = {sort, sort2, sort3};
                $VALUES = sortArr;
                $ENTRIES = new asp(sortArr);
            }

            public Sort() {
                throw null;
            }

            public static Sort valueOf(String str) {
                return (Sort) Enum.valueOf(Sort.class, str);
            }

            public static Sort[] values() {
                return (Sort[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SearchVideosParams() {
            this(ApiInvocationException.ErrorCodes.IDS_BLOCKED, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
        }

        public final Integer a() {
            return this.c;
        }

        public final Boolean b() {
            return this.d;
        }

        public final Length c() {
            return this.e;
        }

        public final Integer d() {
            return this.b;
        }

        public final String e() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SearchVideosParams)) {
                return false;
            }
            SearchVideosParams searchVideosParams = (SearchVideosParams) obj;
            return epx.f(this.a, searchVideosParams.a) && epx.f(this.b, searchVideosParams.b) && epx.f(this.c, searchVideosParams.c) && epx.f(this.d, searchVideosParams.d) && this.e == searchVideosParams.e && epx.f(this.f, searchVideosParams.f) && this.g == searchVideosParams.g && epx.f(this.h, searchVideosParams.h) && epx.f(this.i, searchVideosParams.i);
        }

        public final Boolean f() {
            return this.f;
        }

        public final Boolean g() {
            return this.h;
        }

        public final Sort h() {
            return this.g;
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.b;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.c;
            int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Boolean bool = this.d;
            int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            Length length = this.e;
            int hashCode5 = (hashCode4 + (length == null ? 0 : length.hashCode())) * 31;
            Boolean bool2 = this.f;
            int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Sort sort = this.g;
            int hashCode7 = (hashCode6 + (sort == null ? 0 : sort.hashCode())) * 31;
            Boolean bool3 = this.h;
            int hashCode8 = (hashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Boolean bool4 = this.i;
            return hashCode8 + (bool4 != null ? bool4.hashCode() : 0);
        }

        public final Boolean i() {
            return this.i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SearchVideosParams(query=");
            sb.append(this.a);
            sb.append(", offset=");
            sb.append(this.b);
            sb.append(", count=");
            sb.append(this.c);
            sb.append(", hd=");
            sb.append(this.d);
            sb.append(", length=");
            sb.append(this.e);
            sb.append(", safe=");
            sb.append(this.f);
            sb.append(", sort=");
            sb.append(this.g);
            sb.append(", searchOwn=");
            sb.append(this.h);
            sb.append(", isExtended=");
            return tn.a(sb, this.i, ')');
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ SearchVideosParams(int i, Integer num, Integer num2, String str) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, null, null, null, null, (i & 128) != 0 ? null : r0, (i & 256) != 0 ? null : r0);
            Boolean bool = Boolean.TRUE;
        }

        public SearchVideosParams(String str, Integer num, Integer num2, Boolean bool, Length length, Boolean bool2, Sort sort, Boolean bool3, Boolean bool4) {
            this.a = str;
            this.b = num;
            this.c = num2;
            this.d = bool;
            this.e = length;
            this.f = bool2;
            this.g = sort;
            this.h = bool3;
            this.i = bool4;
        }
    }

    /* compiled from: VideoApiHelperRepository.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final VideoApiHelperRepository STUB = new C1245a();

        /* compiled from: VideoApiHelperRepository.kt */
        /* renamed from: com.vk.libvideo.repositories.VideoApiHelperRepository$a$a, reason: collision with other inner class name */
        public static final class C1245a implements VideoApiHelperRepository {
            @Override // com.vk.libvideo.repositories.VideoApiHelperRepository
            public final q a(int i, UserId userId, UserId userId2) {
                return l1.b;
            }

            @Override // com.vk.libvideo.repositories.VideoApiHelperRepository
            public final q b(int i, UserId userId, String str) {
                return l1.b;
            }

            @Override // com.vk.libvideo.repositories.VideoApiHelperRepository
            public final q<fns0> c(UserId userId, int i, UserId userId2, int i2, int i3) {
                return l1.b;
            }

            @Override // com.vk.libvideo.repositories.VideoApiHelperRepository
            public final q<VKList<VideoFile>> d(SearchVideosParams searchVideosParams) {
                return l1.b;
            }

            @Override // com.vk.libvideo.repositories.VideoApiHelperRepository
            public final x<List<VideoFile>> e(UserId userId, String str) {
                return x.k(EmptyList.b);
            }

            @Override // com.vk.libvideo.repositories.VideoApiHelperRepository
            public final q f(int i, UserId userId) {
                return l1.b;
            }

            @Override // com.vk.libvideo.repositories.VideoApiHelperRepository
            public final q<VKList<VideoFile>> g(UserId userId, Integer num, Integer num2, Integer num3) {
                return l1.b;
            }
        }

        public final VideoApiHelperRepository getSTUB() {
            return STUB;
        }
    }

    q a(int i, UserId userId, UserId userId2);

    q b(int i, UserId userId, String str);

    q<fns0> c(UserId userId, int i, UserId userId2, int i2, int i3);

    q<VKList<VideoFile>> d(SearchVideosParams searchVideosParams);

    x<List<VideoFile>> e(UserId userId, String str);

    q f(int i, UserId userId);

    q<VKList<VideoFile>> g(UserId userId, Integer num, Integer num2, Integer num3);
}
