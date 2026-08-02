package defpackage;

import com.sofascore.model.mvvm.model.TournamentRoundWrapper;
import com.sofascore.model.newNetwork.TeamOfTheWeekRoundsResponseKt;
import com.sofascore.results.R;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class qqj {
    public static final List a = b.j(new Pair("Maks_99", Integer.valueOf(R.drawable.totr_fake_avatar_1)), new Pair("FootyFan21", Integer.valueOf(R.drawable.totr_fake_avatar_2)), new Pair("MidfieldKing", Integer.valueOf(R.drawable.totr_fake_avatar_3)), new Pair("OffsideTraps", Integer.valueOf(R.drawable.totr_fake_avatar_4)), new Pair("GoalMachine_7", Integer.valueOf(R.drawable.totr_fake_avatar_5)), new Pair("PitchInvader", Integer.valueOf(R.drawable.totr_fake_avatar_6)));
    public static final Map b = tub.h(new Pair(rqj.b, b.j("That XI is STACKED 🔥", "Can’t argue with that tbh.", "This team would cook anyone.", "Absolutely deserved spots 🙌🙌", "I’d swap a couple names, but fair enough.", "I know someone’s mad about this 😂", "yeah fair, they earned it", "Proper ballers in there", "Saw that coming tbh.", "That’s a serious squad 😳")), new Pair(rqj.c, b.j("Different gravy this round 🔥🔥🔥", "Yeahhh that checks out. 🤩", "can’t argue with that tbh", "Not bad, not bad at all 🤔", "Some real standouts this time.", "Well well, not surprised to see these names.", "Damn, this round was wild from start to finish 😅", "Some tough calls here, but that’s expected when margins are this small.", "Great performances across the board 👏👏", "That’s elite company right there 🔝🔝🔝")), new Pair(rqj.d, b.j("fair enough 👌", "Elite round, from top to bottom 🔥😍", "A couple of surprises there…", "Solid picks all around", "Bold choices ngl, but I like it", "That lineup is scary good 😱😱😱", "Very interesting XI…", "Hard to argue with that.", "Round of 16 pressure is no joke, so credit where it’s due.", "this team would win it all 😂")), new Pair(rqj.e, b.j("Interesting selections… 🤔", "Didn’t expect all of those, but alright", "One or two surprises there.", "somebody nerf these guys, they’re too good 🔥💪🔥", "Levels. Just levels.", "okay respect respect, not a bad XI at all", "yeah they were kinda insane", "bro what was that round 😭😭😭", "Debate incominggg. I’ll grab my popcorn 🍿", "This round was even better than the group stage.")), new Pair(rqj.f, b.j("Hard to argue with that. ⚽️🔥", "Built different 💪", "every round feels so much heavier than the last 😭", "Am i the only one who thinks some of these ratings are kinda generous lol?", "Aaand let the arguments begin. I personally like it.", "Saw that coming tbh 😎", "Bold but fair. Can’t wait for the quarters.", "Tough calls all around.", "I can already see the comments 😆", "Yeah, this feels right.")), new Pair(rqj.g, b.j("Oh man, that XI is ridiculous 🚀", "Okay yeah… that’s elite.", "Yeah all of them really showed up 💯", "Now that’s a proper lineup right there.", "Quarterfinal energy really is different 😮\u200d💨", "Not everyone’s gonna agree with this one 👀", "Yeah they really stepped up.", "The semifinal is gonna be massive", "Deserved. Let’s go! 💪💪", "I’d argue one spot but overall fair.")), new Pair(rqj.h, b.j("That’s legacy stuff right there.", "Yh, nothing to complain about really. Can’t wait for the finals! 🏆", "I get the hype but… one player doesn’t belong, right?", "this deep into the tournament and still dropping masterclasses??", "this round went HARD ⚽️⚽️💪", "I hope the final lives up to the hype", "I know debates are starting already 😂", "Big performances all around, totally deserved.", "nice, my XI would be practically the same", "Top quality 👌👌👌")), new Pair(rqj.j, b.j("The definitive XI. No doubt about it. 🏆", "Hard to leave anyone out, but this is the right group. 💯", "Absolute ballers. Every single one of them.", "yeah, that’s a scary amount of talent 😳", "Proper respect to everyone in this XI. They ran the show. 🙌", "this team would genuinely never lose a game lol", "Solid. The ratings don't lie 📈", "It’s been a wild ride. Man, what a month 👏", "The best of the best. Simple as that.", "These guys were just on another level. 🔝🔝🔝")));

    public static nn6 a(TournamentRoundWrapper tournamentRoundWrapper) {
        rqj rqjVar;
        List list;
        tournamentRoundWrapper.getClass();
        rqj.a.getClass();
        if (Intrinsics.c(tournamentRoundWrapper.getTotwType(), TeamOfTheWeekRoundsResponseKt.TOTW_SEASON)) {
            rqjVar = rqj.j;
        } else {
            String roundSlug = tournamentRoundWrapper.getRoundSlug();
            Locale locale = Locale.ROOT;
            String lowerCase = roundSlug.toLowerCase(locale);
            lowerCase.getClass();
            String obj = StringsKt.l0(lowerCase).toString();
            String lowerCase2 = tournamentRoundWrapper.getRoundName().toLowerCase(locale);
            lowerCase2.getClass();
            String obj2 = StringsKt.l0(lowerCase2).toString();
            rqjVar = (Intrinsics.c(obj, "round-of-32") || StringsKt.J(obj2, "round of 32", false)) ? rqj.e : (Intrinsics.c(obj, "round-of-16") || StringsKt.J(obj2, "round of 16", false)) ? rqj.f : (c.v(obj, "quarter", false) || StringsKt.J(obj2, "quarterfinal", false)) ? rqj.g : (c.v(obj, "semi", false) || StringsKt.J(obj2, "semifinal", false)) ? rqj.h : (obj.equals("final") || obj2.equals("final")) ? rqj.i : obj2.equals("1") ? rqj.b : obj2.equals("2") ? rqj.c : obj2.equals("3") ? rqj.d : null;
        }
        if (rqjVar == null || (list = (List) b.get(rqjVar)) == null) {
            return null;
        }
        flf flfVar = glf.a;
        int size = list.size();
        flfVar.getClass();
        d7 d7Var = glf.b;
        String str = (String) list.get(d7Var.k(size));
        List list2 = a;
        Pair pair = (Pair) list2.get(d7Var.k(list2.size()));
        return new nn6(((Number) pair.b).intValue(), (String) pair.a, str);
    }
}
