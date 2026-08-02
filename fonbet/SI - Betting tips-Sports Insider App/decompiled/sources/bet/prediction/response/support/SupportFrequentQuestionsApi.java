package bet.prediction.response.support;

import b4.d;
import b4.e;
import com.sports.insider.data.repository.room.support.dp.impl.FrequentQuestionsTable;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.sentry.config.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oi.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v3.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00010\u0003:\u0001&B!\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u0011\u001a\u00020\u00002\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0010R\u001c\u0010#\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u000eR\u0014\u0010%\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0018¨\u0006'"}, d2 = {"Lbet/prediction/response/support/SupportFrequentQuestionsApi;", "Lb4/e;", "Lio/sentry/config/a;", "", "", "Lbet/prediction/response/support/SupportFrequentQuestionsApi$SupportFrequentQuestion;", "listData", "Lv3/b;", "httpException", "<init>", "(Ljava/util/List;Lv3/b;)V", "map", "()Lb4/e;", "component1", "()Ljava/util/List;", "component2", "()Lv3/b;", "copy", "(Ljava/util/List;Lv3/b;)Lbet/prediction/response/support/SupportFrequentQuestionsApi;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getListData", "Lv3/b;", "getHttpException", "Lb4/d;", "getFrequentQuestions", "frequentQuestions", "getStatusCode", "statusCode", "SupportFrequentQuestion", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSupportFrequentQuestionsApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportFrequentQuestionsApi.kt\nbet/prediction/response/support/SupportFrequentQuestionsApi\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n1617#2,9:52\n1869#2:61\n1870#2:63\n1626#2:64\n1#3:62\n*S KotlinDebug\n*F\n+ 1 SupportFrequentQuestionsApi.kt\nbet/prediction/response/support/SupportFrequentQuestionsApi\n*L\n17#1:52,9\n17#1:61\n17#1:63\n17#1:64\n17#1:62\n*E\n"})
/* loaded from: classes.dex */
public final /* data */ class SupportFrequentQuestionsApi extends a implements e {

    @Nullable
    private final b httpException;

    @o9.b("data")
    @Nullable
    private final List<SupportFrequentQuestion> listData;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, d2 = {"Lbet/prediction/response/support/SupportFrequentQuestionsApi$SupportFrequentQuestion;", "", "id", "", FrequentQuestionsTable.columnQuestion, "", FrequentQuestionsTable.columnAnswer, CommonUrlParts.LOCALE, "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getQuestion", "()Ljava/lang/String;", "getAnswer", "getLocale", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SupportFrequentQuestion {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @o9.b(FrequentQuestionsTable.columnAnswer)
        @Nullable
        private final String answer;

        @o9.b("id")
        private final int id;

        @o9.b(CommonUrlParts.LOCALE)
        @Nullable
        private final String locale;

        @o9.b(FrequentQuestionsTable.columnQuestion)
        @Nullable
        private final String question;

        /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbet/prediction/response/support/SupportFrequentQuestionsApi$SupportFrequentQuestion$Companion;", "", "<init>", "()V", "Lbet/prediction/response/support/SupportFrequentQuestionsApi$SupportFrequentQuestion;", "Lb4/d;", "mapper", "(Lbet/prediction/response/support/SupportFrequentQuestionsApi$SupportFrequentQuestion;)Lb4/d;", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Nullable
            public final d mapper(@Nullable final SupportFrequentQuestion supportFrequentQuestion) {
                if (supportFrequentQuestion == null) {
                    return null;
                }
                return new d(supportFrequentQuestion) { // from class: bet.prediction.response.support.SupportFrequentQuestionsApi$SupportFrequentQuestion$Companion$mapper$1
                    private final String answer;
                    private final int id;
                    private final String question;

                    {
                        this.id = supportFrequentQuestion.getId();
                        String question = supportFrequentQuestion.getQuestion();
                        this.question = question == null ? "" : question;
                        String answer = supportFrequentQuestion.getAnswer();
                        this.answer = answer != null ? answer : "";
                    }

                    @Override // b4.d
                    public String getAnswer() {
                        return this.answer;
                    }

                    @Override // b4.d
                    public int getId() {
                        return this.id;
                    }

                    @Override // b4.d
                    public String getQuestion() {
                        return this.question;
                    }
                };
            }

            private Companion() {
            }
        }

        public SupportFrequentQuestion(int i5, @Nullable String str, @Nullable String str2, @Nullable String str3) {
            this.id = i5;
            this.question = str;
            this.answer = str2;
            this.locale = str3;
        }

        public static /* synthetic */ SupportFrequentQuestion copy$default(SupportFrequentQuestion supportFrequentQuestion, int i5, String str, String str2, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                i5 = supportFrequentQuestion.id;
            }
            if ((i10 & 2) != 0) {
                str = supportFrequentQuestion.question;
            }
            if ((i10 & 4) != 0) {
                str2 = supportFrequentQuestion.answer;
            }
            if ((i10 & 8) != 0) {
                str3 = supportFrequentQuestion.locale;
            }
            return supportFrequentQuestion.copy(i5, str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getQuestion() {
            return this.question;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final String getAnswer() {
            return this.answer;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final String getLocale() {
            return this.locale;
        }

        @NotNull
        public final SupportFrequentQuestion copy(int id2, @Nullable String question, @Nullable String answer, @Nullable String locale) {
            return new SupportFrequentQuestion(id2, question, answer, locale);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SupportFrequentQuestion)) {
                return false;
            }
            SupportFrequentQuestion supportFrequentQuestion = (SupportFrequentQuestion) other;
            return this.id == supportFrequentQuestion.id && Intrinsics.areEqual(this.question, supportFrequentQuestion.question) && Intrinsics.areEqual(this.answer, supportFrequentQuestion.answer) && Intrinsics.areEqual(this.locale, supportFrequentQuestion.locale);
        }

        @Nullable
        public final String getAnswer() {
            return this.answer;
        }

        public final int getId() {
            return this.id;
        }

        @Nullable
        public final String getLocale() {
            return this.locale;
        }

        @Nullable
        public final String getQuestion() {
            return this.question;
        }

        public int hashCode() {
            int i5 = this.id * 31;
            String str = this.question;
            int hashCode = (i5 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.answer;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.locale;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("SupportFrequentQuestion(id=");
            sb2.append(this.id);
            sb2.append(", question=");
            sb2.append(this.question);
            sb2.append(", answer=");
            sb2.append(this.answer);
            sb2.append(", locale=");
            return d9.e.k(sb2, this.locale, ')');
        }
    }

    public SupportFrequentQuestionsApi(@Nullable List<SupportFrequentQuestion> list, @Nullable b bVar) {
        this.listData = list;
        this.httpException = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SupportFrequentQuestionsApi copy$default(SupportFrequentQuestionsApi supportFrequentQuestionsApi, List list, b bVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            list = supportFrequentQuestionsApi.listData;
        }
        if ((i5 & 2) != 0) {
            bVar = supportFrequentQuestionsApi.httpException;
        }
        return supportFrequentQuestionsApi.copy(list, bVar);
    }

    @Nullable
    public final List<SupportFrequentQuestion> component1() {
        return this.listData;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final b getHttpException() {
        return this.httpException;
    }

    @NotNull
    public final SupportFrequentQuestionsApi copy(@Nullable List<SupportFrequentQuestion> listData, @Nullable b httpException) {
        return new SupportFrequentQuestionsApi(listData, httpException);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportFrequentQuestionsApi)) {
            return false;
        }
        SupportFrequentQuestionsApi supportFrequentQuestionsApi = (SupportFrequentQuestionsApi) other;
        return Intrinsics.areEqual(this.listData, supportFrequentQuestionsApi.listData) && Intrinsics.areEqual(this.httpException, supportFrequentQuestionsApi.httpException);
    }

    @Override // b4.e
    @Nullable
    public List<d> getFrequentQuestions() {
        d dVar;
        List<SupportFrequentQuestion> list = this.listData;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            try {
                dVar = SupportFrequentQuestion.INSTANCE.mapper((SupportFrequentQuestion) it.next());
            } catch (Exception unused) {
                dVar = null;
            }
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        return arrayList;
    }

    @Override // v3.e
    @Nullable
    public b getHttpException() {
        return this.httpException;
    }

    @Nullable
    public final List<SupportFrequentQuestion> getListData() {
        return this.listData;
    }

    @Override // v3.e
    public int getStatusCode() {
        s0 response;
        b httpException = getHttpException();
        if (httpException == null || (response = httpException.getResponse()) == null) {
            return 200;
        }
        return response.f21334a.f10276d;
    }

    public int hashCode() {
        List<SupportFrequentQuestion> list = this.listData;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        b bVar = this.httpException;
        return hashCode + (bVar != null ? bVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SupportFrequentQuestionsApi(listData=" + this.listData + ", httpException=" + this.httpException + ')';
    }

    @NotNull
    /* renamed from: map, reason: merged with bridge method [inline-methods] */
    public e m88map() {
        return new e(this) { // from class: bet.prediction.response.support.SupportFrequentQuestionsApi$map$1
            private final List<d> frequentQuestions;
            private final b httpException;
            private final int statusCode;

            {
                this.frequentQuestions = this.getFrequentQuestions();
                this.statusCode = this.getStatusCode();
                this.httpException = this.getHttpException();
            }

            @Override // b4.e
            public List<d> getFrequentQuestions() {
                return this.frequentQuestions;
            }

            @Override // v3.e
            public b getHttpException() {
                return this.httpException;
            }

            @Override // v3.e
            public int getStatusCode() {
                return this.statusCode;
            }
        };
    }
}
