package com.vk.libvideo.bottomsheet.about.delegate;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.e3m;
import xsna.egs0;
import xsna.hfz;
import xsna.p1u0;
import xsna.qf6;
import xsna.vfz;
import xsna.zrp;

/* compiled from: AboutVideoSimilarVideosTitleRedesignDelegate.kt */
/* loaded from: classes2.dex */
public final class AboutVideoSimilarVideosTitleRedesignDelegate extends p1u0<AboutVideoItem.z> {
    public final Type a;
    public final egs0 b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AboutVideoSimilarVideosTitleRedesignDelegate.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type Default;
        public static final Type TabletLandscapeRedesign;
        public static final Type TabletRedesign;

        static {
            Type type = new Type("Default", 0);
            Default = type;
            Type type2 = new Type("TabletRedesign", 1);
            TabletRedesign = type2;
            Type type3 = new Type("TabletLandscapeRedesign", 2);
            TabletLandscapeRedesign = type3;
            Type[] typeArr = {type, type2, type3};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* compiled from: AboutVideoSimilarVideosTitleRedesignDelegate.kt */
    public static final class a extends qf6 {
        public final TextView l;
        public final View m;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(ViewGroup viewGroup, Type type, egs0 egs0Var) {
            super(viewGroup, r3, egs0Var);
            int i;
            int i2 = c0.$EnumSwitchMapping$0[type.ordinal()];
            if (i2 == 1) {
                i = R.layout.video_about_similar_videos_title_redesign;
            } else if (i2 == 2) {
                i = R.layout.video_about_similar_videos_title_redesign_tablet;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R.layout.video_about_similar_videos_title_redesign_tablet_landscape;
            }
            this.l = (TextView) this.itemView.findViewById(R.id.title);
            this.m = this.itemView.findViewById(R.id.title_separator);
        }

        @Override // xsna.vfz
        public final void W5(hfz hfzVar) {
            ColorDrawable colorDrawable;
            AboutVideoItem.z zVar = (AboutVideoItem.z) hfzVar;
            boolean z = zVar.c;
            this.l.setText(z ? this.itemView.getContext().getString(R.string.video_about_similar_videos_title) : zVar.d ? this.itemView.getContext().getString(R.string.video_downloaded_title) : zVar.e ? this.itemView.getContext().getString(R.string.video_about_similar_music_title) : zVar.f ? this.itemView.getContext().getString(R.string.video_about_music_mix_title) : this.itemView.getContext().getString(R.string.video_about_similar_videos_title_recommendations_redesign));
            View view = this.itemView;
            if (z) {
                colorDrawable = null;
            } else {
                Context context = view.getContext();
                e3m.a aVar = e3m.a;
                colorDrawable = new ColorDrawable(context.getColor(R.color.vk_gray_1000));
            }
            view.setBackground(colorDrawable);
            View view2 = this.m;
            if (view2 != null) {
                view2.setVisibility(!zVar.g ? 0 : zVar.h ? 4 : 8);
            }
        }
    }

    public AboutVideoSimilarVideosTitleRedesignDelegate(Type type, egs0 egs0Var) {
        this.a = type;
        this.b = egs0Var;
    }

    @Override // xsna.p1u0
    public final vfz<? extends AboutVideoItem.z> b(ViewGroup viewGroup) {
        return new a(viewGroup, this.a, this.b);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof AboutVideoItem.z;
    }
}
