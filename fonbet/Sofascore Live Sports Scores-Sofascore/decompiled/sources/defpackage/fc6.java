package defpackage;

import android.content.Context;
import android.content.Intent;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.google.firebase.perf.util.Timer;
import com.ironsource.EnumC4373w5;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.statistics.season.player.FootballPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.team.FootballTeamSeasonStatistics;
import com.sofascore.model.notifications.NotificationData;
import java.io.File;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class fc6 {
    public static void A(StringBuilder sb, Double d, String str, Double d2, String str2) {
        sb.append(d);
        sb.append(str);
        sb.append(d2);
        sb.append(str2);
    }

    public static boolean B(LocalDate localDate) {
        return localDate.isEqual(LocalDate.now(ZoneId.systemDefault()));
    }

    public static String C() {
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        return uuid;
    }

    public static int a(float f, int i, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    public static int b(int i, int i2, Team team) {
        return (team.hashCode() + i) * i2;
    }

    public static FootballTeamSeasonStatistics c(c73 c73Var, Context context, c73 c73Var2) {
        c73Var.getClass();
        context.getClass();
        return ktm.v(c73Var2);
    }

    public static ClassCastException d(Map.Entry entry) {
        entry.getKey().getClass();
        return new ClassCastException();
    }

    public static String e() {
        return ok3.p().e().getId();
    }

    public static String f(float f, int i, av8 av8Var, av8 av8Var2, utc utcVar) {
        nq8.h(av8Var, bkh.p(utcVar, f));
        return oea.v(i, av8Var2);
    }

    public static String g(int i, int i2, String str) {
        return i + str + i2;
    }

    public static String h(int i, String str, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static String i(long j, DateTimeFormatter dateTimeFormatter) {
        String format = dateTimeFormatter.format(Instant.ofEpochSecond(j));
        format.getClass();
        return format;
    }

    public static String j(FootballPlayerSeasonStatistics footballPlayerSeasonStatistics, Integer num) {
        return rei.q(yid.m(footballPlayerSeasonStatistics.getMinutesPlayed()), num);
    }

    public static String k(File file, String str) {
        return str + file;
    }

    public static String l(Integer num, Integer num2, String str, String str2, StringBuilder sb) {
        sb.append(num);
        sb.append(str);
        sb.append(num2);
        sb.append(str2);
        return sb.toString();
    }

    public static String m(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static String n(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String o(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    public static String p(StringBuilder sb, List list, char c) {
        sb.append(list);
        sb.append(c);
        return sb.toString();
    }

    public static StringBuilder q(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static StringBuilder r(String str, String str2, String str3, Integer num, int i) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(num);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder s(String str, String str2, String str3, List list, List list2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(list);
        sb.append(str2);
        sb.append(list2);
        sb.append(str3);
        return sb;
    }

    public static LocalDate t(Instant instant) {
        LocalDate localDate = instant.atZone(ZoneId.systemDefault()).toLocalDate();
        localDate.getClass();
        return localDate;
    }

    public static ArrayList u(Object obj) {
        y6a.M(obj);
        return new ArrayList();
    }

    public static void v(int i, tc3 tc3Var, av8 av8Var, boolean z) {
        tc3Var.invoke(av8Var, Integer.valueOf(i));
        av8Var.s(z);
    }

    public static void w(ht9 ht9Var, ImageView imageView, apf apfVar) {
        vt9.f(ht9Var, imageView);
        apfVar.a(ht9Var.a());
    }

    public static void x(Intent intent, String str, String str2, NotificationData notificationData, String str3) {
        intent.putExtra(str, str2);
        intent.putExtra(str3, notificationData.getId());
    }

    public static void y(Timer timer, xad xadVar, xad xadVar2) {
        xadVar.j(timer.a());
        yad.c(xadVar2);
    }

    public static void z(EnumC4373w5 enumC4373w5, Set set) {
        set.add(Integer.valueOf(enumC4373w5.b()));
    }
}
