package com.vk.newsfeed.impl.posting.settings.mvi;

import com.vk.newsfeed.impl.posting.settings.mvi.PostingSettingsState;
import com.vk.newsfeed.impl.posting.settings.mvi.e;
import kotlin.NoWhenBranchMatchedException;
import xsna.dm50;
import xsna.fju;

/* compiled from: PostingSettingsReducer.kt */
/* loaded from: classes4.dex */
public final class f extends dm50<h, e, PostingSettingsState> {

    /* compiled from: PostingSettingsReducer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PostingSettingsState.CommentsGlobalState.values().length];
            try {
                iArr[PostingSettingsState.CommentsGlobalState.CLOSED_BY_REPLIES_SETTINGS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PostingSettingsState.CommentsGlobalState.OPEN_JUST_MOMENT_AGO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PostingSettingsState.CommentsGlobalState.CLOSED_BY_WALL_SETTINGS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PostingSettingsState.CommentsGlobalState.OPEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static boolean i(PostingSettingsState.CommentsGlobalState commentsGlobalState) {
        int i = a.$EnumSwitchMapping$0[commentsGlobalState.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            if (i == 3) {
                return false;
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ba, code lost:
    
        if (r9 == null) goto L34;
     */
    @Override // xsna.dm50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PostingSettingsState c(PostingSettingsState postingSettingsState, e eVar) {
        PostingSettingsState.CommentsGlobalState commentsGlobalState;
        PostingSettingsState postingSettingsState2 = postingSettingsState;
        e eVar2 = eVar;
        if (eVar2.equals(e.i.b)) {
            return postingSettingsState2;
        }
        if (eVar2 instanceof e.b) {
            return PostingSettingsState.a(postingSettingsState2, PostingSettingsState.b.a(postingSettingsState2.i, null, ((e.b) eVar2).b, false, 5), null, null, null, null, null, 32639);
        }
        if (eVar2 instanceof e.C1390e) {
            PostingSettingsState.d dVar = postingSettingsState2.j;
            boolean z = ((e.C1390e) eVar2).b;
            dVar.getClass();
            return PostingSettingsState.a(postingSettingsState2, null, new PostingSettingsState.d(z), null, null, null, null, 32511);
        }
        if (eVar2 instanceof e.d) {
            PostingSettingsState.c cVar = postingSettingsState2.n;
            boolean z2 = ((e.d) eVar2).b;
            cVar.getClass();
            return PostingSettingsState.a(postingSettingsState2, null, null, null, null, new PostingSettingsState.c(z2), null, 28671);
        }
        if (eVar2 instanceof e.f) {
            PostingSettingsState.f fVar = postingSettingsState2.k;
            return PostingSettingsState.a(postingSettingsState2, null, null, new PostingSettingsState.f(((e.f) eVar2).b, fVar.b, fVar.c), null, null, null, 32255);
        }
        if (eVar2 instanceof e.g) {
            PostingSettingsState.e eVar3 = postingSettingsState2.l;
            String str = ((e.g) eVar2).b;
            eVar3.getClass();
            return PostingSettingsState.a(postingSettingsState2, null, null, null, new PostingSettingsState.e(str), null, null, 31743);
        }
        if (eVar2 instanceof e.h) {
            e.h hVar = (e.h) eVar2;
            Integer num = hVar.c;
            if (num != null) {
                commentsGlobalState = num.intValue() == 1 ? PostingSettingsState.CommentsGlobalState.OPEN : PostingSettingsState.CommentsGlobalState.CLOSED_BY_REPLIES_SETTINGS;
            }
            int i = hVar.b;
            commentsGlobalState = i != 0 ? i != 1 ? i != 2 ? i != 3 ? PostingSettingsState.CommentsGlobalState.CLOSED_BY_WALL_SETTINGS : PostingSettingsState.CommentsGlobalState.CLOSED_BY_WALL_SETTINGS : PostingSettingsState.CommentsGlobalState.OPEN : PostingSettingsState.CommentsGlobalState.OPEN : PostingSettingsState.CommentsGlobalState.CLOSED_BY_WALL_SETTINGS;
            return PostingSettingsState.a(postingSettingsState2, PostingSettingsState.b.a(postingSettingsState2.i, commentsGlobalState, false, i(commentsGlobalState), 2), null, null, null, null, null, 32639);
        }
        if (eVar2 instanceof e.c) {
            PostingSettingsState.CommentsGlobalState commentsGlobalState2 = ((e.c) eVar2).b;
            int i2 = a.$EnumSwitchMapping$0[commentsGlobalState2.ordinal()];
            if (i2 == 1) {
                commentsGlobalState2 = PostingSettingsState.CommentsGlobalState.OPEN_JUST_MOMENT_AGO;
            } else if (i2 == 2) {
                commentsGlobalState2 = PostingSettingsState.CommentsGlobalState.CLOSED_BY_REPLIES_SETTINGS;
            }
            return PostingSettingsState.a(postingSettingsState2, PostingSettingsState.b.a(postingSettingsState2.i, commentsGlobalState2, false, i(commentsGlobalState2), 2), null, null, null, null, null, 32639);
        }
        if (!(eVar2 instanceof e.a)) {
            throw new NoWhenBranchMatchedException();
        }
        PostingSettingsState.a aVar = postingSettingsState2.o;
        e.a aVar2 = (e.a) eVar2;
        String str2 = aVar2.b;
        Boolean valueOf = Boolean.valueOf(aVar2.c);
        String str3 = aVar2.d;
        aVar.getClass();
        return PostingSettingsState.a(postingSettingsState2, null, null, null, null, null, new PostingSettingsState.a(str2, valueOf, str3), 24575);
    }

    @Override // xsna.dm50
    public final h d() {
        return new h(e(new fju(this, 26)));
    }

    @Override // xsna.dm50
    public final void h(PostingSettingsState postingSettingsState, h hVar) {
        f(hVar.a, postingSettingsState);
    }
}
