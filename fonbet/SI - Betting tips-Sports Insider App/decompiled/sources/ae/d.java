package ae;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f153a = {"Основные обозначения и их расшифровки:", "", "Одинары", "Одинар - это самый распространенный и самый простой для понимания вид ставок. С ним очень легко разобраться: это ставка только на один из возможных исходов (чаще всего, победа какой-либо команды). Существует огромное количество одинаров в любой букмекерской конторе - актуален, в принципе, для любого вида спорта.", "П1 - Победа первой команды", "П2 - Победа второй команды", "Н (или иногда Х) - ничья", "1Х - Победа или ничья первой команды (еще такие ставки называют “Двойной шанс”)", "Х2 - Победа или ничья второй команды", "12 - Победа любой из команд. В данной ставке ничья исключена", "Пример: Челси - Манчестер Юнайтед, ставка “1Х”. Данная ставка выиграет в том случае, если Челси выиграет или сыграет вничью."};

    /* renamed from: b, reason: collision with root package name */
    public final String[] f154b = {"", "Single bets", "Result bets", "Single bets are the easiest for understanding bets in betting: you bet only on one event. There are lots of single bets in sportsbook of any bookmakers. The most popular single bets are:", "1 Win – first team wins;", "2 Win – second team wins;", "X – draw;", "1X – first team double chance (first team win or draw);", "X2 – second team double chance (second team win or draw);", "12 – any team wins. There is no draw in this bet.", ""};

    /* renamed from: c, reason: collision with root package name */
    public final String[] f155c = {"", "Paris simples", "Paris sur le résultat", "Les paris simples sont les plus faciles à comprendre : vous misez sur un seul événement. Tous les bookmakers proposent ce type de paris. Les plus populaires sont :", "Victoire 1 – l’équipe à domicile gagne ;", "Victoire 2 – l’équipe visiteuse gagne ;", "X – match nul ;", "1X – double chance pour l’équipe 1 (victoire ou nul) ;", "X2 – double chance pour l’équipe 2 (victoire ou nul) ;", "12 – l’une des deux équipes gagne (pas de nul).", ""};

    /* renamed from: d, reason: collision with root package name */
    public final String[] f156d = {"", "Einzelwetten", "Ergebniswetten", "Einzelwetten sind die einfachsten Wetten: Sie setzen auf nur ein Ereignis. Sie sind bei allen Buchmachern verfügbar. Die beliebtesten sind:", "1 Sieg – Heimsieg;", "2 Sieg – Auswärtssieg;", "X – Unentschieden;", "1X – Doppelte Chance Heimteam;", "X2 – Doppelte Chance Auswärtsteam;", "12 – Einer der beiden gewinnt (kein Unentschieden).", ""};

    /* renamed from: e, reason: collision with root package name */
    public final String[] f157e = {"", "Apuestas simples", "Apuestas al resultado", "Las apuestas simples son las más fáciles de entender: se apuesta a un solo evento. Son muy comunes en las casas de apuestas. Las más populares son:", "1 – gana el equipo local;", "2 – gana el equipo visitante;", "X – empate;", "1X – doble oportunidad local;", "X2 – doble oportunidad visitante;", "12 – gana cualquiera de los dos (sin empate).", ""};

    /* renamed from: f, reason: collision with root package name */
    public final String[] f158f = {"", "Apostas simples", "Apostas no resultado", "As apostas simples são as mais fáceis de entender: você aposta em apenas um evento. Estão disponíveis em qualquer bookmaker. As mais populares são:", "Vitória 1 – time da casa vence;", "Vitória 2 – time visitante vence;", "X – empate;", "1X – dupla chance para o time da casa;", "X2 – dupla chance para o visitante;", "12 – qualquer time vence (sem empate).", ""};

    /* renamed from: g, reason: collision with root package name */
    public final String[] f159g = {"", "Tekli Bahisler", "Maç Sonucu Bahisleri", "Tekli bahisler, yalnızca bir olaya bahis yapılan en basit bahis türüdür. Tüm bahis sitelerinde bulunur. En popüler olanlar:", "1 – ev sahibi kazanır;", "2 – deplasman kazanır;", "X – beraberlik;", "1X – ev sahibi kazanır veya berabere;", "X2 – deplasman kazanır veya berabere;", "12 – kazanan olur (beraberlik yok).", ""};

    /* renamed from: h, reason: collision with root package name */
    public final String[] f160h = {"Ставки с форой", "Иногда бывает так, что в паре участвующих в матче есть явные фаворит и аутсайдер. Но что делать, если вы уверены, например, в победе фаворита? Ведь если воспользоваться одинарной ставкой, то коэффициент на победу фаворита будет очень мал. В таких случаях на помощь приходят ставки с форой. Суть форы сводится к тому, чтобы добавить или отнять от конечного результата команды то или иное значение - если после этого команда всё равно победила - ставка считается прошедшей. Форы бывают трех видов:", "Ф1 (-1) - минусовая фора. Используется для фаворита. Данная ставка означает, что первая команда должна победить с разницей в 2 и более мяча. Если первая команда победит с разницей в 1 мяч - будет произведен возврат ставки. Внимание: значение минусовой форы может быть любым: (-2), (-3) и так далее.", "Разберём на примере. Представим, что у нас есть матч между Челси и Фулхэмом. Челси - явный фаворит, коэффициент на его победу очень низкий. Мы делаем предположение, что Челси выиграет минимум в 2 мяча - заигрываем фору Ф1 (-1). Если Челси победит, например, со счетом 3-1, то ставка сыграет, поскольку от 3 забитых мячей мы отнимаем фору (-1), и все равно получаем победу Челси 2-1. Если игра закончится, например, 2-1, то отняв фору (-1), получаем итоговый счет 1-1, что предполагает возврат ставки.", "Ф1 (0) - нулевая фора. Используется как для фаворита матча, так и для аутсайдера. Данная ставка означает, что первая команда должна победить с любым счетом. Если первая команда сыграет вничью - будет произведен возврат ставки. Иначе еще эту ставку называют “ставка без ничьи”.", "Разберем на примере. Представим, что у нас есть матч между Ливерпулем и Манчестер Сити. По классу эти команды примерно равны, но у Ливерпуля есть некое преимущество из-за домашнего стадиона. Мы делаем предположение, что благодаря этому преимуществу Ливерпуль, скорее всего, выиграет, но немного сомневаемся (а вдруг Сити упрётся и не даст себя обыграть?), поэтому заигрываем нулевую фору на Ливерпуль Ф1 (0). Если Ливерпуль победит с любым счетом, то мы, отняв нулевую фору (0), все равно получим победу Ливерпуля - ставка сыграла. А если матч закончится вничью, то отняв нулевую фору, получим ничью - возврат ставки.", "Ф1 (+1) - плюсовая фора. Используется для аутсайдера (явного и не очень). Данная ставка означает, что первая команда должна сыграть вничью или выиграть. Если команда проиграет с разницей в 1 мяч - будет произведен возврат ставки. Внимание: значение плюсовой форы может быть любым: (+2), (+3) и так далее.", "Разберем на примере. Представим, что у нас есть матч между Челси и Манчестер Сити. Здесь Челси - неявный, но все же аутсайдер. Мы делаем предположение, что Челси, скорее всего, не проиграет, но если и проиграет, то максимум в 1 мяч - поэтому заигрываем на них плюсовую фору Ф1 (+1). Если же матч закончится победой Челси с любым счетом, то прибавив к их забитым голам нашу плюсовую фору (+1), все равно получим победу Челси - значит, ставка зашла. Если Челси сыграет вничью, то добавив плюсовую фору, мы получим победу Челси - значит, ставка зашла. Если Челси проиграет всего в 1 мяч, то добавив плюсовую фору, мы получим ничью - возврат ставки.", "Стоит помнить, что фору можно заигрывать на любую команду. Если на первую, то ставка будет выглядеть как Ф1, если на вторую - Ф2. Также фора может быть и не целочисленная: например, Ф1 (+1.5)."};

    /* renamed from: i, reason: collision with root package name */
    public final String[] f161i = {"Handicap bets", "In sports, there are a lot of times when one team is a favorite, another one is an outsider. What you should do when you’re sure favorite will win? If you chose just “result bet” (1 Win, for example), the odds will be very small. That’s why many players like to use handicap bets. The point of handicap bets is to add or subtract handicap goals for the selected team. If team wins after this calculation, bet wins. There are three types of handicap bets:", "Negative handicap (Hand minus). Usually is used for favorites. This bet means team have to win by 2 goals or more. If team win by just 1 goal, bet returns.", "Example. Today Chelsea meets Fulham in West London derby. Chelsea are favorites here, that’s why “1 Win” bet has small odds. We expect Chelsea to win comfortably (by 2 or more goals, why not?), so we use “1 Hand (-1)” bet. If Chelsea wins 3:1, we subtract 1 goal (our handicap) and Chelsea are still winners – so, our bet wins. If Chelsea win 2:1 or 3:2, Chelsea won’t be winner after subtraction, game will end draw, so bet returns.", "Zero handicap (draw no bet, DNB). Usually is used for both teams. This beat means team have to win with any score. If team draws, bet returns.", "Example. We have two strong teams with equal game-level: Liverpool against Manchester City. Game is played at Enfield, so Liverpool have advantage. We think, Liverpool should win, but the same way we expect some things from Manchester City to avoid this, that’s why we use DNB-bet. If Liverpool win with any score, bet wins. If game ends with draw, bet returns.", "Positive handicap (Hand plus). Usually is used for outsider. This bet means team should play draw or win. If team team loses with set handicap, bet returns.", "Example. We have a battle between Chelsea and Manchester City. Chelsea is small outsider here. We think, Chelsea have everything to avoid defeat and even they lose – this loss will be by 1 goal maximum. So, we use positive handicap for Chelsea 1 Hand (+1). If Chelsea win this game, we add +1 handicaps to final score and Chelsea still win – so, bet win. If game ends with draw, we add +1 handicaps to final score and Chelsea still win – bet win. If Chelsea to lose by 1 goal max, bet returns.", "You should remember – you can use any kind of these handicaps to any team: 1 Hand or 2 Hand. Moreover, handicaps can be +1.5, -0.5 and other."};
    public final String[] j = {"Paris à handicap", "Dans le sport, il arrive souvent qu’une équipe soit favorite et l’autre outsider. Que faire si vous êtes sûr que le favori va gagner ? Si vous choisissez simplement un pari sur le résultat (par exemple victoire de l’équipe 1), les cotes seront faibles. C’est pourquoi de nombreux joueurs utilisent les paris à handicap. Le principe est d’ajouter ou de soustraire des buts virtuels à l’équipe sélectionnée. Si l’équipe gagne après ce calcul, le pari est gagnant. Il existe trois types de handicaps :", "Handicap négatif (moins). Généralement utilisé pour les favoris. Cela signifie que l’équipe doit gagner par 2 buts ou plus. Si elle gagne avec un seul but d’écart, le pari est remboursé.", "Exemple. Chelsea joue contre Fulham dans un derby de l’ouest de Londres. Chelsea est favorite, donc la cote de « Victoire Chelsea » est faible. Nous attendons une victoire confortable, nous choisissons donc « Handicap -1 ». Si Chelsea gagne 3:1, après soustraction d’un but, elle reste gagnante — pari gagnant. Si Chelsea gagne 2:1 ou 3:2, le score devient nul — pari remboursé.", "Handicap zéro (Draw No Bet, DNB). Utilisé pour les deux équipes. L’équipe doit gagner, peu importe le score. En cas de match nul, le pari est remboursé.", "Exemple. Liverpool joue contre Manchester City, deux équipes de niveau similaire. Le match se joue à Anfield, ce qui donne un avantage à Liverpool. Nous utilisons un pari DNB. Si Liverpool gagne — le pari gagne. En cas de nul — remboursement.", "Handicap positif (plus). Généralement utilisé pour les outsiders. L’équipe doit faire match nul ou gagner. Si elle perd dans la limite du handicap, le pari est remboursé.", "Exemple. Chelsea joue contre Manchester City en tant qu’outsider. Nous pensons que Chelsea peut éviter une lourde défaite. Nous choisissons « Handicap +1 ». Si Chelsea gagne ou fait match nul — pari gagnant. Si Chelsea perd d’un but — pari remboursé.", "Vous pouvez appliquer n’importe quel type de handicap à n’importe quelle équipe : Handicap 1 ou Handicap 2. De plus, les handicaps peuvent être décimaux : +1.5, -0.5, etc."};

    /* renamed from: k, reason: collision with root package name */
    public final String[] f162k = {"Handicap-Wetten", "Im Sport gibt es oft Situationen, in denen eine Mannschaft Favorit ist und die andere Außenseiter. Wenn Sie sicher sind, dass der Favorit gewinnt, sind normale Siegwetten oft niedrig quotiert. Deshalb greifen viele Spieler zu Handicap-Wetten. Dabei werden der ausgewählten Mannschaft virtuelle Tore hinzugefügt oder abgezogen. Es gibt drei Arten von Handicaps:", "Negatives Handicap (Minus). Wird meist für Favoriten verwendet. Die Mannschaft muss mit mindestens 2 Toren Unterschied gewinnen. Gewinnt sie nur mit einem Tor, wird die Wette zurückerstattet.", "Beispiel. Chelsea spielt gegen Fulham. Chelsea ist Favorit, daher sind die Quoten niedrig. Wir erwarten einen klaren Sieg und wählen Handicap -1. Gewinnt Chelsea 3:1, bleibt sie nach Abzug eines Tores Sieger — Wette gewonnen. Bei 2:1 oder 3:2 endet es unentschieden — Rückerstattung.", "Null-Handicap (Draw No Bet, DNB). Für beide Teams geeignet. Die Mannschaft muss gewinnen. Bei einem Unentschieden wird die Wette zurückerstattet.", "Beispiel. Liverpool gegen Manchester City auf Augenhöhe. Das Spiel findet in Anfield statt. Wir wählen DNB. Gewinnt Liverpool — Wette gewinnt. Bei Unentschieden — Rückerstattung.", "Positives Handicap (Plus). Wird meist für Außenseiter verwendet. Die Mannschaft darf unentschieden spielen oder gewinnen. Verliert sie innerhalb des Handicaps — Rückerstattung.", "Beispiel. Chelsea spielt gegen Manchester City als Außenseiter. Wir wählen Handicap +1. Bei Sieg oder Unentschieden — Wette gewonnen. Bei Niederlage mit einem Tor — Rückerstattung.", "Sie können jedes Handicap auf jedes Team anwenden. Zudem gibt es dezimale Handicaps wie +1.5, -0.5 usw."};

    /* renamed from: l, reason: collision with root package name */
    public final String[] f163l = {"Apuestas con hándicap", "En el deporte, a menudo un equipo es favorito y el otro es outsider. Si estás seguro de que el favorito ganará, las cuotas de una apuesta simple suelen ser bajas. Por eso muchos jugadores usan apuestas con hándicap. El objetivo es sumar o restar goles virtuales al equipo elegido. Existen tres tipos:", "Hándicap negativo (menos). Se usa para favoritos. El equipo debe ganar por 2 goles o más. Si gana por un solo gol, la apuesta se devuelve.", "Ejemplo. Chelsea juega contra Fulham. Chelsea es favorito y esperamos una victoria cómoda. Apostamos a hándicap -1. Si gana 3:1 — la apuesta gana. Si gana 2:1 o 3:2 — se devuelve.", "Hándicap cero (Draw No Bet, DNB). El equipo debe ganar. Si hay empate, la apuesta se devuelve.", "Ejemplo. Liverpool vs Manchester City en Anfield. Apostamos DNB. Si gana Liverpool — apuesta ganada. Empate — devolución.", "Hándicap positivo (más). Se usa para outsiders. El equipo puede empatar o ganar. Si pierde dentro del hándicap — devolución.", "Ejemplo. Chelsea es outsider contra Manchester City. Apostamos hándicap +1. Victoria o empate — apuesta ganada. Derrota por un gol — devolución.", "Puedes usar cualquier tipo de hándicap para cualquier equipo. También existen hándicaps decimales como +1.5 o -0.5."};

    /* renamed from: m, reason: collision with root package name */
    public final String[] f164m = {"Apostas com handicap", "No esporte, muitas vezes um time é favorito e o outro é azarão. Se você tem certeza da vitória do favorito, as apostas simples costumam ter odds baixas. Por isso, muitos apostadores usam apostas com handicap. O objetivo é adicionar ou subtrair gols virtuais. Existem três tipos:", "Handicap negativo (menos). Usado para favoritos. O time precisa vencer por 2 gols ou mais. Vitória por um gol resulta em devolução.", "Exemplo. Chelsea joga contra Fulham. Apostamos em handicap -1 esperando vitória confortável. Se ganhar 3:1 — aposta ganha. Se ganhar 2:1 — devolução.", "Handicap zero (Draw No Bet, DNB). O time precisa vencer. Empate gera devolução.", "Exemplo. Liverpool contra Manchester City em Anfield. Apostamos DNB. Vitória do Liverpool — ganha. Empate — devolução.", "Handicap positivo (mais). Usado para azarões. O time pode empatar ou vencer. Derrota dentro do handicap gera devolução.", "Exemplo. Chelsea contra Manchester City como azarão. Handicap +1. Vitória ou empate — ganha. Derrota por um gol — devolução.", "Qualquer handicap pode ser usado em qualquer time. Também existem handicaps decimais como +1.5 ou -0.5."};

    /* renamed from: n, reason: collision with root package name */
    public final String[] f165n = {"Handikap Bahisleri", "Sporda çoğu zaman bir takım favori, diğeri ise underdog olur. Favorinin kazanacağından eminseniz, normal sonuç bahislerinin oranı düşük olur. Bu yüzden handikap bahisleri kullanılır. Amaç, seçilen takıma sanal goller eklemek veya çıkarmaktır. Üç türü vardır:", "Negatif handikap (eksi). Favoriler için kullanılır. Takımın en az 2 farkla kazanması gerekir. 1 farkla kazanırsa bahis iade edilir.", "Örnek. Chelsea – Fulham maçında Chelsea favoridir. Handikap -1 oynarız. Chelsea 3:1 kazanırsa bahis kazanır. 2:1 kazanırsa iade edilir.", "Sıfır handikap (Draw No Bet, DNB). Takım kazanmalıdır. Beraberlikte bahis iade edilir.", "Örnek. Liverpool – Manchester City maçında DNB oynanır. Liverpool kazanırsa bahis kazanır, beraberlikte iade edilir.", "Pozitif handikap (artı). Underdog takımlar için kullanılır. Takım berabere kalabilir veya kazanabilir. Handikap dahilinde kaybederse bahis iade edilir.", "Örnek. Chelsea, Manchester City karşısında underdogdur. Handikap +1 oynanır. Galibiyet veya beraberlikte bahis kazanır. 1 farkla mağlubiyette iade edilir.", "Her takım için her tür handikap kullanılabilir. Ayrıca +1.5, -0.5 gibi ondalıklı handikaplar da vardır."};

    /* renamed from: o, reason: collision with root package name */
    public final String[] f166o = {"Ставки на тотал", "Ставка на тотал - это ставка на количество чего-то в матче: голов, угловых, желтых карточек, штрафных и так далее. Такой вид ставки применяется тогда, когда либо совсем непонятно, кто выиграет, либо когда есть какие-то закономерности в различных аспектах игры той или иной команды. Ставки на тотал являются очень популярными среди беттеров. Существует 2 вида ставок на тотал:", "Тотал больше (значение). Если вы убеждены, что в матче будет забито больше определенного количества мячей, то можно смело заигрывать тотал больше. Обычно он обозначается ТБ 2.5, где “2.5” - это больше какого количества мячей будет забито. Количество мячей может быть как целым (1, 2, 4 и тд), так и дробным (2.5, 1.5). Кроме того, в некоторых букмекерских конторах принимаются ставки на тотал больше угловых, ударов в створ ворот и так далее.", "Пример: Челси - Манчестер Сити, ТБ 2 - ставка зайдет, если в матче будет забито 3 и более мячей. Если в матче будет забито на двоих ровно 2 мяча - возврат ставки.", "Тотал меньше (значение). Если вы убеждены, что в матче будет забито меньше определенного количества мячей, то можно смело заигрывать тотал меньше. Обычно он обозначается ТМ 2.5, где “2.5” - это меньше какого количества мячей будет забито. Количество мячей может быть как целым (1, 2, 4 и тд), так и дробным (2.5, 1.5). В некоторых букмекерских конторах принимаются ставки на тотал меньше угловых, ударов в створ ворот и так далее.", "Пример: Челси - Манчестер Сити, ТМ 2 - ставка зайдет, если в матче будет забито менее 2 мячей. Если в матче будет забито на двоих ровно 2 мяча - возврат ставки.", "Но иногда бывает так, что есть уверенность (или неуверенность) в том, что только какая-то конкретная команда забьет определенное количество мячей. на помощь приходят так называемые индивидуальные тоталы - ставки на то, сколько забьет определенная команда. Здесь всё по аналогии с общим тоталом, только выглядят такие ставки следующим образом:", "1ТБ 2.5 или 2ТБ 2.5 - индивидуальный тотал первой команды больше и индивидуальный тотал второй команды больше;", "1ТМ 2.5 или 2ТМ 2.5 - индивидуальный тотал первой команды меньше и индивидуальный тотал второй команды меньше. В обоих случаях можно ставить на любое количество мячей, доступных в букмекерской конторе."};

    /* renamed from: p, reason: collision with root package name */
    public final String[] f167p = {"Totals", "Totals are bet on number of something in match: goals, corners, cards and other. You may use this kind of bets when don’t exactly know, which team is closer to win. Totals are very popular in betting. Here are two types of totals:", "Over. If you think, game will be full of goals – use “Over” bet. Usually, this bet looks like “Over (goals)”, where “goals” is expected number of goals. You can use fractal numbers of goals (2.5, 1.5, 3.5) or integer (1, 2, 3);", "Example. You think, the game between Manchester City and Chelsea will produce, at least, 3 goals. You use “Over 2.5” bet. If game ends 2:1, 0:4, 3:2 – bet wins. If game produces just 2 goals or less – bet fails.", "Under. If you think, game will be boring and not so interesting to watch in terms of goals – use “Under” bet. Usually, this bet looks like “Under (goals)”, where “goals” is expected number of goals. You can use fractal numbers of goals (2.5, 1.5, 3.5) or integer (1, 2, 3);", "Example. You think, the game between Manchester City and Chelsea will produce 3 goals or less. You use “Under 3.5” bet. If final score is 2:1, 0:1, 1:1 or 0:0 – bet wins. If game produces 4 goals – bet fails.", "Sometimes you’re quite sure about only one team, but not sure about other. So, in this case you can use Individual totals – number of goals by only one selected team. As in totals, individual totals are divided into:", "Individual Over. Usually, this bet looks like “1 Over (goals)”, where “goals” is expected number of goals.", "Individual Under. Usually, this bet looks like “1 Under (goals)”, where “goals” is expected number of goals."};
    public final String[] q = {"Totaux", "Les totaux sont des paris sur la quantité de quelque chose dans un match : buts, corners, cartons, etc. Vous pouvez utiliser ce type de pari lorsque vous ne savez pas exactement quelle équipe est la plus proche de la victoire. Les totaux sont très populaires dans les paris. Il existe deux types de totaux :", "Over. Si vous pensez que le match sera riche en buts, utilisez un pari « Over ». Généralement, ce pari ressemble à « Over (buts) », où « buts » est le nombre attendu. Vous pouvez utiliser des nombres décimaux (2.5, 1.5, 3.5) ou entiers (1, 2, 3) ;", "Exemple. Vous pensez que le match entre Manchester City et Chelsea produira au moins 3 buts. Vous placez un pari « Over 2.5 ». Si le match se termine sur 2:1, 0:4 ou 3:2 — le pari gagne. S’il y a 2 buts ou moins — le pari perd.", "Under. Si vous pensez que le match sera fermé et pauvre en buts, utilisez un pari « Under ». Généralement, ce pari ressemble à « Under (buts) », où « buts » est le nombre attendu. Vous pouvez utiliser des nombres décimaux (2.5, 1.5, 3.5) ou entiers (1, 2, 3) ;", "Exemple. Vous pensez que le match entre Manchester City et Chelsea produira 3 buts ou moins. Vous placez un pari « Under 3.5 ». Si le score final est 2:1, 0:1, 1:1 ou 0:0 — le pari gagne. Si le match produit 4 buts — le pari perd.", "Parfois, vous êtes sûr d’une seule équipe, mais pas de l’autre. Dans ce cas, vous pouvez utiliser les totaux individuels — le nombre de buts d’une seule équipe sélectionnée. Comme les totaux classiques, les totaux individuels se divisent en :", "Over individuel. Généralement, ce pari ressemble à « 1 Over (buts) », où « buts » est le nombre attendu.", "Under individuel. Généralement, ce pari ressemble à « 1 Under (buts) », où « buts » est le nombre attendu."};

    /* renamed from: r, reason: collision with root package name */
    public final String[] f168r = {"Totals", "Totals sind Wetten auf die Anzahl von Ereignissen im Spiel: Tore, Ecken, Karten usw. Diese Wettart eignet sich, wenn man nicht genau weiß, welche Mannschaft dem Sieg näher ist. Totals sind sehr beliebt. Es gibt zwei Arten von Totals:", "Over. Wenn Sie glauben, dass das Spiel viele Tore bringen wird, wählen Sie die Wette „Over“. Meist sieht diese Wette wie „Over (Tore)“ aus, wobei „Tore“ die erwartete Anzahl ist. Es können Dezimalwerte (2.5, 1.5, 3.5) oder ganze Zahlen (1, 2, 3) verwendet werden;", "Beispiel. Sie erwarten im Spiel Manchester City – Chelsea mindestens 3 Tore. Sie setzen auf „Over 2.5“. Endet das Spiel 2:1, 0:4 oder 3:2 — die Wette gewinnt. Bei 2 Toren oder weniger — verliert sie.", "Under. Wenn Sie glauben, dass das Spiel torarm und defensiv sein wird, wählen Sie „Under“. Auch hier sieht die Wette wie „Under (Tore)“ aus. Dezimal- und Ganzzahlen sind möglich;", "Beispiel. Sie erwarten im Spiel Manchester City – Chelsea höchstens 3 Tore. Sie setzen auf „Under 3.5“. Endet das Spiel 2:1, 0:1, 1:1 oder 0:0 — die Wette gewinnt. Bei 4 Toren — verliert sie.", "Manchmal ist man sich nur bei einer Mannschaft sicher. In diesem Fall können individuelle Totals genutzt werden — die Anzahl der Tore einer einzelnen Mannschaft. Diese unterteilen sich in:", "Individuelles Over. Meist als „1 Over (Tore)“ dargestellt.", "Individuelles Under. Meist als „1 Under (Tore)“ dargestellt."};

    /* renamed from: s, reason: collision with root package name */
    public final String[] f169s = {"Totales", "Los totales son apuestas sobre la cantidad de algo en un partido: goles, córners, tarjetas, etc. Puedes usar este tipo de apuesta cuando no sabes exactamente qué equipo está más cerca de ganar. Los totales son muy populares. Existen dos tipos:", "Over. Si crees que el partido tendrá muchos goles, usa la apuesta «Over». Normalmente se presenta como «Over (goles)», donde «goles» es el número esperado. Puedes usar valores decimales (2.5, 1.5, 3.5) o enteros (1, 2, 3);", "Ejemplo. Crees que el partido Manchester City vs Chelsea tendrá al menos 3 goles. Apuestas a «Over 2.5». Si el marcador es 2:1, 0:4 o 3:2 — la apuesta gana. Si hay 2 goles o menos — pierde.", "Under. Si crees que el partido será cerrado y con pocos goles, usa la apuesta «Under». Se presenta como «Under (goles)» y admite decimales o enteros;", "Ejemplo. Crees que el partido tendrá 3 goles o menos. Apuestas a «Under 3.5». Si el resultado es 2:1, 0:1, 1:1 o 0:0 — la apuesta gana. Con 4 goles — pierde.", "A veces solo estás seguro de un equipo. En este caso puedes usar totales individuales — número de goles de un solo equipo. Se dividen en:", "Over individual. Normalmente «1 Over (goles)».", "Under individual. Normalmente «1 Under (goles)»."};

    /* renamed from: t, reason: collision with root package name */
    public final String[] f170t = {"Totais", "Totais são apostas na quantidade de algo em uma partida: gols, escanteios, cartões, etc. Você pode usar esse tipo de aposta quando não sabe exatamente qual equipe está mais próxima da vitória. Os totais são muito populares. Existem dois tipos:", "Over. Se você acha que o jogo terá muitos gols, use a aposta «Over». Geralmente aparece como «Over (gols)», onde «gols» é o número esperado. Podem ser usados valores decimais (2.5, 1.5, 3.5) ou inteiros (1, 2, 3);", "Exemplo. Você acha que o jogo entre Manchester City e Chelsea terá pelo menos 3 gols. Aposta em «Over 2.5». Se terminar 2:1, 0:4 ou 3:2 — a aposta vence. Com 2 gols ou menos — perde.", "Under. Se você acha que o jogo será fechado e com poucos gols, use a aposta «Under». Também aparece como «Under (gols)»;", "Exemplo. Você acha que o jogo terá 3 gols ou menos. Aposta em «Under 3.5». Se o placar for 2:1, 0:1, 1:1 ou 0:0 — a aposta vence. Com 4 gols — perde.", "Às vezes você confia apenas em um time. Nesse caso, pode usar totais individuais — número de gols de apenas um time. Eles se dividem em:", "Over individual. Normalmente «1 Over (gols)».", "Under individual. Normalmente «1 Under (gols)»."};

    /* renamed from: u, reason: collision with root package name */
    public final String[] f171u = {"Toplam Bahisler", "Toplam bahisler, maçtaki belirli bir şeyin sayısına oynanan bahislerdir: goller, kornerler, kartlar vb. Hangi takımın kazanmaya daha yakın olduğunu bilmediğinizde bu bahis türü kullanılabilir. Toplam bahisler oldukça popülerdir. İki türü vardır:", "Üst (Over). Maçta çok gol olacağını düşünüyorsanız «Over» bahislerini kullanın. Genellikle «Over (gol)» şeklindedir. Ondalıklı (2.5, 1.5, 3.5) veya tam sayılar (1, 2, 3) kullanılabilir;", "Örnek. Manchester City – Chelsea maçında en az 3 gol olacağını düşünüyorsunuz. «Over 2.5» oynarsınız. Maç 2:1, 0:4 veya 3:2 biterse bahis kazanır. 2 gol veya daha az olursa kaybeder.", "Alt (Under). Maçın sıkıcı ve az gollü geçeceğini düşünüyorsanız «Under» bahislerini kullanın;", "Örnek. Maçta 3 gol veya daha az olacağını düşünüyorsunuz. «Under 3.5» oynarsınız. Skor 2:1, 0:1, 1:1 veya 0:0 olursa bahis kazanır. 4 gol olursa kaybeder.", "Bazen yalnızca bir takıma güvenirsiniz. Bu durumda bireysel toplamlar kullanılabilir — yalnızca seçilen takımın gol sayısı. Bunlar:", "Bireysel Over. Genellikle «1 Over (gol)» şeklindedir.", "Bireysel Under. Genellikle «1 Under (gol)» şeklindedir."};

    /* renamed from: v, reason: collision with root package name */
    public final String[] f172v = {"Экспрессы", "Экспресс - это совокупность нескольких ставок на различные события. Они могут быть из разных видов спорта и совершенно несвязанными друг с другом. Главное преимущество таких ставок заключается в высокой прибыльности, поскольку итоговый коэффициент получается путем умножения коэффициентов в экспрессе. Однако, как вы успели догадаться, и главным минусом таких ставок являются высокие риски, ведь если не зайдет хотя бы одно событие из всех - весь экспресс будет считаться не зашедшим"};

    /* renamed from: w, reason: collision with root package name */
    public final String[] f173w = {"Express bets", "Express bet (or accumulator bet) – is a combination of some single bets in one. You can add single bets to express from different sports and these bets should be unrelated. The main advantage of express bets is higher profit, than in single bets, because the total odd of express is a multiplication of single bets odds. As you can guess, the main problem of this kind of bets is their high-risk level: if just one of events in express fails – the whole express bet fails."};

    /* renamed from: x, reason: collision with root package name */
    public final String[] f174x = {"Paris combinés", "Un pari combiné (ou accumulateur) est une combinaison de plusieurs paris simples en un seul. Vous pouvez ajouter des paris simples de différents sports dans un combiné, à condition qu’ils ne soient pas liés entre eux. Le principal avantage des paris combinés est un gain potentiel plus élevé que pour les paris simples, car la cote totale est le produit des cotes de chaque pari. Comme vous pouvez le deviner, le principal inconvénient de ce type de pari est son niveau de risque élevé : si un seul événement du combiné échoue, l’ensemble du pari est perdu."};

    /* renamed from: y, reason: collision with root package name */
    public final String[] f175y = {"Kombiwetten", "Eine Kombiwette (auch Akkumulator-Wette genannt) ist eine Zusammenfassung mehrerer Einzelwetten zu einer Wette. Einzelwetten aus verschiedenen Sportarten können zu einer Kombiwette hinzugefügt werden, sofern sie nicht voneinander abhängig sind. Der Hauptvorteil von Kombiwetten ist der höhere mögliche Gewinn im Vergleich zu Einzelwetten, da die Gesamtquote das Produkt der einzelnen Quoten ist. Wie man leicht erkennen kann, liegt der größte Nachteil dieser Wettart im hohen Risiko: Wenn nur ein Ereignis in der Kombiwette verloren geht, ist die gesamte Wette verloren."};

    /* renamed from: z, reason: collision with root package name */
    public final String[] f176z = {"Apuestas combinadas", "Una apuesta combinada (o acumulador) es una combinación de varias apuestas simples en una sola. Puedes añadir apuestas simples de diferentes deportes, siempre que no estén relacionadas entre sí. La principal ventaja de las apuestas combinadas es una ganancia potencial mayor en comparación con las apuestas simples, ya que la cuota total es el resultado de multiplicar las cuotas individuales. Como puedes imaginar, el principal inconveniente de este tipo de apuestas es su alto nivel de riesgo: si falla solo uno de los eventos del combinado, toda la apuesta se pierde."};
    public final String[] A = {"Apostas múltiplas", "Uma aposta múltipla (ou acumulador) é a combinação de várias apostas simples em uma só. É possível incluir apostas simples de diferentes esportes, desde que não estejam relacionadas entre si. A principal vantagem das apostas múltiplas é o lucro potencial mais alto em comparação com apostas simples, pois a odd total é o resultado da multiplicação das odds individuais. Como é fácil imaginar, o principal problema desse tipo de aposta é o alto nível de risco: se apenas um dos eventos falhar, toda a aposta múltipla será perdida."};
    public final String[] B = {"Kombine bahisler", "Kombine bahis (akümülatör bahis olarak da bilinir), birden fazla tekli bahsin tek bir bahis altında birleştirilmesidir. Farklı spor dallarından tekli bahisler kombineye eklenebilir ve bu bahislerin birbiriyle bağlantılı olmaması gerekir. Kombine bahislerin en büyük avantajı, tekli bahislere kıyasla daha yüksek kazanç potansiyelidir; çünkü toplam oran, tekli bahis oranlarının çarpımıdır. Tahmin edileceği üzere, bu bahis türünün en büyük dezavantajı yüksek risk seviyesidir: kombinedeki tek bir etkinlik bile başarısız olursa, tüm bahis kaybedilir."};
    public final String[] C = {"Системы", "Под системами понимается совокупность экспрессов. У каждой системы имеется свой размер, например, “3 из 5”, где 3 - это то количество событий, которое должно зайти, а 5 - это общее количество событий в системе. Главным преимуществом данного вида ставок является подстраховка: согласитесь, вы чувствуете себя гораздо уверенней, если у вас есть права на ошибку (на не зашедшее событие). Однако здесь есть и минус - итоговый коэффициент может быть не столь большим, а риски все еще высокие.", "Таким образом, мы разобрали основные виды ставок: одинары, экспрессы и системы. Какой именно тип ставки выбрать - решать только вам. Многое зависит от характера команд, участвующих в матчах, от коэффициентов и ваших личных знаний и симпатий."};
    public final String[] D = {"System bets", "System bets are combination of express bets. Every system has its size: 2/3, 4/5 or other, where first number of size is number of potential wins and second number of size is total number of events. The main advantage of system bets is possibility for insurance: you feel better when you have one or some rights to fail. However, this insurance has other side – total odds in this case won’t be so high.", "So, we have illustrated some popular types of bets: single, express and systems. What kind of bet to choose only up to you. The selection of bets usually is based on team’s game styles, players, odds and for sure – your personal knowledges and preferences."};
    public final String[] E = {"Paris système", "Les paris système sont une combinaison de paris combinés. Chaque système a sa taille : 2/3, 4/5 ou autre, où le premier chiffre correspond au nombre de gains potentiels et le second au nombre total d’événements. Le principal avantage des paris système est la possibilité d’assurance : vous vous sentez plus en sécurité lorsque vous pouvez vous permettre une ou plusieurs erreurs. Cependant, cette assurance a un revers — les cotes totales ne seront pas aussi élevées.", "Nous avons ainsi présenté les types de paris les plus populaires : simple, combiné et système. Le choix du type de pari dépend uniquement de vous. En général, il se base sur le style de jeu des équipes, les joueurs, les cotes et bien sûr vos connaissances et préférences personnelles."};
    public final String[] F = {"Systemwetten", "Systemwetten sind eine Kombination aus Kombiwetten. Jedes System hat eine bestimmte Größe: 2/3, 4/5 oder andere, wobei die erste Zahl die Anzahl möglicher Gewinne und die zweite die Gesamtanzahl der Ereignisse angibt. Der Hauptvorteil von Systemwetten ist die Absicherung: Man fühlt sich sicherer, wenn ein oder mehrere Fehler erlaubt sind. Diese Absicherung hat jedoch auch eine Kehrseite — die Gesamtquote ist in diesem Fall nicht so hoch.", "Wir haben damit die beliebtesten Wettarten vorgestellt: Einzelwetten, Kombiwetten und Systemwetten. Welche Wettart Sie wählen, liegt ganz bei Ihnen. Die Auswahl basiert in der Regel auf dem Spielstil der Teams, den Spielern, den Quoten sowie auf Ihren persönlichen Kenntnissen und Vorlieben."};
    public final String[] G = {"Apuestas de sistema", "Las apuestas de sistema son una combinación de apuestas combinadas. Cada sistema tiene un tamaño: 2/3, 4/5 u otro, donde el primer número indica la cantidad de aciertos posibles y el segundo el número total de eventos. La principal ventaja de las apuestas de sistema es la posibilidad de asegurarse: te sientes más tranquilo cuando puedes permitirte uno o varios fallos. Sin embargo, esta seguridad tiene un lado negativo — las cuotas totales no serán tan altas.", "Así, hemos revisado los tipos de apuestas más populares: simples, combinadas y de sistema. El tipo de apuesta que elijas depende solo de ti. Normalmente, la selección se basa en el estilo de juego de los equipos, los jugadores, las cuotas y, por supuesto, tus conocimientos y preferencias personales."};
    public final String[] H = {"Apostas de sistema", "As apostas de sistema são uma combinação de apostas múltiplas. Cada sistema possui um tamanho: 2/3, 4/5 ou outro, onde o primeiro número indica a quantidade de acertos possíveis e o segundo o número total de eventos. A principal vantagem das apostas de sistema é a possibilidade de proteção: você se sente mais seguro ao poder errar em um ou mais eventos. No entanto, essa proteção tem um lado negativo — as odds totais não serão tão altas.", "Assim, apresentamos os tipos de apostas mais populares: simples, múltiplas e sistema. O tipo de aposta a escolher depende apenas de você. Normalmente, a escolha é baseada no estilo de jogo das equipes, nos jogadores, nas odds e, claro, nos seus conhecimentos e preferências pessoais."};
    public final String[] I = {"Sistem bahisleri", "Sistem bahisleri, kombine bahislerin bir birleşimidir. Her sistemin bir boyutu vardır: 2/3, 4/5 veya benzeri; burada ilk sayı olası kazanç sayısını, ikinci sayı ise toplam etkinlik sayısını ifade eder. Sistem bahislerinin en büyük avantajı sigorta imkânıdır: bir veya birkaç hataya izin verildiğinde daha güvende hissedersiniz. Ancak bu sigortanın bir dezavantajı vardır — toplam oranlar bu durumda daha düşük olur.", "Böylece en popüler bahis türlerini inceledik: tekli, kombine ve sistem bahisleri. Hangi bahis türünü seçeceğiniz tamamen size bağlıdır. Genellikle seçim; takımların oyun stillerine, oyunculara, oranlara ve elbette kişisel bilgi ve tercihlerinize dayanır."};

    public final String a(int i5, String language) {
        String[] strArr;
        Intrinsics.checkNotNullParameter(language, "language");
        int hashCode = language.hashCode();
        if (hashCode == 3201) {
            if (language.equals("de")) {
                strArr = this.f175y;
            }
            strArr = this.f173w;
        } else if (hashCode == 3246) {
            if (language.equals("es")) {
                strArr = this.f176z;
            }
            strArr = this.f173w;
        } else if (hashCode == 3276) {
            if (language.equals("fr")) {
                strArr = this.f174x;
            }
            strArr = this.f173w;
        } else if (hashCode == 3588) {
            if (language.equals("pt")) {
                strArr = this.A;
            }
            strArr = this.f173w;
        } else if (hashCode != 3651) {
            if (hashCode == 3710 && language.equals("tr")) {
                strArr = this.B;
            }
            strArr = this.f173w;
        } else {
            if (language.equals("ru")) {
                strArr = this.f172v;
            }
            strArr = this.f173w;
        }
        int i10 = i5 - 1;
        return (i10 >= strArr.length || i10 < 0) ? "" : strArr[i10];
    }

    public final String b(int i5, String language) {
        String[] strArr;
        Intrinsics.checkNotNullParameter(language, "language");
        int hashCode = language.hashCode();
        if (hashCode == 3201) {
            if (language.equals("de")) {
                strArr = this.f162k;
            }
            strArr = this.f161i;
        } else if (hashCode == 3246) {
            if (language.equals("es")) {
                strArr = this.f163l;
            }
            strArr = this.f161i;
        } else if (hashCode == 3276) {
            if (language.equals("fr")) {
                strArr = this.j;
            }
            strArr = this.f161i;
        } else if (hashCode == 3588) {
            if (language.equals("pt")) {
                strArr = this.f164m;
            }
            strArr = this.f161i;
        } else if (hashCode != 3651) {
            if (hashCode == 3710 && language.equals("tr")) {
                strArr = this.f165n;
            }
            strArr = this.f161i;
        } else {
            if (language.equals("ru")) {
                strArr = this.f160h;
            }
            strArr = this.f161i;
        }
        int i10 = i5 - 1;
        return (i10 >= strArr.length || i10 < 0) ? "" : strArr[i10];
    }

    public final String c(int i5, String language) {
        String[] strArr;
        Intrinsics.checkNotNullParameter(language, "language");
        int hashCode = language.hashCode();
        if (hashCode == 3201) {
            if (language.equals("de")) {
                strArr = this.f156d;
            }
            strArr = this.f154b;
        } else if (hashCode == 3246) {
            if (language.equals("es")) {
                strArr = this.f157e;
            }
            strArr = this.f154b;
        } else if (hashCode == 3276) {
            if (language.equals("fr")) {
                strArr = this.f155c;
            }
            strArr = this.f154b;
        } else if (hashCode == 3588) {
            if (language.equals("pt")) {
                strArr = this.f158f;
            }
            strArr = this.f154b;
        } else if (hashCode != 3651) {
            if (hashCode == 3710 && language.equals("tr")) {
                strArr = this.f159g;
            }
            strArr = this.f154b;
        } else {
            if (language.equals("ru")) {
                strArr = this.f153a;
            }
            strArr = this.f154b;
        }
        int i10 = i5 - 1;
        return (i10 >= strArr.length || i10 < 0) ? "" : strArr[i10];
    }

    public final String d(int i5, String language) {
        String[] strArr;
        Intrinsics.checkNotNullParameter(language, "language");
        int hashCode = language.hashCode();
        if (hashCode == 3201) {
            if (language.equals("de")) {
                strArr = this.F;
            }
            strArr = this.D;
        } else if (hashCode == 3246) {
            if (language.equals("es")) {
                strArr = this.G;
            }
            strArr = this.D;
        } else if (hashCode == 3276) {
            if (language.equals("fr")) {
                strArr = this.E;
            }
            strArr = this.D;
        } else if (hashCode == 3588) {
            if (language.equals("pt")) {
                strArr = this.H;
            }
            strArr = this.D;
        } else if (hashCode != 3651) {
            if (hashCode == 3710 && language.equals("tr")) {
                strArr = this.I;
            }
            strArr = this.D;
        } else {
            if (language.equals("ru")) {
                strArr = this.C;
            }
            strArr = this.D;
        }
        int i10 = i5 - 1;
        return (i10 >= strArr.length || i10 < 0) ? "" : strArr[i10];
    }

    public final String e(int i5, String language) {
        String[] strArr;
        Intrinsics.checkNotNullParameter(language, "language");
        int hashCode = language.hashCode();
        if (hashCode == 3201) {
            if (language.equals("de")) {
                strArr = this.f168r;
            }
            strArr = this.f167p;
        } else if (hashCode == 3246) {
            if (language.equals("es")) {
                strArr = this.f169s;
            }
            strArr = this.f167p;
        } else if (hashCode == 3276) {
            if (language.equals("fr")) {
                strArr = this.q;
            }
            strArr = this.f167p;
        } else if (hashCode == 3588) {
            if (language.equals("pt")) {
                strArr = this.f170t;
            }
            strArr = this.f167p;
        } else if (hashCode != 3651) {
            if (hashCode == 3710 && language.equals("tr")) {
                strArr = this.f171u;
            }
            strArr = this.f167p;
        } else {
            if (language.equals("ru")) {
                strArr = this.f166o;
            }
            strArr = this.f167p;
        }
        int i10 = i5 - 1;
        return (i10 >= strArr.length || i10 < 0) ? "" : strArr[i10];
    }
}
