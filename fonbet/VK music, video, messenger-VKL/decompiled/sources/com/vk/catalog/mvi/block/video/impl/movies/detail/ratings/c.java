package com.vk.catalog.mvi.block.video.impl.movies.detail.ratings;

import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.video.impl.movies.detail.ratings.MovieRatingsView$MovieRatingsBlockState;
import com.vk.catalog.mvi.block.video.impl.movies.detail.ratings.a;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.c5g;
import xsna.i35;
import xsna.mno0;
import xsna.nno0;
import xsna.s2a;

/* compiled from: MovieRatingsViewStateMapper.kt */
/* loaded from: classes.dex */
public final class c implements s2a<MovieRatingsView$MovieRatingsBlockState, com.vk.catalog.mvi.block.video.impl.movies.detail.ratings.a> {

    /* compiled from: MovieRatingsViewStateMapper.kt */
    /* loaded from: classes16.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MovieRatingsView$MovieRatingsBlockState.RatingBlockState.Provider.values().length];
            try {
                iArr[MovieRatingsView$MovieRatingsBlockState.RatingBlockState.Provider.KinoMail.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MovieRatingsView$MovieRatingsBlockState.RatingBlockState.Provider.Imdb.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.s2a
    public final com.vk.catalog.mvi.block.video.impl.movies.detail.ratings.a a(MovieRatingsView$MovieRatingsBlockState movieRatingsView$MovieRatingsBlockState) {
        mno0.g b;
        MovieRatingsView$MovieRatingsBlockState movieRatingsView$MovieRatingsBlockState2 = movieRatingsView$MovieRatingsBlockState;
        BlockId blockId = movieRatingsView$MovieRatingsBlockState2.b;
        List<MovieRatingsView$MovieRatingsBlockState.RatingBlockState> list = movieRatingsView$MovieRatingsBlockState2.d;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (MovieRatingsView$MovieRatingsBlockState.RatingBlockState ratingBlockState : list) {
            float k = i35.k(ratingBlockState.e(), 2);
            int i = a.$EnumSwitchMapping$0[ratingBlockState.d().ordinal()];
            if (i == 1) {
                b = nno0.b(R.string.movie_rating_name_kinomail);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                b = nno0.b(R.string.movie_rating_name_imdb);
            }
            arrayList.add(new a.C0461a(b, k));
        }
        return new com.vk.catalog.mvi.block.video.impl.movies.detail.ratings.a(blockId, arrayList);
    }
}
