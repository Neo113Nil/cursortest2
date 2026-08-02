package com.sofascore.model.newNetwork.commentary;

import com.sofascore.model.newNetwork.ErrorResponse;
import com.sofascore.model.newNetwork.HeadResponse;
import com.sofascore.model.newNetwork.NetworkResponse;
import defpackage.joa;
import defpackage.oea;
import defpackage.q5h;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.wl2;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:9B9\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBc\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\n\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0018\u0010#\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJJ\u0010$\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b1\u0010\u001fR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00102\u0012\u0004\b4\u00105\u001a\u0004\b3\u0010!R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00102\u0012\u0004\b7\u00105\u001a\u0004\b6\u0010!R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b8\u0010\u001f¨\u0006;"}, d2 = {"Lcom/sofascore/model/newNetwork/commentary/CommentaryResponse;", "Lcom/sofascore/model/newNetwork/NetworkResponse;", "", "Lcom/sofascore/model/newNetwork/commentary/Comment;", "comments", "Lcom/sofascore/model/newNetwork/commentary/TeamShirtColors;", "homeShirtColors", "awayShirtColors", "Lcom/sofascore/model/newNetwork/commentary/AmFootballDrive;", "drives", "<init>", "(Ljava/util/List;Lcom/sofascore/model/newNetwork/commentary/TeamShirtColors;Lcom/sofascore/model/newNetwork/commentary/TeamShirtColors;Ljava/util/List;)V", "", "seen0", "Lcom/sofascore/model/newNetwork/HeadResponse;", "head", "Lcom/sofascore/model/newNetwork/ErrorResponse;", "error", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/newNetwork/HeadResponse;Lcom/sofascore/model/newNetwork/ErrorResponse;Ljava/util/List;Lcom/sofascore/model/newNetwork/commentary/TeamShirtColors;Lcom/sofascore/model/newNetwork/commentary/TeamShirtColors;Ljava/util/List;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/commentary/CommentaryResponse;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Lcom/sofascore/model/newNetwork/commentary/TeamShirtColors;", "component3", "component4", "copy", "(Ljava/util/List;Lcom/sofascore/model/newNetwork/commentary/TeamShirtColors;Lcom/sofascore/model/newNetwork/commentary/TeamShirtColors;Ljava/util/List;)Lcom/sofascore/model/newNetwork/commentary/CommentaryResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getComments", "Lcom/sofascore/model/newNetwork/commentary/TeamShirtColors;", "getHomeShirtColors", "getHomeShirtColors$annotations", "()V", "getAwayShirtColors", "getAwayShirtColors$annotations", "getDrives", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CommentaryResponse extends NetworkResponse {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final TeamShirtColors awayShirtColors;

    @NotNull
    private final List<Comment> comments;

    @Nullable
    private final List<AmFootballDrive> drives;

    @Nullable
    private final TeamShirtColors homeShirtColors;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, null, ypa.a(ysaVar, new wl2(26)), null, null, ypa.a(ysaVar, new wl2(27))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CommentaryResponse(int i, HeadResponse headResponse, ErrorResponse errorResponse, List list, TeamShirtColors teamShirtColors, TeamShirtColors teamShirtColors2, List list2, t5h t5hVar) {
        super(i, headResponse, errorResponse, t5hVar);
        if (60 != (i & 60)) {
            oea.z(i, 60, CommentaryResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.comments = list;
        this.homeShirtColors = teamShirtColors;
        this.awayShirtColors = teamShirtColors2;
        this.drives = list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(Comment$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(AmFootballDrive$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CommentaryResponse copy$default(CommentaryResponse commentaryResponse, List list, TeamShirtColors teamShirtColors, TeamShirtColors teamShirtColors2, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = commentaryResponse.comments;
        }
        if ((i & 2) != 0) {
            teamShirtColors = commentaryResponse.homeShirtColors;
        }
        if ((i & 4) != 0) {
            teamShirtColors2 = commentaryResponse.awayShirtColors;
        }
        if ((i & 8) != 0) {
            list2 = commentaryResponse.drives;
        }
        return commentaryResponse.copy(list, teamShirtColors, teamShirtColors2, list2);
    }

    public static final /* synthetic */ void write$Self$model_release(CommentaryResponse self, wf3 output, SerialDescriptor serialDesc) {
        NetworkResponse.write$Self(self, output, serialDesc);
        joa[] joaVarArr = $childSerializers;
        output.f(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.comments);
        TeamShirtColors$$serializer teamShirtColors$$serializer = TeamShirtColors$$serializer.INSTANCE;
        output.h(serialDesc, 3, teamShirtColors$$serializer, self.homeShirtColors);
        output.h(serialDesc, 4, teamShirtColors$$serializer, self.awayShirtColors);
        output.h(serialDesc, 5, (KSerializer) joaVarArr[5].getValue(), self.drives);
    }

    @NotNull
    public final List<Comment> component1() {
        return this.comments;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final TeamShirtColors getHomeShirtColors() {
        return this.homeShirtColors;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final TeamShirtColors getAwayShirtColors() {
        return this.awayShirtColors;
    }

    @Nullable
    public final List<AmFootballDrive> component4() {
        return this.drives;
    }

    @NotNull
    public final CommentaryResponse copy(@NotNull List<Comment> comments, @Nullable TeamShirtColors homeShirtColors, @Nullable TeamShirtColors awayShirtColors, @Nullable List<AmFootballDrive> drives) {
        comments.getClass();
        return new CommentaryResponse(comments, homeShirtColors, awayShirtColors, drives);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommentaryResponse)) {
            return false;
        }
        CommentaryResponse commentaryResponse = (CommentaryResponse) other;
        return Intrinsics.c(this.comments, commentaryResponse.comments) && Intrinsics.c(this.homeShirtColors, commentaryResponse.homeShirtColors) && Intrinsics.c(this.awayShirtColors, commentaryResponse.awayShirtColors) && Intrinsics.c(this.drives, commentaryResponse.drives);
    }

    @Nullable
    public final TeamShirtColors getAwayShirtColors() {
        return this.awayShirtColors;
    }

    @NotNull
    public final List<Comment> getComments() {
        return this.comments;
    }

    @Nullable
    public final List<AmFootballDrive> getDrives() {
        return this.drives;
    }

    @Nullable
    public final TeamShirtColors getHomeShirtColors() {
        return this.homeShirtColors;
    }

    public int hashCode() {
        int hashCode = this.comments.hashCode() * 31;
        TeamShirtColors teamShirtColors = this.homeShirtColors;
        int hashCode2 = (hashCode + (teamShirtColors == null ? 0 : teamShirtColors.hashCode())) * 31;
        TeamShirtColors teamShirtColors2 = this.awayShirtColors;
        int hashCode3 = (hashCode2 + (teamShirtColors2 == null ? 0 : teamShirtColors2.hashCode())) * 31;
        List<AmFootballDrive> list = this.drives;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CommentaryResponse(comments=" + this.comments + ", homeShirtColors=" + this.homeShirtColors + ", awayShirtColors=" + this.awayShirtColors + ", drives=" + this.drives + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/commentary/CommentaryResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/commentary/CommentaryResponse;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return CommentaryResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @q5h("away")
    public static /* synthetic */ void getAwayShirtColors$annotations() {
    }

    @q5h("home")
    public static /* synthetic */ void getHomeShirtColors$annotations() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CommentaryResponse(@NotNull List<Comment> list, @Nullable TeamShirtColors teamShirtColors, @Nullable TeamShirtColors teamShirtColors2, @Nullable List<AmFootballDrive> list2) {
        super((HeadResponse) null, (ErrorResponse) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        list.getClass();
        this.comments = list;
        this.homeShirtColors = teamShirtColors;
        this.awayShirtColors = teamShirtColors2;
        this.drives = list2;
    }
}
