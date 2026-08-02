package com.vk.profile.questions.impl;

import com.vk.api.generated.questions.dto.QuestionsQuestionDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import defpackage.q0;
import xsna.epx;
import xsna.hfz;
import xsna.qoy;

/* compiled from: QuestionProfileItem.kt */
/* loaded from: classes5.dex */
public abstract class d implements hfz {

    /* compiled from: QuestionProfileItem.kt */
    public static final class a extends d {
        public final QuestionsQuestionDto b;
        public final UsersUserFullDto c;
        public final boolean d;

        public a(QuestionsQuestionDto questionsQuestionDto, UsersUserFullDto usersUserFullDto, boolean z) {
            this.b = questionsQuestionDto;
            this.c = usersUserFullDto;
            this.d = z;
        }

        @Override // com.vk.profile.questions.impl.d
        public final UsersUserFullDto a() {
            return this.c;
        }

        @Override // com.vk.profile.questions.impl.d
        public final QuestionsQuestionDto b() {
            return this.b;
        }

        @Override // com.vk.profile.questions.impl.d
        public final d c() {
            return new a(this.b, this.c, this.d);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && this.d == aVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DeletedAllAuthorQuestionItem(question=");
            sb.append(this.b);
            sb.append(", profile=");
            sb.append(this.c);
            sb.append(", isAnonymous=");
            return q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: QuestionProfileItem.kt */
    public static final class b extends d {
        public final QuestionsQuestionDto b;
        public final UsersUserFullDto c;
        public final boolean d;

        public b(QuestionsQuestionDto questionsQuestionDto, UsersUserFullDto usersUserFullDto, boolean z) {
            this.b = questionsQuestionDto;
            this.c = usersUserFullDto;
            this.d = z;
        }

        @Override // com.vk.profile.questions.impl.d
        public final UsersUserFullDto a() {
            return this.c;
        }

        @Override // com.vk.profile.questions.impl.d
        public final QuestionsQuestionDto b() {
            return this.b;
        }

        @Override // com.vk.profile.questions.impl.d
        public final d c() {
            return new b(this.b, this.c, this.d);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && this.d == bVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DeletedQuestionItem(question=");
            sb.append(this.b);
            sb.append(", profile=");
            sb.append(this.c);
            sb.append(", all=");
            return q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: QuestionProfileItem.kt */
    public static final class c extends d {
        public final QuestionsQuestionDto b;
        public final UsersUserFullDto c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        public final boolean h;

        public c(QuestionsQuestionDto questionsQuestionDto, UsersUserFullDto usersUserFullDto, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            this.b = questionsQuestionDto;
            this.c = usersUserFullDto;
            this.d = z;
            this.e = z2;
            this.f = z3;
            this.g = z4;
            this.h = z5;
        }

        @Override // com.vk.profile.questions.impl.d
        public final UsersUserFullDto a() {
            return this.c;
        }

        @Override // com.vk.profile.questions.impl.d
        public final QuestionsQuestionDto b() {
            return this.b;
        }

        @Override // com.vk.profile.questions.impl.d
        public final d c() {
            return new c(this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && this.d == cVar.d && this.e == cVar.e && this.f == cVar.f && this.g == cVar.g && this.h == cVar.h;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.h) + qoy.b(qoy.b(qoy.b(qoy.b((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("QuestionActiveItem(question=");
            sb.append(this.b);
            sb.append(", profile=");
            sb.append(this.c);
            sb.append(", isAuthorBlocked=");
            sb.append(this.d);
            sb.append(", isFromAnonymous=");
            sb.append(this.e);
            sb.append(", isAnsweredToMsg=");
            sb.append(this.f);
            sb.append(", isAnsweredToStory=");
            sb.append(this.g);
            sb.append(", canWritePrivateMessage=");
            return q0.a(sb, this.h, ')');
        }
    }

    public abstract UsersUserFullDto a();

    public abstract QuestionsQuestionDto b();

    public abstract d c();

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(b().getId());
    }
}
